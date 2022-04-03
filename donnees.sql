USE ADOPTIONANIMAUX;

INSERT INTO RACE (libelle_race) VALUES ("Berger Allemand");
INSERT INTO RACE (libelle_race) VALUES ("Bichon");
INSERT INTO RACE (libelle_race) VALUES ("Labrador");
INSERT INTO RACE (libelle_race) VALUES ("Rottweiler");
INSERT INTO RACE (libelle_race) VALUES ("Main Coon");
INSERT INTO RACE (libelle_race) VALUES ("Sphynx");
INSERT INTO RACE (libelle_race) VALUES ("Chartreux");
INSERT INTO RACE (libelle_race) VALUES ("Angora");

INSERT INTO COULEUR(libelle_couleur) VALUES ("Blanc");
INSERT INTO COULEUR(libelle_couleur) VALUES ("Noir");
INSERT INTO COULEUR(libelle_couleur) VALUES ("Brun");
INSERT INTO COULEUR(libelle_couleur) VALUES ("Roux");

INSERT INTO TYPE(libelle_type) VALUES("Chien");
INSERT INTO TYPE(libelle_type) VALUES("Chat");

INSERT INTO ANIMAL(nom_animal, age, id_race, id_type, adopter) VALUES ("Snoopy", 7, 2, 1, 0);
INSERT INTO ANIMAL(nom_animal, age, id_race, id_type, adopter) VALUES ("Symba", 4, 7, 2, 0);

INSERT INTO COULEURS VALUES (1, 2);
INSERT INTO COULEURS VALUES (2, 4);

INSERT INTO UTILISATEUR(nom_util, prenom_util, mail, mdp, role) VALUES ("MEYER", "Maxime", "maxime.meyer@test.fr", "test", "Administrateur");
INSERT INTO UTILISATEUR(nom_util, prenom_util, mail, mdp, role) VALUES ("GOUAT", "Anthony", "anthony.gouat@test.fr", "test", "Administrateur");
INSERT INTO UTILISATEUR(nom_util, prenom_util, mail, mdp, role) VALUES ("BOUDHAIM", "Sofiane", "sofiane.boudhaim@test.fr", "test", "Administrateur");
INSERT INTO UTILISATEUR(nom_util, prenom_util, mail, mdp, role) VALUES ("USER", "Test", "test.user@test.fr", "test", "Utilisateur");