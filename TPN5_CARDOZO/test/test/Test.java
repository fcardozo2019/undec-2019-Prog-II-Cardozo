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
		
		boolean actual04= c01.addMateria(m01);
		
		//Assert
		assertEquals(true,actual01);
		assertEquals(false,actual03);
		assertEquals(true,actual04);
	}
	@org.junit.jupiter.api.Test
	void test06() {
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		Materia m02 = new Materia("Progracacion I", "Prog. I", AnioAcademico.III);
		Materia listadMaterias [] = new Materia [3];
		listadMaterias[0]=m02;
		//Act
		boolean actual01=c01.addMateria(m02);
		boolean actual02=c01.addMateria(m02);
		Materia [] actual03=c01.getMaterias(AnioAcademico.III);
		
		//Assert 
		assertEquals(true, actual01);
		assertEquals(false, actual02);
		assertArrayEquals(listadMaterias, actual03);
	}	
	@org.junit.jupiter.api.Test
	void test07() {
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		Materia m01 = new Materia("Progracacion I", "Prog. I", AnioAcademico.I);
		Materia m02 = new Materia("Sistemas I", "Sist. I", AnioAcademico.I);
		Materia m03 = new Materia("Analisis Matematico II", "An. Mat. II", AnioAcademico.I);
		Materia m04 = new Materia("Sistemas Operativos II", "Sist Ope. II", AnioAcademico.I);
		//Act
		boolean actual01=c01.addMateria(m01);
		boolean actual02=c01.addMateria(m02);
		boolean actual03=c01.addMateria(m03);
		boolean actual04=c01.addMateria(m04);
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(false, actual04);
	}
	@org.junit.jupiter.api.Test
	void test09(){
		//Arrange
		Materia m01 = new Materia("Progracacion I", "Prog. I", AnioAcademico.I);
		String anioCalendario= "2019";
		String fechaInicio= "12/12";
		String fechaFin= "12/12";
		Alumno listadoAlumno[]= null
		Implementacion inm01 = new Implementacion(m1, anioCalendario, fechaInicio, FechaFin);
		//Act
		Materia act01 = imp01.getMateria();
		String act02 = imp01.getAnioCalendario();
		String act02 = imp01.getFechaInicio();
		String act03 = imp01.getFechaInicio();
		Alumnos act05 = imp01.getListadoAlumno().Length();
		//Assert
		assertEquals(act01, true);
		assertEquals(act02, false);
		assertEquals(act03, false);
		assertEquals(act04, true);
		assertEquals(act05, true);
		assertEquals(act06, false);
	}
	
}
