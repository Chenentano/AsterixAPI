package com.example.asterixapi.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterCreationDTO {
    private String name;
    private int age;
    private String role;
}