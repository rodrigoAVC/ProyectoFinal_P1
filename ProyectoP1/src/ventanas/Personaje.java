package ventanas;

import java.util.Scanner;
import java.util.Random;

public class Personaje {

    String nombre;
    double vida;
    double ataque1;
    double ataque2;
    double ataque3;
    String elemento; 

    public Personaje(String nombre, double vida, double ataque1, double ataque2, double ataque3, String elemento) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
        this.ataque3 = ataque3;
        this.elemento = elemento;
    }
    
    public void menu() {
        System.out.println("<-------------- " + nombre + " -------------->");
        System.out.println("Vida: " + this.vida + "  Elemento: " + this.elemento);
        System.out.println("1. [Ataque 1]                    2. [Ataque 2]");
        System.out.println("3. [Ataque 3]                       4. [Curar]");
    }
    
    public double ataque1 (String elemento, String escenario) {
        switch(escenario) {
            case "oceano":
                if (elemento.equalsIgnoreCase("agua")) {
                    double percent = ataque1 / 0.3;
                    ataque1 = ataque1 + percent;
                    return ataque1;
                } else {
                    return ataque1;
                }
            case "desierto":
                if (elemento.equalsIgnoreCase("tierra")) {
                    double percent = ataque1 / 0.3;
                    ataque1 = ataque1 + percent;
                    return ataque1;
                } else {
                    return ataque1;
                }
            case "montaña":
                if (elemento.equalsIgnoreCase("aire")) {
                    double percent = ataque1 / 0.3;
                    ataque1 = ataque1 + percent;
                    return ataque1;
                } else {
                    return ataque1;
                }
            case "volcan": 
                if (elemento.equalsIgnoreCase("fuego")) {
                    double percent = ataque1 / 0.3;
                    ataque1 = ataque1 + percent;
                    return ataque1;
                } else {
                    return ataque1;
                }
        }
        return 0;
    }
    
    public double ataque2 (String elemento, String escenario) {
        switch(escenario) {
            case "oceano":
                if (elemento.equalsIgnoreCase("agua")) {
                    double percent = ataque2 / 0.3;
                    ataque2 = ataque2 + percent;
                    return ataque2;
                } else {
                    return ataque2;
                }
            case "desierto":
                if (elemento.equalsIgnoreCase("tierra")) {
                    double percent = ataque2 / 0.3;
                    ataque2 = ataque2 + percent;
                    return ataque2;
                } else {
                    return ataque2;
                }
            case "montaña":
                if (elemento.equalsIgnoreCase("aire")) {
                    double percent = ataque2 / 0.3;
                    ataque2 = ataque2 + percent;
                    return ataque2;
                } else {
                    return ataque2;
                }
            case "volcan": 
                if (elemento.equalsIgnoreCase("fuego")) {
                    double percent = ataque2 / 0.3;
                    ataque2 = ataque2 + percent;
                    return ataque2;
                } else {
                    return ataque2;
                }
        }
        return 0;
    }
    
    public double ataque3 (String elemento, String escenario) {
        switch(escenario) {
            case "oceano":
                if (elemento.equalsIgnoreCase("agua")) {
                    double percent = ataque3 / 0.3;
                    ataque3 = ataque3 + percent;
                    return ataque3;
                } else {
                    return ataque3;
                }
            case "desierto":
                if (elemento.equalsIgnoreCase("tierra")) {
                    double percent = ataque3 / 0.3;
                    ataque3 = ataque3 + percent;
                    return ataque3;
                } else {
                    return ataque3;
                }
            case "montaña":
                if (elemento.equalsIgnoreCase("aire")) {
                    double percent = ataque3 / 0.3;
                    ataque3 = ataque3 + percent;
                    return ataque3;
                } else {
                    return ataque3;
                }
            case "volcan": 
                if (elemento.equalsIgnoreCase("fuego")) {
                    double percent = ataque3 / 0.3;
                    ataque3 = ataque3 + percent;
                    return ataque3;
                } else {
                    return ataque3;
                }
        }
        return 0;
    }
    
    public double curar(double dmg) {
        double curar = dmg / 0.4;
        return vida = vida + curar;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;
    }

    public double getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(int ataque2) {
        this.ataque2 = ataque2;
    }

    public double getAtaque3() {
        return ataque3;
    }

    public void setAtaque3(int ataque3) {
        this.ataque3 = ataque3;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
    
    
}
