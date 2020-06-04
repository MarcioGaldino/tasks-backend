package br.ce.wcaquino.taskbackend.utils;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {
	
	@Test
	public void DeveRetornarTrueParaDatasFuturas()
	{
		LocalDate date = LocalDate.of(2030,01,01);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}
	
	@Test
	public void DeveRetornarFalseParaDatasPassadas()
	{
		LocalDate date = LocalDate.of(2010,01,01);
		Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
	}
	
	@Test
	public void DeveRetornarFalseParaDataAtual()
	{
		LocalDate date = LocalDate.now();
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}
	
	
}
