package org.example;

import java.util.HashMap;
import java.util.Map;

public class FabricaArbol {
    private Map<String, TipoArbol> tiposArbol = new HashMap<>();

    public TipoArbol getTipoArbol(String type) {

        // Si el tipo de árbol ya existe, lo reutilizamos
        if (!tiposArbol.containsKey(type)) {
            tiposArbol.put(type, new TipoArbol(type));
        }
        return tiposArbol.get(type);
    }
}
