package java;

public class exercici2reals {

//Salga por pantalla un número Entero entre el 0 i 9 
    float numero = (float) Math.random(); //Math. random retorna un número real double a l’atzar entre 0.0 (inclòs) i 1.0 (no inclòs)
    float decimal =  numero * 10;           //passar el valor entre 0.0 i 1.0
     int azar = (int) decimal;              // a un valor entero 0 i 9
  
      System.out.println("azar: " + azar);


//[02/10/2023] Dado el radio, dé el área i la curcumferencia 

/*import java.util.Scanner; 
public class MyClass {
    public static void main(String args[]) {
        
    Scanner join = new Scanner(System.in); */
    
     System.out.println ("Quin és el radi?");
     float radio = join.nextFloat();
      
      float circumferencia =  (float) (2.0 * 3.14 * radio);
      float longitud = (float) (3.14 * Math.pow(radio, 2.0));

      System.out.println("L'àrea de la circumferència és de " + circumferencia + " i té una longitud de " + longitud);
      
}
