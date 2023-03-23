package com.ezen.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ezen.mybatis.domain.employee.dto.Employee;
import com.ezen.mybatis.domain.employee.dto.Member;
import com.ezen.mybatis.domain.employee.mapper.EmployeeMapper;
import com.ezen.mybatis.domain.employee.mapper.MemberDao;


/**
 * 자바 애플리케이션에서 Mybatis 사용 예제
 * @Author 김재훈
 * @Date 2023. 3. 22.
 */
public class MemberDaoExample {
	
	private static final String namespace = "com.ezen.mybatis.domain.employee.mapper.EmployeeMapper";
	
	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		
		// 트랜잭션 Auto Commit
		//SqlSession sqlSession = sqlSessionFactory.openSession(true);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// Not Auto Commit
		//SqlSession sqlSession = sqlSessionFactory.openSession(false);
		//sqlSession.commit();
		//sqlSession.rollback();
		
		
		System.out.println("==================== sqlSession 생성 완료 ====================");
		
		System.out.println("==================== 전체회원 조회 ========================");
//		List<Employee> employeeList = sqlSession.selectList(namespace + ".findAll");
		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		System.out.println(memberDao);
		List<Member> memberList= memberDao.findAll();
		for (Member member : memberList) {
			System.out.println(member);
		}

		
	}
	
}











