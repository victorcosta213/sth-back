package com.studyhub.sth.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "representantes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "representanteId")
public class Representante {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID representanteId;

    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "empresa_id", nullable = false)
    private UUID empresaId;

    @OneToMany(mappedBy = "representante", cascade = CascadeType.ALL)
    private List<Squad> squads;
    
}
