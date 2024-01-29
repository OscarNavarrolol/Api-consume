package com.example.apisrandom.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Api {

    int userId;
    int id;
    String title;
    Boolean completed;

}

