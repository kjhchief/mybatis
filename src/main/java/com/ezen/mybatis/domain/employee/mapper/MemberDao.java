package com.ezen.mybatis.domain.employee.mapper;

import java.sql.SQLException;
import java.util.List;

import com.ezen.mybatis.domain.employee.dto.Member;

/**
 * 회원 Database 관련 기능 명세(역할)
 * @Author 김재훈
 * @Date 2023. 3. 8.
 */
public interface MemberDao {

	// 회원 목록 조회
	public List<Member> findAll();


}