package Concessionaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoAluguelTest {

    @Test
    public void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Aluguel");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}