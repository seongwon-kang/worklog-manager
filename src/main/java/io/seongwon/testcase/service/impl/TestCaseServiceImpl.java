package io.seongwon.testcase.service.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.seongwon.testcase.service.TestCaseService;

/**
 * testCase:
 * h1: 대분류
 * h2: 중분류
 * h3: 소분류
 * scenario: 시나리오
 * input: 입력값
 * output: 기대 출력값
 * result: 결과
 */
@Service
public class TestCaseServiceImpl implements TestCaseService{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Value("projectNumber")
	String projectNumber;
	
	@Value("templateName")
	private String templateName = "resources/templates/";
	
	private String outputFilePath = String.format("resources/static/%s/%s 테스트케이스.xls", projectNumber);
	
	@Override
	public void downloadTemplate(List<Map<String, Object>> testCaseList) {
		try (InputStream is = TestCaseServiceImpl.class.getResourceAsStream(templateName)) {
			try (OutputStream os = new FileOutputStream(outputFilePath)) {
					Context context = new Context();
					
					context.putVar("testCaseList", testCaseList);
					JxlsHelper.getInstance().processTemplate(is, os, context);
					
			} catch (FileNotFoundException e) {
				logger.info(e.getStackTrace().toString());
			} catch (IOException e) {
				logger.info(e.getStackTrace().toString());
			}
		} catch (IOException e1) {
			logger.info(e1.getStackTrace().toString());
		}
	}

}
