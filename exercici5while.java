import java.util.Scanner;
public class exercici5while {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

/* EXERCICI CLASE: Leer todos los precios de un producto y decir cuál es el mejor precio 
    Input ejemplo: ssd 50 25.8 90 72 88 -1.0  (el -1.0 para indiciar que ya no habrá más precios) */

    final double MARCA_FINAL = -1.0;
    String producte = entrada.next();
    double preu = entrada.nextDouble(); 
    double millorPreu = preu;           //el declarem com a millor preu la primera entrada
        
    preu = entrada.nextDouble();        //llegim segon preu
    while (preu != MARCA_FINAL) {
        if  (preu < millorPreu){
                millorPreu = preu;
        }
            preu = entrada.nextDouble();    //llegim tercer preu
    }  
    System.out.println("el millor preu és " + millorPreu);
    

/*EXERICICI 2: Donat botigues, preus i descomptes de cadascuna, retorni el nom de la botiga amb el millor Preu
 *          input: botiga1 78.8 (preu) 20 (descompte)
 *                  botiga2 100 50
 *                  botiga3 66 2
 *                  final
 */
    String botiga = entrada.next();                 //se introduce la primera botiga
    double preu = entrada.nextDouble(); 
    double descompte = entrada.nextDouble();
    String millorBotiga = botiga;
    preu = preu - preu*descompte/100;
    double millorPreu = preu;                       //se declara el primer precio com el millor preu
         
    botiga = entrada.next();                        //se introduce la segunda botiga      
    while (!botiga.equalsIgnoreCase("final")){      //si no pone final se hace el siguiente bucle
        preu = entrada.nextDouble();                //se introduce el segundo precio
        descompte = entrada.nextDouble();  
        preu = preu - preu*descompte/100;
           
            
        if  (preu < millorPreu){                    //se comparan los precios y si es afirmativo se declara com a milloPreu
                millorPreu = preu;
                millorBotiga = botiga;
        }
        botiga = entrada.next();                    //sino se lee "Final" empieza a leer otra botiga
           
    }
    System.out.println("La millor botiga és  " + millorBotiga + " amb un preu de " + millorPreu + "€");


/*EXERICICI 3:Dado una lista infinita de productos y precios de cada producto determinado su final con string Final y -1.0
                La salida tiene que devolver la lista de productos diciendo cuál es el precio más bajo /económico.
 
            input:  ssd 10.3 11 32 21 15.3 21 -1.0          salida: ssd 10.3
 *                  hdd 30 25 14.5 13.6 -1.0                        hdd 13.6
 *                  portátil 529.99 630 700 677.4 -1.0              portátil 529.99
 *                  final                                                                            */

    final double MARCA_FINAL = -1.0;

    String producte = entrada.next();               //1r producto

    while (!producte.equalsIgnoreCase("final")){
        int preu = entrada.nextDouble();            //asignas 1r precio cómo el mejor
        int millorPreu = preu;
            
        while (preu != MARCA_FINAL) {               //si es diferente a la marca final
            if  (preu < millorPreu){                //1r bucle: nada porque es el mismo precio
                    millorPreu = preu;              // 2ndo bucle: el nuevo precio sino es la marca final,  
            }                                       //lo compara con el 1r precio asignado cóm el mejor, 
            preu = entrada.nextDouble();            //y ya si es menor(mejor), se reasigna como el millorPreu
        }   
        System.out.println( producte + " el seu millor preu és " + millorPreu + "€");
        producte = entrada.next();                  //siguiente producto
    }


/*EXERICICI 5: Dado un número determinará la cantidad de tiendas a tener en cuenta 
                3 (3 tiendas a tener en cuenta)
                [nombre tienda] [precio] [descuento]
                Y la salida es: de las tiendas a tener en cuenta, 
                que salga el nombre de la más económica con el descuento aplicado. */
        
    int num = entrada.nextInt();
    int contador = 0;
        
    String botiga = entrada.next();
    double preu = entrada.nextDouble(); 
    double descompte = entrada.nextDouble();
                
    String millorBotiga = botiga;                   
    preu = preu*(100-descompte) / 100;
    double millorPreu = preu;
    double millorDescompte= descompte;
                
    contador++;     //Se haga el bucle tantas veces hasta que NO sea mayor al núm introducido (nº tiendas a tener en cuenta) 
        
    while (contador < num) {    
        botiga = entrada.next();
        preu = entrada.nextDouble();              
        descompte = entrada.nextDouble();  
        preu = preu*(100-descompte) / 100;
                    
        if (preu < millorPreu) {                    
            millorPreu = preu;
            millorBotiga = botiga;
            millorDescompte = descompte;
        }
                    
        contador++;
    }      
    System.out.println("La millor botiga és " + millorBotiga + " amb un descompte de " + millorDescompte + "% amb un preu final de " + millorPreu + "€");

/* EXERCICI 5B: Dado un número determinará la cantidad de productos a tener en cuenta 
                Seguido del string producte + un núm q indica quantitat de preus + llistat preus
                [núm Quantitat de productes]
                [String Producte1] [núm Quantitat de Preus] [llistat de preus]
                [String Producte2] [núm Quantitat de Preus] [llistat de preus]
                ..                                                */

    int num = entrada.nextInt();
    for (int i = 0; i < num; i++) {                     //bucle de la quantitat de productes
        String producte = entrada.next();
        int contador = entrada.nextInt();
        double millorPreu = entrada.nextDouble();
            
        for (int j = 1; j < contador; j++) {            //bucle de la quantitat de preus
            double preu = entrada.nextDouble();
            if (preu < millorPreu) {
                millorPreu = preu;
            }
        }
        entrada.nextLine(); 
        System.out.println(producte + " amb un preu final de " + millorPreu + "€");
    }

/*-------------------------------------   FINAL INTRODUCCIÓ ALS BUCLES   -------------------------------------- 



                                        ESQUEMES SEQÜENCIALS: RECORREGUT part 1        

                                        
EXERCICI CLASE: Llegeixi un número i digui si es perfecte(la suma dels seus divisors excepte ell) dóna el número. */
    
    int n = 6;
    //< 1 2 3 4 5..n> seqüència a recórrer per sumar els divisors
    //<preparar_sequencia>
    int divisor = 1;
    //<iniciar_tractament>
    while (divisor < n ){
        System.out.print (divisor + " ");
    
        //<avançar_seqüencia>
            divisor++;                                      //para que la salida sea: 1 2 3 4 5
    }
    
    //Ejercicio completo
    int n = 15; 

    //<preparar_sequencia>
    int divisor = 1; 

    //<iniciar_tractament>
    int sumaDivisors = 0; 
        
    while (divisor <= n/2 ){

    //<tractar_element>
        if (n % divisor == 0){    
              sumaDivisors = sumaDivisors + divisor;
        }

        // <avançar_seqüencia>
        divisor++; 
    }
    //<tractament_final>
    if (sumaDivisors == n){
            System.out.println (n + " Es perfecte!");
    }else{
            System.out.println (n + " No es perfecte");
    }


/*EXERCICI 2: [nom producte] [llistat preus] -1.0 (final) 
 *              Salida: [nom] [preu més económic]               */

    String producte = entrada.next();

    //<preparar_seqüència>
    double preu = entrada.nextDouble(); 
        
    //<iniciar_tractament>
    double millorPreu = Double.MAX_VALUE;
    while (preu!=-1.0){
            
        //<tractar_element>
        if (preu < millorPreu){
                millorPreu = preu;
        }
        //<avançar_seqüència>
        preu = entrada.nextDouble();
    }
    //<tractament_final>
    System.out.println(producte + " el seu millor preu és " + millorPreu);          


/*EXERCICI 5.1:  Entrada: 1 UF3 10 9 6.5 4.3 4.5 -1       
                [núm modul] [UFnúm] [llistat notes] -1.0
                Sortida: La nota mitjana del M1 UF3 és 6.86*/
    
    //<preparar_seqüència>
    int modul = entrada.nextInt();    
    String uf = entrada.next();
    
    //<iniciar_tractament>
    double nota = entrada.nextDouble();
    double quantitat = 0.0;
    double suma = 0.0;
    
    while (nota!=-1.0){
      
        //<tractar_element>
        suma = suma + nota;      //1r bucle=  0 + nota   2n bucle = nota anterior + nueva nota y así poder sumarlas
        quantitat++;            //para que cuente la cantidad de notas
    
        //<avançar_seqüència>
        nota = entrada.nextDouble();        //introduir la nueva nota
    }
    
    //<tractament_final>
    nota = suma / quantitat;            //redeclaramos la nota = fent l'operació mitjana
    
     System.out.println("La nota mitjana del " + " M" + modul +" "+  uf +  " és " + (float) nota);


/*EXERCICI 5.2:  La nota més baixa del M3 UF1 és 2.0
                [núm modul] [UFnúm] [llistat notes] -1.0*/

    //<preparar_seqüència>
    int modul = entrada.nextInt();    
    String uf = entrada.next();
    
    //<iniciar_tractament>
    double nota = entrada.nextDouble();
    double minimaNota = nota;
    
    while (nota!=-1.0){
      
        //<tractar_element>
       if(nota< minimaNota)   { 
        minimaNota = nota;
        }
        
        //<avançar_seqüència>
        nota = entrada.nextDouble();
    }
    
    //<tractament_final>
     System.out.println("La nota mínima del " + " M" + modul +" "+  uf +  " és " +  minimaNota);
    

/*EXERCICI 5.3: Tots els divisors d'un número enter positiu         entrada: 123
                                                                    sortida: 1 3 41 123 */
    int n = entrada.nextInt();

    //<preparar_sequencia> 
    int divisor = 1; 

    //<iniciar_tractament>
    int sumaDivisors = 0; 

    while (divisor <= n/2 ){

        //<tractar_element>
        if (n % divisor == 0){    // 
        sumaDivisors = sumaDivisors + divisor;
        System.out.print(divisor +  " ");               //para que salgan sin sumarse entre ellos
        }
        //<avançar_seqüencia>
        divisor++; 
    }
    //<tractament_final>
    System.out.print(n);


/*EXERCICI 5.4: Sumar tots els digits d'un enter positiu per exemple 123, la sortida serà 1+ 2 + 3 = 6   */

    //<preparar_sequencia>
    int num = entrada.nextInt(); 

    //<iniciar_tractament>
    int suma = 0; 
    while (num % 10 !=0 ){              // 123/10= 12,3*10=120, el mòdul sería 3 (ya que falta 3 para llegar a 123)
        //<tractar_element>                 
        suma = suma + num%10;           //1r bucle:%10 para coger el mòdul, último dígito que es en éste caso 3
                                        //2n bucle: 12%10 = 2   y se haría la suma de 3 + 2 + 1 (3r bucle)  
        //<avançar_seqüencia>
        num = num/10;                   //1r bucle coges el 12 
    }                                   //2n bucle: 12/10 = 1
    //<tractament_final>
    System.out.print(suma);


/*EXERCICI 5.5: Mostri el número en binari y compti quants digits té (en binari) */

    //<preparar_sequencia>
    int num = entrada.nextInt(); 
        
    //<iniciar_tractament>
    String binario = Integer.toBinaryString(num);

    //<tractament_final>
    System.out.println(binario);
    System.out.print("Té " + binario.length() + " digits en Binari");


/*EXERCICI 5.6: Mostri les dues Notes més altes 
                [númModul] [String UF] [llistat notes] -1.0 */   

    //<preparar_seqüència>
    int modul = entrada.nextInt();    
    String uf = entrada.next();
    
    //<iniciar_tractament>
    double nota = entrada.nextDouble();
    double millorNota1 = nota;
    double millorNota2 = nota;
    
    while (nota!=-1){
      
    //<tractar_element>
       
       if(nota> millorNota1){
        
        millorNota2 = millorNota1;  //la primera nota pasa a ser la segona
        millorNota1 = nota;         //la primera nota s'actualitza a l'actual millor nota
                                                                //else if: més petit que millorNota1 però més gran que millorNota2
        }else if (nota > millorNota2 && nota!= millorNota1){      //si es más grande que millorNota2 y diferente a millorNota1 
            millorNota2= nota;                                    //declaralo cómo la millorNota2
        }                                                              
        //<avançar_seqüència>
        nota = entrada.nextDouble();
    }
    //<tractament_final>
     System.out.println("Les millors notes del M" + modul + " "+ uf + " són " + millorNota1 + " i " + millorNota2);


/*EXERCICI 5.7: La nota Mitjana de cada UF (d'un llistat de diferents UF's )
 *              [núm modul] [String UF1] [llistat notes]-1      Sortida: M3 UF1: 5.13
 *              3 UF2 4 5 6 7 8 9 10 -1                                  M3 UF2: 7.0
 *              [núm modul] [String UF3] [llistat notes]-1               M3 UF3: 10.0 
                -1                                                                       */
   //<preparar_seqüència>
   int modul = entrada.nextInt();    

   //<iniciar_tractament>
    while (modul !=-1.0){
       String uf = entrada.next();
        //<tractar_element>
       double nota = entrada.nextDouble();
       double quantitat = 0.0;
       double suma = 0.0;
       
           while (nota!=-1.0){
                suma = suma + nota;      
                quantitat++;
                //<avançar_seqüència>
                nota = entrada.nextDouble();
           }
       
    //<tractament_final>
    double notaMitjana = suma / quantitat;
       
    System.out.println("M" + modul +" "+ uf + ": " +  notaMitjana);
        //avançar seqüència
        modul = entrada.nextInt();
    }

/*-------------------------------------   FINAL ESQUEMES SEQÜENCIALS RECURREGUT   -------------------------------------- 



                                           ESQUEMES SEQÜENCIALS: CERCA part 2  


EXERCICI CLASE 06/11/2023:/*Donada una sequencia de notes enteres, acabades en -1 feu un programa que escrigui "Hi ha algun apartat suspes",
    si hi ha alguna nota inferior a 5, o "Has superat el mòdul" si no hi ha cap nota inferior a 5 */

    Scanner entrada = new Scanner(System.in);
    final int FINAL = -1;
      
    //preparar secuencia
    int nota = entrada.nextInt();
      
    //preparar tractament (no cal fer res)
    boolean trobat = false; //no he trobat el que busca
    while(nota!=FINAL && !trobat){   //!trobat porque cómo lo inicializas cómo false, en el bucle tienes que ponerlo = false con la !
          
        //actualitzar trobat
        if (nota<5){
              trobat = true;
        }
          
        if (!trobat){                       //si aún no he encontrado un suspenso(nota<5), se avanzará la secuencia
              //avançar seqüència
              nota = entrada.nextInt();
        }
    }
      
    //tractament final
    if (trobat){
        System.out.println("Hi ha algun apartat suspès");
    }else{
         System.out.println("Enhorabona has superat el mòdul");
    } 


/*EXERCICI 5.1: Donada una Seqüència de lletres amb un . final. Si S >=3 que digui que hi ha suspesos */
  
    String notes = entrada.next();
    
   //Preparar seqüència
   int i =0;
   char c = notes.charAt(0); //
   
   //Iniciar tractament 
   boolean trobat = false; 
   int nSuspesos = 0;
   
   while(c !='.' && !trobat){
   
        //actualitzar trobar
        if (c == 'S'){ 
            nSuspesos++;
        
            if (nSuspesos>=3){
                trobat = true;
            }
        }
        i++;                    //i = index = aumenta la posició de la lletra
        c = notes.charAt(i);    //al aumentar la posició, cambia de lletra
    }
    
    
    //tractament final
    if (trobat){
        System.out.println("Hi ha 3 o més suspesos");
    }else{
        System.out.println("No està suspès");
    }


/*EXERCICI 5.2: Donada una seqüència de [hores][nota] [hores][nota]..-1
 *              Calculi la mitjana en funció de les hores y si hi ha un suspès que posi no acaba el cicle */


    int hores = entrada.nextInt();
    int nota = entrada.nextInt();

    //preparar seqüència

    double suma = 0;
    double horesTotales = 0;

    //iniciar tractament

    boolean trobat = false;

    while (hores != -1 && !trobat){     //hores introducidas inicialmente diferente a -1
        
        //tractar element
        if (nota <5){
        trobat = true;
        }

        if (nota>=5){
            horesTotales = horesTotales + hores;
            suma = suma + (hores * nota);
        }
    
        //avançar seqüència                    se podría poner dentro del if(nota>=5)
        hores = entrada.nextInt();

        if (hores != -1){                   //avanzar si hores diferente a -1 ja que està dentro del bucle
            nota = entrada.nextInt();       //y si es diferente a -1, coger el segundo número assignado que es la nota
        }
    }
    //tractament final
    double notafinal = suma / horesTotales; 

    if (trobat){
    System.out.println("No acaba cicle, ja que té un 4 d’un mòdul." );
    }else{
        System.out.println("La nota final és " + notafinal );
    }


/*EXERCICI 5.3: Invertir un número exemple entrada: 1234        soritida: (1234,0)
 *                                                                        (123,4)
 *                                                                        (12,43)
 *                                                                        (1,432)
 *                                                                        (0,4321)         última línea */
    //preparar tractament
   int num = join.nextInt();
   int numOriginal = num;
   int numInvertit = 0;
   
    //Iniciar tractament  
    while (num >0){
     
        System.out.println( "Seqüència (" + num + "," + numInvertit + ")"); 
        
        //tractar element
        int num1 = num % 10; //primero cóge el último dígito que sería 4 (si introducimos 1234)
        numInvertit = numInvertit*10 + num1; //reposiciona el último dígito al primero, 1r bucle: 0+4, 2nbucle: 40+3 (porque num1=123%10 =3 )
                                            //3r bucle: 43*10 + 2 = 432 y 4to bucle: 432*10 + 1 = 4321

        int unitats = (num % 10)*1000;      //transformación para coger las unidades y reposicionarlas
        
        int decenes = ((num % 100)/10) * 100;
        
        int centenes= ((num % 1000)/100)*10;
        
        int milers = num / 1000;
        
        //avançar seqüència
        num = num/10;                   //se elimina el último dígito para la próxima iteración del bucle
                                        //1r: 123 y se haría de nuevo el bucle con ése núm
                                        //2n: 12     3r:1
   }
   
    //tractament final   
    System.out.println( "Seqüència (" + num + "," + numInvertit+ ")" ); //la última seqüència
    System.out.println("Número original: " + numOriginal );
    System.out.println( "El número invertit és: " + numInvertit);


/*EXERCICI 5.4: FIBONACCI       0 1 1 2 3 5 8 13.. CERT = si algun dels 2000 primers termes acaba en 9
                                                   FALS = en cas contrari                                  */
    //preparar tractament
    int fib0=0;
    int fib1 = 1;
    int comptador = 2;
    
    //iniciar tractament
    boolean trobat = false;
    while( comptador<2000 && !trobat) {
        
        //tractar element
        int total = fib1 + fib0; 
        fib0 = fib1;
        fib1 = total;
        
        if(total%10 == 9){
            trobat = true;
        }
    }
    //tractament final
    if(trobat){
    System.out.println("CERT");
    }else{
        System.out.println("FALS");
    }


/*EXERCICI 5.5: Comprovar si la seqüència està en ordre creixent 'S' yi sino, 'N' */
   //preparar seqüència
    int numero = entrada.nextInt();
     
    // iniciar seqüència
    boolean ordenat = true;
        while (numero != 0) {           // && ordenat)
            
            //tractar element
            int num2 = entrada.nextInt();

            if (num2 != 0 && num2 < numero) {
                ordenat = false;
            }           
            //avançar seqüència
            numero = num2;
        }

    // tractament final
    if (ordenat) {
            System.out.println("S");
    } else{
            System.out.println("N");
    }


/*EXERCICI 5.6: Compta quantes 'a' hay */
    
    String text = entrada.next();
    int i = 0;                          //posició dels caràcters
    int contador = 0;                   //comptar les lletres
       
    //Iniciar tractament  
    while (i<text.length()){            //fa el bucle si la posició es menor a la longitud del text
        char c = text.charAt(i);        //extreu un únic caràcter/lletra
        
        //tractar element
       if (c =='a'){                    //si troba la A, aumenta-ho al comptador
           contador++;          
       }
        //avançar seqüència
        i++;                                //avança a la següent posició 0,1,2,3,..    
    }    
   //tractament final   
    if(contador>0){
        System.out.println("Hi ha " + contador + " vegades la lletra a" );
    }else{
        System.out.println( "No hi ha cap lletra A");
    }


/*EXERCICI 5.7: Comprovar si hi ha alguna 'a' */
    
    String text = entrada.next();
    int i = 0;                                     //posició dels caràcters
    int contador = 0;                             //comptar les lletres
    boolean trobat = false;

    //Iniciar tractament  
    while (i<text.length() && !trobat){           //fa el bucle si la posició es menor a la longitud del text
        char c = text.charAt(i);                 //extreu un únic caràcter/lletra
        
        //tractar element
       if (c =='a'){                             //si troba la A, aumenta-ho al comptador
           //contador++;
           trobat = true;        
       }
       //avançar seqüència
        i++;                                     //avança a la següent posició 0,1,2,3,..
    }    
        
   //tractament final   
    if(trobat){
        System.out.println("Cert" );
    }else{
        System.out.println( "Fals");
    }


/*EXERCICI 5.8: Si hi ha alguna B després d'una A (a..b.) */

    //preparar tractament
    String text = entrada.next();
    int i = 0;                       

    //Iniciar tractament
    boolean trobatAyB = false;
    while (i<text.length() && !trobatAyB){          
        char c = text.charAt(i);                //extrae de la posición i su caràcter    
    
        //tractar element
        if (c == 'a'){                          //si el caràcter es 'a'
            
            while (i<text.length()){             //Inicia otro bucle para encontrar b
                    c = text.charAt(i);         //extrae de la posición i su caràcter    
                    
                    if(c == 'b'){              //Si encuentra B, trobatAyB pasa a ser true
                    trobatAyB = true;
                    }
                    i++;                       //en caso de que no lo encuentre, aumenta la posición i 
            }                       //de nuevo bucle, para que vea el siguiente caràcter una posición aumentada
        }       
        i++;             //en caso de que no encuentre A, seguirá aumentando la posición para ver el siguiente caràcter                    
    }   
    //tractament final   
    if( trobatAyB){
    System.out.println("CERT: Entre la primera 'a' y el final de la cadena hi ha alguna 'b'" );
    }else{
    System.out.println( "FALS: No hi ha cap b després d'una 'a' (pot ser que no hi hagi cap 'a' en la cadena)");


/*EXERCICI 5.9: Palíndrom (que es llegeixi igual tant del dret com del reves ex: reconocer) */

    //preparar tractament
    String text = entrada.next();
    String original = text;
    String invers = "";
    int longitud = text.length();
    int i = longitud -1; 
    
    //Iniciar tractament
    while (i>=0){          
        char c = text.charAt(i); 
        invers = invers + c;        //tractar element
        i--;                              
    }    
        
    //tractament final   
    if(original.equals(invers)){                                     
        System.out.println("CERT: És un Palíndrom" );
        }else{
        System.out.println( "FALS: No és cap Palíndrom, ja que  " );
        System.out.println( "L'original és: " + original );
        System.out.println( "L'invers és: " + invers ); 
    }

    }
}
