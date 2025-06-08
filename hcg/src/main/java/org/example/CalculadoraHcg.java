package org.example;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CalculadoraHcg {

    public static String calcularIdadeGestacional(double betaHcg, Date ultimaMenstruacao){
        long diffMillis = new Date().getTime() - ultimaMenstruacao.getTime();
        long diffDias = TimeUnit.MILLISECONDS.toDays(diffMillis);
        int semanas = (int) (diffDias / 7);

        if (semanas < 3 || semanas > 16) {
            return "A ferramenta cobre o intervalo de 3 a 16 semanas de gestação.";
        }

        int[][] hcgFaixas = {
                {}, // 0 semanas - não usado
                {}, // 1 semana
                {}, // 2 semanas
                {50, 100},          // 3 semanas
                {100, 426},         // 4 semanas
                {200, 7340},       // 5 semanas
                {1080, 56500},    // 6 semanas
                {7650, 229000},   // 7 semanas
                {25700, 288000},  // 8 semanas
                {28800, 291000},  // 9 semanas
                {32000, 261000},  // 10 semanas
                {30000, 233000},  // 11 semanas
                {27500, 200000},  // 12 semanas
                {24000, 180000},  // 13 semanas
                {18500, 145000},  // 14 semanas
                {12000, 110000},  // 15 semanas
                {9000, 105000},   // 16 semanas
        };

        int[] faixa = hcgFaixas[semanas];
        String status;

        if (betaHcg < 25) {
            status = "Resultado negativo (<25 mUI/mL): indica que, provavelmente, não há gestação em curso.";
        } else if (betaHcg < faixa[0]) {
            status = "Resultado positivo abaixo do esperado: pode indicar problemas na evolução da gravidez ou datação incorreta.";
        } else if (betaHcg > faixa[1]) {
            status = "Resultado positivo acima do esperado: pode sugerir uma gestação gemelar ou erro de datação.";
        } else {
            status = "Resultado positivo compatível com a idade gestacional: o valor de hCG está dentro do intervalo esperado.";
        }

        return String.format(status);
    }
}
