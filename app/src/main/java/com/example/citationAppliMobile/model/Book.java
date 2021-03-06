package com.example.citationAppliMobile.model;

import java.io.Serializable;

public class Book implements Serializable {

    private int id;
    private String titre;
    private String imageUrl;
    private int anneeParution;
    private Auteur auteur;



    public Book(int id, int years, String titre,int anneeParution, Auteur auteur) {
        this.id = id;
        this.anneeParution = years;
        this.titre = titre;
        this.auteur = auteur;
        this.anneeParution =  anneeParution;
    }

    public int getId() {
        return id;
    }

    public int getAnneeParution() {
        return anneeParution;
    }

    public String getTitre() {
        return titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", anneeParution=" + anneeParution +
                ", auteur=" + auteur +
                '}';
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
