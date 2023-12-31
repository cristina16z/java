package java;
//para añadir los valores manualmente, no desde el código, [interactivo]
import java.util.Scanner; 
public class teoria {

    public static void main(String args[]) {
     Scanner join = new Scanner(System.in); 

     int edad = join.nextInt();        //lee la entrada de un entero para que introduzcas el nº en la consola. activar botó interactive
     double pes = join.nextDouble();    // System.out.println ( “edat” + edad + “peso” + pes);
    }

 
/* DATOS

    Integer.MAX_VALUE; 	    //Enter más grande
    Integer.MIN_VALUE; 	    //Enter más pequeño
    Integer.SIZE; 			//Nombre de bits de un enter
    % 				        Mòdul, és el residu de la divisió, últim decimal
     ==	                     //Igualació
    !=                      //Diferent
    %2==0				    //si es parell

        ej modul: 10/3 = 3,33 en programación sería 3. Entonces 3*3 = 9 para llegar al 10 faltaria 1+ y ése es el módulo
        ej2 modul: 15/6 = 2,5 en programación = 2, después 2*6= 12 y para llegar a 15, su módulo sería 3 (residu).


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



    /*-------------------------------------------------------STRINGS---------------------------------------------------*/ 

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


/*--------------------------------------------------------BOOLEANS---------------------------------------------------*/    


    *  AND --> &&  A de complir les 2 condicions
    *  OR --> ||   Com a mínim ha de complir 1 condició
    *  NOT --> !    */
        int enter = 145;
        double real = 12.3;
        boolean plou = false;
         System.out.printf ("numero %d %f %b %c\n", enter, real, plou);  

/*  %d se asocia con 145 y %f=12.3  b=false, se asignan por orden los códigos de formato
    %d enter
    %f real (inclou float)
    %b boolean 
    %n o \n salt de línea  
    %c caràcter     
    %8.3f -->   el 8 la cantidad de espacios y 3 decimales
        
    Llei de de morgan
        !(a&&b) <----> !a || !b     negar a y b = negar a o b
        !(a||b) <----> !a && !b     negar a o b = negar a y b
       
       Recrear la tabla */ 
        boolean plou = false;
        boolean faSol = true;

        System.out.printf ("%5s %5s %5s %5s \n", "plou", "faSol", "plou i fa sol", "plau o fa sol"); 
        System.out.printf ("%5s %5s %13s %13s \n", "=====", "=====", "=============", "============="); 
        System.out.printf ("%5b %5b %9b %13b \n", plou, !faSol, plou && !faSol, plou || !faSol); 
        System.out.printf ("%5b %5b %9b %12b \n", plou, faSol, plou && faSol, plou || faSol); 
        System.out.printf ("%5b %5b %9b %12b \n", !plou, !faSol, plou && !faSol, !plou || faSol); 
        System.out.printf ("%5b %5b %9b %12b \n", !plou, faSol, !plou && faSol, !plou || faSol); 
                            //cantidad de espacios
/*EQUALS
    *  comparando strings */
        System.out.println("hola".equals("hola")); //true
        System.out.println("hola".equals("Hola")); //false
        System.out.println("hola".equalsIgnoreCase("Hola")); //true, hace que ignore la mayúsucla
    
    //Con los strings: No es poden comparar amb operadors racionals, ja que són un tipus compost



/*--------------------------------------------------------BUCLES WHILE & FOR---------------------------------------------------*/    



/*WHILE (condició) / Do while es haz ésto, while si se cumple la condición, de nuevo el bucle.
    While (condició) */


    //SEGUIMENT de while dentro de otro while:
        int i = 1;
        int j = 0;
        
        while(i<10){
            j=i;
            while (j<10){
                System.out.println(i+""+j);
                j++;
            }
            i++;    /*las salidas serían: 1 1, 1 2, 1 3,..1 9
                                         2 2, 2 3..29
                                        3 3, 3 4 ..3 9   el programa acaba en 99*/
   
   
    //[FOR] Con el for (inicialització; condició; increment)
    
      for(int i=1; i<10; i++){
        System.out.println(i);
        }
    //[FOR] para escribir joan en vertical
    String nom = "joan";
    for(int i=0; i<nom.length(); i++){
        System.out.println(nom.charAt(i)); }
    }

    //[FOR] abecedario a-z en vertical. a=97 i z=122
    for(int i=97; i<123; i++){                     for(int i='a'; i<='z'; i++){    
        System.out.println((char)i);                 System.out.printf("%c", i);    //printf si hay formato "%c" 
    }

    //[FOR] hacer un programa que diga 30 veces hola
    for ( int i = 0; i<30 ;i++){
        System.out.println("Hola");
    }

    /*[FOR] escriba la tabla del 7. Sortida 7 x 1 = 7, etc..  */ int nTaula = 7
    for ( int i = 0; i<=10 ;i++){                               for(int i = 0; i<11; i++)
        System.out.println("7 x " + i + " = " + i*7);           System.out.printf("%2d x %2d = %2d\n", nTaula, i, i*nTaula);
    
    //[WHILE] La tabla del 8
    int i = 0;
    while (i<=10){
    System.out.println ("8 x " + i + " = " + i*8);
    i++;
    }

    //[FOR] que sólo haga nx23 hasta nx25   input: [num][numInici][numFinal]    output: 7x23 = 161 hasta 7x25=175
    int num= entrada.nextInt();
    int inici = entrada.nextInt();
    int ultim = entrada.nextInt();
      
       for(int i = inici; i<=ultim; i++){
       System.out.printf("%2d x %2d = %2d\n", num, i, i*num);
       }
    
    
    //[FOR] Totes les taules

    for(int nTaula = 0; nTaula<11; nTaula++){
        System.out.println("taula de " + nTaula);                               //título: taula del ..
        
        for(int i = 0; i<11; i++){
         System.out.printf("%2d x %2d = %2d\n", nTaula, i, i*nTaula);
        }

        System.out.println();
    }
    
    //[FOR]Si sólo quiero las tablas del 7 al 10 y tenga núminicio y númfinal. Ejemplo input: [7][10][23][25]

    int primeraTaula= entrada.nextInt();
    int ultimaTaula = entrada.nextInt();
    int iniciValor = entrada.nextInt();
    int ultimValor = entrada.nextInt();

    for(int num = primeraTaula; NUM<=ultimaTaula; num++){
    System.out.println("Taula de " + num); 
    
        for(int valor = iniciValor; valor<=ultimValor; valor++){
            System.out.printf("%2d x %2d = %3d\n", num, valor, num*valor);
        }
        
        System.out.println();                                                   //para que haya un salto aparte
    }



//MÈTODES

public static boolean aprovat (int nota){   
         //   variable que quiero que me devuelva (variable que introduzco)




/*--------------------------------------------------------------ARRAYS & VECTORS---------------------------------------------------*/

//IntroduccióAlsVectors

public class IntroduccioAlsVectors {

    public static void main(String[] args) {

        System.out.println("STRING");
        String bonDia = "Bon dia!";
        System.out.println(bonDia.length()); //mirar la longitud
        char c = bonDia.charAt(4);
        for(int i= 0; i<bonDia.length();i++){
            System.out.print(bonDia.charAt(i));
        }
        
        System.out.println();
        System.out.println();

        //vector de caràcters
        System.out.println("ARRAY");
        char[] arrayChar;           //declaració
        arrayChar = new char[8];     //reserva espai per a 8 caràcters //se podría directamente char[] arrayChar = new char[8];
        arrayChar[0] = 'B';         //posició 0 de l'array
        arrayChar [1] = 'o';
        arrayChar [2] = 'n';
        arrayChar [3] = ' ';
        arrayChar [4] = 'd';
        arrayChar [5] = 'i';
        arrayChar [6] = 'a';
        arrayChar [7] = '!';

        System.out.println("La longitud del vector " + arrayChar.length);

        for (int i = 0; i<arrayChar.length; i++){
            System.out.print(arrayChar[i]);
        }
        System.out.println();                   //Sale Bon dia!
        arrayChar[2] = 'M';                     //cambiamos la letra de la posición 2 ( n -> M)
        System.out.println(arrayChar);          //escribe directamente Bon dia! o sustituido BoM dia!
    }
}


//IntroduccióAlsVectors2

public class IntroduccioAlsVectors2 {

    public static void main(String[] args) {
        int[] notes = new int[8];
        double[] notesUf = new double[6];

        for (int i = 0; i<notes.length;i++){
            notes[i] = 10;                            //para que salga nota 10, 8 veces
            System.out.println(notes[i]);
        }

        String[] cadena = new String[9];
        System.out.println(cadena[0]);               //sortida: null     perque no hi ha cap cadena


        //Forma alternativa d'inicialitzar un vector
        double[] temperatura = {15, 15, 16, 19};
        String[] diesSetmana = {"dilluns ", "divendres"};

        for (int i = 0; i< diesSetmana.length; i++){
            System.out.print(diesSetmana[i]);           //sortida: dilluns, divendres
        }
        System.out.println();
    }


    //mètode que rep com a paràmetre un vector
    public static void mostraTemperatures(double[] temperatura){

        for (int i = 0; i<temperatura.length; i++)
            System.out.println(temperatura[i]);
    }
    //mètode que retorni un vector:
    //public static int[] joinArrays(int[] array1, int[] array2){

    }
}}

        
   
