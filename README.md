# 🚗 Meleva — Carona Universitária FATEC SJC

API REST para conectar alunos da FATEC São José dos Campos que precisam de carona, reduzindo custos com transporte e promovendo a comunidade universitária.

## 💡 Problema

A FATEC SJC está localizada em uma região de difícil acesso, sem transporte público eficiente. Muitos alunos gastam valores altos com gasolina diariamente, sem uma forma organizada de dividir caronas.

## ✅ Solução

O Meleva é uma plataforma exclusiva para alunos da FATEC SJC, onde motoristas oferecem caronas e passageiros encontram rotas compatíveis — tudo com autenticação pelo e-mail institucional `@fatec.sp.gov.br`.

## 🛠️ Tecnologias

- **Java 21**
- **Spring Boot 3.5**
- **Spring Security**
- **PostgreSQL**
- **Docker**
- **Maven**

## 🔐 Funcionalidades

- Cadastro exclusivo com e-mail `@fatec.sp.gov.br`
- Oferecer e buscar caronas
- Sistema de avaliação entre motoristas e passageiros
- Autenticação segura com JWT

## 🚀 Como rodar localmente

### Pré-requisitos
- Java 21
- Docker
- Maven

### Passos

```bash
# Subir o banco de dados
docker compose up -d

# Rodar a aplicação
mvn spring-boot:run
```

A API estará disponível em `http://localhost:8080`

## 📌 Endpoints disponíveis

| Método | Rota | Descrição |
|--------|------|-----------|
| GET | `/auth/ping` | Verifica se a API está online |
| POST | `/auth/register` | Cadastro de novo usuário |

## 👨‍💻 Autor

**Rafael** — Estudante de ADS na FATEC SJC

[![LinkedIn](https://img.shields.io/badge/LinkedIn-blue?style=flat&logo=linkedin)](https://linkedin.com/in/seulinkedin)
