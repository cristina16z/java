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
                                                                //también se podría declarar una constante con: Final double PI =3.14
    float circumferencia =  (float) (2.0 * Math.PI * radio); //PI es una constant, si es mínusculas es una variable
    float longitud = (float) (Math.PI * Math.pow(radio, 2.0));

    System.out.println("L'àrea de la circumferència és de " + circumferencia + " i té una longitud de " + longitud);
   

//A partir de 3 notas (activitat20%, prova1 40%,prova2 40% = nota final M3)

/*import java.util.Scanner; 
public class MyClass {
    public static void main(String args[]) {
 Scanner join = new Scanner(System.in); */

    System.out.println ("Nota de la activitat: "); 
    float activitat = join.nextFloat();
    System.out.println ("Nota de la prova 1: "); 
    float prova1 = join.nextFloat();
    System.out.println ("Nota de la prova 2: "); 
    float prova2 = join.nextFloat();
    
    activitat = (float) (activitat*0.2);
    prova1 = (float) (prova1*0.4);        //también podrías poner en int y luego multiplicarlo por 4.0
    prova2 = (float) (prova2*0.4);
    float notaFinal = (float) (activitat + prova1 + prova2);
    
    System.out.println( "La nota final de M3 és " + notaFinal );


//[02/10/2023] Dado 3 precios descuentos 10%,15%,50% dé el precio final con iva incluido.

    /*import java.util.Scanner; 
    public class MyClass {
    public static void main(String args[]) {
    Scanner join = new Scanner(System.in); */
            
    System.out.println("primer producte (descompte 10%) ");
    float preu1 = join.nextFloat(); 
    System.out.println("segon producte (descompte 15%) ");
    float preu2 = join.nextFloat(); 
    System.out.println("tercer  producte (descompte 50%) ");
    float preu3 = join.nextFloat(); 
            
    preu1 = (float)(preu1*0.9);
    preu2 = (float) (preu2*0.85);
    preu3 = (float) (preu3*0.5);
            
    float totalPreus = (float) ((preu1 + preu2 + preu3)*1.22); //también se puede declarar una constante con: final double IVA=0.21
      
    System.out.println("El client haurà de pagar un import final de " + totalPreus + " euros amb IVA inclòs. ");
             

//Dado un número entero, muestre el caràcter correspondiente a ése numero/valor
    int codiDigit = 9;
    char digit = (char) (codiDigit + '0');
    System.out.println ("Aquest caràcter correspon al número " + digit );

 /*  Pasar de minúsculas a mayúsculas !! Creo que no va el scanner aquí
    public class MyClass {
    public static void main(String args[]) { */ 
    char caracterMinusculas = 't';
    int operacion = (int) ('z' - 'Z'); //aquí es para mirar la diferencia que hay entre minusculas y mayúsculas
    char caracterMayusculas =  (char) (caracterMinusculas - 32); /*para que cuando se introduzca cualquier minúscula
                                                                haga la diferencia y autonmáticamente dé la mayúscula */
            
    System.out.println("La mayúscula será " + caracterMayusculas);



                
         
}
