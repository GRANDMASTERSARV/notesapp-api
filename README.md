# Notesapp-api
Notes API – Auto-Clearing Notes App (Spring Boot)

A secure, RESTful Notes API built using Java and Spring Boot, designed for multi-user note-taking with **automatic daily clearing** of all notes. Ideal for integrating with any frontend via exposed APIs. Includes authentication, secure password storage, and scheduling.

---

##  Features

-  User registration and authentication using **Spring Security (HTTP Basic Auth)**
-  Add and fetch notes for each authenticated user
-  **Daily auto-clear** of all notes using Spring Scheduler
-  Exposed as a clean REST API for frontend teams or other services
-  In-memory H2 database for easy testing and fast prototyping
