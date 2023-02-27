package com.FrightBox.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String cloud;

    private BigDecimal temperature;

    private BigDecimal temperature_min;

    private BigDecimal temperature_max;

    private Integer pressure;

    private Integer humidity;

    private Integer sea_level;

    private BigDecimal windSpeed;

    private Integer WindDirection;

    private BigDecimal windGust;

    private Integer sunrise;

    private Integer sunset;

    private String country;

    private String url;




}
