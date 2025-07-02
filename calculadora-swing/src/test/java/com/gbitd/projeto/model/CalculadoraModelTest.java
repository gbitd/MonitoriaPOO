package com.gbitd.projeto.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraModelTest{

    private CalculadoraModel model;

    @BeforeEach
    public void setUp(){
        model = new CalculadoraModel();
    }

    @Test
    public void testSomaNumerosPositivos(){
        model.soma(5.0, 3.5);
        assertEquals(8.5, model.getResultado(), 0.0001);

    }
    @Test
    public void testSomaNumerosNegativos(){
        model.soma(-7.0, -3.5);
        assertEquals(-10.5, model.getResultado(), 0.0001);

    }
    @Test
    public void testSomaNumerosNegativosePositivos(){
        model.soma(-5.0, 3.0);
        assertEquals(-2.0, model.getResultado(), 0.0001);

    }
    @Test
    public void testSomaNumerosPositivoseNegativos(){
        model.soma(5.0, -3.5);
        assertEquals(1.5, model.getResultado(), 0.0001);

    }

    @Test
    public void testSubtracaoNumerosPositivos(){
        model.subtracao(5.0, 2.0);
        assertEquals(3.0, model.getResultado(), 0.0001);
    }
    @Test
    public void testSubtracaoNumerosNegativos(){
        model.subtracao(-5.0, -2.0);
        assertEquals(-3.0, model.getResultado(), 0.0001);
    }
    @Test
    public void testSubtracaoNumerosPositivoseNegativos(){
        model.subtracao(5.0, -2.0);
        assertEquals(7.0, model.getResultado(), 0.0001);
    }
    @Test
    public void testSubtracaoNumerosNegativosePositivos(){
        model.subtracao(-5.0, 2.0);
        assertEquals(-7.0, model.getResultado(), 0.0001);
    }

    @Test
    public void testMultiplicacaoNumerosPositivos(){
        model.multiplicacao(5.0, 2.0);
        assertEquals(10.0, model.getResultado(), 0.0001);
    }
    @Test
    public void testMultiplicacaoNumerosNegativos(){
        model.multiplicacao(-5.0, -2.0);
        assertEquals(10.0, model.getResultado(), 0.0001);
    }
    @Test
    public void testMultiplicacaoNumerosPositivoseNegativos(){
        model.multiplicacao(5.0, -2.0);
        assertEquals(-10.0, model.getResultado(), 0.0001);
    }
    @Test
    public void testMultiplicacaoNumerosNegativosePositivos(){
        model.multiplicacao(-5.0, 2.0);
        assertEquals(-10.0, model.getResultado(), 0.0001);
    }
@Test
    public void testDivisaoNumerosPositivos(){
        model.divisao(5.0, 2.0);
        assertEquals(2.5, model.getResultado(), 0.0001);
    }
    @Test
    public void testDivisaoNumerosNegativos(){
        model.divisao(-5.0, -2.0);
        assertEquals(2.5, model.getResultado(), 0.0001);
    }
    @Test
    public void testDivisaoNumerosPositivoseNegativos(){
        model.divisao(5.0, -2.0);
        assertEquals(-2.5, model.getResultado(), 0.0001);
    }
    @Test
    public void testDivisaoNumerosNegativosePositivos(){
        model.divisao(-5.0, 2.0);
        assertEquals(-2.5, model.getResultado(), 0.0001);
    }

}
