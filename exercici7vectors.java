public class exercici7vectors {

    public static double notaMitjana(double[] nota) {
    
        double suma = 0;
        for (int i = 0; i < nota.length; i++) {
            suma = suma + nota[i];
        }
    
        double notaMitjana = suma / nota.length;
        return notaMitjana;
    }
    

    public static double notaGran(double[] nota) {
    
        double millorNota = nota[0];                //declaramos millorNota cómo la primera Nota que introducimos
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] > millorNota) {
                millorNota = nota[i];               //importante poner nota[i], ya que se basa en el array
            }                                       //proporcionado
        }
        return millorNota;
    }
    

    public static boolean suspes(double[] nota) {
    
        boolean trobat = false;
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] < 5) {
                trobat = true;
            }
        }
        return trobat;
    }
    

    public static int[] combinacion(int[] array1, int[] array2) {
    
        int[] array = new int[array1.length + array2.length];
    
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
    
        for (int i = 0; i < array2.length; i++) {
            array[array1.length + i] = array2[i];       //después de la array1 empiece la array2
        }                                               //si la array1 es de 3 + 1 = 4 dónde empezaría la array2
    
        return array;
    }
    

    public static float[] percentatge(int[] notas) {
    
        int contadorAlumnes = notas.length;
        float[] percentatges = new float[11];       //del 0 al 10, son 11 espacios
        int[] frecuencias = new int[11];
    
        for (int i = 0; i < notas.length; i++) {    //contar las veces que se repite una nota
            frecuencias[notas[i]]++;                //notas[0] = 10 entonces frecuencias[|0] es 1
        }                                           //notas[|] = 9 entonces frecuencias[9] es 1
                                                    //notas[2] = 9 entonces frecuencias[9] es 2
                                                    //notas[3] = 8 entonces frecuencias[8] es 1
        for (int nota = 0; nota <= 10; nota++) {
            float percentatge = frecuencias[nota] / (float) contadorAlumnes * 100;
            percentatges[nota] = percentatge; //calcular el % en base a cada nota repetida sobre el total de alumnos
        }
    
        return percentatges;
    }
    

    
    public static void main(String[] args) {
          
    System.out.println("1r Mètode: Nota Mitjana");
    System.out.println(notaMitjana(new double[]{8, 9, 7, 9, 5}));   //los parámetros que se quiere introducir

    System.out.println("2n Mètode: La Millor Nota");
    System.out.println(notaGran(new double[]{6, 9, 8}));

    System.out.println("3r Mètode: Si hi ha algun Suspès");
    System.out.println(suspes(new double[]{9, 8, 6, 4.9, 7}));


    System.out.println("4rt Mètode: Combinació de 2 arrays");
    int[] resultat = combinacion(new int[]{8, 7, 6}, new int[]{5, 4, 3});

        for (int i = 0; i < resultat.length; i++) {
            int valor = resultat[i];
            System.out.print(valor + " ");

        }
    System.out.println();

    
    System.out.println("5è Mètode: Percentatges de les notes segons el total d'alumnes");
    float[] porcentajes = percentatge(new int[]{10, 9, 9, 8, 5, 6, 5, 9, 10, 4, 3, 8, 3, 4, 3, 5});

        for (int i = 10; i >=0; i--) {
            System.out.printf("%2d ==> %.2f%%\n", i, porcentajes[i]);
        }                   //10 ==> 12,50%
    }                       //9 ==> 18,75%
}



/* ---------------------------------------------------------CodingBat1------------------------------------------------------------------------- */



public class codingBat {
    
    public static boolean firstLast6 (int[] nums) { //true = si el principio y al final de la array es el núm 6

        if (nums[0] == 6 || nums[nums.length-1] == 6){
            return true;
        }
        return false;
    }


    public static boolean sameFirstLast(int[] nums) { //true = si la longitud es >=1 & si el principio y al final de la array es lo mismo
        
        if (nums.length >= 1 && nums[nums.length-1] == nums[0]){ //longitud(empieza por 1) && index (empieza por 0)
            return true;
        }
        return false;
    }


    public static int[] makePi() { //que devuelva una array de 3 dígitos con los números pi

        int[] pi =  {3,1,4};
        return pi;
    }


    public static void main(String[] args) {

        System.out.println("First CodingBat");
        System.out.println(firstLast6 (new int[]{1, 2, 6}));

        System.out.println("Second CodingBat");
        System.out.println(sameFirstLast(new int[]{1, 2, 3, 1}));

        System.out.println("Third CodingBat");           //hay que crear una variable para llamar al método
        int[] resultat = makePi();                      //en éste caso porque en el make pi no le pasas una variable
        System.out.println(Arrays.toString(resultat));  //y por último se convierte una array en una string

    }
}



/* ---------------------------------------------------------CodingBat2------------------------------------------------------------------------- */



public class CodingBat2 {

    public static int countEvens(int[] nums) {

        int contador = 0;
        for(int i = 0; i<nums.length;i++){
            if (nums[i]%2 == 0 ){
                contador++;
            }
        }
        return contador;
    }

    public static int bigDiff(int[] nums) {

        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i<nums.length; i++){
            if (nums.length >=1 && nums[i] > max){
                max = nums[i];
            }

            if (nums.length >=1 && nums[i] < min){
                min = nums[i];
            }
        }
        int resultat = max - min;
        return resultat;
    }

    public static int sum13(int[] nums) {

        int contador = 0;
        int suma = 0;

        for (int i = 0; i<nums.length;i++){

            if ( nums[i] == 13){
                i++;

            }else{

                if (nums.length >=1 && nums[i] !=13){
                    suma = suma + nums[i];
                }
            }
        }

        int resultat = suma;
        return resultat;
    }


    public static void main(String[] args) {

        System.out.println("First CodingBat");
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));

        System.out.println("Second CodingBat");
        System.out.println(bigDiff(new int[]{10, 3, 5, 6}));

        System.out.println("Third CodingBat");
        System.out.println(sum13(new int[]{1, 2, 2, 1}));
    }
}


