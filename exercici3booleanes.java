import java.util.Scanner; 
public class exercici3booleanes {
    public static void main(String args[]) {
      Scanner join = new Scanner(System.in);

/* EXERCICI 1: si hay pluja, no tengo amigos o no tengo una cuerda >=150m --> No iré a escalar */
      
    String pluja = join.next(); //introducir cualquier string
    int amigos = join.nextInt(); //introducir cualquier número
    int cuerda = join.nextInt();
    
        boolean lluvia = pluja.equalsIgnoreCase("pluja"); //si el string es igual a pluja = true
        boolean amics = amigos >=2; //Más de 2 amigos = true
        boolean  corda = cuerda >= 150; //si es >= 150 = true

        boolean escalare = !lluvia && amics && corda; // si lluva=false & amigos = true & corda & true --> escalar = true
      
    System.out.println ("Pluja:" + lluvia); //salga el resultado de pluja
    System.out.println ("Amics:" + amigos); //salga el parámetro de núm. introducido
    System.out.println ("Corda:" + cuerda); //salga el parámetro de núm. introducido
    System.out.println ("Escalaré ==> " + escalare); //resultado booleana escalare
   

/*EXERCICI 1: Compraré un coche si se reunen todos los requisitos: 
                -Descuento >=5%
                -Color Carbassa
                -Valoración del coche antiguo +3000             */    
   
    String color = join.next();
    double descuento = join.nextInt();
    double valor = join.nextInt();
               
        boolean colores = color.equalsIgnoreCase("carbassa");
        boolean descompte = descuento >=5.0;
        boolean  valorVell = valor >= 3000.0;
           
        boolean comprar = colores && descompte && valorVell;
                 
    System.out.println ("Color:" + color);
    System.out.println ("Descuento:" + descuento);
    System.out.println ("Valor Vell:" + valor); 
    System.out.println ("Compraré = " + comprar); 


/*EXERCICI 2: Si hi ha reserva, no plou, dissabte o diumenge, cotxes (5persones) -->  fem barbacoa */
          
    String trucat = join.next();
    String plou = join.next();
    int cotxes = join.nextInt();
    int persones = join.nextInt();
    String dia = join.next();
        
        boolean lluvia = plou.equalsIgnoreCase("plou");
        boolean fetaReserva = trucat.equalsIgnoreCase("si") ;
        boolean coches = (cotxes >0);
        boolean personas = cotxes*5 >= persones; //1 coche y 6 personas = false
        boolean dias = dia.equalsIgnoreCase("dissabte") || dia.equalsIgnoreCase("diumenge"); //sábado o domingo
    
        boolean femBarbacoa  = !lluvia &&fetaReserva && coches && personas && dias;
          
    System.out.println ("Reserva feta: " + fetaReserva );
    System.out.println ("Plou: " + lluvia );
    System.out.println ("Coches: " + cotxes);
    System.out.println ("Persones: " + persones ); 
    System.out.println ("Dia: " + dia ); 
    System.out.println ("Farem barbacoa avui: " + femBarbacoa); 


/*EXERCICI 3: Dejaré de fumar si se da uno de los siguientes propósitos:
 *              -El tabaco suba a +5€
 *              -Que uno de mis amigos lo haga conmigo
 *              -Que se apunte mi pareja
 *              -Que me recorten el sueldo por debajo de los 1500€ */

    float preu = join.nextInt();
    String pareja = join.next(); 
    String deixa1 = join.next();
    String deixa2 = join.next();
    float sou = join.nextInt();


        boolean deixaParella = pareja.equalsIgnoreCase("si");
        boolean amic1 = deixa1.equalsIgnoreCase("si");
        boolean amic2 = deixa2.equalsIgnoreCase("si");
        boolean precio = preu>5 ;
        boolean salario = sou <1500;

        boolean fumar  = precio|| amic1|| amic2 || deixaParella || salario;
    
    System.out.println ("Precio: " + preu );
    System.out.println ("Deixa 1: " + deixa2 );
    System.out.println ("Deixa 2: " + deixa1);
    System.out.println ("Parella: " + pareja ); 
    System.out.println ("Salari: " + sou ); 
    System.out.println ("Deixo de fumar? " + fumar ); 


/*EXERCICI 4: Sino viene la Maria: Joan saltará sino está resfriado(false) y altura -5metros
              Si viene la Maria(true): me tiraré si o si */
    
    String maria = join.next(); 
    String resfriado = join.next();
    float alçada = join.nextInt();
    
  
        boolean estaMaria = maria.equalsIgnoreCase("si");
        boolean refredat = resfriado.equalsIgnoreCase("no");
        boolean altura = alçada<5;
        
        boolean salt  = (!estaMaria && refredat && altura) || (estaMaria);
    
    System.out.println ("Maria: " + maria);
    System.out.println ("Resfradat: " + resfriado );
    System.out.println ("Alçada: " + alçada );
    System.out.println ("En Joan Saltará? " + salt ); 


/*EXERCICI 6: Una persona puede vivir 100 años sino fuma (fuma=false), menjaSa(true), fa exercici(moderat) */        
    
    String fumar = join.next();
    String menjar = join.next();
    String exercici = join.next();

        boolean fuma = fumar.equalsIgnoreCase("no");
        boolean menjaSa = menjar.equalsIgnoreCase("si");

        boolean viure100Anys = fuma && menjaSa && (exercici.equalsIgnoreCase("moderat"));

    System.out.println ("Viurem 100 anys? " + viure100Anys ); 


/*EXERCICI 7 part 1: Iré a la playa si vienen 2/3 amigos. va1,va2,va3 (true) */

        boolean va1 = join.nextBoolean();
        boolean va2 = join.nextBoolean();
        boolean va3 = join.nextBoolean();


        boolean anar = (va1 && va2 && va3) ||(!va1 && va2 && va3) || (va1 && !va2 && va3) || (va1 && va2 && !va3) ;

    System.out.println ("Aniré? " + anar ); 


/*EXERCICI 8 part2: Aniré a l'aigua si la temperatura tAigua=18 y 25 inclòsos, tAmbient>=25º i 1/3 amics m'acompanya */

    int tAigua = join.nextInt();
    int tAire = join.nextInt();
        boolean fica1 = join.nextBoolean();
        boolean fica2 = join.nextBoolean();
        boolean fica3 = join.nextBoolean();

        boolean ficare = ((tAigua>18) && (tAigua<25)) && (tAire>=25) && ((!fica1 && !fica2 && fica3) || (fica1 && !fica2 && !fica3) || (!fica1 && fica2 && !fica3)) ;

    System.out.println ("Hem ficaré a l'aigua? " + ficare ); 


/*EXERCICI 9: Susana se tirará a la pista si:
 *              -No es de color vermella ni negre (string)
 *              -Si la neu es primavera (string)
 *              -Hi ha cobertura amb el mòbil (booleà) */

    String color = join.next();
    String estacion = join.next();
        boolean mobil = join.nextBoolean();
 
        boolean pista = ((color.equalsIgnoreCase("vermella")) || (color.equalsIgnoreCase("negra")));
        boolean neu = estacion.equalsIgnoreCase("primavera") ;
    
        boolean tira = !pista && neu && mobil ;
 
    System.out.println ("Susana es tirará a la pista? " + tira ); 


/*EXERCICI 10: Irá en cotxe si hi ha +5km de distancia o si està plovent, o mala combinació de transport públic
                No agafarà el cotxe si no té parking garantitzat
                distancia(double) plou(booleà) bonaCombinació(booleà) parking(booleà) */

        double distancia = join.nextDouble();
        boolean plou = join.nextBoolean();
        boolean bonaCombinacio = join.nextBoolean();
        boolean parking= join.nextBoolean();
    
        boolean agafaCotxe = (distancia>5 || plou || !bonaCombinacio) && parking;
    
    System.out.println ("Fará servir el cotxe? " + agafaCotxe); 


/*EXERCICI 11: Robert farà un doctorat si es compleixen les següents condicions:
                -Que acabi la licienciatura (booleà)
                -Pujada de Sou (double) per sobre 1000 o li toquin 5000 en la primitiva (double)
                -Que la seva xicota estigui d'acord (booleà) */

        boolean llicenciat = join.nextBoolean();
        double sou = join.nextDouble();
        double primitiva = join.nextDouble();
        boolean conformeXicota = join.nextBoolean();
                 
        boolean doctorat = llicenciat && ((sou>1000) || (primitiva>5000)) && conformeXicota ;
                
    System.out.println ("Fará un doctorat? " + doctorat); 


/*EXERCICI 12: Aniré al cinema sino quedo amb cap dels meus tres amics. Quedo1,quedo2,quedo3 (true) */

        boolean quedo1 = join.nextBoolean();
        boolean quedo2 = join.nextBoolean();
        boolean quedo3 = join.nextBoolean();
  
        boolean cinema = !quedo1 && !quedo2 && !quedo3 ;
    
    System.out.println ("Aniré avui al cinema? " + cinema); 

    }
}
