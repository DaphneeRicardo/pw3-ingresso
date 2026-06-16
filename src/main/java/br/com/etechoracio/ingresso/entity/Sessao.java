package br.com.etechoracio.ingresso.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_SESSAO")
public class Sessao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SESSAO")
    private Long id;
    @Column(name = "DT_DATA")
    private LocalDate data;
    @Column(name = "TM_HORA")
    private LocalTime horario;
    @Column(name = "NR_PRECO")
    private Double preco;
    @Column(name = "TX_SALA")
    private String sala;
    @ManyToOne
    @JoinColumn(name = "FK_FILME")
    private Filme filme;

}
