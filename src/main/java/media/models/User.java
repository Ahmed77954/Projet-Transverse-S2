package media.models;

import java.util.List;
import java.util.ArrayList;

/**
 * Classe représentant un utilisateur
 */
public class User {
    // Attributs
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String pseudo;
    private List<Media> mediaVus;
    private List<Media> mediaFavoris;
    
    // Constructeurs
    public User() {
        this.mediaVus = new ArrayList<>();
        this.mediaFavoris = new ArrayList<>();
    }
    
    public User(int id, String nom, String prenom, String email, String pseudo) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.pseudo = pseudo;
        this.mediaVus = new ArrayList<>();
        this.mediaFavoris = new ArrayList<>();
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPseudo() {
        return pseudo;
    }
    
    public List<Media> getMediaVus() {
        return mediaVus;
    }
    
    public List<Media> getMediaFavoris() {
        return mediaFavoris;
    }
    
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    
    public void setMediaVus(List<Media> mediaVus) {
        this.mediaVus = mediaVus;
    }
    
    public void setMediaFavoris(List<Media> mediaFavoris) {
        this.mediaFavoris = mediaFavoris;
    }
    
    // Méthodes
    public void ajouterMediaVu(Media media) {
        // TODO: Implémenter l'ajout d'un média vu
    }
    
    public void ajouterMediaFavori(Media media) {
        // TODO: Implémenter l'ajout d'un média favori
    }
    
    public void supprimerMediaFavori(Media media) {
        // TODO: Implémenter la suppression d'un média favori
    }
    
    public void noterMedia(Media media, double note) {
        // TODO: Implémenter la notation d'un média
    }
}
