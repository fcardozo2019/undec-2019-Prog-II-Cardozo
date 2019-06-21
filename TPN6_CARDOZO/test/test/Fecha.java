package test;

public class Fecha {

		private int dia;
		private int mes;
		private int anio;
		
		
		public Fecha(int dia, int mes, int anio) {
			this.dia = dia;
			this.mes = mes;
			this.anio = anio;
		}

		public Fecha(String expectedFechaCorta) {
			if(dia<30^dia>1)
				return dia;
		}

		public Fecha(String string, String string2, String string3) {
			// TODO Auto-generated constructor stub
		}

		public void setDia(int dia) {
			this.dia = dia;
		}

		public void setMes(int mes) {
			this.mes = mes;
		}

		public void setAnio(int anio) {
			this.anio = anio;
		}

		public int getDia() {
			return dia;
		}

		public int getMes() {
			return mes;
		}
		
		public int getAnio() {
			return anio;
		}

		public String getFechaCorta() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getFecha() {
			// TODO Auto-generated method stub
			return getFechaCorta();
		}

		public boolean esMayorQue(Fecha f01) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + anio;
			result = prime * result + dia;
			result = prime * result + mes;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return false;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Fecha other = (Fecha) obj;
			if (anio != other.anio)
				return false;
			if (dia != other.dia)
				return false;
			if (mes != other.mes)
				return false;
			return true;
		}

	

}
