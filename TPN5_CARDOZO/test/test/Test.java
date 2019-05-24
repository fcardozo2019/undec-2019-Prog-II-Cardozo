package test;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test01() {
		//Arrange
		String expectedNombre=("Licenciatura en Enologia");
		String expectedAbreviatura=("Lic.Enolog.");
		String expectedPlan=("128/12");
		//Act
		Carrera c01= new Carrera(expectedNombre,expectedAbreviatura,expectedPlan);
		String actualNombre=c01.getNombre();
		String actualAbreviatura=c01.getAbreviatura();
		String actualPlan=c01.getPlan();
		//Assert
		assertEquals(expectedNombre,actualNombre);
		assertEquals(expectedAbreviatura,actualAbreviatura);
		assertEquals(expectedPlan,actualPlan);
	}

	
	@org.junit.jupiter.api.Test
	void test02() {
		//Arrange
		Carrera c01= new Carrera("Licenciatura en sistemas","Lic. Sist.","071/08");
		Carrera c02= new Carrera("Licenciatura en sistemas","Lic. Sist.","070/08");
		Carrera c03= new Carrera("Ingenieria en sistemas","Ing. Sist.","072/08");
		//Act
		boolean actual01=c01.equals(c02);
		boolean actual02=c01.equals(c03);
		//Assert
		assertEquals(false,actual01);
		assertEquals(true,actual02);
	}
	

	void test03() {
		//Arrange
		String expectedNombre=("ProgramacionII");
		String expectedAbreviatura=("PII");
		AnioAcademico expectedAnio=Anioacademico.III;
		//Act
		Materia m01= new Carrera(expectedNombre,expectedAbreviatura,expectedAnio);
		String actualNombre=m01.getNombre();
		String actualAbreviatura=m01.getAbreviatura();
		AnioAcademico actualAnio=m01.getAnio();
		//Assert
		assertEquals(expectedNombre,actualNombre);
		assertEquals(expectedAbreviatura,actualAbreviatura);
		assertEquals(expectedAnio,actualAnio);
	}
	
	@org.junit.jupiter.api.Test
	void test04() {
		//Arrange
		Materia m01= new Materia("Programacion","Prog.","II");
		Materia m02= new Materia("Sistemas","Sist.","II");
		Materia m03= new Materia("Economia","Eco.","II");
		//Act
		boolean actual01=c01.equals(c02);
		boolean actual02=c01.equals(c03);
		//Assert
		assertEquals(false,actual01);
		assertEquals(true,actual02);
	}
	
	
}
