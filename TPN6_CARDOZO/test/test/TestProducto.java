package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProducto {
	private String codigo;
	private String nombre;
	private precio precio[];
	
	/**}
	 * Validar el constructor de producto junto con los getter de nombre y codigo.
	 * 
	 */
	@Test
	void test01() {
		//String expectedNombre=("") ;
		int actualDia= c01.getDia();
		int	actualMes= c01.getMes();
		int actualAnio=c01.getAnio();
	}
	
	/**}
	 * Validar que un producto devuelva como precio -1 cuando no tiene cargado ningun precio.
	 * 
	 */
	@Test
	void test02() {
		
	}
	
	/**}
	 * Validar que un producto cargue adecuadamente varios precio (con fechas distintas pero siemre progresivas)
	 * y en medio de cada carga que el metodo getLastPrecio funcione adecuadamente.
	 * 
	 */
	@Test
	void test03() {
		
	}
	
	/**}
	 * Validar que un producto no cargue un nuevo precio cuando la fecha sean anterior o igual 
	 * a la última.
	 * 
	 */
	@Test
	void test04() {
	
		
	}
	
	/**}
	 * Validar que el método removePrecio elimine adecuadamente los precios.
	
	 * 
	 */
	@Test
	void test05() {
		
	}

}
