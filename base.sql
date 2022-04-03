CREATE DATABASE ADOPTIONANIMAUX;

USE ADOPTIONANIMAUX;

CREATE TABLE COULEUR ( -- Référencie toutes les couleurs des animaux
    id_couleur INT NOT NULL AUTO_INCREMENT,
    libelle_couleur VARCHAR(10) NOT NULL,
    PRIMARY KEY(id_couleur)
);

CREATE TABLE RACE ( -- Race d'un animal (Bouldog/Persan/...)
    id_race INT NOT NULL AUTO_INCREMENT,
    libelle_race VARCHAR(50) NOT NULL,
    PRIMARY KEY(id_race)
);

CREATE TABLE TYPE ( -- Type d'un animal (chien/chat/...)
    id_type INT NOT NULL AUTO_INCREMENT,
    libelle_type VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_type)
);

CREATE TABLE ANIMAL (
    id_animal INT NOT NULL AUTO_INCREMENT,
    nom_animal VARCHAR(10) NOT NULL,
    age INT NOT NULL,
    id_race INT NOT NULL,
    id_type INT NOT NULL,
    adopter INT not null,
    PRIMARY KEY(id_animal),
    FOREIGN KEY (id_race) REFERENCES RACE(id_race),
    FOREIGN KEY (id_type) REFERENCES TYPE(id_type)
);

CREATE TABLE COULEURS ( -- Référencie toutes les couleurs d'un animal
    id_animal INT NOT NULL,
    id_couleur INT NOT NULL,
    PRIMARY KEY(id_animal, id_couleur),
    FOREIGN KEY (id_animal) REFERENCES ANIMAL(id_animal),
    FOREIGN KEY (id_couleur) REFERENCES COULEUR(id_couleur)
);

CREATE TABLE UTILISATEUR (
    id_util INT NOT NULL AUTO_INCREMENT,
    nom_util VARCHAR(10) NOT NULL,
    prenom_util VARCHAR(10) NOT NULL,
    mail VARCHAR(50) NOT NULL,
    mdp VARCHAR(20) NOT NULL,
    role VARCHAR(30) NOT NULL,
    token VARCHAR(30),
    oputh VARCHAR(10),
    PRIMARY KEY(id_util)
);

CREATE TABLE TAG( -- Référencie les tags
    id_tag INT NOT NULL AUTO_INCREMENT,
    lib_tag VARCHAR(50) NOT NULL,
    primary KEY(id_tag)
);

CREATE TABLE TAGS( -- Référencie tout les tags pour chaque animal
    id_tag INT NOT NULL,
    id_animal INT NOT NULL,
    PRIMARY KEY(id_tag, id_animal),
    FOREIGN KEY (id_tag) REFERENCES TAG(id_tag),
    FOREIGN KEY (id_animal) REFERENCES ANIMAL(id_animal)
);

CREATE TABLE COMMENTAIRE(
    id_commentaire INT NOT NULL AUTO_INCREMENT,
    id_util INT NOT NULL,
    id_reponse INT,
    contenu_comm text NOT NULL,
    date DATE,
    PRIMARY KEY (id_commentaire),
    FOREIGN KEY (id_util) REFERENCES UTILISATEUR(id_util),
    FOREIGN KEY (id_reponse) REFERENCES COMMENTAIRE(id_commentaire)
);

CREATE TABLE COMMENTER( -- Référencie tout les commentaires pour un animal
    id_commentaire INT NOT NULL,
    id_animal INT NOT NULL,
    PRIMARY KEY(id_commentaire, id_animal),
    FOREIGN KEY (id_commentaire) REFERENCES COMMENTAIRE(id_commentaire),
    FOREIGN KEY (id_animal) REFERENCES ANIMAL(id_animal)
);