package com.FrightBox.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WeatherDetails {

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    private WeatherLocation pincode;

    private String cloud;

    private Double temperature;

    private Double temperature_min;

    private Double temperature_max;

    private Integer pressure;

    private Double humidity;

    private Double sea_level;

    private Double grnd_level;

    private Double visibility;

    private Double windSpeed;

    private Double WindDirection;

    private Double windGust;

    private Long sunrise;

    private Long sunset;

    private Integer timezone;

    private String country;




}
