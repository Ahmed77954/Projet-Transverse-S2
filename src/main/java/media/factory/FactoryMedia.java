package media.factory;

import media.models.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Factory pour créer des données simulées de médias
 */
public class FactoryMedia {
    
    /**
     * Méthode statique pour générer des films simulés
     * @return Liste de films
     */
    public static List<Film> genererFilms() {
        // TODO: Implémenter la génération de films simulés
        return new ArrayList<>();
    }
    
    /**
     * Méthode statique pour générer des séries simulées
     * @return Liste de séries
     */
    public static List<Serie> genererSeries() {
        // TODO: Implémenter la génération de séries simulées
        return new ArrayList<>();
    }
    
    /**
     * Méthode statique pour générer des épisodes simulés pour une série
     * @param serie La série pour laquelle générer des épisodes
     * @return Liste d'épisodes
     */
    public static List<Episode> genererEpisodes(Serie serie) {
        // TODO: Implémenter la génération d'épisodes simulés
        return new ArrayList<>();
    }
    
    /**
     * Méthode statique pour générer tous les médias (films et séries)
     * @return Liste de tous les médias
     */
    public static List<Media> genererTousLesMedias() {
        // TODO: Implémenter la génération de tous les médias
        List<Media> medias = new ArrayList<>();
        medias.addAll(genererFilms());
        medias.addAll(genererSeries());
        return medias;
    }
    
    /**
     * Méthode statique pour générer des utilisateurs simulés
     * @return Liste d'utilisateurs
     */
    public static List<User> genererUtilisateurs() {
        // TODO: Implémenter la génération d'utilisateurs simulés
        return new ArrayList<>();
    }
}
