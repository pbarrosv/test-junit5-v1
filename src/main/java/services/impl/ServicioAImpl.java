package services.impl;

import services.ServicioA;

public class ServicioImpl implements ServicioA {
    @Override
    public int sumar(int a, int b) {
        return a+b;
    }
}
