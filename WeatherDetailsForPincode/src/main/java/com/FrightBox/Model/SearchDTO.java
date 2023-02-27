package com.FrightBox.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SearchDTO {

    @NotNull(message = "pincode cant be null")
    @NotBlank(message = "pincode cant be blank")
    @NotEmpty(message = "pincode cant be empty")
    private Integer pincode;
    @Past(message = "date must be past")
    private LocalDate dateStamp;



}
