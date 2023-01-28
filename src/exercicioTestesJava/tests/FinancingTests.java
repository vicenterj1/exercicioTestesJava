package exercicioTestesJava.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import exercicioTestesJava.entities.Financing;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		
		//arrange
		Financing f = new Financing (100000.00, 2000.00, 80);

		//action
		
		//assert
		Assertions.assertEquals(100000.00, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80,  f.getMonths());
	}

	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> {
					//arrange
					
					//action
					Financing f = new Financing (100000.00, 2000.00, 20);

					//assert
				});
		
	}

	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		
		//arrange
		Financing f = new Financing (100000.00, 2000.00, 80);
		
		//action
		f.setTotalAmount(90000.0);
		
		//assert
		Assertions.assertEquals(90000.00, f.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> {
					//arrange
					
					//action
					Financing f = new Financing (100000.00, 2000.00, 80);

					//assert
					f.setTotalAmount(110000.0);
				});
		
	}
	
	@Test
	public void setIncomeShouldSetDataWhenValidData() {
		
		//arrange
		Financing f = new Financing (100000.00, 2000.00, 80);
		
		//action
		f.setIncome(2100.0);
		
		//assert
		Assertions.assertEquals(2100.00, f.getIncome());
	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> {
					//arrange
					
					//action
					Financing f = new Financing (100000.00, 1900.0, 80);

					//assert
					f.setTotalAmount(1900.0);
				});
		
	}

	@Test
	public void setMonthsShouldSetDataWhenValidData() {
		
		//arrange
		Financing f = new Financing (100000.00, 2000.00, 80);
		
		//action
		f.setMonths(81);
		
		//assert
		Assertions.assertEquals(81, f.getMonths());
	}

	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> {
					//arrange
					
					//action
					Financing f = new Financing (100000.00, 2000.0, 80);

					//assert
					f.setMonths(79);
				});
		
	}
	

	@Test
	public void entryShouldCalculateEntryCorrectly() {
		Financing f = new Financing (100000.00, 2000.0, 80);
		
		Assertions.assertEquals(20000.0, f.entry());
	}
	
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		Financing f = new Financing (100000.00, 2000.0, 80);
		
		Assertions.assertEquals(1000.0, f.quota());
	}
	
}
