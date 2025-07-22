package com.example.CrudSingers.controller;

import com.example.CrudSingers.doMain.singers.RequestSingers;
import com.example.CrudSingers.doMain.singers.Singers;
import com.example.CrudSingers.repository.SingersRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping ("/singers")
public class SingersController {

    @Autowired
    private SingersRepository repository;

    @GetMapping
    public ResponseEntity ReturnSingers() {

        var Allsingers = repository.findAllByActiveTrue();
        return ResponseEntity.ok(Allsingers);
    }

    @PostMapping
    public ResponseEntity Postsingers(@RequestBody @Valid RequestSingers requestSingers) {
        Singers newSinger = new Singers(requestSingers);
        repository.save(newSinger);
        return ResponseEntity.ok().build();

    }

    @PutMapping
    @Transactional
    public ResponseEntity updateSingers(@RequestBody @Valid RequestSingers requestSingers) {
        Optional<Singers> optionalSingers = repository.findById(requestSingers.id());
        if (optionalSingers.isPresent()) {
            Singers singers = optionalSingers.get();
            singers.setName(requestSingers.name());
            singers.setAge(requestSingers.age());
            return ResponseEntity.ok(singers);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


@DeleteMapping ("/{id}")
@Transactional
public ResponseEntity deleteSingers(@PathVariable String id){
        Optional<Singers> optionalSingers = repository.findById(id);
        if(optionalSingers.isPresent()){
            Singers singers = optionalSingers.get();
            singers.setActive(false);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
}

}



