package br.com.ths.projeto.controller;

import br.com.ths.projeto.domain.CadastroPack.CadastroDeProdutos;
import br.com.ths.projeto.domain.CadastroPack.DadosCadastroProduto;
import br.com.ths.projeto.domain.CadastroPack.DadosListaProduto;
import br.com.ths.projeto.domain.CadastroPack.DadosUpdateProduto;
import br.com.ths.projeto.service.CadastroProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos") // Adicione o caminho da API aqui
public class CadastroDeProdutosController {
    @Autowired
    private CadastroProdutoService service;

    @PostMapping
    public ResponseEntity<CadastroDeProdutos> cadastrarProdutos(@RequestBody DadosCadastroProduto dados) {
        CadastroDeProdutos novoProduto = service.criarProduto(dados).getBody(); // Corrigido para usar
        return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<DadosListaProduto>> listarProduto() {
        List<DadosListaProduto> produtos = (List<DadosListaProduto>) service.listarProduto();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/{codigo_produto}")
    public ResponseEntity<CadastroDeProdutos> buscarProdutoPorCodigo(@PathVariable Long codigo_produto) {
        Optional<CadastroDeProdutos> produto = service.buscarProdutoPorCodigo(codigo_produto); // Corrigido para Optional
        return produto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }



    @PutMapping("/{codigo_produto}")
    public ResponseEntity<ResponseEntity<CadastroDeProdutos>> atualizarProdutos(@PathVariable Long codigo_produto, @RequestBody DadosUpdateProduto dadosAtualizados) {
        ResponseEntity<CadastroDeProdutos> produtoAtualizado = service.atualizarProduto(codigo_produto, dadosAtualizados);
        return ResponseEntity.ok(produtoAtualizado);
    }

    @DeleteMapping("/{codigo_produto}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long codigo_produto) { // Corrigido
        service.deletarProduto(codigo_produto);
        return ResponseEntity.noContent().build();
    }
}
