package com.example.demotestangular.article;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table


public class  Article {

    @SequenceGenerator(
            name = "article_sequence",
            sequenceName = "article_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "article_sequence"
    )
    private Long id;
    @Column(name = "destination")
    private String destination;
    @Column(name = "depart")
    private String depart;
    @Column(name = "place")
    private int places;
    @Column(name = "time")
    private LocalDate time;

    public Article() {
    }

    public Article(String destination, String depart, int places, LocalDate time) {
        this.destination = destination;
        this.depart = depart;
        this.places = places;
        this.time = time;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", depart='" + depart + '\'' +
                ", places=" + places +
                ", time=" + time +
                '}';
    }
}
