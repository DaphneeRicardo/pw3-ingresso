package br.com.etechoracio.ingresso.service;

import br.com.etechoracio.ingresso.dto.SessaoResponseDTO;
import br.com.etechoracio.ingresso.mapper.SessaoMapper;
import br.com.etechoracio.ingresso.repository.SessaoRepository;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class SessaoService {
    @Autowired
    private SessaoRepository sessaoRepository;

    @Autowired
    private SessaoMapper sessaoMapper;

    public  List<SessaoResponseDTO> findAll() {
        var sessao = sessaoRepository.findAll();
        return sessaoMapper.toResponseDTOList(sessao);
    }

    public List<SessaoResponseDTO> findFilmeById(Long id){
        var filme = sessaoRepository.findFilmeById(id);
        return sessaoMapper.toResponseDTOList(filme);
    }


}
