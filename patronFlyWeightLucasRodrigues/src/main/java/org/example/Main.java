package org.example;

public class Main {
    public static void main(String[] args) {
        FabricaArbol fabricaArbol = new FabricaArbol();

        // Crear algunos árboles con tipos y posiciones diferentes
        TipoArbol tipoRoble = fabricaArbol.getTipoArbol("Roble");
        TipoArbol tipoPino = fabricaArbol.getTipoArbol("Pino");

        Arbol arbol1 = new Arbol(tipoRoble, 1, 2);
        Arbol arbol2 = new Arbol(tipoRoble, 3, 4);
        Arbol arbol3 = new Arbol(tipoPino, 5, 6);
        Arbol arbol4 = new Arbol(tipoPino, 7, 8);

        // Dibujar los árboles
        arbol1.dibujar();
        arbol2.dibujar();
        arbol3.dibujar();
        arbol4.dibujar();
    }
}