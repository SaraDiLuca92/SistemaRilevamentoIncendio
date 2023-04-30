package com.es.sistemarilevamentoincendio;

public class CentroDiControllo {
	public static void main(String[] args) {
		  Sonda sondaMachine = new Sonda(1,3,2.5,5.6);
		  Sonda sondaGun = new Sonda(2,4,4.7,9.8);
		  Sonda sondaBill=new Sonda(3,2,3.6,8.5);
		  Sonda sondaKaulitz=new Sonda(4,5,5.8,7);
		  Sonda sondaTom=new Sonda(5,2,7.9,9);
		  
		  ProcessoDiControllo processodicontrollo = new ProcessoDiControllo();
		  ProcessoDiControllo processodicontrollo2=new ProcessoDiControllo();

		   sondaMachine.attach(processodicontrollo);
		   sondaMachine.setLivellofumo(10);
		   sondaGun.attach(processodicontrollo);
		   sondaGun.setLivellofumo(15);
		   sondaBill.attach(processodicontrollo);
		   sondaBill.setLivellofumo(4);
		   sondaKaulitz.attach(processodicontrollo2);
		   sondaKaulitz.setLivellofumo(20);
		   sondaTom.attach(processodicontrollo2);
		   sondaTom.setLivellofumo(3);
		   
		   
		 
		  
		  
		  
		}


}
