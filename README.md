# JavaFX Library Management System

## Overview
Ovaj projekt predstavlja desktop aplikaciju razvijenu u Javi koristeći JavaFX i MySQL. Aplikacija demonstrira integraciju grafičkog korisničkog interfejsa, objektno-orijentisanih principa i rada sa relacijskom bazom podataka.

Sistem služi kao osnovna platforma za upravljanje bibliotekom i može se proširiti funkcionalnostima poput evidencije knjiga, korisnika ili posudbi.

---

## Features

### 1. JavaFX User Interface
- GUI razvijen pomoću **FXML** datoteka  
- Controller klasa upravlja korisničkim interakcijama  
- Jasno odvojeni slojevi aplikacije (View – Controller – Model)

### 2. MySQL Database Integration
- Konekcija ostvarena pomoću `mysql-connector-j` JDBC drivera  
- Klasa `veza.java` centralizuje rad sa bazom  
- Pogodno za implementaciju CRUD logike  

### 3. Modular and Maintainable Architecture
- Posebne klase za logiku, modele i kontrolere  
- Jednostavan source code layout  
- Pogodno za dalji razvoj ili prelazak na Maven/Gradle

---

## Technologies Used

| Tehnologija | Opis |
|-------------|------|
| **Java 8+** | Osnovni programski jezik |
| **JavaFX** | Grafički korisnički interfejs |
| **FXML** | Definisanje layouta |
| **MySQL** | Relacijska baza podataka |
| **NetBeans / Ant** | Build sistem i razvojno okruženje |
| **mysql-connector-j** | JDBC driver |

---

## Project Structure

```
biblioteka-project/
│
├── build.xml
├── manifest.mf
├── .gitignore
├── README.md
│
├── nbproject/
│   ├── project.properties
│   ├── project.xml
│   ├── genfiles.properties
│   ├── jfx-impl.xml
│   └── configs/
│
├── src/
│   └── biblioteka1/
│       ├── Biblioteka1.java
│       ├── FXMLDocument.fxml
│       ├── FXMLDocumentController.java
│       ├── kartica.java
│       └── veza.java
│
└── database/
    └── database.sql
```

---

## Database Setup

1. Kreirati novu MySQL bazu:
```sql
CREATE DATABASE biblioteka;
```

2. Importovati SQL skriptu:
```
database/database.sql
```

3. Podesiti MySQL kredencijale u `veza.java`:
```java
String url = "jdbc:mysql://localhost:3306/biblioteka";
String user = "root";
String pass = "lozinka";
```

---

## How to Run

### 1. Import into NetBeans
File → Open Project → izabrati folder projekta.

### 2. Build Project
Run → **Clean and Build Project**

### 3. Run Application
Run → **Run Project**  
ili izvršiti `.jar` fajl ako je generisan u `dist/`

---

## Future Enhancements

- CRUD funkcionalnosti za knjige i korisnike  
- Evidencija posudbi i vraćanja  
- Autentikacija korisnika (login sistem)  
- Migracija na Maven ili Gradle  
- Modernizacija UI-a putem CSS stilova  

---
