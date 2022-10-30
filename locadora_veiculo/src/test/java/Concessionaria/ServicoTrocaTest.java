package Concessionaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoTrocaTest {

    @Test
    public void deveAprovarTroca() {
        IServico servico = ServicoFactory.obterServico("Troca");
        assertEquals("Troca Aprovada", servico.aprovado());
    }

    @Test
    public void deveReprovarTroca() {
        IServico servico = ServicoFactory.obterServico("Troca");
        assertEquals("Troca Recusada, pois o limite do prazo foi excedido", servico.reprovado());
    }
}