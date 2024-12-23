package org.example;

public class Arbol {
    private TipoArbol tipoArbol;  // El Flyweight

    private int x, y;  // Estado único para cada arbol

    public Arbol(TipoArbol tipoArbol, int x, int y) {
        this.tipoArbol = tipoArbol;
        this.x = x;
        this.y = y;
    }

    // Método para dibujar el árbol en el terreno
    public void dibujar() {
        tipoArbol.dibujar(x, y);
    }
}
