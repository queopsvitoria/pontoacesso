package com.acesso.acesso.model;

import lombok.*;

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

public class Localidade {
    @Id
    private long id;
    @ManyToOne
    private NIvelAcesso nivelacesso;
    private String descricao;

}
