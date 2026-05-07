# 🎬 Netflix Clone - Microservices Architecture

A scalable Netflix-inspired streaming platform built using **Spring Boot Microservices**.

## 🚀 Tech Stack

- Java 21
- Spring Boot
- Spring Cloud
- Spring Security + JWT
- API Gateway
- Eureka Service Discovery
- Kafka
- PostgreSQL / MongoDB
- Elasticsearch
- Docker
- Kubernetes
- FFmpeg
- AWS S3 / MinIO

---

# 🧱 Microservices

| Service | Description |
|---|---|
| Auth Service | Handles authentication & JWT |
| User Service | User profiles and preferences |
| Catalog Service | Movies, series, metadata |
| Search Service | Elasticsearch-based search |
| Recommendation Service | Personalized recommendations |
| Streaming Service | Video streaming with HLS |
| Upload Service | Video upload & transcoding |
| Billing Service | Subscription and payments |
| Notification Service | Email & push notifications |
| Analytics Service | Watch analytics and metrics |
| API Gateway | Centralized routing |
| Eureka Server | Service discovery |
| Config Server | Centralized configuration |

---

# 📌 Features

- JWT Authentication
- Role-based Authorization
- HLS Video Streaming
- Distributed Architecture
- Event-Driven Communication (Kafka)
- Search & Recommendation Engine
- Dockerized Services
- Cloud-Native Design

---

# 🛠️ Architecture

Client → API Gateway → Microservices

Microservices ↔ Kafka Event Bus

Streaming Service → CDN → Video Player

---

# 📂 Project Structure

```bash
netflix-clone/
│
├── api-gateway/
├── auth-service/
├── user-service/
├── catalog-service/
├── search-service/
├── recommendation-service/
├── streaming-service/
├── upload-service/
├── analytics-service/
├── billing-service/
├── notification-service/
├── eureka-server/
├── config-server/
└── docker-compose.yml