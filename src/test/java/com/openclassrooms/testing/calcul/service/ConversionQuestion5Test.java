package com.openclassrooms.testing.calcul.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

import com.openclassrooms.testing.calcul.domain.ConversionCalculator;
import com.openclassrooms.testing.calcul.domain.model.ConversionModel;
import com.openclassrooms.testing.calcul.domain.model.ConversionType;

@ExtendWith(MockitoExtension.class)
public class ConversionQuestion5Test {
	@Mock
	ConversionCalculator calculator;

	ConversionCalculatorServiceImpl conversionCalculatorService;

	@BeforeEach
	public void init() {
		conversionCalculatorService = new ConversionCalculatorServiceImpl(calculator);
	}

	@Test
	public void calculate_shouldUseCalculator_forCelsiusToFarenheit() {
		// GIVEN
		final double resultatAttendu = 32.;
		when(calculator.celsiusToFahrenheit(0.0)).thenReturn(32.);


		// WHEN
		final double resultat = conversionCalculatorService.calculate(
				new ConversionModel(0.0, ConversionType.CELSIUS_TO_FARENHEIT)).getSolution();

		// THEN
		verify(calculator).celsiusToFahrenheit(0.0);
		assertThat(resultat).isEqualTo(resultatAttendu);

	}
}
