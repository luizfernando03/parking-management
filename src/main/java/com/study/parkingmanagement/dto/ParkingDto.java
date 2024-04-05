package com.study.parkingmanagement.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
public class ParkingDto {

    @NotBlank
    private String numeroDaVaga;
    @NotBlank
    @Size(max = 7)
    private String placaDoCarro;
    @NotBlank
    private String modeloDoCarro;
    @NotBlank
    private String CorDoCarro;
    @NotBlank
    private String nomeDono;
    @NotBlank
    private LocalDateTime dataDaEntrada;


}
