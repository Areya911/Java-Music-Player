# JavaFX Music Player 

## Overview
This project is a desktop-based music player built using Java and JavaFX. It was developed as part of learning and applying Object-Oriented Programming concepts in a practical way. The application loads MP3 files from a local folder, displays them in a playlist, and allows users to play and stop songs through a graphical interface.

## Purpose

The main goal of this project was to understand and implement core OOP principles through a real working system rather than just theory. Concepts such as class design, encapsulation, modular structure, and separation of responsibilities were practiced while building this application.
## Features

* Load songs dynamically from a local folder
* Play and stop MP3 files
* Playlist management using ArrayList
* JavaFX-based user interface
* Background socket server to share playlist data
* Clean separation of classes using OOP principles

## Technologies Used

* Java (JDK 17+)
* JavaFX SDK
* Socket Programming
* File Handling

## Project Structure

```
JavaFX-Music-Player/
│
├── Main.java
├── Song.java
├── Playlist.java
├── MusicPlayer.java
├── MusicServer.java
├── songs/                (Place MP3 files here)
└── README.md
```

## How It Works

* The Playlist class scans the `songs` folder and loads MP3 files.
* Each file is stored as a Song object.
* The UI displays the list of songs.
* When a song is selected and played, JavaFX MediaPlayer streams the audio.
* A background server runs on port 5000 to share the playlist data over a network.

## Setup Instructions

### 1. Install Requirements

* Install JDK 17 or higher
* Download JavaFX SDK from https://gluonhq.com/products/javafx/
* Extract JavaFX SDK

### 2. Place Songs

Create a folder named `songs` in the project directory and add `.mp3` files.

### 3. Compile

Open terminal in the project folder and run:

```
javac --module-path "D:\projects\JavaFX-Music Player\javafx-sdk-25.0.2\lib" --add-modules javafx.controls,javafx.media *.java
```

### 4. Run

```
java --module-path "D:\projects\JavaFX-Music Player\javafx-sdk-25.0.2\lib" --add-modules javafx.controls,javafx.media Main
```

## Key Concepts Demonstrated

* Object-Oriented Programming (class separation: Song, Playlist, Player, Server)
* Data Structures (ArrayList for playlist management)
* File Handling (loading MP3 files from directory)
* GUI Development (JavaFX)
* Networking (Socket server running in background)

## Future Improvements

* Pause/Resume functionality
* Next/Previous track controls
* Search within playlist
* Volume control
* Network client to connect and stream playlist remotely

## Author

Areya K S
Computer Science Engineering Student
