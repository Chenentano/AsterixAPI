package com.example.asterixapi.Repository;

import com.example.asterixapi.Character;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepository extends MongoRepository<Character,String> {
}
