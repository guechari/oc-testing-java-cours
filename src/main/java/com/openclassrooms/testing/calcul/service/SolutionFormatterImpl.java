package com.openclassrooms.testing.calcul.service;

import java.text.DecimalFormat;

public class SolutionFormatterImpl implements SolutionFormatter {

	@Override
	public String format(int solution) {
		DecimalFormat df = new DecimalFormat();
		df.setGroupingSize(3);

		return df.format(solution);

	}

}
