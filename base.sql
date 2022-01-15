CREATE DATABASE ADOPTIONANIMAUX;

USE ADOPTIONANIMAUX;

CREATE TABLE COULEUR ( -- Référencie toutes les couleurs des animaux
    idcouleur INT NOT NULL,
    libellecouleur VARCHAR(10) NOT NULL,
    PRIMARY KEY(idcouleur)
);

CREATE TABLE RACE ( -- Race d'un animal (Bouldog/Persan/...)
    idrace INT NOT NULL,
    libellerace VARCHAR(10) NOT NULL,
    PRIMARY KEY(idrace)
);

CREATE TABLE TYPE ( -- Type d'un animal (chien/chat/...)
    idtype INT NOT NULL,
    libelletype VARCHAR(10) NOT NULL,
    PRIMARY KEY (idtype)
);

CREATE TABLE ANIMAL (
    idAnimal INT NOT NULL AUTO_INCREMENT,
    nomanimal VARCHAR(10) NOT NULL,
    age INT NOT NULL,
    idrace INT NOT NULL,
    idtype INT NOT NULL,
    PRIMARY KEY(idanimal),
    FOREIGN KEY (idrace) REFERENCES RACE(idrace),
    FOREIGN KEY (idtype) REFERENCES TYPE(idtype)
);

CREATE TABLE COULEURS ( -- Référencie toutes les couleurs d'un animal
    idanimal INT NOT NULL,
    idcouleur INT NOT NULL,
    PRIMARY KEY(idanimal, idcouleur),
    FOREIGN KEY (idanimal) REFERENCES ANIMAL(idanimal),
    FOREIGN KEY (idcouleur) REFERENCES COULEUR(idcouleur)
);

CREATE TABLE UTILISATEUR (
    idutil INT NOT NULL,
    nomutil VARCHAR(10) NOT NULL,
    prenomutil VARCHAR(10) NOT NULL,
    mail VARCHAR(20) NOT NULL,
    mdp VARCHAR(20) NOT NULL,
    role VARCHAR(10) NOT NULL,
    token VARCHAR(30),
    oputh VARCHAR(10),
    PRIMARY KEY(idutil)
)