package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.ValidarContrasenia;

class TestLogin {
	@Test
	void test01ContraseniaNoValida_LargoMenorAlMinimo() {
	//Arrange
	String passNoValida01 = "123456789";
	String passNoValida02 = "12345678";
	String passNoValida03 = "1234567";
	String passNoValida04 = "123456";
	String passNoValida05 = "12345";
	String passNoValida06 = "1234";
	String passNoValida07 = "123";
	String passNoValida08 = "12";
	String passNoValida09 = "1";
	String passNoValida10 = "";
	String passNoValida11 = null;

	//Act
	boolean actual01 = ValidarContrasenia.esLargoValido(passNoValida01);
	boolean actual02 = ValidarContrasenia.esLargoValido(passNoValida02);
	boolean actual03 = ValidarContrasenia.esLargoValido(passNoValida03);
	boolean actual04 = ValidarContrasenia.esLargoValido(passNoValida04);
	boolean actual05 = ValidarContrasenia.esLargoValido(passNoValida05);
	boolean actual06 = ValidarContrasenia.esLargoValido(passNoValida06);
	boolean actual07 = ValidarContrasenia.esLargoValido(passNoValida07);
	boolean actual08 = ValidarContrasenia.esLargoValido(passNoValida08);
	boolean actual09 = ValidarContrasenia.esLargoValido(passNoValida09);
	boolean actual10 = ValidarContrasenia.esLargoValido(passNoValida10);
	boolean actual11 = ValidarContrasenia.esLargoValido(passNoValida11);

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
	assertEquals(false, actual10);
	assertEquals(false, actual11);
	}

	@Test
	void test01ContraseniaNoValida_LargoPermitido() {
	//Arrange
	String passNoValida01 = "1234567890";
	String passNoValida02 = "12345678901";
	String passNoValida03 = "123456789012";
	String passNoValida04 = "1234567890123";
	String passNoValida05 = "12345678901234";
	String passNoValida06 = "123456789012345";
	String passNoValida07 = "1234567890123456";
	String passNoValida08 = "12345678901234567";
	String passNoValida09 = "123456789012345678";

	//Act
	boolean actual01 = ValidarContrasenia.esLargoValido(passNoValida01);
	boolean actual02 = ValidarContrasenia.esLargoValido(passNoValida02);
	boolean actual03 = ValidarContrasenia.esLargoValido(passNoValida03);
	boolean actual04 = ValidarContrasenia.esLargoValido(passNoValida04);
	boolean actual05 = ValidarContrasenia.esLargoValido(passNoValida05);
	boolean actual06 = ValidarContrasenia.esLargoValido(passNoValida06);
	boolean actual07 = ValidarContrasenia.esLargoValido(passNoValida07);
	boolean actual08 = ValidarContrasenia.esLargoValido(passNoValida08);
	boolean actual09 = ValidarContrasenia.esLargoValido(passNoValida09);

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
	
	void test02ContraseniaNoValida_DosLetrasMinusculas() {
		//Arrange
		String passNoValida01 = "1234567az3";
		String passNoValida02 = "a12345678z9";
		String passNoValida03 = "1a234567z68";
		String passNoValida04 = "12a3456z478";
		String passNoValida05 = "123a45z2789";
		String passNoValida06 = "12345z8901";
		String passNoValida07 = "1234z67891";
		String passNoValida08 = "12a5689123";
		String passNoValida09 = "1";
		String passNoValida10 = "";
		String passNoValida11 = null;

		//Act
		boolean actual01 = ValidarContrasenia.DosLetrasMinusculas(passNoValida01);
		boolean actual02 = ValidarContrasenia.DosLetrasMinusculas(passNoValida02);
		boolean actual03 = ValidarContrasenia.DosLetrasMinusculas(passNoValida03);
		boolean actual04 = ValidarContrasenia.DosLetrasMinusculas(passNoValida04);
		boolean actual05 = ValidarContrasenia.DosLetrasMinusculas(passNoValida05);
		boolean actual06 = ValidarContrasenia.DosLetrasMinusculas(passNoValida06);
		boolean actual07 = ValidarContrasenia.DosLetrasMinusculas(passNoValida07);
		boolean actual08 = ValidarContrasenia.DosLetrasMinusculas(passNoValida08);
		boolean actual09 = ValidarContrasenia.DosLetrasMinusculas(passNoValida09);
		boolean actual10 = ValidarContrasenia.DosLetrasMinusculas(passNoValida10);
		boolean actual11 = ValidarContrasenia.DosLetrasMinusculas(passNoValida11);

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
		assertEquals(false, actual10);
		assertEquals(false, actual11);
		}
	void test02ContraseniaValida_DosLetrasMinusculas() {
		//Arrange
		String passNoValida01 = "1234567az";
		String passNoValida02 = "a12345678z";
		String passNoValida03 = "1a234567z8";
		String passNoValida04 = "12a3456z78";
		String passNoValida05 = "123a45z789";
		String passNoValida06 = "1234az8901";
		String passNoValida07 = "123az67891";
		String passNoValida08 = "12az689123";
		String passNoValida09 = "1az456890";
		String passNoValida10 = "";
		String passNoValida11 = null;

		//Act
		boolean actual01 = ValidarContrasenia.DosLetrasMinusculas(passNoValida01);
		boolean actual02 = ValidarContrasenia.DosLetrasMinusculas(passNoValida02);
		boolean actual03 = ValidarContrasenia.DosLetrasMinusculas(passNoValida03);
		boolean actual04 = ValidarContrasenia.DosLetrasMinusculas(passNoValida04);
		boolean actual05 = ValidarContrasenia.DosLetrasMinusculas(passNoValida05);
		boolean actual06 = ValidarContrasenia.DosLetrasMinusculas(passNoValida06);
		boolean actual07 = ValidarContrasenia.DosLetrasMinusculas(passNoValida07);
		boolean actual08 = ValidarContrasenia.DosLetrasMinusculas(passNoValida08);
		boolean actual09 = ValidarContrasenia.DosLetrasMinusculas(passNoValida09);
		boolean actual10 = ValidarContrasenia.DosLetrasMinusculas(passNoValida10);
		boolean actual11 = ValidarContrasenia.DosLetrasMinusculas(passNoValida11);

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
		assertEquals(true, actual10);
		assertEquals(true, actual11);
	}
	void test03ContraseniaNoValida_DosLetrasMayusculas() {
		//Arrange
		String passNoValida01 = "1234567AZ3";
		String passNoValida02 = "A12345678Z9";
		String passNoValida03 = "1A234567R68";
		String passNoValida04 = "12C3456L478";
		String passNoValida05 = "123D45F2789";
		String passNoValida06 = "12345G8901";
		String passNoValida07 = "1234Y67891";
		String passNoValida08 = "12P5689123";
		String passNoValida09 = "1";
		String passNoValida10 = "";
		String passNoValida11 = null;

		//Act
		boolean actual01 = ValidarContrasenia.DosLetrasMayusculas(passNoValida01);
		boolean actual02 = ValidarContrasenia.DosLetrasMayusculas(passNoValida02);
		boolean actual03 = ValidarContrasenia.DosLetrasMayusculas(passNoValida03);
		boolean actual04 = ValidarContrasenia.DosLetrasMayusculas(passNoValida04);
		boolean actual05 = ValidarContrasenia.DosLetrasMayusculas(passNoValida05);
		boolean actual06 = ValidarContrasenia.DosLetrasMayusculas(passNoValida06);
		boolean actual07 = ValidarContrasenia.DosLetrasMayusculas(passNoValida07);
		boolean actual08 = ValidarContrasenia.DosLetrasMayusculas(passNoValida08);
		boolean actual09 = ValidarContrasenia.DosLetrasMayusculas(passNoValida09);
		boolean actual10 = ValidarContrasenia.DosLetrasMayusculas(passNoValida10);
		boolean actual11 = ValidarContrasenia.DosLetrasMayusculas(passNoValida11);

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
		assertEquals(false, actual10);
		assertEquals(false, actual11);
		}
	void test03ContraseniaValida_DosLetrasMinusculas() {
		//Arrange
		String passNoValida01 = "1234567AZ";
		String passNoValida02 = "A12345678Z";
		String passNoValida03 = "1A234567Z8";
		String passNoValida04 = "12U3456L78";
		String passNoValida05 = "123U45W789";
		String passNoValida06 = "1234DA8901";
		String passNoValida07 = "123TR67891";
		String passNoValida08 = "12KF689123";
		String passNoValida09 = "1EF456890";
		String passNoValida10 = "";
		String passNoValida11 = null;

		//Act
		boolean actual01 = ValidarContrasenia.DosLetrasMayusculas(passNoValida01);
		boolean actual02 = ValidarContrasenia.DosLetrasMayusculas(passNoValida02);
		boolean actual03 = ValidarContrasenia.DosLetrasMayusculas(passNoValida03);
		boolean actual04 = ValidarContrasenia.DosLetrasMayusculas(passNoValida04);
		boolean actual05 = ValidarContrasenia.DosLetrasMayusculas(passNoValida05);
		boolean actual06 = ValidarContrasenia.DosLetrasMayusculas(passNoValida06);
		boolean actual07 = ValidarContrasenia.DosLetrasMayusculas(passNoValida07);
		boolean actual08 = ValidarContrasenia.DosLetrasMayusculas(passNoValida08);
		boolean actual09 = ValidarContrasenia.DosLetrasMayusculas(passNoValida09);
		boolean actual10 = ValidarContrasenia.DosLetrasMayusculas(passNoValida10);
		boolean actual11 = ValidarContrasenia.DosLetrasMayusculas(passNoValida11);

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
		assertEquals(true, actual10);
		assertEquals(true, actual11);
	}

	void test04ContraseniaNoValida_AlMenosDosNumeros() {
		//Arrange
		String passNoValida01 = "ADCSDEPLES";
		String passNoValida02 = "PROGRAMION";
		String passNoValida03 = "DJSSNCEKDD";
		String passNoValida04 = "EHDMFNJDJD";
		String passNoValida05 = "ANCJDCCSWK";
		String passNoValida06 = "SDNDSJDSJS";
		String passNoValida07 = "SDCSDJRJJR";
		String passNoValida08 = "CDSWJCDWJD";
		String passNoValida09 = "1";
		String passNoValida10 = "";
		String passNoValida11 = null;

		//Act
		boolean actual01 = ValidarContrasenia.AlMenosDosNumeros(passNoValida01);
		boolean actual02 = ValidarContrasenia.AlMenosDosNumeros(passNoValida02);
		boolean actual03 = ValidarContrasenia.AlMenosDosNumeros(passNoValida03);
		boolean actual04 = ValidarContrasenia.AlMenosDosNumeros(passNoValida04);
		boolean actual05 = ValidarContrasenia.AlMenosDosNumeros(passNoValida05);
		boolean actual06 = ValidarContrasenia.AlMenosDosNumeros(passNoValida06);
		boolean actual07 = ValidarContrasenia.AlMenosDosNumeros(passNoValida07);
		boolean actual08 = ValidarContrasenia.AlMenosDosNumeros(passNoValida08);
		boolean actual09 = ValidarContrasenia.AlMenosDosNumeros(passNoValida09);
		boolean actual10 = ValidarContrasenia.AlMenosDosNumeros(passNoValida10);
		boolean actual11 = ValidarContrasenia.AlMenosDosNumeros(passNoValida11);

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
		assertEquals(false, actual10);
		assertEquals(false, actual11);
		}
	void test04ContraseniaValida_AlMenosDosNumeros() {
		//Arrange
		String passNoValida01 = "33CSDEPLES";
		String passNoValida02 = "PR67RAMION";
		String passNoValida03 = "DJS67CEKDD";
		String passNoValida04 = "EHD45NJDJD";
		String passNoValida05 = "ANCJDCCS09";
		String passNoValida06 = "SDNDSJ61JS";
		String passNoValida07 = "SDCSD24JJR";
		String passNoValida08 = "CDSWJ04WJD";
		String passNoValida09 = "1";
		String passNoValida10 = "";
		String passNoValida11 = null;

		//Act
		boolean actual01 = ValidarContrasenia.AlMenosDosNumeros(passNoValida01);
		boolean actual02 = ValidarContrasenia.AlMenosDosNumeros(passNoValida02);
		boolean actual03 = ValidarContrasenia.AlMenosDosNumeros(passNoValida03);
		boolean actual04 = ValidarContrasenia.AlMenosDosNumeros(passNoValida04);
		boolean actual05 = ValidarContrasenia.AlMenosDosNumeros(passNoValida05);
		boolean actual06 = ValidarContrasenia.AlMenosDosNumeros(passNoValida06);
		boolean actual07 = ValidarContrasenia.AlMenosDosNumeros(passNoValida07);
		boolean actual08 = ValidarContrasenia.AlMenosDosNumeros(passNoValida08);
		boolean actual09 = ValidarContrasenia.AlMenosDosNumeros(passNoValida09);
		boolean actual10 = ValidarContrasenia.AlMenosDosNumeros(passNoValida10);
		boolean actual11 = ValidarContrasenia.AlMenosDosNumeros(passNoValida11);

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
		assertEquals(false, actual10);
		assertEquals(false, actual11);
		}
	void test05ContraseniaNoValida_AlMenosDosCaracteresEspeciales() {
		//Arrange
		String passNoValida01 = "ADCSDEPLES";
		String passNoValida02 = "PROGRAMION";
		String passNoValida03 = "DJSSNCEKDD";
		String passNoValida04 = "EHDMFNJDJD";
		String passNoValida05 = "ANCJDCCSWK";
		String passNoValida06 = "SDNDSJDSJS";
		String passNoValida07 = "SDCSDJRJJR";
		String passNoValida08 = "CDSWJCDWJD";
		String passNoValida09 = "1";
		String passNoValida10 = "";
		String passNoValida11 = null;

		//Act
		boolean actual01 = ValidarContrasenia.AlMenosDosNumeros(passNoValida01);
		boolean actual02 = ValidarContrasenia.AlMenosDosNumeros(passNoValida02);
		boolean actual03 = ValidarContrasenia.AlMenosDosNumeros(passNoValida03);
		boolean actual04 = ValidarContrasenia.AlMenosDosNumeros(passNoValida04);
		boolean actual05 = ValidarContrasenia.AlMenosDosNumeros(passNoValida05);
		boolean actual06 = ValidarContrasenia.AlMenosDosNumeros(passNoValida06);
		boolean actual07 = ValidarContrasenia.AlMenosDosNumeros(passNoValida07);
		boolean actual08 = ValidarContrasenia.AlMenosDosNumeros(passNoValida08);
		boolean actual09 = ValidarContrasenia.AlMenosDosNumeros(passNoValida09);
		boolean actual10 = ValidarContrasenia.AlMenosDosNumeros(passNoValida10);
		boolean actual11 = ValidarContrasenia.AlMenosDosNumeros(passNoValida11);

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
		assertEquals(false, actual10);
		assertEquals(false, actual11);
		}
	void test05ContraseniaValida_AlMenosDosCaracteresEspeciales() {
		//Arrange
		String passNoValida01 = "AD#%SDEPLES";
		String passNoValida02 = "PROGR$&ION";
		String passNoValida03 = "DJSSNCEKDD";
		String passNoValida04 = "EH$&FNJDJD";
		String passNoValida05 = "ANCJ$&CSWK";
		String passNoValida06 = "SDNDSJ$&JS";
		String passNoValida07 = "SDC$&JRJJR";
		String passNoValida08 = "CDSWJC$&JD";
		String passNoValida09 = "$&";
		String passNoValida10 = "";
		String passNoValida11 = null;

		//Act
		boolean actual01 = ValidarContrasenia.AlMenosDosNumeros(passNoValida01);
		boolean actual02 = ValidarContrasenia.AlMenosDosNumeros(passNoValida02);
		boolean actual03 = ValidarContrasenia.AlMenosDosNumeros(passNoValida03);
		boolean actual04 = ValidarContrasenia.AlMenosDosNumeros(passNoValida04);
		boolean actual05 = ValidarContrasenia.AlMenosDosNumeros(passNoValida05);
		boolean actual06 = ValidarContrasenia.AlMenosDosNumeros(passNoValida06);
		boolean actual07 = ValidarContrasenia.AlMenosDosNumeros(passNoValida07);
		boolean actual08 = ValidarContrasenia.AlMenosDosNumeros(passNoValida08);
		boolean actual09 = ValidarContrasenia.AlMenosDosNumeros(passNoValida09);
		boolean actual10 = ValidarContrasenia.AlMenosDosNumeros(passNoValida10);
		boolean actual11 = ValidarContrasenia.AlMenosDosNumeros(passNoValida11);

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
		assertEquals(false, actual10);
		assertEquals(false, actual11);
		}
	void test06ContraseniaNoValida_CaracteresEspecificos() {
		//Arrange
		String passNoValida01 = "AD#%SDEPLES";
		String passNoValida02 = "PROGR$&ION";
		String passNoValida03 = "DJSSNCEKDD";
		String passNoValida04 = "EH$&FNJDJD";
		String passNoValida05 = "ANCJ$&CSWK";
		String passNoValida06 = "SDNDSJ$&JS";
		String passNoValida07 = "SDC$&JRJJR";
		String passNoValida08 = "CDSWJC$&JD";
		String passNoValida09 = "$&";
		String passNoValida10 = "";
		String passNoValida11 = null;

		//Act
		boolean actual01 = ValidarContrasenia.AlMenosDosNumeros(passNoValida01);
		boolean actual02 = ValidarContrasenia.AlMenosDosNumeros(passNoValida02);
		boolean actual03 = ValidarContrasenia.AlMenosDosNumeros(passNoValida03);
		boolean actual04 = ValidarContrasenia.AlMenosDosNumeros(passNoValida04);
		boolean actual05 = ValidarContrasenia.AlMenosDosNumeros(passNoValida05);
		boolean actual06 = ValidarContrasenia.AlMenosDosNumeros(passNoValida06);
		boolean actual07 = ValidarContrasenia.AlMenosDosNumeros(passNoValida07);
		boolean actual08 = ValidarContrasenia.AlMenosDosNumeros(passNoValida08);
		boolean actual09 = ValidarContrasenia.AlMenosDosNumeros(passNoValida09);
		boolean actual10 = ValidarContrasenia.AlMenosDosNumeros(passNoValida10);
		boolean actual11 = ValidarContrasenia.AlMenosDosNumeros(passNoValida11);

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
		assertEquals(false, actual10);
		assertEquals(false, actual11);
		}
	void test06ContraseniaValida_CaracteresEspecificos() {
		//Arrange
		String passNoValida01 = "AD#%SD32LES";
		String passNoValida02 = "PROGR$&32N";
		String passNoValida03 = "DJSS&%E95D";
		String passNoValida04 = "EH$&FN70JD";
		String passNoValida05 = "ANCJ$&C24K";
		String passNoValida06 = "SD7DSJ$&6S";
		String passNoValida07 = "SDC$&JR78R";
		String passNoValida08 = "C35WJC$&JD";
		String passNoValida09 = "$&";
		String passNoValida10 = "";
		String passNoValida11 = null;

		//Act
		boolean actual01 = ValidarContrasenia.AlMenosDosNumeros(passNoValida01);
		boolean actual02 = ValidarContrasenia.AlMenosDosNumeros(passNoValida02);
		boolean actual03 = ValidarContrasenia.AlMenosDosNumeros(passNoValida03);
		boolean actual04 = ValidarContrasenia.AlMenosDosNumeros(passNoValida04);
		boolean actual05 = ValidarContrasenia.AlMenosDosNumeros(passNoValida05);
		boolean actual06 = ValidarContrasenia.AlMenosDosNumeros(passNoValida06);
		boolean actual07 = ValidarContrasenia.AlMenosDosNumeros(passNoValida07);
		boolean actual08 = ValidarContrasenia.AlMenosDosNumeros(passNoValida08);
		boolean actual09 = ValidarContrasenia.AlMenosDosNumeros(passNoValida09);
		boolean actual10 = ValidarContrasenia.AlMenosDosNumeros(passNoValida10);
		boolean actual11 = ValidarContrasenia.AlMenosDosNumeros(passNoValida11);

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
		assertEquals(false, actual10);
		assertEquals(false, actual11);
		}
}
