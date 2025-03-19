## Projet RPG
###### (Matteo-hub-01 : Matteo D. / DarwinSKS : Mathys F.) 

# Analyse du Code - Violations SOLID et Points d'Amélioration

## Violations des Principes SOLID

### Single Responsibility Principle (SRP)
- La classe `Main` gère à la fois l'initialisation du jeu, la création du joueur et la génération du donjon
- La classe `ClasseBase` contient trop de responsabilités : gestion des statistiques et affichage des informations
- La classe `Donjon` gère à la fois la génération des salles et la gestion des connexions

### Open/Closed Principle (OCP)
- La méthode `afficherClasses()` dans `ClasseBase` est codée en dur avec les classes disponibles
- L'ajout d'une nouvelle classe nécessite de modifier le code existant
- La génération du donjon est fermée à l'extension (difficile d'ajouter de nouveaux types de salles)

### Liskov Substitution Principle (LSP)
- La classe `Joueur` hérite de `Classes` ce qui crée une relation étrange : un joueur n'est pas vraiment une classe
- Le constructeur vide de `Joueur` crée un état invalide

### Interface Segregation Principle (ISP)
- L'interface `Classe` semble forcer l'implémentation de méthodes qui ne sont pas toujours nécessaires
- Les classes concrètes sont contraintes d'implémenter des méthodes qu'elles n'utilisent peut-être pas

### Dependency Inversion Principle (DIP)
- La classe `Main` crée directement les instances de `Scanner` et `Random`
- `Donjon` crée directement les instances de `Salle`
- Forte dépendance entre les classes plutôt que l'utilisation d'interfaces

## Autres Points d'Amélioration

### Encapsulation
- Les attributs de `ClasseBase` sont privés mais accessibles via des getters/setters non montrés
- La liste `salles` dans `Donjon` est publique

### Gestion des États
- Le constructeur vide de `Joueur` crée un état invalide
- Pas de validation des paramètres dans les constructeurs

### Couplage
- Fort couplage entre `Donjon` et `Salle`
- Couplage fort entre `Joueur` et `Classes`
- La génération du donjon est fortement couplée à la structure des salles

### Extensibilité
- Difficile d'ajouter de nouveaux types de salles
- Difficile d'ajouter de nouvelles classes de personnages
- Structure rigide pour l'ajout de nouvelles fonctionnalités

### Nommage
- Certains noms de variables pourraient être plus descriptifs (ex: `nom` dans `ClasseBase`)
- Les noms de packages pourraient être plus cohérents (majuscules vs minuscules)

### Gestion des Erreurs
- Absence de gestion des exceptions
- Pas de validation des entrées utilisateur
- Pas de gestion des cas limites
