package br.com.ths.projeto.service;

import br.com.ths.projeto.domain.CadastroPack.DadosCadastroProduto;
import br.com.ths.projeto.domain.CadastroPack.DadosUpdateProduto;
import br.com.ths.projeto.domain.CadastroPack.CadastroDeProdutos;
import br.com.ths.projeto.repository.CadastroDeProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
@RequestMapping("/produtos")
public class CadastroProdutoService {

    @Autowired
    private CadastroDeProdutosRepository repository;

    // Criar produto
    @PostMapping
    public ResponseEntity<CadastroDeProdutos> criarProduto(@RequestBody DadosCadastroProduto dados) {
        CadastroDeProdutos produto = new CadastroDeProdutos(dados);
        repository.save(produto);
        return ResponseEntity.ok(produto);
    }

    // Listar todos os Produtos com DadosListaProduto
    @GetMapping
    public ResponseEntity<List<CadastroDeProdutos>> listarProduto() {
        List<CadastroDeProdutos> produtos = repository.findAll();
        return ResponseEntity.ok(produtos);
    }

    // Buscar produto por codigo
    @GetMapping("/{codigo_produto}")
    public Optional<CadastroDeProdutos> buscarProdutoPorCodigo(@PathVariable Long codigo_produto) {
        Optional<CadastroDeProdutos> produto = repository.findById(codigo_produto);
        return null;
    }


    // Atualizar produto com DadosUpdateProduto
    @PutMapping("/{codigo_produto}") // Use PUT for updates
    public ResponseEntity<CadastroDeProdutos> atualizarProduto(@PathVariable Long codigo_produto, @RequestBody DadosUpdateProduto dados) {
        Optional<CadastroDeProdutos> produtoOptional = repository.findById(codigo_produto);
        if (produtoOptional.isPresent()) {
            CadastroDeProdutos produto = produtoOptional.get();

            repository.save(produto);
            return ResponseEntity.ok(produto);
        }
        return ResponseEntity.notFound().build();
    }

    // Deletar produto
    @DeleteMapping("/{codigo_produto}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long codigo_produto) {
        repository.deleteById(codigo_produto);
        return ResponseEntity.noContent().build();
    }


}