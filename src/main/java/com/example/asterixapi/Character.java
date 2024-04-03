package com.example.asterixapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "character")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character {
@Id
    String id;
    String name;
    int age;
    String role;


}
