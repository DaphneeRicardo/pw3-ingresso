package br.com.etechoracio.ingresso.controller;

import br.com.etechoracio.ingresso.dto.FilmeResponseDTO;
import br.com.etechoracio.ingresso.dto.SessaoResponseDTO;
import br.com.etechoracio.ingresso.entity.Filme;
import br.com.etechoracio.ingresso.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/sessoes")
@CrossOrigin("*")
public class SessaoController {

    @Autowired
    private SessaoService sessaoService;

    @GetMapping
    public List<SessaoResponseDTO> findAll(){
        return sessaoService.findAll();
    }

    @GetMapping("/filmeById/{id}")
    public List<SessaoResponseDTO> findFilmeById(Long id) {return sessaoService.findFilmeById(id);}

}
