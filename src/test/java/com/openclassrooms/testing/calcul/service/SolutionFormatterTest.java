package com.openclassrooms.testing.calcul.service;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionFormatterTest {
	
	SolutionFormatter classUnderTest;
	
	@BeforeEach
	public void setUp() {
		classUnderTest = new SolutionFormatterImpl();
	}
	
	@Test
	public void format_shouldFormat_positiveInteger() {
		
		//GIVEN
		String formatedNumber = "13 000";
		
		//WHEN
		String result = classUnderTest.format(13000);
		
		//THEN
		assertThat(result).isEqualTo(formatedNumber); 
		
	
	}
	
	@Test
	public void format_shouldFormat_Zero() {
		
		//GIVEN
		String formatedNumber = "0";
		
		//WHEN
		String result = classUnderTest.format(0);
		
		//THEN
		assertThat(result).isEqualTo(formatedNumber); 		
	
	}
	
	@Test
	public void format_shouldFormat_negativeInteger() {
		
		//GIVEN
		String formatedNumber = "-3 213 000";
		
		//WHEN
		String result = classUnderTest.format(-3213000);
		
		//THEN
		assertThat(result).isEqualTo(formatedNumber); 
		
	
	}
}
