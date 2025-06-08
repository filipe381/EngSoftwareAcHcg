import org.example.CalculadoraHcg;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static junit.framework.TestCase.assertTrue;

public class hcgTest {
    private final CalculadoraHcg calculadora = new CalculadoraHcg();

    private Date criarDataComSemanasDeGestacao(int semanas) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -semanas * 7);
        return cal.getTime();
    }

    private void testarResultado(double beta, int semanas, String esperado) {
        Date dum = criarDataComSemanasDeGestacao(semanas);
        String resultado = calculadora.calcularIdadeGestacional(beta, dum);
        assertTrue("Esperado: " + esperado + ", mas foi: " + resultado, resultado.contains(esperado));
    }

    // Testes para semanas fora do intervalo
    @Test
    public void testeSemanaMenorQue3() {
        testarResultado(100, 2, "A ferramenta cobre o intervalo de 3 a 16 semanas");
    }

    @Test
    public void testeSemanaMaiorQue16() {
        testarResultado(100, 17, "A ferramenta cobre o intervalo de 3 a 16 semanas");
    }

    // Testes para Semana 3
    @Test
    public void testeSemana3Negativo() {
        testarResultado(10, 3, "Resultado negativo");
    }

    @Test
    public void testeSemana3AbaixoDoEsperado() {
        testarResultado(26, 3, "abaixo do esperado");
    }

    @Test
    public void testeSemana3DentroDoIntervalo() {
        testarResultado(51, 3, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana3AcimaDoEsperado() {
        testarResultado(101, 3, "acima do esperado");
    }

    // Testes para Semana 4
    @Test
    public void testeSemana4Negativo() {
        testarResultado(10, 4, "Resultado negativo");
    }

    @Test
    public void testeSemana4AbaixoDoEsperado() {
        testarResultado(26, 4, "abaixo do esperado");
    }

    @Test
    public void testeSemana4DentroDoIntervalo() {
        testarResultado(200, 4, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana4AcimaDoEsperado() {
        testarResultado(427, 4, "acima do esperado");
    }

    // Testes para Semana 5
    @Test
    public void testeSemana5Negativo() {
        testarResultado(10, 5, "Resultado negativo");
    }

    @Test
    public void testeSemana5AbaixoDoEsperado() {
        testarResultado(26, 5, "abaixo do esperado");
    }

    @Test
    public void testeSemana5DentroDoIntervalo() {
        testarResultado(1000, 5, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana5AcimaDoEsperado() {
        testarResultado(7341, 5, "acima do esperado");
    }

    // Testes para Semana 6
    @Test
    public void testeSemana6Negativo() {
        testarResultado(10, 6, "Resultado negativo");
    }

    @Test
    public void testeSemana6AbaixoDoEsperado() {
        testarResultado(1000, 6, "abaixo do esperado");
    }

    @Test
    public void testeSemana6DentroDoIntervalo() {
        testarResultado(30000, 6, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana6AcimaDoEsperado() {
        testarResultado(56501, 6, "acima do esperado");
    }

    // Testes para Semana 7
    @Test
    public void testeSemana7Negativo() {
        testarResultado(10, 7, "Resultado negativo");
    }

    @Test
    public void testeSemana7AbaixoDoEsperado() {
        testarResultado(7000, 7, "abaixo do esperado");
    }

    @Test
    public void testeSemana7DentroDoIntervalo() {
        testarResultado(100000, 7, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana7AcimaDoEsperado() {
        testarResultado(229001, 7, "acima do esperado");
    }

    // Testes para Semana 8
    @Test
    public void testeSemana8Negativo() {
        testarResultado(10, 8, "Resultado negativo");
    }

    @Test
    public void testeSemana8AbaixoDoEsperado() {
        testarResultado(25000, 8, "abaixo do esperado");
    }

    @Test
    public void testeSemana8DentroDoIntervalo() {
        testarResultado(150000, 8, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana8AcimaDoEsperado() {
        testarResultado(288001, 8, "acima do esperado");
    }

    // Testes para Semana 9
    @Test
    public void testeSemana9Negativo() {
        testarResultado(10, 9, "Resultado negativo");
    }

    @Test
    public void testeSemana9AbaixoDoEsperado() {
        testarResultado(28000, 9, "abaixo do esperado");
    }

    @Test
    public void testeSemana9DentroDoIntervalo() {
        testarResultado(150000, 9, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana9AcimaDoEsperado() {
        testarResultado(291001, 9, "acima do esperado");
    }

    // Testes para Semana 10
    @Test
    public void testeSemana10Negativo() {
        testarResultado(10, 10, "Resultado negativo");
    }

    @Test
    public void testeSemana10AbaixoDoEsperado() {
        testarResultado(31000, 10, "abaixo do esperado");
    }

    @Test
    public void testeSemana10DentroDoIntervalo() {
        testarResultado(150000, 10, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana10AcimaDoEsperado() {
        testarResultado(261001, 10, "acima do esperado");
    }

    // Testes para Semana 11
    @Test
    public void testeSemana11Negativo() {
        testarResultado(10, 11, "Resultado negativo");
    }

    @Test
    public void testeSemana11AbaixoDoEsperado() {
        testarResultado(29000, 11, "abaixo do esperado");
    }

    @Test
    public void testeSemana11DentroDoIntervalo() {
        testarResultado(150000, 11, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana11AcimaDoEsperado() {
        testarResultado(233001, 11, "acima do esperado");
    }

    // Testes para Semana 12
    @Test
    public void testeSemana12Negativo() {
        testarResultado(10, 12, "Resultado negativo");
    }

    @Test
    public void testeSemana12AbaixoDoEsperado() {
        testarResultado(27000, 12, "abaixo do esperado");
    }

    @Test
    public void testeSemana12DentroDoIntervalo() {
        testarResultado(100000, 12, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana12AcimaDoEsperado() {
        testarResultado(200001, 12, "acima do esperado");
    }

    // Testes para Semana 13
    @Test
    public void testeSemana13Negativo() {
        testarResultado(10, 13, "Resultado negativo");
    }

    @Test
    public void testeSemana13AbaixoDoEsperado() {
        testarResultado(23500, 13, "abaixo do esperado");
    }

    @Test
    public void testeSemana13DentroDoIntervalo() {
        testarResultado(100000, 13, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana13AcimaDoEsperado() {
        testarResultado(180001, 13, "acima do esperado");
    }

    // Testes para Semana 14
    @Test
    public void testeSemana14Negativo() {
        testarResultado(10, 14, "Resultado negativo");
    }

    @Test
    public void testeSemana14AbaixoDoEsperado() {
        testarResultado(18000, 14, "abaixo do esperado");
    }

    @Test
    public void testeSemana14DentroDoIntervalo() {
        testarResultado(100000, 14, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana14AcimaDoEsperado() {
        testarResultado(145001, 14, "acima do esperado");
    }

    // Testes para Semana 15
    @Test
    public void testeSemana15Negativo() {
        testarResultado(10, 15, "Resultado negativo");
    }

    @Test
    public void testeSemana15AbaixoDoEsperado() {
        testarResultado(11500, 15, "abaixo do esperado");
    }

    @Test
    public void testeSemana15DentroDoIntervalo() {
        testarResultado(50000, 15, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana15AcimaDoEsperado() {
        testarResultado(110001, 15, "acima do esperado");
    }

    // Testes para Semana 16
    @Test
    public void testeSemana16Negativo() {
        testarResultado(10, 16, "Resultado negativo");
    }

    @Test
    public void testeSemana16AbaixoDoEsperado() {
        testarResultado(8500, 16, "abaixo do esperado");
    }

    @Test
    public void testeSemana16DentroDoIntervalo() {
        testarResultado(50000, 16, "dentro do intervalo esperado");
    }

    @Test
    public void testeSemana16AcimaDoEsperado() {
        testarResultado(105001, 16, "acima do esperado");
    }
}
