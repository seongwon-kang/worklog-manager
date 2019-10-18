package io.seongwon.testcase.service;

import java.util.List;
import java.util.Map;

import io.seongwon.testcase.service.impl.TestCaseVO;

public interface TestCaseService {

	void downloadTemplate(List<TestCaseVO> testCaseList);
}
