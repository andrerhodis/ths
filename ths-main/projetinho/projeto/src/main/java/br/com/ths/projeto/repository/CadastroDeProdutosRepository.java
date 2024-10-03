package br.com.ths.projeto.repository;

import br.com.ths.projeto.domain.CadastroPack.CadastroDeProdutos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroDeProdutosRepository extends JpaRepository<CadastroDeProdutos, Long> {
}