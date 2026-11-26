package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class Speakerserviceimpl implements Speakerservice {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    @Override
    public final List<Speaker> findAll() {
        return repository.findAll();

    }
}
