package dominio;

public class Materia {
	private String nombre;
	private String abreviatura;
	private AnioAcademico anio;
	
	
	public Materia(String nombre, String abreviatura, AnioAcademico anio) {
		super();
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.anio = anio;
	
	}
	public String getNombre() {
		return nombre;
	}
	
	public String getAbreviatura() {
		return abreviatura;
	}

	public AnioAcademico getAnio() {
		return anio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Materia other = (Materia) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
	
}
