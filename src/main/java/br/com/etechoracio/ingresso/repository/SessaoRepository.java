package br.com.etechoracio.ingresso.repository;

import br.com.etechoracio.ingresso.entity.Sessao;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface SessaoRepository extends JpaRepository<Sessao, Long> {

    List<Sessao>findFilmeById(Long id);
}
