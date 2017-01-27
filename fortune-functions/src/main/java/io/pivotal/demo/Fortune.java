package io.pivotal.demo;

import javax.persistence.*;

@Entity
@Table(name = "fortunes")
public class Fortune {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFortune() {
        return text;
    }

    public void setFortune(String text) {
        this.text = text;
    }

    public String toString() {
        return "Fortune[" + getId() + "]: " + getFortune();
    }
}
