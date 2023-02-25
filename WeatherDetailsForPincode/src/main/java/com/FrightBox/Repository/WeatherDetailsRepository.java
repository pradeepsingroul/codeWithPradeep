package com.FrightBox.Repository;

import com.FrightBox.Model.WeatherDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherDetailsRepository extends JpaRepository<WeatherDetails,Integer> {



}
