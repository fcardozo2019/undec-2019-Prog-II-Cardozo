package utiles;

import javax.rmi.CORBA.Util;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;
   
    public Hora(int hora, int minuto, int segundo) {
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
    }
    public int getHora(){
        return this.hora;
    }
    public int getMinuto(){
        return this.minuto;
    }
    public int getSegundo() {
        return this.segundo;
    }
    public Hora() {
        this.hora=0;
        this.minuto=0;
        this.segundo=0;
    }
   
    public String getHoraConFormato() {
        return Utiles.LPAD(this.hora, 2)+":"+Utiles.LPAD(this.minuto, 2)+":"+Utiles.LPAD(this.segundo, 2);
    }
	public void setHora(int hora) {
		this.hora=hora;
		
	}
	public void setMinuto(int minuto) {
		this.minuto=minuto;
		
	}
	public void setSegundo(int segundo) {
		this.segundo=segundo;
		
	}
	public void 
	
}