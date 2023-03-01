package com.FrightBox.Repository;

import com.FrightBox.Exceptions.WeatherLocationExceptions;
import com.FrightBox.Model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface LocationRepository extends JpaRepository<Location,Integer> {


}
