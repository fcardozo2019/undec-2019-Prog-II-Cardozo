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
	
	void test01_02() {
		Carrera c01 =new Carrera("Licenciatura en Sistemas","Lic. en Sistemas","71/08");
		String nombreEsperado = "Licenciatura En Sistemas";
		
		Carrera c02 =new Carrera("Abogacia","Abog","128/01");
		String nombreEsperado = "Abogacia";
		
		Carrera c03 =new Carrera("Abogacia","Abog","128/01");
		String nombreEsperado = "Abogacia";
		
		String actual01 = c01.getTipoOracion();
		String actual02 = c02.getTipoOracion();
		String actual03 = c03.getTipoOracion();
		
		assertEquals(nombreEsperado, actual01);
		assertEquals(nombreEsperado, actual02);
		assertEquals(nombreEsperado, actual03);
		
	}
	void test03() {
		Carrera c01 =new Carrera("Licenciatura en Sistemas","Lic. en Sistemas","71/08");
		String nombreEsperado = "LS";
		
		Carrera c02 =new Carrera("Abogacia","Abog","128/01");
		String nombreEsperado = "A";
		
		Carrera c03 =new Carrera("Ingenieria Mecatronica","Ing. Mecatronica","128/01");
		String nombreEsperado = "IM";
		
		Carrera c04 =new Carrera("Licenciatura en Enfermeria","Lic. en Efermeria","128/01");
		String nombreEsperado = "LE";
		
		String actual01 = c01.getnom();
		String actual02 = c02.getnom();
		String actual03 = c03.getnom();
		
		assertEquals(nombreEsperado, actual01);
		assertEquals(nombreEsperado, actual02);
		assertEquals(nombreEsperado, actual03);
		
	}
	

}
