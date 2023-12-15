public class exercici6metodes {
//a la hora de crear la clase TieneQueSerEnMayúsculas
//a la hora de crear métodos, la primera siempre en minúscula
//void significa que NO va a retornar nada

/*definir cada argumento con su correspondencia */
int edat = Integer.parseInt (args[0]);
double preu = double.parsedouble(args[1]);
String salutacio = args[2];


//Calcular l'àrea i el perímetre d'una circumferència donat el radi

public class AreaCercle {

    //CAPÇALERA
    //public static es posa sempre
    //double és el tipus de dada que retorna la funcio o mètode
    //areaCercle és el nom de la funcio
    //els paràmetres (entre parèntesis) indiquen els valors que passem
    
    //COS és un programa com els que feiem al main
    // es declaren variables (locals)
    // retorna un valor

    public static double areaCercle(double radi){
        // radi està inicialitzat

        return Math.PI * radi * radi;

        
        /* @param radi
         * @return retorna l'area d'un cercle donat el radi.
         */
    }

    public static double perimetreCercle(double radi){
        return Math.PI * 2 * radi;

        
        /* @param radi
         * @return retorna el perimetre d'un cercle donat el radi
         */
    }

    //el main és el mètode que s'executa primer
    public static void main(String[] args) {
        
        double crida1 = areaCercle(1);
        System.out.println(crida1);
        
        //si el resultat és numèric, el podem fer servir en una expressió
        System.out.println(3 * areaCercle(4));
        
        System.out.println(perimetreCercle(1));
        if (perimetreCercle(1)!= 2 * Math.PI){
            System.out.println("ERROR");
        }
    }
}



//*---------------------------------------------------------Exercicis----------------------------------------------------*/


public class ExercicisVocals {

    public static String vocals (){                                                         //1r mètode
        return "aeiou";
    }


    public static String vocals (boolean majuscules){                                       //2n mètode

        if (majuscules) {
            return "AEIOU";
        }else{
            return "aeiou";
        }
    }


    public static boolean aprovat (int nota){                                               //3 mètode

        if (nota >=5){
            return true;
        }
        return false;
        }

        //també es podria return nota >= 5;


    public static int valorAbsolut (int numero){                                            //4t mètode

        if (numero<0){
            numero = - numero;
        }
        return numero;        //también se puede return Math.abs(numero);
    }


    public static int diferenciaValorAbsolut (int nu1, int nu2){                            //5è mètode

       // int num1 = valorAbsolut(nu1);
       // int num2 = valorAbsolut(nu2);
       return valorAbsolut(nu1 - nu2);
    }


    public static void main(String[] args){

        System.out.println(vocals()); //1r mètode

        System.out.println(vocals(true)); //2n mètode. Si true mayúsculas, si false minúsculas

        System.out.println(aprovat(9)); // 3r mètode. Si aprova true, sino false

        System.out.println(valorAbsolut(-16));  //4t mètode. Retornar el seu valor Absolut

        System.out.println(diferenciaValorAbsolut(6,8)); //5è mètode. Retornar el valor Absolut de la diferencia de 2 num
    }
}



/*------------------------------------------------------------CODINGBAT STRING 3-------------------------------------------------- */



//[CodingBat String 3.countYZ]Contar si las palabras acaban en Z o Y 

public class Main {

    public static int countYZ(String str) { //bloque ejercicio
        //str = str.toLowerCase();
        int countYZ = 0;
        int len = str.length();

        for(int i=0; i<len -1; i++){
            char carSeguent = str.charAt(i+1);

            if (!Character.isLetter(carSeguent)){
                char car = str.charAt(i);
                if (car =='Y' || car=='y' || car=='z' || car== 'Z'){
                    countYZ++;
                }
            }
        }
        //si ultima lletra és y o z?
        char car = str.charAt(len - 1);
        if (car =='Y' || car=='y' || car=='z' || car== 'Z'){
            countYZ++;
        }

        return countYZ;
    }


   public static void main(String[] args) { //bloque Main psvm
        String str;
        int resultat;
        int resultatEsperat;

        str = "fez day";
        resultatEsperat = 2;
        resultat = countYZ(str);
        if (resultat == 2) {
            System.out.println(str + " " + "OK");
        } else {
            System.out.println(str + " " + "X");
        }

        str = "day fez";
        resultatEsperat = 2;
        resultat = countYZ(str);
        if (resultat == 2) {
            System.out.println(str + " " + "OK");
        } else {
            System.out.println(str + " " + "X");
        }

        str = "day fyyyz";
        resultatEsperat = 2;
        resultat = countYZ(str);
        if (resultat == 2) {
            System.out.println(str + " " + "OK");
        } else {
            System.out.println(str + " " + "X");
        }
    }
}



/*[CodingBat String 3. withoutString] Dado 2 cadenas que una reste a la otra, ejemplo: "hello there", "llo" --> "he there"
                                                                "hello there", "e" --> "hllo thr"       */

public static String withoutString (String base, String remove) {
    String result = "";

    for (int i = 0; i < base.length(); i++) {
        if (base.substring(i).toLowerCase().startsWith(remove.toLowerCase())) {
            i = i + remove.length() - 1;
        } else {
            result = result +  base.charAt(i);
        }
    }
    return result;
}

public static void main(String[] args) {

    String str = "Hello World";
    String stremove = "o";
    String result = withoutString(str, stremove);
    System.out.println (result);
}

                                                                    //Método Pere

                                                                    private static boolean subcadenaCoincident(String base, int posicio, String remove){
                                                                        //si el queda de cadena és més curt que la cadena remove,
                                                                        //no coincideixen
                                                                        if (posicio + remove.length() > base.length()) return false;

                                                                        //iniciar seqüència
                                                                        int i=0;
                                                                        //no hi ha tractament
                                                                        boolean trobat = false; //no trobat que hi hagi dues caràcters diferents
                                                                        int len = remove.length();
                                                                        while(i < len && !trobat){
                                                                            trobat = base.charAt(i + posicio)!= remove.charAt(i);
                                                                            if (!trobat) {
                                                                                i++;
                                                                            }
                                                                        }
                                                                        return !trobat;
                                                                    }

                                                                    public static String withoutString(String base, String remove) {
                                                                        String cadena = "";
                                                                        int i =0;
                                                                        int midaSubcadena = remove.length();
                                                                        int len = base.length();
                                                                        String baseLowerCase = base.toLowerCase();
                                                                        String removeLowerCase = remove.toLowerCase();
                                                                        while(i< len){
                                                                            if(!subcadenaCoincident(baseLowerCase, i, removeLowerCase)){
                                                                                cadena = cadena + base.charAt(i);
                                                                                i++;
                                                                            } else {
                                                                                i = i + midaSubcadena;
                                                                            }
                                                                        }
                                                                        return cadena;
                                                                    }

                                                                    public static void main(String[] args) {
                                                                        /*String cadena = "hola mon!";
                                                                        String remove = "ol";


                                                                        System.out.println(subcadenaCoincident(cadena, 0, remove));
                                                                        System.out.println(subcadenaCoincident(cadena, 1, remove));
                                                                        System.out.println(subcadenaCoincident("hola", 2, "la"));
                                                                    */
                                                                        System.out.println("withoutString(\"Hello there\", \"llo\") → " +
                                                                                withoutString("Hello there", "llo"));
                                                                        System.out.println("withoutString(\"Hello there\", \"x\") → " +
                                                                                withoutString("Hello there", "e"));
                                                                        System.out.println("withoutString(\"Hello there\", \"x\")  "  +
                                                                                withoutString("Hello there", "llo"));
                                                                    }
                                                                    }


//[CodingBat String 3. GHappy] Si hay xxggxx seguidas en un string = true, sino false
                                                            //sin los tests
                                                            import java.util.Scanner;
                                                            public class codingBat1 {

                                                                public static boolean gHappy (String str) {

                                                                    boolean trobat = true;

                                                                    for (int i = 0; i<str.length() && trobat; i++){
                                                                        char c = str.charAt(i);

                                                                        if ( c == 'g'){
                                                                            if ((i>0 && str.charAt (i-1) == 'g') || (i<str.length() -1) && str.charAt(i+1) == 'g'){

                                                                                trobat = true;
                                                                            }else{
                                                                                trobat = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    return trobat;
                                                                }

                                                                public static void main(String[] args) {
                                                                    Scanner entrada = new Scanner(System.in);
                                                                    System.out.println(gHappy(entrada.nextLine()));
                                                                }
                                                            }

//[CodingBat String 3. GHappy] InteliJ Con los tests 

public class codingBat1 {

    public static boolean gHappy (String str) {

        boolean trobat = true;

        for (int i = 0; i<str.length() && trobat; i++){
            char c = str.charAt(i);

            if ( c == 'g'){
                if ((i>0 && str.charAt (i-1) == 'g') || (i<str.length() -1) && str.charAt(i+1) == 'g'){

                    trobat = true;
                }else{
                    trobat = false;
                }
            }
        }
        return trobat;
    }

    public static void testgHappy (String str, boolean resultatEsperat){

        boolean resultat = gHappy(str);
        if ( resultat == resultatEsperat ) {
            System.out.println(str + " " + "OK");
        }else{
            System.out.println(str + " " + "X");
        }
    }

    public static void main(String[] args) {

        testgHappy("xxggxx", true);
        testgHappy("xxgxx", false);
        testgHappy("xxggyygxx", false);
        testgHappy("g", false);
        testgHappy("gg", true);
        testgHappy(" ", true);
        testgHappy("xxgggxyz", true);
        testgHappy("xxgggxyg", false);
        testgHappy("xxgggxygg", true);
        testgHappy("mgm", false);
        testgHappy("mggm", true);
        testgHappy("yyygggxyy", true);
    }
}
                                                            //Formato Pere

                                                            public class String3CodingBat {
                                                            public static boolean gHappy(String str) {
                                                                //mirem el primer //i=0
                                                                //recorregut per les seqüencies que van del segon al penultim caràcter
                                                                if (str.isEmpty()) return true; //cadena buida
                                                                if (str.length()==1) return str.charAt(0)!='g'; //cadena 1 element
                                                                if (str.charAt(0)=='g' && str.charAt(1)!='g') return false;


                                                                int i=1;
                                                                boolean trobat = false;
                                                                int darrer = str.length() -1;
                                                                while (i<darrer && !trobat) {
                                                                    trobat = str.charAt(i) == 'g' &&
                                                                            (str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g');
                                                                    i++;
                                                                }
                                                                //mirem l'ultim i= len -1
                                                                if (str.charAt(darrer)=='g' && str.charAt(darrer - 1)!='g'){
                                                                    trobat = true;
                                                                }
                                                                return !trobat;
                                                            }

                                                            public static void testGHappy(){
                                                                boolean resultatEsperat;
                                                                boolean resultat;
                                                                String cadena;
                                                                final String nomFuncio = "gHappy";
                                                                String sortida;


                                                                cadena = "xxggxx";
                                                                resultatEsperat = true;
                                                                resultat = gHappy("xxggxx");


                                                                    //gHappy("xxggxx") → true   true   OK
                                                                if (resultat==resultatEsperat){
                                                                    sortida="OK";
                                                                } else {
                                                                    sortida = "X";
                                                                }
                                                                System.out.println(nomFuncio + "(\"" + cadena + "\")" + "--> " + resultatEsperat
                                                                        + " " + resultat + " " + sortida);

                                                                System.out.println(gHappy("xxgxx")); //false
                                                                System.out.println(gHappy("xxggyygxx")); //false
                                                                System.out.println(gHappy("x")); //true
                                                            }

                                                            public static void main(String[] args) {
                                                                testGHappy();
                                                            }
                                                            }



/*[CodingBat String 3.CountTriple] Amb testos inclòs. Contar la cantidad de repeticiones que estan repetidas 3 veces seguidas.
                                                ejemplo: xxxabyyyycd --> 3                                                  */
public class codingBat2 {
    public static int countTriple (String str) {

        int contador = 0;

        for (int i = 0; i<str.length()-2 ; i++){
            char c = str.charAt(i);

            if (c == str.charAt(i+1) && c == str.charAt(i+2)){
                contador++;
            }
        }
        return contador;
    }
    
    public static void testCountTriple (String str, int resultatEsperat){

        int resultat = countTriple(str);
        if (resultat == resultatEsperat) {
            System.out.println(str + " " + "OK");
        }else{
            System.out.println(str + " " + "X");
        }
    }
    
    public static void main(String[] args) {

        testCountTriple("abcXXXabc", 1);
        testCountTriple("xxxabyyyycd", 3);
        testCountTriple("a", 0);
        testCountTriple(" ", 0);
        testCountTriple("XXXabc", 1);
        testCountTriple("XXXXabc", 2);
        testCountTriple("XXXXXabc", 3);
        testCountTriple("222abyyycdXXX", 3);
        testCountTriple("abYYYabXXXXXab", 4);
        testCountTriple("abYYXabXXYXXab", 0);
        testCountTriple("abYYXabXXYXXab", 0);
        testCountTriple("122abhhh2", 1);
    }
}



//[CodingBat String 3. sumDigits] Si la cadena tiene un número, sumar todos los números. ej: aa1bc2d3 --> 6

public class codingBat3 {
    public static int sumDigits(String str) {
        
        int suma = 0;
        for ( int i = 0; i<str.length(); i++){
            char c = str.charAt(i);

            if (Character.isDigit(c)){
                suma = suma + Integer.parseInt(String.valueOf(c) );
            }
        }
        return suma;
    }
    
    public static void testsumDigits (String str, int resultatEsperat){
        
        int resultat = sumDigits(str);
        if (resultat == resultatEsperat) {
            System.out.println(str + " " + "OK");
        }else{
            System.out.println(str + " " + "X");
        }
    }
    
    public static void main(String[] args) {

        testsumDigits("aa1bc2d3", 6);
        testsumDigits("aa11b33", 8);
        testsumDigits("Chocolate", 0);
        testsumDigits("5hoco1a1e", 7);
        testsumDigits("123abc123", 12);
        testsumDigits("", 0);
        testsumDigits("Hello", 0);
        testsumDigits("X1z9b2", 12);
        testsumDigits("5432a", 14);
    }
}



/*-----------------------------------------------ACEPTA EL RETO ------------------------------------------------------- */



/*[Acepta el reto] Introduciendo X numero(indica cantidad de fechas)        2               Salida
                    Mirar si la fecha introducida es Navidad o no           13 2              NO
                                                                            25 12             SI            */

import java.util.Scanner;
public class AceptaelretoEsnavidad {

    /**
     * Donat un dia i un mes escriu "Si" si és Nadal,
     * "NO" si no ho és
     *
     * @param dia
     * @param mes
     */
    public static void esNavidad(int dia, int mes) {

        if (dia == 25 && mes == 12) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nCasos = entrada.nextInt();             //se introduce el número de casos y se va a ejectura el bucle tantas
        for (int i = 0; i < nCasos; i++) {          //veces como número introducido
            int dia = entrada.nextInt();
            int mes = entrada.nextInt();
            esNavidad(dia, mes);                    //hace que los valores introducidos pasen por el método
        }
    }
}
}

