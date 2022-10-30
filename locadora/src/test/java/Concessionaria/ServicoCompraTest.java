package Concessionaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoCompraTest {

    @Test
    public void deveAprovarCompra() {
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra aprovada!", servico.aprovado());
    }

    @Test
    public void deveReprovarCompra() {
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra reprovada!", servico.reprovado());
    }
}