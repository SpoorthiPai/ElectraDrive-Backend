# ElectraDrive-Backend
Tesla Clone Backend project

# ⚡ ElectraDrive – Tesla Clone (Full Stack Application)

ElectraDrive is a Tesla-inspired full-stack web application that replicates the sleek and modern UI/UX of [tesla.com](https://www.tesla.com). Built using **React** for the frontend and **Java Spring Boot** for the backend, it demonstrates a modular approach to state management, routing, and backend API integration.

## 🚀 Objective

To design and build a responsive Tesla-style landing page that enables users to:

- Seamlessly browse different car models.
- Interact with UI elements like modals, hero sections, and headers.
- Submit bookings and view data powered by a backend.
- Experience a smooth deployment-ready modern full-stack web app.

---

## 🎯 Project Goals

- Replicate Tesla's minimalist yet engaging design.
- Enable smooth routing across pages (e.g., `/models`, `/modelx`, `/modely`).
- Integrate backend features for user interactions like adding vehical .
- Deploy both frontend and backend using popular platforms (Netlify, Render).
- Implement enhancements like OAuth 2.0 and JWT-based authentication.

---

## 🧰 Tools & Technologies

### Frontend
- React
- HTML, CSS

### Backend
- MongoDB

### Deployment
- **Frontend**: Netlify
- **Backend**
- **Build Tools**: npm, Maven, IntelliJ Idea, Visual Studio Code

---

## 🧱 Architecture
(https://spoorthipai23.atlassian.net/wiki/spaces/~7120200874916a55964435888d7887da9d3f64/pages/98308/Tesla+Clone+ElectraDrive+-+FullStack+Application)

The application follows a standard client-server architecture with RESTful API integration:

- **Frontend** communicates with backend via `/api` endpoints.
- **Backend** is structured into layers:
  - `Controller`: Handles API routes.
  - `Service`: Business logic.
  - `Repository`: Database access.
  - `Entity`: Data models.

---

## 🔧 Implementation Plan

### Phase 1: Project Setup
- Frontend initialized using `create-react-app` in **VS Code**.
- Backend initialized in **IntelliJ IDEA** using Spring Initializr.
- Basic folder structure and dependencies set up.

### Phase 2: Frontend Development
- Built reusable UI components (Header, Hero, Footer, Buttons).
- Implemented Tesla-style scroll landing pages.
- Enabled routing for:
  - `/models`
  - `/modelx`
  - `/modely`

### Phase 3: Backend Development
- Defined data models and created database schema.
- Built endpoints:
  - `POST /api/vehicle/add` – Save booking details.
  - `GET /api/vehicle` – Fetch car model data.
- Integrated with MySQL/PostgreSQL/MongoDB.

### Phase 4: Deployment
- Frontend hosted on **Netlify**:  
  [https://electradrive.netlify.app](https://electradrive.netlify.app)

---

## Future Enhancements

- Add **OAuth2.0 / JWT-based** authentication system.
- Integrate Backend and Frontend for loading dynamic data.

Live Demo
Frontend: https://electradrive.netlify.app

## Resources Used
- ChatGPT
- Google AI
- Youtube videos

