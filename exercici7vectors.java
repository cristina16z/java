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

