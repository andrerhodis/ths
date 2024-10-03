package br.com.ths.projeto.domain.CadastroPack;

import java.time.LocalDate;

public record  DadosListaProduto(
        Long codigoProduto,
        String nomeProduto,
        String descricaoProduto,
        int precoProduto,
        int quantidadeProduto,
        LocalDate dataCadastro,
        int codEstoquista
) {
    public DadosListaProduto(Produto produ) {
        this(
                produ.getCodigo(),
                produ.getNome(),
                produ.getDescricao(),
                produ.getPreco(),
                produ.getQuantidade(),
                produ.getData(),
                produ.getCodEsto()
        );
    }

    public void DadosListaProdutos(CadastroDeProdutos cadastroDeProdutos) {
    }
}

//classe Produto
class Produto {
    private Long codigo_produto;
    private String nome;
    private String descricao;
    private int preco;
    private int quantidade;
    private LocalDate data; // deve ser LocalDate
    private int codEsto;


    public Long getCodigo() { return codigo_produto; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public int getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
    public LocalDate getData() { return data; }
    public int getCodEsto() { return codEsto; }

}
