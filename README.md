# 🗒️ NotesAPI – Auto-Clearing Notes Backend

A secure, modular RESTful API for temporary note-taking, built with **Java + Spring Boot**, designed for multi-user usage , with automatic daily clearing. Cleanly structured for frontend integration and fast testing.

---

## 🔧 Features

- 🔐 **User Registration & Authentication** with Spring Security (HTTP Basic Auth)
- 🗃️ **Add and Fetch Notes** per user (data scoped to each authenticated user)
- ⏰ **Scheduled Daily Cleanup**: All notes auto-deleted every 24 hours via Spring Scheduler
- 🧪 **Lightweight H2 DB** for in-memory storage — perfect for dev/testing
- ✅ **Modular, Secure API** for easy frontend consumption (Postman or React-ready)

---

## 🚀 Quick Start

```bash
git clone https://github.com/sarv-projects/notesapp-api.git
cd notesapp-api
./mvnw spring-boot:run
