package Concessionaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoVendaTest {

    @Test
    public void deveAprovarVenda() {
        IServico servico = ServicoFactory.obterServico("Venda");
        assertEquals("Venda Aprovada", servico.aprovado());
    }

    @Test
    public void deveReprovarVenda() {
        IServico servico = ServicoFactory.obterServico("Venda");
        assertEquals("Venda Recusada", servico.reprovado());
    }
}