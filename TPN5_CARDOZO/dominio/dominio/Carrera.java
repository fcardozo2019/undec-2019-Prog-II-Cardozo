package dominio;

public class Carrera {
	private String nombre;
	private String abreviatura;
	private String plan;
	
	public Carrera(String nombre, String abreviatura, String plan) {
		this.nombre= nombre;
		this.abreviatura = abreviatura;
		this.plan= plan;
		
		
	}

	public String getNombreEnMayuscula() {
	
		return nombre.toUpperCase();
	}

	public String getTipoOracion() {
		// TODO Auto-generated method stub
		return nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toUpperCase();
	}

	public String getnom() {
		String []palabras= nombre.split(" ");
		String resultado="";
			for(int i=0; i < palabras.length;i++)
				if(palabras[i].length() > 3)
					resultado+=palabras[i].substring(0, 1).toUpperCase();
		return resultado;
	}
}
