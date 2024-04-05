package com.study.parkingmanagement.model;


import lombok.Data;
import org.yaml.snakeyaml.util.EnumUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_PARKING")
public class ParkingModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
   @Column (nullable = false, unique = true, length = 10)
   private String numeroDaVaga;
   @Column (nullable = false, unique = true, length = 7)
   private String PlacaDoCarro;
   @Column(nullable = false,length = 20)
    private String modeloDoCarro;
   @Column(nullable = false,length = 50)
    private String nomeDono;
   @Column(nullable = false )
    private LocalDateTime dataDaEntrada;


}
