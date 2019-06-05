package test;

import static org.junit.jupiter.api.Assertions.*;

import dominio.Materia;
import dominio.AnioAcademico;
import dominio.Carrera;
import dominio.*;

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
		boolean actual01=c01.equals(c01);
		boolean actual02=c01.equals(c02);
		//Assert
		assertEquals(true,actual01);
		assertEquals(false,actual02);
	}
	
	@org.junit.jupiter.api.Test
	void test03() {
		//Arrange
		String expectedNombre=("ProgramacionII");
		String expectedAbreviatura=("PII");
		AnioAcademico expectedAnio=AnioAcademico.III;
		//Act
		Materia m01= new Materia(expectedNombre,expectedAbreviatura,expectedAnio);
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
		Materia m01= new Materia("Programacion","Prog.",AnioAcademico.II);
		Materia m02= new Materia("Sistemas","Sist.",AnioAcademico.II);
		Materia m03= new Materia("Economia","Eco.",AnioAcademico.IV);
		//Act
		boolean actual01=m01.equals(m01);
		boolean actual02=m01.equals(m02);
		//Assert
		assertEquals(true,actual01);
		assertEquals(false,actual02);
	}
	
	@org.junit.jupiter.api.Test
	void test05() {
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist", "071/08");
		Materia m01 = new Materia("Arquitectura de computadora I", "Arq.I", AnioAcademico.II);
		Materia m02 = new Materia("Algebra Lineal", "Alg Lin", AnioAcademico.I);
		String listadoDeMaterias [] = {"Algebra Lineal"}; 
		AnioAcademico anioAcadeBusqueda = AnioAcademico.I;
		
		//Act
		boolean actual01= c01.addMateria(m02);
		boolean actual03= c01.addMateria(m02);
		Materia actual02= c01.getMateria(anioAcadeBusqueda);
		boolean actual04= c01.addMateria(m01);
		
		//Assert
		assertEquals(true,actual01);
		assertEquals(false,actual03);
		assertEquals(listadoDeMaterias[0],actual02.getNombre());
		assertEquals(true,actual04);
	}
	@org.junit.jupiter.api.Test
	void test06() {
		AnioAcademico expectedAnio=AnioAcademico.III;
		//Act
		Materia m01= new Materia(expectedNombre,expectedAbreviatura,expectedAnio);
		AnioAcademico actualAnio=m01.getAnio();
		//Assert

		assertEquals(expectedAnio,actualAnio);
	}
	
}
