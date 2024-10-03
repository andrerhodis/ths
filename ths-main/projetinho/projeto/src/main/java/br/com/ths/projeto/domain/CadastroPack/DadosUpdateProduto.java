package br.com.ths.projeto.domain.CadastroPack;

import java.time.LocalDate;

public record DadosUpdateProduto(
        Long codigo_produto,
        String nome_produto,
        String descricao_produto,
        int preco_produto,
        int quantidade_produto,
        LocalDate data_cadastro,
        int cod_estoquista
) {
}

//EXTENDER TABELA ESTOQUISTA //
