package Concessionaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoFactoryTeste {

    @Test
    public void deveRetornarExceçãoParaServicoinexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Seguro");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

}
