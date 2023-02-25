package com.FrightBox.Repository;

import com.FrightBox.Model.WeatherLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherLocationRepository extends JpaRepository<WeatherLocation,Integer> {

}
