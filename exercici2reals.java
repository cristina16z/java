package java;

public class exercici2reals {

//Salga por pantalla un número Entero entre el 0 i 9 
    float numero = (float) Math.random(); //Math. random retorna un número real double a l’atzar entre 0.0 (inclòs) i 1.0 (no inclòs)
    float decimal =  numero * 10;           //passar el valor entre 0.0 i 1.0
     int azar = (int) decimal;              // a un valor entero 0 i 9
  
      System.out.println("azar: " + azar);

    
}
