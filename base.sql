CREATE DATABASE IF NOT EXISTS ADOPTIONANIMAUX;

USE ADOPTIONANIMAUX;

DROP TABLE IF EXISTS IMAGES;
DROP TABLE IF EXISTS IMAGE;
DROP TABLE IF EXISTS COMMENTER;
DROP TABLE IF EXISTS COMMENTAIRE;
DROP TABLE IF EXISTS TAGS;
DROP TABLE IF EXISTS TAG;
DROP TABLE IF EXISTS UTILISATEUR;
DROP TABLE IF EXISTS COULEURS;
DROP TABLE IF EXISTS ANIMAL;
DROP TABLE IF EXISTS TYPE;
DROP TABLE IF EXISTS RACE;
DROP TABLE IF EXISTS COULEUR;

CREATE TABLE IF NOT EXISTS COULEUR ( -- Référencie toutes les couleurs des animaux
    id_couleur INT NOT NULL AUTO_INCREMENT,
    libelle_couleur VARCHAR(10) NOT NULL,
    PRIMARY KEY(id_couleur)
);

CREATE TABLE IF NOT EXISTS RACE ( -- Race d'un animal (Bouldog/Persan/...)
    id_race INT NOT NULL AUTO_INCREMENT,
    libelle_race VARCHAR(50) NOT NULL,
    PRIMARY KEY(id_race)
);

CREATE TABLE IF NOT EXISTS TYPE ( -- Type d'un animal (chien/chat/...)
    id_type INT NOT NULL AUTO_INCREMENT,
    libelle_type VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_type)
);

CREATE TABLE IF NOT EXISTS ANIMAL (
    id_animal INT NOT NULL AUTO_INCREMENT,
    nom_animal VARCHAR(35) NOT NULL,
    age INT NOT NULL,
    id_race INT NOT NULL,
    id_type INT NOT NULL,
    adopter BOOLEAN not null,
    PRIMARY KEY(id_animal),
    FOREIGN KEY (id_race) REFERENCES RACE(id_race),
    FOREIGN KEY (id_type) REFERENCES TYPE(id_type)
);

CREATE TABLE IF NOT EXISTS COULEURS ( -- Référencie toutes les couleurs d'un animal
    id_animal INT NOT NULL,
    id_couleur INT NOT NULL,
    PRIMARY KEY(id_animal, id_couleur),
    FOREIGN KEY (id_animal) REFERENCES ANIMAL(id_animal),
    FOREIGN KEY (id_couleur) REFERENCES COULEUR(id_couleur)
);

CREATE TABLE IF NOT EXISTS UTILISATEUR (
    id_util INT NOT NULL AUTO_INCREMENT,
    nom_util VARCHAR(20) NOT NULL,
    prenom_util VARCHAR(20) NOT NULL,
    mail VARCHAR(50) NOT NULL,
    mdp VARCHAR(20) NOT NULL,
    role VARCHAR(30) NOT NULL,
    oputh VARCHAR(10),
    PRIMARY KEY(id_util)
);

CREATE TABLE IF NOT EXISTS TAG( -- Référencie les tags
    id_tag INT NOT NULL AUTO_INCREMENT,
    lib_tag VARCHAR(50) NOT NULL,
    primary KEY(id_tag)
);

CREATE TABLE IF NOT EXISTS TAGS( -- Référencie tout les tags pour chaque animal
    id_tag INT NOT NULL,
    id_animal INT NOT NULL,
    PRIMARY KEY(id_tag, id_animal),
    FOREIGN KEY (id_tag) REFERENCES TAG(id_tag),
    FOREIGN KEY (id_animal) REFERENCES ANIMAL(id_animal)
);

CREATE TABLE IF NOT EXISTS COMMENTAIRE(
    id_commentaire INT NOT NULL AUTO_INCREMENT,
    id_util INT NOT NULL,
    id_reponse INT,
    contenu_comm text NOT NULL,
    date DATE,
    PRIMARY KEY (id_commentaire),
    FOREIGN KEY (id_util) REFERENCES UTILISATEUR(id_util),
    FOREIGN KEY (id_reponse) REFERENCES COMMENTAIRE(id_commentaire)
);

CREATE TABLE IF NOT EXISTS COMMENTER( -- Référencie tout les commentaires pour un animal
    id_commentaire INT NOT NULL,
    id_animal INT NOT NULL,
    PRIMARY KEY(id_commentaire, id_animal),
    FOREIGN KEY (id_commentaire) REFERENCES COMMENTAIRE(id_commentaire),
    FOREIGN KEY (id_animal) REFERENCES ANIMAL(id_animal)
);

CREATE TABLE IF NOT EXISTS IMAGE( -- Référencie les images
    id_img INT NOT NULL AUTO_INCREMENT,
    lien TEXT NOT NULL,
    primary KEY(id_img)
);

CREATE TABLE IF NOT EXISTS IMAGES( -- Référencie toutes les images pour chaque animal
   id_img INT NOT NULL,
   id_animal INT NOT NULL,
   PRIMARY KEY(id_img, id_animal),
   FOREIGN KEY (id_img) REFERENCES IMAGE(id_img),
   FOREIGN KEY (id_animal) REFERENCES ANIMAL(id_animal)
);