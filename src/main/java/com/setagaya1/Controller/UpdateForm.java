package com.setagaya1.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class UpdateForm {

    private String name;
    private LocalDate birthday;
    private int height;

}
