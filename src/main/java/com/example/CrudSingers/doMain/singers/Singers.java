package com.example.CrudSingers.doMain.singers;


import jakarta.persistence.*;
import lombok.*;


@Table (name= "singers")
@Entity (name = "singers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")

public class Singers {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
   private String id;

   private  String name;
   private  int age;
   private  Boolean active;

    public Singers(RequestSingers requestSingers){
        this.name = requestSingers.name();
        this.age = requestSingers.age();
        this.active = true;
    }




}
