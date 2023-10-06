package java;
//para añadir los valores manualmente, no desde el código, [interactivo]
import java.util.Scanner; 
public class teoria {

    public static void main(String args[]) {
     Scanner join = new Scanner(System.in); 

     int edad = join.next.int();        //lee la entrada de un entero para que introduzcas el nº en la consola. activar botó interactive
     double pes = join.nextDouble();    // System.out.println ( “edat” + edad + “peso” + pes);


 
/* DATOS

    Integer.MAX_VALUE; 	    //Enter más grande
    Integer.MIN_VALUE; 	    //Enter más pequeño
    Integer.SIZE; 			//Nombre de bits de un enter
    % 				        Mòdul, és el residu de la divisió, últim decimal
     ==	                     //Igualació
    !=                      //Diferent
    %2==0				    //si es parell


        Integers: size (lo que ocupa en bits), value(valor)
        int→ overflow: sumarle +1 al entero más grande, cómo resultado saldría en negativo (-)

        long enterllarg = Integer.Max_value +1l; 	(max value: 23..7)
        System.print.out (enterllarg) 			(23..8)

        enterllarg (64b) = enter (32b)		//al revés no. es una conversión automática
        Enter = (int) enterLlarg;       	//guardar un entero largo en un entero. conversión forzada


    Tipus primitius o bàsics:
        -enter          byte,short,int,long 10l
        -real           float 11.3f / double 0.0   1.32E10
        -caracter       ascii a, H
        -boolean        true, false que es més petit que el true
    
        i++ o ++i       és un increment
        i--             és un decreixent
    
    Formas de escribir i que significa lo mismo         

        i = i+3         i = i*50        i%=3                
        i + =3          i * = 50        i = i%3            
        
        unari: nomès afecta a un operari (int) (3*2.5)
        binari: afecta a 2 operadors 2+3*4
        
    Asignar un caràcter
        char a = 'a';  
        char tres = '3'; 

        system.out.println ("el caracter" + (int)a ); //de letra a A hay que usar el casting (int)
        System.out.println("el caracter " +  ((char) ((int)a + 3))); //de número a letra

        char '9'-'54'            es cómo si fuera 57-54 = 3 //realmente se resta el valor del caràcter 
        
        (char) (3 +'0')           convertir un número a caracter, por ejemplo podría dar '3'
        obtener 'C'              (char)('A'+2)
        (char )('A'-'a')        es un símbolo raro
        'X'+'a'                 para pasar X mayúscula a x minúscula



    Strings

        /*
        Cadenes de caràcters String (tipus compost)
        Declarar un String
        Operacions amb Strings
        +
        Mètodes habituals que s’utilitzen en els Strings
        length()            la longitud de carácteres, cadena
        charAt()            da el carácter del número de la posición
        indexOf()           da el nº de posición 
        toUpperCase(),      ‘z’ obtindrà la ‘Z’
        toLowerCase()       ‘Z’  obtindrà l ‘z’
        */
        System.out.println("Hola mon"); //"Hola mon" és un literal de tipus cadena String
               
        String cadena = "Hola mon";
        String cadena2 = cadena + "!"; //concatenar dues cadenes

         //Operador + concatena

        System.out.println(cadena.toLowerCase());
        System.out.println("molta sort!".toUpperCase());  //MOLTA SORT! Ponerlo en mayúsculas
        
        //longitud cadena
        String nom = "Maria";
        System.out.println("Longitud de la cadena " + nom.length()); //5, ya que son 5 carácteres Maria

        //caracter de la posicio 0 de la cadena
        System.out.println("El carácter de la posició 0" + "0123".charAt(0)); //la posición 0 es 0
        System.out.println("La posició on comença la subcadena b "+ "abcd".indexOf("b"));   /*la posición será 1, ya que es:
                                                                                                a, b, c, d
                                                                                                0, 1, 2, 3 */

    } 
}