package io.seongwon.testcase.service.impl;

import lombok.Data;

/**
 * testCase: h1: 대분류 h2: 중분류 h3: 소분류 scenario: 시나리오 input: 입력값 output: 기대 출력값
 * result: 결과
 */

@Data
public class TestCaseVO {
	String h1;
	String h2;
	String h3;
	String scenario;

	String input;
	String output;
	String result;
}
