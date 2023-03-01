package com.FrightBox.Model;



import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.json.JSONObject;

import java.math.BigDecimal;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Weather {

    @Id
    private Integer pin;
    private String cloud;
    private BigDecimal temperature;
    private BigDecimal temperature_min;

    private BigDecimal temperature_max;

    private Integer pressure;

    private Integer humidity;

    private BigDecimal windSpeed;

    private Integer WindDirection;

    private Integer sunrise;

    private Integer sunset;

    private String country;

    private String url;



}
