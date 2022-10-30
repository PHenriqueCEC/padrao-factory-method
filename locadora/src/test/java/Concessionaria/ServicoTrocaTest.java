package Concessionaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoTrocaTest {

    @Test
    public void deveAprovarTroca() {
        IServico servico = ServicoFactory.obterServico("Troca");
        assertEquals("Troca aprovada!", servico.aprovado());
    }

    @Test
    public void deveReprovarTroca() {
        IServico servico = ServicoFactory.obterServico("Troca");
        assertEquals("Troca recusada!", servico.reprovado());
    }
}