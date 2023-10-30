import java.util.Scanner;
public class exercici5while {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

/* Leer todos los precios de un producto y decir cuál es el mejor precio */
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
    /*Input ejemplo: ssd 50 25.8 90 72 88 -1.0  (el -1.0 para indiciar que ya no habrá más precios) */


/*EXERICICI: Donat botigues, preus i descomptes de cadascuna, retorni el nom de la botiga amb el millor Preu
 *          input: botiga1 78.8 (preu) 20 (descompte)
 *                  botiga2 100 50
 *                  botiga 3 66 2
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
      
    
    }
}
