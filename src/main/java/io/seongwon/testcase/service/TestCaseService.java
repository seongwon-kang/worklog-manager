package io.seongwon.testcase.service;

import java.util.List;
import java.util.Map;

public interface TestCaseService {
	void downloadTemplate(List<Map<String, Object>> testcaseList);
}
