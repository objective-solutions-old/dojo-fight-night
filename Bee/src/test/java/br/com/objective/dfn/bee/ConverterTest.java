package br.com.objective.dfn.bee;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.objective.dfn.Converter;
import br.com.objective.dfn.MajaCordinate;

public class ConverterTest {
	
	private Converter converter = new Converter();

	@Test
	public void conversion() {
		assertConvert(1, 0, 0);
		assertConvert(2, 0, 1);
		assertConvert(3, -1, 1);
		assertConvert(4, -1, 0);
		assertConvert(5, 0, -1);
		assertConvert(6, 1, -1);
		assertConvert(7, 1, 0);
		assertConvert(8, 1, 1);
		assertConvert(9, 0, 2);
		assertConvert(10, -1, 2);
		assertConvert(11, -2, 2);
		assertConvert(12, -2, 1);
		assertConvert(13, -2, 0);
		assertConvert(14, -1, -1);
		assertConvert(15, 0, -2);
		assertConvert(16, 1, -2);
		assertConvert(17, 2, -2);
		assertConvert(18, 2, -1);
		assertConvert(19, 2, 0);
		assertConvert(20, 2, 1);
		assertConvert(21, 1, 2);
		assertConvert(22, 0, 3);
		assertConvert(23, -1, 3);
	}
	
	@Test
	public void hugeConversion() {
		assertConvert(100000, 102, 81); //chute :)
	}
	
	private void assertConvert(int williCordinate, int expectedMajaA, int expectedMajaB) {
		assertEquals(new MajaCordinate(expectedMajaA, expectedMajaB), converter.convert(williCordinate));
	}

}
