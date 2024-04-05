package com.example.asterixapi.Service;

import com.example.asterixapi.Character;
import com.example.asterixapi.Repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public Character createCharacter(Character character) {
        return characterRepository.save(character);
    }
}