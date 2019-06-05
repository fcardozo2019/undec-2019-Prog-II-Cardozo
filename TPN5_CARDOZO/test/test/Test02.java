package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Carrera;

class Test02 {

	@Test
	void test01() {
		Carrera c01 =new Carrera("Licenciatura en Sistemas","Lic. en Sistemas","71/08");
		String nombreEsperado = "LICENCIATURA EN SISTEMAS";
		
		String actual= c01.getNombreEnMayuscula();
		
		assertEquals(nombreEsperado, actual);
	}
	
	@Test
	void test01_02() {
		Carrera c01 =new Carrera("Licenciatura en Sistemas","Lic. en Sistemas","71/08");
		String nombreEsperado = "LICENCIATURA EN SISTEMAS";
		
		Carrera c02 =new Carrera("Abogacia","Abog","128/01");
		String nombreEsperado1 = "ABOGACIA";
		
		Carrera c03 =new Carrera("Abogacia","Abog","128/01");
		String nombreEsperado2 = "ABOGACIA";
		
		String actual01 = c01.getTipoOracion();
		String actual02 = c02.getTipoOracion();
		String actual03 = c03.getTipoOracion();
		
		assertEquals(nombreEsperado, actual01);
		assertEquals(nombreEsperado1, actual02);
		assertEquals(nombreEsperado2, actual03);
		
	}
	@Test
	void test03() {
		Carrera c01 =new Carrera("Licenciatura en Sistemas","Lic. en Sistemas","71/08");
		String nombreEsperado = "LS";
		
		Carrera c02 =new Carrera("Abogacia","Abog","128/01");
		String nombreEsperado1 = "A";
		
		Carrera c03 =new Carrera("Ingenieria Mecatronica","Ing. Mecatronica","128/01");
		String nombreEsperado2 = "IM";
		
		Carrera c04 =new Carrera("Licenciatura en Enfermeria","Lic. en Efermeria","128/01");
		String nombreEsperado3 = "LE";
		
		String actual01 = c01.getnom();
		String actual02 = c02.getnom();
		String actual03 = c03.getnom();
		String actual04 = c04.getnom();
		
		assertEquals(nombreEsperado, actual01);
		assertEquals(nombreEsperado1, actual02);
		assertEquals(nombreEsperado2, actual03);
		assertEquals(nombreEsperado3, actual04);
		
	}
	@Test
	void test04() {
		Carrera c01 =new Carrera("Licenciatura en Sistemas","Lic. en Sistemas","71/08");
		String nombreEsperado = "LicenSiste - LicSIs";
		
		Carrera c02 =new Carrera("Abogacia","Abog","128/01");
		String nombreEsperado1 = "Aboga - Abo";
		
		Carrera c03 =new Carrera("Ingenieria Mecatronica","Ing. Mecatronica","128/01");
		String nombreEsperado2 = "IngenMecat - IngMec";
		
		String actual01 = c01.getnom();
		String actual02 = c02.getnom();
		String actual03 = c03.getnom();
		
		assertEquals(nombreEsperado, actual01);
		assertEquals(nombreEsperado1, actual02);
		assertEquals(nombreEsperado2, actual03);
		
	}
	
	

}
