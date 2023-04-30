package com.es.sistemarilevamentoincendio;
import java.util.ArrayList;
import java.util.List;

public class Sonda implements Subject {
	private int id;
	private double longitudine;
	private double latitudine;
	private int livellofumo;
	private List <Observer>observers=new ArrayList<Observer>();

	
	public Sonda(int id,int i, double d, double e) {this.id=id;
		this.livellofumo=i;
		this.latitudine=d;
		this.longitudine=e;
	
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
		
	}

	public double getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
		
	}

	public int getLivellofumo() {
		return livellofumo;
	}

	public void setLivellofumo(int livellofumo) {
		this.livellofumo = livellofumo;
		notifyObservers();
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public void attach(Observer observer) {
		observers.add(observer);
		
	}


	public void detach(Observer observer) {
		observers.remove(observer);
		
	}


	public void notifyObservers() {
		for(Observer observer:observers) {observer.update(id,livellofumo, latitudine, longitudine);}
		
	}

}
