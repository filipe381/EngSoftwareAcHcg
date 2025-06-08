package org.example;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        CalculadoraHcg hcg = new CalculadoraHcg();
        Calendar cal = Calendar.getInstance();
        cal.set(2025, 4, 2); // Junho é 5 (começa do zero: Jan = 0)
        String resultado = hcg.calcularIdadeGestacional(2000, cal.getTime());

        System.out.println(resultado);
    }
}