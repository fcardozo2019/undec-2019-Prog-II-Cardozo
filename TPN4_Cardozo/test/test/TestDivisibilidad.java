package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Divisibilidad;

class TestDivisibilidad {
	@Test
	void test01DivisiblePorDos_NoValido() {
		//Arrange
		//Act
		boolean actual01= Divisibilidad.esDivisiblePorDos(3);
		boolean actual02= Divisibilidad.esDivisiblePorDos(5);
		boolean actual03= Divisibilidad.esDivisiblePorDos(7);
		boolean actual04= Divisibilidad.esDivisiblePorDos(9);
		boolean actual05= Divisibilidad.esDivisiblePorDos(11);
		boolean actual06= Divisibilidad.esDivisiblePorDos(457);
		boolean actual07= Divisibilidad.esDivisiblePorDos(895);
		boolean actual08= Divisibilidad.esDivisiblePorDos(983);
		boolean actual09= Divisibilidad.esDivisiblePorDos(1297);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
	}
	
	void test02DivisiblePorDos_Valido() {
		//Arrange
		//Act
		boolean actual01= Divisibilidad.esDivisiblePorDos(2);
		boolean actual02= Divisibilidad.esDivisiblePorDos(4);
		boolean actual03= Divisibilidad.esDivisiblePorDos(8);
		boolean actual04= Divisibilidad.esDivisiblePorDos(12);
		boolean actual05= Divisibilidad.esDivisiblePorDos(18);
		boolean actual06= Divisibilidad.esDivisiblePorDos(44);
		boolean actual07= Divisibilidad.esDivisiblePorDos(220);
		boolean actual08= Divisibilidad.esDivisiblePorDos(480);
		boolean actual09= Divisibilidad.esDivisiblePorDos(2000);
		
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
	}
	void test03DivisiblePorTres_NoValido() {
		
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorTres(7);
		boolean actual02 = Divisibilidad.esDivisiblePorTres(8);
		boolean actual03 = Divisibilidad.esDivisiblePorTres(11);
		boolean actual04 = Divisibilidad.esDivisiblePorTres(14);
		boolean actual05 = Divisibilidad.esDivisiblePorTres(16);
		boolean actual06 = Divisibilidad.esDivisiblePorTres(20);
		boolean actual07 = Divisibilidad.esDivisiblePorTres(61);
		boolean actual08 = Divisibilidad.esDivisiblePorTres(100);
		boolean actual09 = Divisibilidad.esDivisiblePorTres(530);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
	}
	
	void test04DivisiblePorTres_Valido() {
		
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorTres(3);
		boolean actual02 = Divisibilidad.esDivisiblePorTres(6);
		boolean actual03 = Divisibilidad.esDivisiblePorTres(9);
		boolean actual04 = Divisibilidad.esDivisiblePorTres(21);
		boolean actual05 = Divisibilidad.esDivisiblePorTres(24);
		boolean actual06 = Divisibilidad.esDivisiblePorTres(30);
		boolean actual07 = Divisibilidad.esDivisiblePorTres(333);
		boolean actual08 = Divisibilidad.esDivisiblePorTres(243);
		boolean actual09 = Divisibilidad.esDivisiblePorTres(729);
		
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
	}
	
	void test05DivisiblePorCuatro_NoValido() {
		//Arrange
		//Act
	
		boolean actual01 = Divisibilidad.esDivisiblePorCuatro(5);
		boolean actual02 = Divisibilidad.esDivisiblePorCuatro(10);
		boolean actual03 = Divisibilidad.esDivisiblePorCuatro(15);
		boolean actual04 = Divisibilidad.esDivisiblePorCuatro(22);
		boolean actual05 = Divisibilidad.esDivisiblePorCuatro(39);
		boolean actual06 = Divisibilidad.esDivisiblePorCuatro(55);
		boolean actual07 = Divisibilidad.esDivisiblePorCuatro(99);
		boolean actual08 = Divisibilidad.esDivisiblePorCuatro(159);
		boolean actual09 = Divisibilidad.esDivisiblePorCuatro(300);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
	}

	void test06DivisiblePorCuatro_NoValido() {
		//Arrange
		//Act
	
		boolean actual01 = Divisibilidad.esDivisiblePorCuatro(5);
		boolean actual02 = Divisibilidad.esDivisiblePorCuatro(10);
		boolean actual03 = Divisibilidad.esDivisiblePorCuatro(15);
		boolean actual04 = Divisibilidad.esDivisiblePorCuatro(22);
		boolean actual05 = Divisibilidad.esDivisiblePorCuatro(39);
		boolean actual06 = Divisibilidad.esDivisiblePorCuatro(55);
		boolean actual07 = Divisibilidad.esDivisiblePorCuatro(99);
		boolean actual08 = Divisibilidad.esDivisiblePorCuatro(159);
		boolean actual09 = Divisibilidad.esDivisiblePorCuatro(300);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
	}
	
	void test07DivisiblePorCuatro_Valido() {
		//Arrange
		//Act
	
		boolean actual01 = Divisibilidad.esDivisiblePorCuatro(4);
		boolean actual02 = Divisibilidad.esDivisiblePorCuatro(8);
		boolean actual03 = Divisibilidad.esDivisiblePorCuatro(12);
		boolean actual04 = Divisibilidad.esDivisiblePorCuatro(16);
		boolean actual05 = Divisibilidad.esDivisiblePorCuatro(20);
		boolean actual06 = Divisibilidad.esDivisiblePorCuatro(32);
		boolean actual07 = Divisibilidad.esDivisiblePorCuatro(40);
		boolean actual08 = Divisibilidad.esDivisiblePorCuatro(80);
		boolean actual09 = Divisibilidad.esDivisiblePorCuatro(200);
		
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
	}
	void test07DivisiblePorCinco_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorCinco(6);
		boolean actual02 = Divisibilidad.esDivisiblePorCinco(12);
		boolean actual03 = Divisibilidad.esDivisiblePorCinco(19);
		boolean actual04 = Divisibilidad.esDivisiblePorCinco(29);
		boolean actual05 = Divisibilidad.esDivisiblePorCinco(62);
		boolean actual06 = Divisibilidad.esDivisiblePorCinco(90);
		boolean actual07 = Divisibilidad.esDivisiblePorCinco(187);
		boolean actual08 = Divisibilidad.esDivisiblePorCinco(341);
		boolean actual09 = Divisibilidad.esDivisiblePorCinco(499);
		//Assert
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
		}
	void test08DivisiblePorCinco_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorCinco(5);
		boolean actual02 = Divisibilidad.esDivisiblePorCinco(10);
		boolean actual03 = Divisibilidad.esDivisiblePorCinco(15);
		boolean actual04 = Divisibilidad.esDivisiblePorCinco(20);
		boolean actual05 = Divisibilidad.esDivisiblePorCinco(25);
		boolean actual06 = Divisibilidad.esDivisiblePorCinco(30);
		boolean actual07 = Divisibilidad.esDivisiblePorCinco(40);
		boolean actual08 = Divisibilidad.esDivisiblePorCinco(45);
		boolean actual09 = Divisibilidad.esDivisiblePorCinco(50);
		//Assert
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
		}
		
	void test09DivisiblePorSeis_NoValido() {
			//Arrange
			//Act
		boolean actual01 = Divisibilidad.esDivisiblePorSeis(7);
		boolean actual02 = Divisibilidad.esDivisiblePorSeis(11);
		boolean actual03 = Divisibilidad.esDivisiblePorSeis(15);
		boolean actual04 = Divisibilidad.esDivisiblePorSeis(20);
		boolean actual05 = Divisibilidad.esDivisiblePorSeis(25);
		boolean actual06 = Divisibilidad.esDivisiblePorSeis(38);
		boolean actual07 = Divisibilidad.esDivisiblePorSeis(41);
		boolean actual08 = Divisibilidad.esDivisiblePorSeis(59);
		boolean actual09 = Divisibilidad.esDivisiblePorSeis(61);
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
			}
	void test10DivisiblePorSeis_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorSeis(6);
		boolean actual02 = Divisibilidad.esDivisiblePorSeis(12);
		boolean actual03 = Divisibilidad.esDivisiblePorSeis(18);
		boolean actual04 = Divisibilidad.esDivisiblePorSeis(24);
		boolean actual05 = Divisibilidad.esDivisiblePorSeis(30);
		boolean actual06 = Divisibilidad.esDivisiblePorSeis(36);
		boolean actual07 = Divisibilidad.esDivisiblePorSeis(42);
		boolean actual08 = Divisibilidad.esDivisiblePorSeis(48);
		boolean actual09 = Divisibilidad.esDivisiblePorSeis(54);
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
	}
	void test11DivisiblePorSiete_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorSiete(8);
		boolean actual02 = Divisibilidad.esDivisiblePorSiete(16);
		boolean actual03 = Divisibilidad.esDivisiblePorSiete(20);
		boolean actual04 = Divisibilidad.esDivisiblePorSiete(25);
		boolean actual05 = Divisibilidad.esDivisiblePorSiete(45);
		boolean actual06 = Divisibilidad.esDivisiblePorSiete(55);
		boolean actual07 = Divisibilidad.esDivisiblePorSiete(95);
		boolean actual08 = Divisibilidad.esDivisiblePorSiete(405);
		boolean actual09 = Divisibilidad.esDivisiblePorSiete(888);
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
		}
	void test12DivisiblePorSiete_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorSiete(7);
		boolean actual02 = Divisibilidad.esDivisiblePorSiete(14);
		boolean actual03 = Divisibilidad.esDivisiblePorSiete(21);
		boolean actual04 = Divisibilidad.esDivisiblePorSiete(28);
		boolean actual05 = Divisibilidad.esDivisiblePorSiete(35);
		boolean actual06 = Divisibilidad.esDivisiblePorSiete(42);
		boolean actual07 = Divisibilidad.esDivisiblePorSiete(49);
		boolean actual08 = Divisibilidad.esDivisiblePorSiete(56);
		boolean actual09 = Divisibilidad.esDivisiblePorSiete(63);
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
		}
	void test13DivisiblePorOcho_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorOcho(10);
		boolean actual02 = Divisibilidad.esDivisiblePorOcho(35);
		boolean actual03 = Divisibilidad.esDivisiblePorOcho(49);
		boolean actual04 = Divisibilidad.esDivisiblePorOcho(50);
		boolean actual05 = Divisibilidad.esDivisiblePorOcho(61);
		boolean actual06 = Divisibilidad.esDivisiblePorOcho(97);
		boolean actual07 = Divisibilidad.esDivisiblePorOcho(103);
		boolean actual08 = Divisibilidad.esDivisiblePorOcho(261);
		boolean actual09 = Divisibilidad.esDivisiblePorOcho(421);
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
		}
	void test14DivisiblePorOcho_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorOcho(8);
		boolean actual02 = Divisibilidad.esDivisiblePorOcho(16);
		boolean actual03 = Divisibilidad.esDivisiblePorOcho(24);
		boolean actual04 = Divisibilidad.esDivisiblePorOcho(32);
		boolean actual05 = Divisibilidad.esDivisiblePorOcho(40);
		boolean actual06 = Divisibilidad.esDivisiblePorOcho(48);
		boolean actual07 = Divisibilidad.esDivisiblePorOcho(56);
		boolean actual08 = Divisibilidad.esDivisiblePorOcho(64);
		boolean actual09 = Divisibilidad.esDivisiblePorOcho(72);
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
		}
	void test15DivisiblePorNueve_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorNueve(11);
		boolean actual02 = Divisibilidad.esDivisiblePorNueve(19);
		boolean actual03 = Divisibilidad.esDivisiblePorNueve(29);
		boolean actual04 = Divisibilidad.esDivisiblePorNueve(51);
		boolean actual05 = Divisibilidad.esDivisiblePorNueve(71);
		boolean actual06 = Divisibilidad.esDivisiblePorNueve(100);
		boolean actual07 = Divisibilidad.esDivisiblePorNueve(154);
		boolean actual08 = Divisibilidad.esDivisiblePorNueve(302);
		boolean actual09 = Divisibilidad.esDivisiblePorNueve(400);
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
		}
	void test16DivisiblePorNueve_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorNueve(9);
		boolean actual02 = Divisibilidad.esDivisiblePorNueve(18);
		boolean actual03 = Divisibilidad.esDivisiblePorNueve(27);
		boolean actual04 = Divisibilidad.esDivisiblePorNueve(36);
		boolean actual05 = Divisibilidad.esDivisiblePorNueve(45);
		boolean actual06 = Divisibilidad.esDivisiblePorNueve(54);
		boolean actual07 = Divisibilidad.esDivisiblePorNueve(63);
		boolean actual08 = Divisibilidad.esDivisiblePorNueve(72);
		boolean actual09 = Divisibilidad.esDivisiblePorNueve(81);
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
		}
	void test17DivisiblePorDiez_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorDiez(11);
		boolean actual02 = Divisibilidad.esDivisiblePorDiez(21);
		boolean actual03 = Divisibilidad.esDivisiblePorDiez(51);
		boolean actual04 = Divisibilidad.esDivisiblePorDiez(63);
		boolean actual05 = Divisibilidad.esDivisiblePorDiez(86);
		boolean actual06 = Divisibilidad.esDivisiblePorDiez(91);
		boolean actual07 = Divisibilidad.esDivisiblePorDiez(131);
		boolean actual08 = Divisibilidad.esDivisiblePorDiez(259);
		boolean actual09 = Divisibilidad.esDivisiblePorDiez(411);
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
		}
	void test18DivisiblePorDiez_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorDiez(10);
		boolean actual02 = Divisibilidad.esDivisiblePorDiez(20);
		boolean actual03 = Divisibilidad.esDivisiblePorDiez(30);
		boolean actual04 = Divisibilidad.esDivisiblePorDiez(40);
		boolean actual05 = Divisibilidad.esDivisiblePorDiez(50);
		boolean actual06 = Divisibilidad.esDivisiblePorDiez(60);
		boolean actual07 = Divisibilidad.esDivisiblePorDiez(70);
		boolean actual08 = Divisibilidad.esDivisiblePorDiez(80);
		boolean actual09 = Divisibilidad.esDivisiblePorDiez(90);
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
		}
	void test19DivisiblePorOnce_NoValido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorOnce(12);
		boolean actual02 = Divisibilidad.esDivisiblePorOnce(25);
		boolean actual03 = Divisibilidad.esDivisiblePorOnce(41);
		boolean actual04 = Divisibilidad.esDivisiblePorOnce(69);
		boolean actual05 = Divisibilidad.esDivisiblePorOnce(80);
		boolean actual06 = Divisibilidad.esDivisiblePorOnce(100);
		boolean actual07 = Divisibilidad.esDivisiblePorOnce(211);
		boolean actual08 = Divisibilidad.esDivisiblePorOnce(631);
		boolean actual09 = Divisibilidad.esDivisiblePorOnce(789);
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
		}
	void test20DivisiblePorOnce_Valido() {
		//Arrange
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorOnce(11);
		boolean actual02 = Divisibilidad.esDivisiblePorOnce(22);
		boolean actual03 = Divisibilidad.esDivisiblePorOnce(33);
		boolean actual04 = Divisibilidad.esDivisiblePorOnce(44);
		boolean actual05 = Divisibilidad.esDivisiblePorOnce(55);
		boolean actual06 = Divisibilidad.esDivisiblePorOnce(66);
		boolean actual07 = Divisibilidad.esDivisiblePorOnce(77);
		boolean actual08 = Divisibilidad.esDivisiblePorOnce(88);
		boolean actual09 = Divisibilidad.esDivisiblePorOnce(99);
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(true, actual04);
		assertEquals(true, actual05);
		assertEquals(true, actual06);
		assertEquals(true, actual07);
		assertEquals(true, actual08);
		assertEquals(true, actual09);
		}
}
