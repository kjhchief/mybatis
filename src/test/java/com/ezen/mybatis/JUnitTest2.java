package com.ezen.mybatis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
public class JUnitTest2 {
	@Test
	@Order(3)
	void testC() {
		assertEquals(2, 1 + 1);
	}

	@Test
	@Order(1)
	void testB() {
		assertEquals(2, 1 + 1);
	}

	@Test
	@Order(2)
	void testA() {
		assertEquals(2, 1 + 1);
	}
}


