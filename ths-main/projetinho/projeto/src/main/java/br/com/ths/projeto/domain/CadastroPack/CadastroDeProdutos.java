
package br.com.ths.projeto.domain.CadastroPack;

import jakarta.persistence.*;
        import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Entity(name = "CadastroDeProdutos")
@Data
@Table(name = "CadastroDeProdutos")
@EqualsAndHashCode(of = "codigo_produto")
public class CadastroDeProdutos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long codigo_produto;
    private String nome_produto;
    private String descricao_produto;
    private Double preco_produto;
    private int quantidade_produto;
    private LocalDate data_cadastro;
    private Long codigo;

    public CadastroDeProdutos() {

    }

    public CadastroDeProdutos(DadosCadastroProduto prod) {
        this.codigo_produto = prod.codigo_produto();
        this.nome_produto = prod.nome_produto();
        this.descricao_produto = prod.descricao_produto();
        this.preco_produto = prod.preco_produto();
        this.quantidade_produto = prod.quantidade_produto();
        this.data_cadastro = prod.data_cadastro();
    }

    public void setCodigo(Long codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public Long getCodigo() {
        return codigo_produto;
    }

    public void setNome(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getNome() {
        return nome_produto;
    }

    public void setDescricao(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public String getDescricao() {
        return descricao_produto;
    }

    public void setPreco(double preco_produto) {
        this.preco_produto = preco_produto;
    }

    public double getPreco() {
        return preco_produto;
    }

    public void setQuantidade(int quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    public int getQuantidade() {
        return quantidade_produto;
    }

    public void setDataCadastro(LocalDate data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public LocalDate getDataCadastro() {
        return data_cadastro;
    }
}