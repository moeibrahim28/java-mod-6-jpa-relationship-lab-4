package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="SHOWS_TABLE")
@Getter
@Setter
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String dayOfWeek;
    private String season;
    private String genre;

    @ManyToOne
    private Network network;

    @OneToMany(mappedBy = "id")
    private List<Character> characterList = new ArrayList<>();
}
