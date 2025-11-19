package com.mycompany.inventarioderestaurante;

import java.util.ArrayList;
import java.util.List;

public class inventario {
    private List<producto> productos;

    public inventario() {
        productos = new ArrayList<>();
    }

    public boolean agregarProducto(producto nuevoProducto) {
        for (producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nuevoProducto.getNombre())) {
                return false;
            }
        }
        productos.add(nuevoProducto);
        return true;
    }

    public boolean aumentarStock(String nombre, int cantidad) {
        for (producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                p.setCantidad(p.getCantidad() + cantidad);
                return true;
            }
        }
        return false; 
    }

    public boolean disminuirStock(String nombre, int cantidad) {
        for (producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                if (p.getCantidad() >= cantidad) {
                    p.setCantidad(p.getCantidad() - cantidad);
                    return true;
                }
                return false;
            }
        }
        return false; 
    }

    public List<producto> obtenerProductos() {
        return productos;
    }

    public producto buscarProducto(String nombre) {
        for (producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
}

