USE ADOPTIONANIMAUX;

INSERT INTO RACE (libelle_race) VALUES ("Berger Allemand");
INSERT INTO RACE (libelle_race) VALUES ("Bichon");
INSERT INTO RACE (libelle_race) VALUES ("Labrador");
INSERT INTO RACE (libelle_race) VALUES ("Rottweiler");
INSERT INTO RACE (libelle_race) VALUES ("Main Coon");
INSERT INTO RACE (libelle_race) VALUES ("Sphynx");
INSERT INTO RACE (libelle_race) VALUES ("Chartreux");
INSERT INTO RACE (libelle_race) VALUES ("Angora");
INSERT INTO RACE (libelle_race) VALUES ("Perroquet");
INSERT INTO RACE (libelle_race) VALUES ("Moineau");

INSERT INTO COULEUR(libelle_couleur) VALUES ("Blanc");
INSERT INTO COULEUR(libelle_couleur) VALUES ("Noir");
INSERT INTO COULEUR(libelle_couleur) VALUES ("Gris");
INSERT INTO COULEUR(libelle_couleur) VALUES ("Bleu");
INSERT INTO COULEUR(libelle_couleur) VALUES ("Brun");
INSERT INTO COULEUR(libelle_couleur) VALUES ("Roux");

INSERT INTO IMAGE(lien) VALUES ("https://cdn.pixabay.com/photo/2017/09/25/13/12/cocker-spaniel-2785074__480.jpg");
INSERT INTO IMAGE(lien) VALUES ("https://cdn.pixabay.com/photo/2016/02/19/15/46/labrador-retriever-1210559__340.jpg");
INSERT INTO IMAGE(lien) VALUES ("https://cdn.pixabay.com/photo/2019/08/07/14/11/dog-4390885__340.jpg");
INSERT INTO IMAGE(lien) VALUES ("https://cdn.pixabay.com/photo/2020/03/31/19/20/dog-4988985__340.jpg");
INSERT INTO IMAGE(lien) VALUES ("https://cdn.pixabay.com/photo/2014/11/30/14/11/cat-551554__480.jpg");
INSERT INTO IMAGE(lien) VALUES ("https://cdn.pixabay.com/photo/2017/02/20/18/03/cat-2083492__340.jpg");
INSERT INTO IMAGE(lien) VALUES ("https://cdn.pixabay.com/photo/2016/02/10/16/37/cat-1192026__340.jpg");
INSERT INTO IMAGE(lien) VALUES ("https://cdn.pixabay.com/photo/2017/02/15/12/12/cat-2068462__340.jpg");

INSERT INTO TYPE(libelle_type) VALUES("Chien");
INSERT INTO TYPE(libelle_type) VALUES("Chat");
INSERT INTO TYPE(libelle_type) VALUES("Oiseau");

INSERT INTO ANIMAL(nom_animal, age, id_race, id_type, adopter) VALUES ("Snoopy", 7, 2, 1, false);
INSERT INTO ANIMAL(nom_animal, age, id_race, id_type, adopter) VALUES ("Symba", 4, 7, 2, false);
INSERT INTO ANIMAL(nom_animal, age, id_race, id_type, adopter) VALUES ("Symba", 3, 1, 1, false);
INSERT INTO ANIMAL(nom_animal, age, id_race, id_type, adopter) VALUES ("Symba", 8, 8, 2, true);

INSERT INTO COULEURS VALUES (1, 2);
INSERT INTO COULEURS VALUES (1, 1);
INSERT INTO COULEURS VALUES (2, 2);
INSERT INTO COULEURS VALUES (2, 4);
INSERT INTO COULEURS VALUES (3, 5);
INSERT INTO COULEURS VALUES (4, 6);

INSERT INTO IMAGES VALUES (1, 1);
INSERT INTO IMAGES VALUES (2, 1);
INSERT INTO IMAGES VALUES (3, 1);
INSERT INTO IMAGES VALUES (4, 2);
INSERT INTO IMAGES VALUES (5, 3);
INSERT INTO IMAGES VALUES (6, 3);
INSERT INTO IMAGES VALUES (7, 3);
INSERT INTO IMAGES VALUES (8, 4);

INSERT INTO UTILISATEUR(nom_util, prenom_util, mail, mdp, role) VALUES ("MEYER", "Maxime", "maxime.meyer@test.fr", "test", "Administrateur");
INSERT INTO UTILISATEUR(nom_util, prenom_util, mail, mdp, role) VALUES ("GOUAT", "Anthony", "anthony.gouat@test.fr", "test", "Administrateur");
INSERT INTO UTILISATEUR(nom_util, prenom_util, mail, mdp, role) VALUES ("BOUDHAIM", "Sofiane", "sofiane.boudhaim@test.fr", "test", "Administrateur");
INSERT INTO UTILISATEUR(nom_util, prenom_util, mail, mdp, role) VALUES ("USER", "Test", "test.user@test.fr", "test", "Utilisateur");

INSERT INTO TAG(lib_tag) VALUES  ("exotique");
INSERT INTO TAG(lib_tag) VALUES  ("origine continental");
INSERT INTO TAG(lib_tag) VALUES  ("nain");
INSERT INTO TAG(lib_tag) VALUES  ("grand");

INSERT INTO TAGS VALUES (1, 1);
INSERT INTO TAGS VALUES (2, 1);
INSERT INTO TAGS VALUES (3, 4);
