package com.junitpushup;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    private Example example;

    @BeforeEach
    public void init() {
        this.example = new Example();
    }

    @Test
    public void testSumar(){
        //Given - elementos que se tienen para realizar la prueba
        int numberA = 5;
        int numberB = 10;
        //When : Cuando
        int result = example.sumar(numberA, numberB);
        //Then - Entonces
        assertNotNull(result);
        assertEquals(15, result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckPositivo() {
        // Given
        int numeroPositivo = 5;
        int numeroNegativo = -1;

        // When
        boolean resultPositivo = example.checkPositivo(numeroPositivo);

        // Then
        assertNotNull(resultPositivo);
        assertTrue(resultPositivo);
        assertThrows(IllegalArgumentException.class, () -> example.checkPositivo(numeroNegativo));
    }

    @Test
    public void testContarLetrasA() {
        // Given
        String cadenaConA = "antitauromaquia";
        String cadenaSinA = "buho";
        
        // When
        int resultConA = example.contarLetrasA(cadenaConA);
        int resultSinA = example.contarLetrasA(cadenaSinA);
        
        // Then
        assertNotNull(resultConA);
        assertNotNull(resultSinA);
        assertEquals(4, resultConA);
        assertEquals(0, resultSinA);
    }

    @Test
    public void testContieneElemento() {
        // Given
        List<String> frutas = Arrays.asList("manzana", "naranja", "pera");
        String elementoPresente = "manzana";
        String elementoAusente = "piña";
        
        // When
        boolean resultPresente = example.contieneElemento(frutas, elementoPresente);
        boolean resultAusente = example.contieneElemento(frutas, elementoAusente);
        
        // Then
        assertNotNull(resultPresente);
        assertNotNull(resultAusente);
        assertTrue(resultPresente);
        assertFalse(resultAusente);
    }

    @Test
    public void testRevertirCadena() {
        // Given
        String cadena = "animal";
        
        // When
        String result = example.revertirCadena(cadena);
        
        // Then
        assertNotNull(result);
        assertEquals("lamina", result);
        assertInstanceOf(String.class, result);
    }

    @Test
    public void testFactorial() {
        // Given
        int numero = 5;
        int numeroNegativo = -1;

        // When
        long result = example.factorial(numero);

        // Then
        assertNotNull(result);
        assertEquals(120, result);  // 5! = 120
        assertInstanceOf(Long.class, result);
        assertThrows(IllegalArgumentException.class, () -> example.factorial(numeroNegativo));
    }

    @Test
    public void testEsPrimo() {
        // Given
        int numeroPrimo = 7;
        int numeroNoPrimo = 4;
        int numeroInvalido = 1;

        // When
        boolean resultPrimo = example.esPrimo(numeroPrimo);
        boolean resultNoPrimo = example.esPrimo(numeroNoPrimo);
        boolean resultInvalido = example.esPrimo(numeroInvalido);

        // Then
        assertNotNull(resultPrimo);
        assertNotNull(resultNoPrimo);
        assertNotNull(resultInvalido);
        assertTrue(resultPrimo);
        assertFalse(resultNoPrimo);
        assertFalse(resultInvalido);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {

        // When
        String result = example.mensajeConRetraso();

        // Then
        assertNotNull(result);
        assertEquals("Listo después de retraso", result);
        assertInstanceOf(String.class, result);
    }

    @Test
    public void testConvertirAString() {
        // Given
        List<Integer> lista = Arrays.asList(1, 2, 3);
        
        // When
        List<String> result = example.convertirAString(lista);
        
        // Then
        assertNotNull(result);
        assertEquals(Arrays.asList("1", "2", "3"), result);
        assertInstanceOf(List.class, result);
    }

    @Test
    public void testCalcularMedia() {
        // Given
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> listaVacia = Arrays.asList();
        
        // When
        double result = example.calcularMedia(lista);
        
        // Then
        assertNotNull(result);
        assertEquals(3.0, result);
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(listaVacia));
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(null));
    }

    @Test
    public void testConvertirListaAString() {
        // Given
        List<String> lista = Arrays.asList("java", "python", "ruby");
        
        // When
        String result = example.convertirListaAString(lista);
        
        // Then
        assertNotNull(result);
        assertEquals("JAVA,PYTHON,RUBY", result);
        assertInstanceOf(String.class, result);
    }

}
