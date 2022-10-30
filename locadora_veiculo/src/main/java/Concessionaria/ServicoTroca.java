package Concessionaria;

public class ServicoTroca implements IServico{

    public String aprovado() {
        return  "Troca aprovada!";
    }

    public String reprovado(){
        return "Troca recusada!";
    }

}
