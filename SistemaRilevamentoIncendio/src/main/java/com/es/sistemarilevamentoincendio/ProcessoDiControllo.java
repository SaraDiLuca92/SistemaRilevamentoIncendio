package com.es.sistemarilevamentoincendio;

public class ProcessoDiControllo implements Observer {private int id;
	private int livellofumo;
	private double latitudine;
	private double longitudine;

		
	public void update(int id, int livellofumo, double latitudine, double longitudine) {
		this.id=id;
		this.livellofumo=livellofumo;
		this.latitudine=latitudine;
		this.longitudine=longitudine;
		if(livellofumo<5) {
		System.out.println("La sonda"+" "+id+" "+ "a latitudine"+" "+latitudine+" "+"e longitudine"+" "+longitudine+" "+"ha livello del fumo"+" "+livellofumo+"."+" "+"Nessun pericolo.");}
		else{System.out.println("ALLARME PERICOLO! http://host/alarm?=idsonda="+id+"&lat="+latitudine+"&lon="+longitudine+"&smokelevel="+livellofumo+".");}
		
		
	}


	public Object getLivellofumo() {
	
		return livellofumo;
	}



	

	

}
