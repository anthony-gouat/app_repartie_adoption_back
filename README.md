# API d'adoption d'animaux

API pour adopter des animaux.
Ce projet a pour but d'être relié à un [site](https://github.com/anthony-gouat/app_repartie_adoption_front)

## Prérequis

- Java 17
- SGBD MySQL ou MariaDB
- Maven

## Installation

1 Clonner le projet : git clone https://github.com/anthony-gouat/app_repartie_adoption_back.git

2 Se rendre dans le projet : cd app_repartie_adoption_back

3 Lancer la BDD et exécuter les scripts sql : base.sql puis donnees.sql ( Identifiants de plusieurs utilisateurs dans donnees.sql )

4 Mettre vos informations de connexion à la BDD dans application.properties

5 Build le projet : mvn install -f pom.xml

6 Lancer l'API avec java -jar .\target\app_repartie_adoption_back-0.0.1-SNAPSHOT.jar

7 Démarrer le [site](https://github.com/anthony-gouat/app_repartie_adoption_front)

