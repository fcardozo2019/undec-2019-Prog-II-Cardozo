package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFecha {
	private int dia;
	private int mes;
	private int anio;
	
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}
	
	public int getAnio() {
		return anio;
	}

	
	/**
	 * Validar que al construir una fecha con datos valido los metodos getDia(), getMes() y getAnio() devuelvan los valores adecuados.
	 * 
	 */
	@Test
	void test01() {
	/*	
		int expectedDia=(01);
		int expectedMes=(04);
		int expectedAnio=(12);
		String fechaCorta = ("01/04/12"); 
		TestFecha c01= new TestFecha(expectedDia,expectedMes,expectedAnio);
		int actualDia=c01.getDia();
		int actualMes=c01.getMes();
		int actualAnio=c01.getAnio();
		assertEquals(expectedDia,actualDia);
		assertEquals(expectedMes,actualMes);
		assertEquals(expectedAnio,actualAnio);
	
		Fecha f01= new expectedDia(01);
		Fecha f02= new expectedMes(04);
		Fecha f03= new expectedAnio(12); */	
		Fecha f01 = new Fecha(1,4,2012);
		int expectedDia=01;
		int expectedMes=04;
		int expectedAnio=2012;
	//	Fecha f01= new Fecha("01","04","12");
		int actualDia=f01.getDia();
		int actualMes=f01.getMes();
		int actualAnio=f01.getAnio();
		assertEquals(expectedDia,actualDia);
		assertEquals(expectedMes,actualMes);
		assertEquals(expectedAnio,actualAnio);

	/*	String actualFechaCorta=f01.getFechaCorta();
		assertEquals(expectedFechaCorta,actualFechaCorta);
	*/
	}	

	/**
	 * Validar que al construir una fecha con datos valido el metodo getFechaCorta devuelva con el formato adecuado.
	 * Hacer pruebas con dias de uno y dos digitos, con meses de uno y dos digitos.
	 * 
	 */
	@Test
	void test02() {
		/*String expectedDia=("01");
		String expectedMes=("04");
		String expectedAnio=("12");
		String fechaCorta = ("01/04/12"); 
		TestFecha c01= new TestFecha(expectedDia,expectedMes,expectedAnio);
		String actualDia=c01.getDia();
		String actualMes=c01.getMes();
		String actualAnio=c01.getAnio();
		assertEquals(expectedDia,actualDia);
		assertEquals(expectedMes,actualMes);
		assertEquals(expectedAnio,actualAnio);
	}
	
	*/
		String expectedFechaCorta="27/01/12";
		
		Fecha f01= new Fecha(expectedFechaCorta);
		
		String expectedFechaCorta1 = "27/02/12" ;
		String actualFechaCorta=f01.getFechaCorta();
		assertEquals(expectedFechaCorta1,actualFechaCorta);
	}	
	/**
	 * Validar que al construir una fecha con valores de dias no valido la fecha construida sea 01/01/1900.
	 * Tomar en cuenta valores mayores y menores a los validos.
	 */
	@Test
	void test03() {
		String expectedFecha="27/01/12";
		
		Fecha f01= new Fecha(expectedFecha);
		
		
		String actualFecha=f01.getFecha();
		assertEquals("27/02/12",actualFecha);
	}
	
	/**
	 * Validar que al construir una fecha con valores de meses no valido la fecha construida sea 01/01/1900.
	 * Tomar en cuenta valores mayores y menores a los validos para todos los meses.
	 * 
	 */
	@Test
	void test04() {
		Fecha f01= new Fecha("01","11","12");
		Fecha f02= new Fecha("30","11","12");
		Fecha f03= new Fecha("01","12","12");
		
		boolean actual01=f01.equals(f01);
		boolean actual02=f01.equals(f02);
		
		assertEquals(false,actual01);
		assertEquals(true,actual02);
	}
		
	/**
	 * Validar equals de fecha.
	 * Tanto el true como el false.
	 */
	@Test
	void test05() {
		Fecha f01= new Fecha("01","11","12");
		Fecha f02= new Fecha("30","11","12");
		Fecha f03= new Fecha("01","12","12");
		
		boolean actual01=f01.equals(f01);
		boolean actual02=f01.equals(f02);
		
		assertEquals(false,actual01);
		assertEquals(true,actual02);
	}
	
	/**
	 * Validar el metodo esMayorQue(Fecha).
	 * Hacer pruebas con fechas mayores, menores e iguales.
	 * En los primeros dos casos hacer pruebas que difieran solo en el dia, luego solo en el mes, luego solo en el anio.
	 * Luego en el dia y anio y finalmente los tres valores.
	 * 
	 */
	@Test
	void test06() {
		Fecha f01= new Fecha("01","11","12");
		Fecha f02= new Fecha("02","11","12");
		Fecha f03= new Fecha("03","11","12");
		Fecha f04= new Fecha("01","01","12");
		Fecha f05= new Fecha("01","02","12");
		Fecha f06= new Fecha("01","03","12");
		Fecha f07= new Fecha("01","11","12");
		Fecha f08= new Fecha("01","11","13");
		Fecha f09= new Fecha("01","11","14");
	
		
		boolean actual01=f01.esMayorQue(f01);
		boolean actual02=f02.esMayorQue(f02);
		boolean actual03=f03.esMayorQue(f01);
		boolean actual04=f04.esMayorQue(f02);
		boolean actual05=f05.esMayorQue(f01);
		boolean actual06=f06.esMayorQue(f02);
		boolean actual07=f07.esMayorQue(f01);
		boolean actual08=f08.esMayorQue(f02);
		boolean actual09=f09.esMayorQue(f01);
		
		assertEquals(true,actual01);
		assertEquals(false,actual02);
		assertEquals(true,actual03);
		assertEquals(false,actual04);
		assertEquals(true,actual05);
		assertEquals(false,actual06);
		assertEquals(true,actual07);
		assertEquals(false,actual08);
		assertEquals(true,actual09);
		
		
		
		
	}
	
	
}