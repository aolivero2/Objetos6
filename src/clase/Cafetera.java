/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author SERVIDOR
 */
public class Cafetera {
    private int capMa;
    private int cantAc;
    
     public Cafetera (){
        this.capMa = 1000;
        this.cantAc= 0;
    }
    public Cafetera (int capacm,int cantac){
    
        this.capMa=capacm;
        this.cantAc=cantac;
    }

    public int getCapMa() {
        return capMa;
    }

    public int getCantAc() {
        return cantAc;
    }

    public void setCapMa(int capMa) {
        this.capMa = capMa;
    }

    public void setCantAc(int cantAc) {
        this.cantAc = cantAc;
    }
    
    public void llenarcafetera (){
      this.setCantAc(this.getCapMa());
    }
    public void servirtaza (int cantc){
        int aux1;
        aux1=this.getCantAc()-cantc;
        this.setCantAc(aux1);
    }
    public void vaciarcafetera (){
        this.setCantAc(0);
    }
    public void agregarcafe (int cant_ag){
        int aux2;
        aux2=this.getCantAc()+cant_ag;
        this.setCantAc(aux2);
    }
}


