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

public class Empresa {
    @Id
    private long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String cidade;
    private String estado;
    private String numero;
}
