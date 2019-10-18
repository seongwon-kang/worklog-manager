package io.seongwon.testcase.service.impl;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.seongwon.testcase.service.TestCaseService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestCaseServiceImplTest.Config.class)
@TestPropertySource(properties = {
    "projectNumber=XX-Y-ZZ-CCC",
})
class TestCaseServiceImplTest {
	
	TestCaseService testCaseService = new TestCaseServiceImpl();
	
	@Before
	public void setUp() {
		TestCaseVO testCase1 = new TestCaseVO();
	}
	
	@Test
	void test() {
		
		fail("Not yet implemented");
	}

	@Configuration
	static class Config {
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertiesResolver() {
			return new PropertySourcesPlaceholderConfigurer();
		}
	}
}
