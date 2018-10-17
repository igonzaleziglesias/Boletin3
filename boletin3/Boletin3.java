
package boletin3;


public class Boletin3 {

   
    public static void main(String[] args) {  
        //a)
        Consumo unConsumo = new Consumo();
        System.out.println("Km: "+unConsumo.getKm());
        System.out.println("Litros: "+unConsumo.getLitros());
        System.out.println("vMed: "+unConsumo.getvMed());
        System.out.println("pGas: "+unConsumo.getpGas());
        //b)
        unConsumo.setLitros(50f);
        unConsumo.setpGas(1.57f);
        System.out.println("\nlitros: "+unConsumo.getLitros()+" L"+"\nPrecio de la gasolina: "+unConsumo.getpGas()+" Euros");
        //c)
        Consumo outroConsumo = new Consumo(200f,10f,120f, 1.4f);
        System.out.println("\nKm: "+outroConsumo.getKm());
        System.out.println("Litros: "+outroConsumo.getLitros());
        System.out.println("vMed: "+outroConsumo.getvMed());
        System.out.println("pGas: "+outroConsumo.getpGas());
        //d)
        System.out.println("O consumo medio é: "+outroConsumo.consumoMedio()+"L a los 100 km");
        //e)
        outroConsumo.setLitros(15f);
        System.out.println("\nLitros: "+outroConsumo.getLitros());
        System.out.println("O consumo medio é: "+outroConsumo.consumoMedio()+"L a los 100 km");
        //f)
        System.out.println("\nVelocidade media: "+outroConsumo.getvMed());
        
    }
    
}
