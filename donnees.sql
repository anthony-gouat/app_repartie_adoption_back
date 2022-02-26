USE ADOPTIONANIMAUX;

INSERT INTO RACE (libelleRace) VALUES ("Berger Allemand");
INSERT INTO RACE (libelleRace) VALUES ("Bichon");
INSERT INTO RACE (libelleRace) VALUES ("Labrador");
INSERT INTO RACE (libelleRace) VALUES ("Rottweiler");
INSERT INTO RACE (libelleRace) VALUES ("Main Coon");
INSERT INTO RACE (libelleRace) VALUES ("Sphynx");
INSERT INTO RACE (libelleRace) VALUES ("Chartreux");
INSERT INTO RACE (libelleRace) VALUES ("Angora");

INSERT INTO COULEUR(libelleCouleur) VALUES ("Blanc");
INSERT INTO COULEUR(libelleCouleur) VALUES ("Noir");
INSERT INTO COULEUR(libelleCouleur) VALUES ("Brun");
INSERT INTO COULEUR(libelleCouleur) VALUES ("Roux");

INSERT INTO TYPE(libelleType) VALUES("Chien");
INSERT INTO TYPE(libelleType) VALUES("Chat");

INSERT INTO ANIMAL(nomAnimal, age, idRace, idType) VALUES ("Snoopy", 7, 2, 1);
INSERT INTO ANIMAL(nomAnimal, age, idRace, idType) VALUES ("Symba", 4, 7, 2);

INSERT INTO COULEUR VALUES (1, 2);
INSERT INTO COULEUR VALUES (2, 4);

INSERT INTO UTILISATEUR(nomUtil, prenomUtil, mail, mdp, role) VALUES ("MEYER", "Maxime", "maxime.meyer@test.fr", "test", "Administrateur");
INSERT INTO UTILISATEUR(nomUtil, prenomUtil, mail, mdp, role) VALUES ("GOUAT", "Anthony", "anthony.gouat@test.fr", "test", "Administrateur");
INSERT INTO UTILISATEUR(nomUtil, prenomUtil, mail, mdp, role) VALUES ("BOUDHAIM", "Sofiane", "sofiane.boudhaim@test.fr", "test", "Administrateur");
INSERT INTO UTILISATEUR(nomUtil, prenomUtil, mail, mdp, role) VALUES ("USER", "Test", "test.user@test.fr", "test", "Utilisateur");