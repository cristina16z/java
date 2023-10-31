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


/*EXERICICI 2: Donat botigues, preus i descomptes de cadascuna, retorni el nom de la botiga amb el millor Preu
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

/*EXERICICI 3:Dado una lista infinita de productos y precios de cada producto determinado su final con string Final y -1.0
                La salida tiene que devolver la lista de productos diciendo cuál es el precio más bajo /económico.
 
                input: ssd 10.3 11 32 21 15.3 21 -1.0           salida: ssd 10.3
 *                  hdd 30 25 14.5 13.6 -1.0                        hdd 13.6
 *                  portátil 529.99 630 700 677.4 -1.0              portátil 529.99
 *                  final                                                                            */

        final double MARCA_FINAL = -1.0;

        String producte = entrada.next();
        double millorPreu = 0.0;
        double preu = 0.0;

        while (!producte.equalsIgnoreCase("final")){
            preu = entrada.nextDouble();
            millorPreu = preu;
            
            while (preu != MARCA_FINAL) {
                if  (preu < millorPreu){
                        millorPreu = preu;
                }
                preu = entrada.nextDouble();
            }
            
            System.out.println( producte + " el seu millor preu és " + millorPreu + "€");
        producte = entrada.next();
    
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
                
        contador++;
        
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
         


    }
}
