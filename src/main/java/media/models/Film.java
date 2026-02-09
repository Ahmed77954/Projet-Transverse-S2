package media.models;

/**
 * Classe représentant un film
 */
public class Film extends Media {
    // Attributs spécifiques
    private int duree; // en minutes
    private String realisateur;
    
    // Constructeurs
    public Film() {
        super();
    }
    
    public Film(int id, String titre, String description, int annee, String genre, int duree, String realisateur) {
        super(id, titre, description, annee, genre);
        this.duree = duree;
        this.realisateur = realisateur;
    }
    
    // Getters
    public int getDuree() {
        return duree;
    }
    
    public String getRealisateur() {
        return realisateur;
    }
    
    // Setters
    public void setDuree(int duree) {
        this.duree = duree;
    }
    
    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }
    
    // Implémentation des méthodes abstraites
    @Override
    public void afficher() {
        // TODO: Implémenter l'affichage du film
    }
}
