package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_I_when_1 () {
		testConvertToRoman("1", "I");
	}

	@Test
	public void should_return_V_when_5 () {
		//Given
		testConvertToRoman("5", "V");
	}
	@Test
	public void should_return_X_when_10 () {
		//Given
		testConvertToRoman("10", "X");
	}
	@Test
	public void should_return_L_when_50 () {
		//Given
		testConvertToRoman("50", "L");
	}
	@Test
	public void should_return_C_when_100 () {
		//Given
		testConvertToRoman("100", "C");
	}
	@Test
	public void should_return_D_when_500 () {
		//Given
		testConvertToRoman("500", "D");
	}
	@Test
	public void should_return_M_when_1000 () {
		//Given
		testConvertToRoman("1000", "M");
	}
	@Test
	public void should_return_roman_number () {
		testConvertToRoman("3", "III");
		testConvertToRoman("6", "VI");
	}
	
	private void testConvertToRoman(String input, String expected) {
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}

}
