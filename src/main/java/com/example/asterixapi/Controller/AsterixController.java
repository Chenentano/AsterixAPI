package com.example.asterixapi.Controller;

import com.example.asterixapi.Character;
import com.example.asterixapi.DTO.CharacterCreationDTO;
import com.example.asterixapi.Service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/asterix")
public class AsterixController {

    private final CharacterService characterService;

    @Autowired
    public AsterixController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping("/character")
    public ResponseEntity<Character> createCharacter(@RequestBody CharacterCreationDTO createDTO) {
        String generatedId = UUID.randomUUID().toString();
        Character character = new Character(generatedId, createDTO.getName(), createDTO.getAge(), createDTO.getRole());
        Character createdCharacter = characterService.createCharacter(character);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdCharacter);
    }
}