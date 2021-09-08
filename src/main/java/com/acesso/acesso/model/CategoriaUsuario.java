package com.acesso.acesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class CategoriaUsuario {
    @Id
    private long id;
    private String descricao;
}
