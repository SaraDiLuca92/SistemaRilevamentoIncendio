package com.es.sistemarilevamentoincendio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SondaTest {
	 //Testo che la sonda venga correttamente inizializzata con l'id, la longitudine, la latitudine e il livello di fumo passati come parametri nel costruttore.

    @Test
    public void testSondaInitialization() {
        Sonda sonda = new Sonda(1, 3, 2.5, 5.6);
        assertEquals(1, sonda.getId());
        assertEquals(3, sonda.getLivellofumo());
        assertEquals(2.5, sonda.getLatitudine(), 0.01);
        assertEquals(5.6, sonda.getLongitudine(), 0.01);
    }

    //Testo che l'aggiunta di un observer alla lista degli osservatori della sonda avvenga correttamente.
    @Test
    public void testAttachObserver() {
        Sonda sonda = new Sonda(1, 3, 2.5, 5.6);
        ProcessoDiControllo observer = new ProcessoDiControllo();
        sonda.attach(observer);
        assertEquals(1, sonda.getObservers().size());
    }

    // Verifica che l'update dell'observer sia stato chiamato
    @Test
    public void testNotifyObservers() {
        Sonda sonda = new Sonda(1, 3, 2.5, 5.6);
        ProcessoDiControllo observer = new ProcessoDiControllo();
        sonda.attach(observer);
        sonda.setLivellofumo(10);
        assertEquals(10, observer.getLivellofumo());
    }
}



   
