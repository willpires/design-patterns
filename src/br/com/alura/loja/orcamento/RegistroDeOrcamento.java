package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

public class RegistroDeOrcamento {
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        //chamada http para a api externa
        if (orcamento.isFinalizado()) {
        throw new DomainException("Orcamento nao finalizado!");
        }
        String url = "http://api.externa";
//        Map<String, Object>  dados = Map.of(
//                "valor",orcamento.getValor(),
//                "quantidade",orcamento.getQuantidadeItens()
//        );
//        http.post(url,dados);
    }
}
