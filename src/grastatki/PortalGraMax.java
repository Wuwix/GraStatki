
package grastatki;

import java.util.ArrayList;

public class PortalGraMax {
    PomocnikGry pomocnik = new PomocnikGry();
    ArrayList<Portal> listaPortali = new ArrayList<Portal>();
    int iloscRuchow = 0;
    
    void przygotojGre(){
        Portal portal1 = new Portal();
        Portal portal2 = new Portal();
        Portal portal3 = new Portal();
        portal1.setNazwa("Go2.com");
        portal2.setNazwa("www.onet.pl");
        portal3.setNazwa("www.wp.pl");
        listaPortali.add(portal1);
        listaPortali.add(portal2);
        listaPortali.add(portal3);
       
         for (Portal rozmieszczanyPortal:listaPortali){
             ArrayList<String> nowePolozenie= new ArrayList<String>();
             nowePolozenie = pomocnik.rozmiescPortal(3);
             rozmieszczanyPortal.setPolaPolozenia(nowePolozenie);
             System.out.println(nowePolozenie);
        }
    }
    
    
    
    
    
    
    
    

    
    
    
    void rozpocznijGre(){        
        
    }
    void sprawdzRuchGracz(){
        
    }
    void zakonczGre(){
        
    }
    
    public static void main(String[] args) {
        PortalGraMax portalGraMax = new PortalGraMax();
        portalGraMax.przygotojGre();
    }   
}
