package Concessionaria;

public class ServicoVenda implements IServico{

    public String aprovado() {
        return "Venda aprovada!";
    }

    public String reprovado(){

        return "Venda recusada!";
    }
}