package com.example.CrudSingers.repository;

import com.example.CrudSingers.doMain.singers.Singers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SingersRepository extends JpaRepository<Singers, String> {

    List<Singers> findAllByActiveTrue();

}
