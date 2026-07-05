#  Library Management System

Un système de gestion de bibliothèque développé avec **Spring Boot**, permettant de gérer les livres, les utilisateurs et les emprunts de manière simple, rapide et efficace.

---

##  Fonctionnalités

-  Gestion des livres (CRUD complet)
-  Gestion des utilisateurs
-  Emprunt et retour de livres
-  Suivi des disponibilités en temps réel
-  Recherche de livres (titre, auteur, catégorie)
-  API REST prête pour frontend (React / Angular / Vue)

---

## Stack technique

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven

---

### Books
| Method | Endpoint          | Description           |
| ------ | ----------------- | --------------------- |
| GET    | `/api/books`      | Liste tous les livres |
| GET    | `/api/books/{id}` | Détail d’un livre     |
| POST   | `/api/books`      | Ajouter un livre      |
| PUT    | `/api/books/{id}` | Modifier un livre     |
| DELETE | `/api/books/{id}` | Supprimer un livre    |

### Users
| Method | Endpoint     | Description            |
| ------ | ------------ | ---------------------- |
| GET    | `/api/users` | Liste des utilisateurs |
| POST   | `/api/users` | Ajouter un utilisateur |

### Borrowing System
| Method | Endpoint                             | Description        |
| ------ | ------------------------------------ | ------------------ |
| POST   | `/api/borrow/{bookId}/user/{userId}` | Emprunter un livre |
| POST   | `/api/return/{bookId}`               | Retourner un livre |

### Architecture

```
src/main/java/com/a1ka.library.library_management
│
├── controller     # REST Controllers
├── service        # Logique métier
├── repository     # Accès base de données
├── model          # Entités JPA
├── dto            # Data Transfer Objects
└── config         # Configuration Spring
```

---

Premier projet de Full-stack Java. 
