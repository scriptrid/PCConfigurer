package ru.scriptrid.pcconfigurer.model.entity.pc.processor;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.scriptrid.pcconfigurer.model.entity.pc.PCComponent;

@Entity
@Getter
@Setter
@Table(name = "pc_processor")
public class PCProcessorEntity extends PCComponent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "cores")
    private Integer cores;

    @Column(name = "threads")
    private Integer threads;

}