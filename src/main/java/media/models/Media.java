package media.models;

/**
 * Classe abstraite représentant un média générique
 */
public abstract class Media {
    // Attributs
    private int id;
    private String titre;
    private String description;
    private int annee;
    private String genre;
    private double note;
    
    // Constructeurs
    public Media() {
    }
    
    public Media(int id, String titre, String description, int annee, String genre) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.annee = annee;
        this.genre = genre;
        this.note = 0.0;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getTitre() {
        return titre;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getAnnee() {
        return annee;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public double getNote() {
        return note;
    }
    
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void setNote(double note) {
        this.note = note;
    }
    
    // Méthodes abstraites
    public abstract void afficher();
}
