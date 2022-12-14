
package ventanas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Proyecto {
    public static void main() {
        int juego = principio();
        boolean bandera;
        do{
            switch (juego){
                case 1:
                    unjug();
                    bandera = false;
                    break;
                case 2:
                    bandera = false;
                    break;
                case 3:
                    Scanner caso3 = new Scanner(System.in);
                    System.out.println();
                    char back;
                    System.out.println("""
                                       1. Este juego esta basado en los dos juegos de pelea Super Smash Bros y Mortal Kombat
                                          y no queremos que nada de lo visto en estos momentos se practique en casa ni en cualquier otro lado. \n
                                       2. En el modo de juego de un jugador seras tu contra la maquina, seras capaz de elegir tu combatiente
                                          mientras la maquina elegira uno al azar. Cuando esten en la batalla tendras que elegir que ataque quieres hacer
                                          para que tu oponente reciba golpes y puede bajar su vida.\n
                                       3. El ganador es el que quede con vida no hay mas.\n
                                       4. En el modo de dos jugadores, las dos personas tendran que elegir sus combatientes y batallar hasta que quede uno
                                          quede vivo, y como se dice en el mundo real... QUE GANE EL MEJOR.\n
                                       5. Asi como seras capaz de elegir que combatiente quieres utilizar tambien seras capaz de crear tu propio personaje
                                          con sus propios golpes y mas.\n
                                       6. Este juego esta creado por la organizacion RJPogra1 Society Project (RJPSP) y esta creado no solo por el simple
                                          hecho de que valga puntos, si no por que queremos que sea el mejor proyecto que se presente en esta aula y que
                                          gane los Grammys y de paso los Oscar el proximo year. (No gana el mundial por que es un proyecto y no un pais)\n
                                       7. Septima y ultima regla pero no menos importante, Disfrute :).
                                       """);
                    do{
                        System.out.print("Presione la letra [v] para volver: ");
                        back = caso3.next().charAt(0);
                        if ((back!='v')&&(back!='V')) {
                            System.out.println("Solo se puede la letra v, ninguna mas. (Para que haya mas validaciones jajaja)");
                        }
                    }while((back!='v')&&(back!='V'));
                    juego = principio();
                    bandera = true;
                    break;
                case 4:
                    bandera = false;
                    break;
                default:
                    System.out.println("Modo de juego no valido.");
                    bandera = true;
                    break;
            }
        }while(bandera);
        System.out.println("Gracias por jugar este maravilloso y merecedor de todos los puntos juego.");
    }
    public static int principio(){
        Scanner modo = new Scanner(System.in);
        System.out.println("---------------------------BIENVENID@ A SUPERKOMBAT I---------------------------");
        System.out.println  ("""
                             Las reglas se diran como dice la inge a grosso modo, es un juego de dos personas, 
                             1 vs 1 o tu eliges si lo quieres jugar contra la maquina pero ten cuidado que la 
                             maquina le sabe bastante pero no te preocupes, seras capaz de elgir la dificultad.
                             
                             SIN MAS DILATACION......................................QUE EMPIEZE LA DIVERSION""");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< SELECCIONE EL MODO DE JUEGO QUE DESEA JUGAR >>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        System.out.println("                          [1. UN JUGADOR]                                            ");
        System.out.println("                          [2. DOS JUGADORES]                                         ");
        System.out.println("                          [3. INSTRUCCIONES]                                         ");
        System.out.println("                          [4. SALIR]                                                 ");
        System.out.println();
        int juego;
        do{
            System.out.print("Ingrese el modo de juego [1] o [2] que desee, [3] para saber las instrucciones, [4] para salir: ");
            juego = modo.nextInt();
            if ((juego>4)||(juego<1)){
                System.out.println("Modo de juego o seleccion no es valida, intentelo de nuevo.");
            }
        }while((juego>4)||(juego<1));
        return juego;
    }
    public static void unjug(){
        Scanner entero = new Scanner(System.in);
        Scanner palabras = new Scanner(System.in);
        int cual;
        ArrayList<Jugador> personaje = new ArrayList();
        personaje.add(new Jugador("Santana", 1000,150, 300, 250, 350));
        personaje.add(new Jugador("Fire Stick", 1000, 200, 170, 300, 400));
        personaje.add(new Jugador("Aquamen", 1000, 100, 400, 150, 375));
        System.out.println("Estos son los personajes habilitados");
        System.out.println();
        for (int i = 1; i <= personaje.size(); i++) {
            System.out.println(i+ ". "+personaje.get(i-1).toString());
            System.out.println();
        }
        System.out.println("4. Personalizado");
        do{
            System.out.print("Ingrese que personaje quiere utilizar[1-4]: ");
            cual = entero.nextInt();
            int ran = new Random().nextInt((2-0)+1)+0;
            switch(cual){
                case 1:
                    System.out.println("La maquina ha elegido ha "+personaje.get(ran).getNombre());
                    pelea(personaje.get(0), personaje.get(ran));
                    break;
                case 2:
                    System.out.println("La maquina ha elegido ha "+personaje.get(ran).getNombre());
                    pelea(personaje.get(1), personaje.get(ran));
                    break;
                case 3:
                    System.out.println("La maquina ha elegido ha "+personaje.get(ran).getNombre());
                    pelea(personaje.get(2), personaje.get(ran));
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de su personaje: ");
                    String namepersonali = palabras.nextLine();
                    System.out.print("Ingrese cuanto de vida tiene su personaje: ");
                    int vidapersonali = entero.nextInt();
                    System.out.print("Ingrese cuanto de daño hace su primer ataque: ");
                    int ataque1 = entero.nextInt();
                    System.out.print("Ingrese cuanto de daño hace su segundo ataque: ");
                    int ataque2 = entero.nextInt();
                    System.out.print("Ingrese cuanto de daño hace su tercer ataque: ");
                    int ataque3 = entero.nextInt();
                    System.out.print("Ingrese cuanta vida recupera con su habilidad de curacion: ");
                    int curarper = entero.nextInt();
                    personaje.add(new Jugador(namepersonali, vidapersonali, ataque1, ataque2, ataque3, curarper));
                    System.out.println("La maquina ha elegido ha "+personaje.get(ran).getNombre());
                    pelea(personaje.get(3), personaje.get(ran));
                    break;
                default:
                    System.out.println("Personaje no valido, ingrese una opcion valida.");
                    break;
            }
        }while((cual>4)||(cual<1));
    }
    public static void pelea(Jugador personaje, Jugador maquina){
        Scanner entero = new Scanner(System.in);
        int random = new Random().nextInt((100-1)+1)+1;
        int ataque;
        if (random<50){
            System.out.println("Jugador ataca primero");
            do {
                System.out.println("Ataque1 = "+personaje.getAtaque1()+" , Ataque2 = "+personaje.getAtaque2()+" , Ataque3 = "+personaje.getAtaque3()+" , Curar = "+personaje.getCurar());
                do{
                    System.out.print("Ingrese que ataque o curacion desea utilizar{1-4}: ");
                    ataque = entero.nextInt();
                    int vidaper = personaje.getVida();
                    int vidamaq = maquina.getVida();
                    switch(ataque){
                        case 1:
                            vidamaq -= personaje.getAtaque1();
                            maquina.setVida(vidamaq);
                            break;
                        case 2:
                            vidamaq -= personaje.getAtaque2();
                            maquina.setVida(vidamaq);
                            break;
                        case 3:
                            vidamaq -= personaje.getAtaque3();
                            maquina.setVida(vidamaq);
                            break;
                        case 4:
                            vidaper+= personaje.getCurar();
                            personaje.setVida(vidaper);
                            break;
                        default:
                            System.out.println("Opcion no valida, ingrese de nuevo");
                            break;
                        }
                }while((ataque>4)||(ataque<1));
                System.out.println("vida de Jugador: "+personaje.getVida());
                System.out.println("vida de Maquina: "+maquina.getVida());
                int ataquerandom = new Random().nextInt((4-1)+1)+1;
                int vidaperso = personaje.getVida();
                int vidamaqui = maquina.getVida();
                switch (ataquerandom) {
                    case 1:
                        vidaperso -= maquina.getAtaque1();
                        personaje.setVida(vidaperso);
                        System.out.println("Maquina Ha elegido ataque 1");
                        break;
                    case 2:
                        vidaperso -= maquina.getAtaque2();
                        personaje.setVida(vidaperso);
                        System.out.println("Maquina Ha elegido ataque 2");
                        break;
                    case 3:
                        vidaperso -= maquina.getAtaque3();
                        personaje.setVida(vidaperso);
                        System.out.println("Maquina Ha elegido ataque 3");
                        break;
                    case 4:
                        vidamaqui += maquina.getCurar();
                        maquina.setVida(vidamaqui);
                        System.out.println("Maquina ha decidido curarse");
                        break;
                }
                System.out.println("vida de Jugador: "+personaje.getVida());
                System.out.println("vida de Maquina: "+maquina.getVida());
            } while (((personaje.getVida()>0)&&(maquina.getVida()>0)));
        }else{
            System.out.println("Maquina ataca primero");
            do{
            int ataquerandom = new Random().nextInt((4-1)+1)+1;
            int vidaperso = personaje.getVida();
            int vidamaqui = maquina.getVida();
            switch(ataquerandom){
                case 1:
                    vidaperso -= maquina.getAtaque1();
                    personaje.setVida(vidaperso);
                    System.out.println("Maquina Ha elegido ataque 1");
                    break;
                case 2:
                    vidaperso -= maquina.getAtaque2();
                    personaje.setVida(vidaperso);
                    System.out.println("Maquina Ha elegido ataque 2");
                    break;
                case 3:
                    vidaperso -= maquina.getAtaque3();
                    personaje.setVida(vidaperso);
                    System.out.println("Maquina Ha elegido ataque 3");
                    break;
                case 4:
                    vidamaqui+=maquina.getCurar();
                    maquina.setVida(vidamaqui);
                    System.out.println("La maquina ha decidido curarse");
                    break;
            }
            System.out.println("vida de Jugador: "+personaje.getVida());
            System.out.println("vida de Maquina: "+maquina.getVida());
                System.out.println("Ataque1 = "+personaje.getAtaque1()+" , Ataque2 = "+personaje.getAtaque2()+" , Ataque3 = "+personaje.getAtaque3()+" , Curar = "+personaje.getCurar());
                do{
                    System.out.print("Ingrese que ataque o curacion desea utilizar{1-4}: ");
                    ataque = entero.nextInt();
                    int vidaper = personaje.getVida();
                    int vidamaq = maquina.getVida();
                    switch(ataque){
                        case 1:
                            vidamaq -= personaje.getAtaque1();
                            maquina.setVida(vidamaq);
                            break;
                        case 2:
                            vidamaq -= personaje.getAtaque2();
                            maquina.setVida(vidamaq);
                            break;
                        case 3:
                            vidamaq -= personaje.getAtaque3();
                            maquina.setVida(vidamaq);
                            break;
                        case 4:
                            vidaper+= personaje.getCurar();
                            personaje.setVida(vidaper);
                            break;
                        default:
                            System.out.println("Opcion no valida, ingrese de nuevo");
                            break;
                        }
                System.out.println("vida de Jugador: "+personaje.getVida());
                System.out.println("vida de Maquina: "+maquina.getVida());
                }while((ataque>4)||(ataque<1));
                ataquerandom = new Random().nextInt((4-1)+1)+1;
                vidaperso = personaje.getVida();
                vidamaqui = maquina.getVida();
                switch (ataquerandom) {
                    case 1:
                        vidaperso -= maquina.getAtaque1();
                        personaje.setVida(vidaperso);
                        break;
                    case 2:
                        vidaperso -= maquina.getAtaque2();
                        personaje.setVida(vidaperso);
                        break;
                    case 3:
                        vidaperso -= maquina.getAtaque3();
                        personaje.setVida(vidaperso);
                        break;
                    case 4:
                        vidamaqui += maquina.getCurar();
                        maquina.setVida(vidamaqui);
                        break;
                }
            } while ((personaje.getVida()>0)&&(maquina.getVida()>0));

        }
        if (personaje.getVida()<=0){
            System.out.println("Lo siento ha ganado la maquina");
        }else{
            System.out.println("Jugador ha ganado felicidades");
        }
    }
}
