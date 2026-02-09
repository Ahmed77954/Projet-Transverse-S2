package media.models;

/**
 * Classe représentant un épisode d'une série
 */
public class Episode {
    // Attributs
    private int id;
    private String titre;
    private String description;
    private int numeroSaison;
    private int numeroEpisode;
    private int duree; // en minutes
    private Serie serie;
    
    // Constructeurs
    public Episode() {
    }
    
    public Episode(int id, String titre, String description, int numeroSaison, int numeroEpisode, int duree, Serie serie) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.numeroSaison = numeroSaison;
        this.numeroEpisode = numeroEpisode;
        this.duree = duree;
        this.serie = serie;
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
    
    public int getNumeroSaison() {
        return numeroSaison;
    }
    
    public int getNumeroEpisode() {
        return numeroEpisode;
    }
    
    public int getDuree() {
        return duree;
    }
    
    public Serie getSerie() {
        return serie;
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
    
    public void setNumeroSaison(int numeroSaison) {
        this.numeroSaison = numeroSaison;
    }
    
    public void setNumeroEpisode(int numeroEpisode) {
        this.numeroEpisode = numeroEpisode;
    }
    
    public void setDuree(int duree) {
        this.duree = duree;
    }
    
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    
    // Méthodes
    public void afficher() {
        // TODO: Implémenter l'affichage de l'épisode
    }
}
