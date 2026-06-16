package br.com.etechoracio.ingresso.service;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.dto.SessaoResponseDTO;
import br.com.etechoracio.ingresso.enums.SimNaoEnum;
import br.com.etechoracio.ingresso.mapper.SessaoMapper;
import br.com.etechoracio.ingresso.repository.FilmeRepository;
import br.com.etechoracio.ingresso.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SessaoService {
    @Autowired
    private SessaoRepository sessaoRepository;

    @Autowired
    private SessaoMapper sessaoMapper;

    public  List<SessaoResponseDTO> findAll() {
        var sessao = sessaoRepository.findAll();
        return sessaoMapper.toResponseDTOList(sessao);
    }


}
