package media.models;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe représentant une série
 */
public class Serie extends Media {
    // Attributs spécifiques
    private int nombreSaisons;
    private String statut; // en cours, terminée, annulée
    private List<Episode> episodes;
    
    // Constructeurs
    public Serie() {
        super();
        this.episodes = new ArrayList<>();
    }
    
    public Serie(int id, String titre, String description, int annee, String genre, int nombreSaisons, String statut) {
        super(id, titre, description, annee, genre);
        this.nombreSaisons = nombreSaisons;
        this.statut = statut;
        this.episodes = new ArrayList<>();
    }
    
    // Getters
    public int getNombreSaisons() {
        return nombreSaisons;
    }
    
    public String getStatut() {
        return statut;
    }
    
    public List<Episode> getEpisodes() {
        return Collections.unmodifiableList(episodes);
    }
    
    // Setters
    public void setNombreSaisons(int nombreSaisons) {
        this.nombreSaisons = nombreSaisons;
    }
    
    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
    
    // Méthodes
    public void ajouterEpisode(Episode episode) {
        // TODO: Implémenter l'ajout d'un épisode
    }
    
    public void supprimerEpisode(Episode episode) {
        // TODO: Implémenter la suppression d'un épisode
    }
    
    // Implémentation des méthodes abstraites
    @Override
    public void afficher() {
        // TODO: Implémenter l'affichage de la série
    }
}
