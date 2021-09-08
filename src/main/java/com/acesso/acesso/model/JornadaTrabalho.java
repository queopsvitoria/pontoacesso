package com.acesso.acesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
//@Audited
public class JornadaTrabalho {

    @Id
    @GeneratedValue
    private long id;
    private String descricao;
    
}
