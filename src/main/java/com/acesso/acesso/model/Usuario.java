package com.acesso.acesso.model;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NIvelAcesso nivelacesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime finalJornada;
    
}
