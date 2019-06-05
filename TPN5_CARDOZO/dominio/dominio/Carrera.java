package dominio;

public class Carrera {
	private String nombre;
	private String abreviatura;
	private String plan;
	private  Materia listadomateria[];
	
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

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	public String getAbreviatura() {
		// TODO Auto-generated method stub
		return this.abreviatura;
	}

	public String getPlan() {
		// TODO Auto-generated method stub
		return this.plan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((plan == null) ? 0 : plan.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrera other = (Carrera) obj;
		if (plan == null) {
			if (other.plan != null)
				return false;
		} else if (!plan.equals(other.plan))
			return false;
		return true;
	}

	public boolean addMateria(Materia m02) {
		int i;
		for(i=0;i<50;i++) {
			if (listadomateria[i].getNombre().equals(nombre)) {
				return false;
			}
		}

	}
	
}
