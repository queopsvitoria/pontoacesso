package com.acesso.acesso.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Movimentacao {
    /*
        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable

        public class MovimentacaoId implements Serializable {

            private long idMovimento;
            private long idUsuario;
        }
    */
    @EmbeddedId
 //   private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    private Ocorrencia ocorrencia;
    private Calendario calendario;

}
