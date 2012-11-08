gest-immo
=========

Architecture choisie :

Langage : Java
Projet : Maven => Simplification de compilation + Les même sources pour tout le monde pour la compilation + Permet la portabilité entre différents IDE
Test : Junit + Hamcrest	Test unitaire => Hamcrest propose des extensions à Junit
Framework Web : Restlet	Framework Web => basé sur l'architecture REST + Serveur HTTP + émulation de client
Template : FreeMarker	Template Manager => Extension à Restlet disponible
SGBDR : HSQLDB	=> Base de données SQL rapide et léger + Facilité d'utilisation + pas de configuration par défaut
Framework gestion data : Hibernate =>	Gestion de la persistence des objets en BDD
Divers : Guava Librairie => JAVA apportant divers fonctionnalités