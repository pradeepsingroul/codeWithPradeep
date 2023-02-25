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
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WeatherLocation {

    @Id
    private Integer pinCode;

    private Long LattiTude;

    private Long longitude;

    private String districk;

    private String block;

    @OneToOne(cascade = CascadeType.ALL)
    private WeatherDetails WeatherPincode;


}
