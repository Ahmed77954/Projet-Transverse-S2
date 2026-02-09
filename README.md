# Projet-Transverse-S2

## Description
Application de gestion de médias (films, séries, épisodes) type Letterboxd développée en Java OOP dans le cadre de la SAE S2.

## Objectif
Créer une application permettant aux utilisateurs de gérer et noter leurs médias favoris (films et séries TV).

## Architecture du projet

### Structure des packages
```
src/main/java/media/
├── models/          # Classes du modèle de données
│   ├── Media.java      (classe abstraite)
│   ├── Film.java       (hérite de Media)
│   ├── Serie.java      (hérite de Media)
│   ├── Episode.java    (lié à Serie)
│   └── User.java       (utilisateur)
├── factory/         # Factory pour données simulées
│   └── FactoryMedia.java
└── Main.java        # Point d'entrée de l'application
```

### Classes principales

#### Media (abstraite)
Classe de base pour tous les médias avec les attributs communs :
- `id` : identifiant unique
- `titre` : titre du média
- `description` : description
- `annee` : année de sortie
- `genre` : genre du média
- `note` : note moyenne

#### Film
Hérite de Media et ajoute :
- `duree` : durée en minutes
- `realisateur` : nom du réalisateur

#### Serie
Hérite de Media et ajoute :
- `nombreSaisons` : nombre de saisons
- `statut` : état de la série (en cours, terminée, annulée)
- `episodes` : liste des épisodes

#### Episode
Représente un épisode de série :
- `id` : identifiant unique
- `titre` : titre de l'épisode
- `description` : description
- `numeroSaison` : numéro de saison
- `numeroEpisode` : numéro d'épisode
- `duree` : durée en minutes
- `serie` : référence à la série parente

#### User
Représente un utilisateur de l'application :
- `id` : identifiant unique
- `nom` : nom
- `prenom` : prénom
- `email` : adresse email
- `pseudo` : pseudonyme
- `mediaVus` : liste des médias visionnés
- `mediaFavoris` : liste des médias favoris

#### FactoryMedia
Factory avec méthodes statiques pour générer des données simulées :
- `genererFilms()` : génère une liste de films
- `genererSeries()` : génère une liste de séries
- `genererEpisodes(Serie)` : génère les épisodes d'une série
- `genererTousLesMedias()` : génère tous les médias
- `genererUtilisateurs()` : génère des utilisateurs de test

## Compilation et exécution

### Compilation
```bash
javac -d bin src/main/java/media/*.java src/main/java/media/models/*.java src/main/java/media/factory/*.java
```

### Exécution
```bash
java -cp bin media.Main
```

## État du projet
🚧 **Version squelette** : Seules les structures de classes avec attributs et signatures de méthodes sont implémentées. Aucune logique métier ni interface graphique n'est développée pour le moment.

## Technologies
- Java (OOP)
- Pas de base de données (données simulées en mémoire)
- Pas d'interface graphique (console uniquement pour le moment)

## Auteur
Projet réalisé dans le cadre de la SAE S2