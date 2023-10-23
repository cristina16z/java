import java.util.Scanner;

public class exercici4ifelse {
      public static void main(String args[]) {
        Scanner join = new Scanner(System.in); 
        


    //Aplicar un descuento si supera un importe mínimo de compra
    System.out.println("Quin és el preu del producte en euros ? ");
      float preu = join.nextFloat();
      final float COMPRA_MIN = 50;
      final float DESCOMPTE = 10;
      
      if (preu >= COMPRA_MIN) { 
           float descompteFet = preu*DESCOMPTE/100;
           preu = preu - descompteFet;
        }
    System.out.println("El preu final per pagar és de  " + preu + " euros");
    }

    //Decir que ha endivinado el número si lo ha hecho, sino decir que te has equivocado.

    System.out.println("Endivina el valor enter, entre 1 i 10 :");
    int valorUsuari = join.nextInt();
    final int VALOR_SECRET = 8;
    
    
    if (valorUsuari==VALOR_SECRET) { 
        System.out.println("Exacte! Era " + VALOR_SECRET + ".");
        
      }else{
            System.out.println("T'has equivocat");
      }
    System.out.println("Hem acabat el joc.");
  
    //A partir de la not aque has sacado, clasificarla, diciendo si es excelente, notable, bien, etc..

    System.out.println("Quina nota has tret?");
    float nota = join.nextFloat();
    
    if (nota>=9) { 
        System.out.println("Excel·lent.");
        
        }else if ((nota<9 && nota>=6.5)){
            System.out.println("Notable");
            
        }else if (nota<6.5 && nota>=5) {
            System.out.println("Suficient");
            
        }else{
            System.out.println("Suspès.");
        }
        
    System.out.println("Espero que hagi anat bé.");

    }
    //Dado 3 nombres de tiendas, 3 precios y 3 descuentos, diga cuál es la más económica.

    String botiga1 = join.next();
        double preu1 = join.nextDouble();
        double descompte1 = join.nextDouble();
        double compte1 = preu1 - preu1 * descompte1/100;
        
        String botiga2 = join.next();
        double preu2 = join.nextDouble();
        double descompte2 = join.nextDouble();
        double compte2 = preu2 - preu2 * descompte2/100;
        
        String botiga3 = join.next();
        double preu3 = join.nextDouble();
        double descompte3 = join.nextDouble();
        double compte3 = preu3 - preu3 * descompte3/100;
        
        if (compte1 <= compte2 && compte1<= compte3) {
            System.out.println ("La botiga que surt més a compte és " + botiga1 + " amb un preu final de " + (float) compte1 );
            
        
            
        } else if (compte2<= compte3 && compte2<=compte1){
            
            System.out.println ("La botiga que surt més a compte és " + botiga2 + " amb un preu final de " + (float) compte2 );
        } else{
            System.out.println ("La botiga que surt més a compte és " + botiga3 + " amb un preu final de " + (float) compte3 );
        }

