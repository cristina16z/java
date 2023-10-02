package java;
//Dado un número escriba true=parell, false=senar
import java.util.Scanner; 
public class exercici1base {
    public static void main(String args[]) {
     Scanner join = new Scanner(System.in);
    
     //Dado un número escriba true=parell, false=senar
        int numero = join.nextInt();
        
        if  (numero%2 ==0) {
            System.out.println ("true");
            }else {
            System.out.println ("false");  }

    //Dado un número escriba les seves unitats, desenes i centenes 
        int numero = join.nextInt();
        
        int unidades = numero%10;
        int decenas = numero/10;
        decenas = decenas%10;
        int centenas = numero/100;
        
        System.out.println (centenas + " centenas " + decenas + " decenas " + unidades + " unidades ");

        
    //dado el dinero, lo devuelva en billetes de 100, 50,20 y 10
    //int dinero = 380;
        int dinero = join.nextInt();

        int  cien = dinero/100; //cuántos billetes de 100€ (3)
        int restante = dinero%100; //el restante es 80€
        int cinquanta = restante/50; // cuántos billetes de 50€  se puede tener con con el restante obtenido anteriormente
        int restante2 = restante%50; // el restante es de 30€
        int veinte = restante2/20; //cuántos billetes de 20€ se puede tener con el restante2 (1)
        int restante3 = restante2%20; // el restante2 son 10€
        int diez = restante3/10; //cuántos billetes de 10€ (1)
        
        System.out.println ( cien + " de cent ");
        System.out.println ( cinquanta +" de cinquanta ");
        System.out.println ( veinte + " de vint ");
        System.out.println ( diez + " de deu ");
    
                                                                                                       //SOBRE ENTERS I CONVERSIONS 
    //Dado días, horas, minutos lo pase todo a segundos 

        System.out.println("Quants dies?");    //para que te pregunte
        int dies = join.nextInt();              // a la hora de introducir los datos
        
        System.out.println("Quantes hores?");    
        int hores = join.nextInt();
        
        System.out.println("Quants minuts?");    
        int minuts = join.nextInt();
        
            dies = dies*24*3600;    //se pasa a horas y
            hores = hores*3600;     //horas a seg = *60*60 = *3600
            minuts = minuts * 60;
            int totalSegons = dies + hores + minuts;

            System.out.println("Han passat " + totalSegons + " segons");



    //[formato Long 02/10/2023] Dado los días, pase a segundos, incluyendo el máximo de días 
        System.out.println("Quants dies?");    
        long dies = join.nextLong();
        dies = dies*24*3600;
    
      
         System.out.println("Han passat " + dies + " segons");

    // [0]2/10/2023] Para saber el número máximo de días que puede funcioanr nuestro programa 

         System.out.println("El màxim nombre de dies " + Long.MAX_VALUE/86400 + " que el programa funciona correctament"); //máximo de días / los segundos que tiene 1 día 


    //[02/10/2023 parte 1] Dado los segundos se pase a días,horas,minutos y segundos 
    
       System.out.println("Quants segons?");    
      long segons = join.nextLong();
      
      long dias = segons/86400; //
      long restante = segons%86400; //24d*60h*60m = 86400 segons té 1 día
      
     long hores = restante/3600;
      long restante2 = restante%3600;
      
      long minuts = restante2/60;
    long restante3 = restante2%60;
      
      long segundos = restante3;

      System.out.println("Han passat " + dias + " dia " + hores + " horas " + minuts + " minutos " + segundos + " segons ");


    // [02/10/2023 parte 2] Que muestre el máximo número de segundos 

      long segons = Long.MAX_VALUE;
      
      long dias = segons/86400; //24d*60h*60m = 86400 segons té 1 día
      long restante = segons%86400; 
      
     long hores = restante/3600;
      long restante2 = restante%3600;
      
      long minuts = restante2/60;
    long restante3 = restante2%60;
      
      long segundos = restante3;
      
      System.out.println("El màxim nombre de segons " + Long.MAX_VALUE + " que el programa funciona correctament");

      System.out.println("Han passat " + dias + " dias " + hores + " horas " + minuts + " minutos " + segundos + " segons ");
      
    /*long 64 bits
    integeer 32 bits Falta conversión.
    short 14 bits
    byte 8bits */







        }
}











