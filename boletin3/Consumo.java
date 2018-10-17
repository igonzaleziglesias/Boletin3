
package boletin3;


public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    //constructor sen parametros
    public Consumo(){
    }
    //constructor con parametros
    public Consumo(float km,float l, float vMed, float pGas){
    this.km=km;
    this.litros=l;
    this.vMed=vMed;
    this.pGas=pGas;
    }
    //getters
    public float getKm(){
    return this.km;
    }
    public float getLitros(){
    return this.litros;
    }
    public float getvMed(){
    return this.vMed;
    }
    public float getpGas(){
    return this.pGas;
    }
    
    //setters
    public void setkm(float km){
    this.km=km;
    }
    public void setLitros(float l){
    this.litros=l;
    }    
    public void setvMed(float vMed){
    this.vMed=vMed;
    }   
    public void setpGas(float pGas){
    this.pGas=pGas;
    }
    
    //operaciones 
    public float getTempo(){
    return (1/this.vMed)*this.km;
    }
    
    public float consumoMedio(){
    return 100*this.litros/this.km;
    }
    
    public float consumoEuros(){
    return consumoMedio()*this.pGas;
    }
}
