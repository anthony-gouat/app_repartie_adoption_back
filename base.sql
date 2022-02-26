CREATE DATABASE ADOPTIONANIMAUX;

USE ADOPTIONANIMAUX;

CREATE TABLE COULEUR ( -- Référencie toutes les couleurs des animaux
    idCouleur INT NOT NULL AUTO_INCREMENT,
    libelleCouleur VARCHAR(10) NOT NULL,
    PRIMARY KEY(idcouleur)
);

CREATE TABLE RACE ( -- Race d'un animal (Bouldog/Persan/...)
    idRace INT NOT NULL AUTO_INCREMENT,
    libelleRace VARCHAR(10) NOT NULL,
    PRIMARY KEY(idrace)
);

CREATE TABLE TYPE ( -- Type d'un animal (chien/chat/...)
    idType INT NOT NULL AUTO_INCREMENT,
    libelleType VARCHAR(10) NOT NULL,
    PRIMARY KEY (idtype)
);

CREATE TABLE ANIMAL (
    idAnimal INT NOT NULL AUTO_INCREMENT,
    nomAnimal VARCHAR(10) NOT NULL,
    age INT NOT NULL,
    idRace INT NOT NULL,
    idType INT NOT NULL,
    PRIMARY KEY(idanimal),
    FOREIGN KEY (idrace) REFERENCES RACE(idrace),
    FOREIGN KEY (idtype) REFERENCES TYPE(idtype)
);

CREATE TABLE COULEURS ( -- Référencie toutes les couleurs d'un animal
    idAnimal INT NOT NULL,
    idCouleur INT NOT NULL,
    PRIMARY KEY(idanimal, idcouleur),
    FOREIGN KEY (idanimal) REFERENCES ANIMAL(idanimal),
    FOREIGN KEY (idcouleur) REFERENCES COULEUR(idcouleur)
);

CREATE TABLE UTILISATEUR (
    idUtil INT NOT NULL AUTO_INCREMENT,
    nomUtil VARCHAR(10) NOT NULL,
    prenomUtil VARCHAR(10) NOT NULL,
    mail VARCHAR(20) NOT NULL,
    mdp VARCHAR(20) NOT NULL,
    role VARCHAR(10) NOT NULL,
    token VARCHAR(30),
    oputh VARCHAR(10),
    PRIMARY KEY(idutil)
),

CREATE TABLE TAG( -- Référencie les tags
    idTag INT NOT NULL AUTO_INCREMENT,
    libTag VARCHAR(50) NOT NULL
),

CREATE TABLE TAGS( -- Référencie tout les tags pour chaque animal
    idTag INT NOT NULL,
    idAnimal INT NOT NULL,
    PRIMARY KEY(idTag, idAnimal),
    FOREIGN KEY (idTag) REFERENCES TAG(idTag),
    FOREIGN KEY (idAnimal) REFERENCES ANIMAL(idAnimal)
),

CREATE TABLE COMMENTAIRE(
    idCommentaire INT NOT NULL AUTO_INCREMENT,
    idUtil INT NOT NULL,
    contenuComm TEXTE NOT NULL,
    PRIMARY KEY (idCommentaire),
    FOREIGN KEY (idUtil) REFERENCES UTILISATEUR(idUtil)
),

CREATE TABLE COMMENTER( -- Référencie tout les commentaires pour un animal
    idCommentaire INT NOT NULL,
    idAnimal INT NOT NULL,
    PRIMARY KEY(idCommentaire, idAnimal),
    FOREIGN KEY (idCommentaire) REFERENCES COMMENTAIRE(idCommentaire),
    FOREIGN KEY (idAnimal) REFERENCES ANIMAL(idAnimal)
)