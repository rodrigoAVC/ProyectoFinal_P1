
package ventanas;

public class Jugador {
    public String nombre;
    public int vida;
    public int ataque1;
    public int ataque2;
    public int ataque3;
    public int curar;

    public Jugador(String nombre, int vida, int ataque1, int ataque2, int ataque3, int curar) {
        this.nombre=nombre;
        this.vida = vida;
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
        this.ataque3 = ataque3;
        this.curar = curar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;
    }

    public int getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(int ataque2) {
        this.ataque2 = ataque2;
    }

    public int getAtaque3() {
        return ataque3;
    }

    public void setAtaque3(int ataque3) {
        this.ataque3 = ataque3;
    }

    public int getCurar() {
        return curar;
    }

    public void setCurar(int curar) {
        this.curar = curar;
    }

    @Override
    public String toString() {
        return nombre + "( vida=" + vida + ", ataque1=" + ataque1 + ", ataque2=" + ataque2 + ", ataque3=" + ataque3 + ", curar=" + curar + ')';
    }

    
   
    
    
}
