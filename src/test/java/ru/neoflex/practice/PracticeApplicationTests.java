package ru.neoflex.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import ru.neoflex.practice.controller.CalcController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PracticeApplicationTests {

	@InjectMocks
	private CalcController CalcController;

	@BeforeEach
	void setUp(){
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void Test_Summing() {
		int a = 20;
		int b = 20;
		long expectedResult = 40;
		long actualResult = CalcController.Summing(a, b);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void Test_Subtraction() {
		int a = 12;
		int b = 2;
		long expectedResult = 10;
		long actualResult = CalcController.Subtraction(a, b);
		assertEquals(expectedResult, actualResult);
	}

}
