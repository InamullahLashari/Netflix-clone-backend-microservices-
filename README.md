# 🎬 Netflix Clone - Full Stack Microservices Architecture

A scalable Netflix-inspired streaming platform built using **Spring Boot Microservices** with a modern **React Frontend**.

---

# 🚀 Tech Stack

## Backend

* Java 21
* Spring Boot
* Spring Cloud
* Spring Security + JWT
* API Gateway
* Eureka Service Discovery
* Kafka
* PostgreSQL / MongoDB
* Elasticsearch
* Docker
* Kubernetes
* FFmpeg
* AWS S3 / MinIO

## Frontend

* React.js
* TypeScript
* Redux Toolkit
* Tailwind CSS
* Material UI / ShadCN UI
* Axios
* React Router
* HLS.js / Video.js
* Vite

---

# 🧱 Microservices

| Service                | Description                   |
| ---------------------- | ----------------------------- |
| Auth Service           | Handles authentication & JWT  |
| User Service           | User profiles and preferences |
| Catalog Service        | Movies, series, metadata      |
| Search Service         | Elasticsearch-based search    |
| Recommendation Service | Personalized recommendations  |
| Streaming Service      | Video streaming with HLS      |
| Upload Service         | Video upload & transcoding    |
| Billing Service        | Subscription and payments     |
| Notification Service   | Email & push notifications    |
| Analytics Service      | Watch analytics and metrics   |
| API Gateway            | Centralized routing           |
| Eureka Server          | Service discovery             |
| Config Server          | Centralized configuration     |

---

# 🎨 Frontend Features

* Responsive Netflix-like UI
* Authentication & Protected Routes
* Movie & Series Browsing
* Dynamic Hero Banners
* Search with Instant Suggestions
* Personalized Recommendations
* Video Streaming Player
* Continue Watching Section
* Watchlist Management
* Dark Theme UI
* Multi-Device Support

---

# 📌 Features

* JWT Authentication
* Role-based Authorization
* HLS Video Streaming
* Distributed Architecture
* Event-Driven Communication (Kafka)
* Search & Recommendation Engine
* Dockerized Services
* Cloud-Native Design
* Scalable Frontend Architecture
* API Integration with Axios
* Real-time Streaming Experience

---

# 🛠️ Architecture

```text
React Frontend
       ↓
   API Gateway
       ↓
Spring Boot Microservices
       ↓
 Kafka Event Bus
       ↓
 Databases / Storage
```

```text
Streaming Service → CDN → HLS Video Player
```

---

# 📂 Project Structure

```bash
netflix-clone/
│
├── frontend-react/
│   ├── src/
│   ├── public/
│   ├── components/
│   ├── pages/
│   ├── redux/
│   ├── services/
│   └── hooks/
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
│
├── docker-compose.yml
└── kubernetes/
```

---

# 🔥 Frontend + Backend Workflow

1. User accesses React Frontend
2. Frontend communicates with API Gateway
3. Gateway routes requests to microservices
4. Services communicate asynchronously using Kafka
5. Streaming Service delivers HLS video content
6. React Player streams adaptive video playback

---

# ☁️ Deployment

* Docker Compose for local setup
* Kubernetes for orchestration
* AWS EC2 / EKS deployment
* Nginx Ingress Controller
* CI/CD with GitHub Actions

---

# 📈 Scalability Highlights

* Independently deployable services
* Horizontal scaling support
* Fault-tolerant architecture
* Centralized logging & monitoring
* CDN-based video delivery
* High-performance search with Elasticsearch
