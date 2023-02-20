package ru.scriptrid.pcconfigurer.model.entity.pc.drive;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.scriptrid.pcconfigurer.model.entity.pc.PCComponent;

@Entity
@Getter
@Setter
@Table(name = "drive")
public class DriveEntity extends PCComponent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "capacity_in_gigabytes", nullable = false)
    private Integer capacityInGigabytes;

    @Column(name = "model", nullable = false)
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(name = "connect_interface")
    private ConnectInterface connectInterface;

    @Enumerated(EnumType.STRING)
    @Column(name = "drive_type")
    private DriveType driveType;

}