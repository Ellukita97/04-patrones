package org.example;

public class TipoArbol {
    private String tipo;

    public TipoArbol(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void dibujar(int x, int y) {
        System.out.println("Dibujando árbol de tipo " + tipo + " en posición (" + x + ", " + y + ")");
    }
}
