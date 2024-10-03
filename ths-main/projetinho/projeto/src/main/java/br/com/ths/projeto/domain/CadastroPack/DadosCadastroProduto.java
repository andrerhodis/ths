package br.com.ths.projeto.domain.CadastroPack;

import java.time.LocalDate;

public record DadosCadastroProduto(
        Long codigo_produto,
        String nome_produto,
        String descricao_produto,
        Double preco_produto,
        int quantidade_produto,
        LocalDate data_cadastro,
        int cod_estoquista) {
}


