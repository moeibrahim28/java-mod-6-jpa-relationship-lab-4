package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="CHARACTERS_TABLE")
@Getter
@Setter
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String catchphrase;

    @ManyToMany
    private List<Actor> actorList=new ArrayList<>();

    @ManyToMany
    private List<Show> showList = new ArrayList<>();
}
