# 🎤 Crud Singers

**Crud Singers** é uma aplicação Java com Spring Boot que realiza operações de cadastro, leitura, atualização e exclusão (CRUD) de cantores, armazenando seus nomes e idades em um banco de dados PostgreSQL.

---

## ✅ Funcionalidades

- Criar um novo cantor (nome + idade)
- Listar todos os cantores cadastrados
- Atualizar informações de um cantor
- Remover um cantor do banco de dados

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- IntelliJ IDEA

---

## 🗃️ Estrutura do Projeto
```
CrudSingers/
├── src/
│   └── main/
│       ├── java/
│       │   └── com.example.CrudSingers/
│       │       ├── controller/
│       │       │   └── SingersController.java
│       │       ├── doMain/
│       │       │   ├── RequestSingers.java
│       │       │   └── Singers.java
│       │       ├── repository/
│       │       │   └── SingersRepository.java
│       │       └── CrudSingersApplication.java
│       └── resources/
│           ├── application.properties
│           └── db.migration/
│               └── V1__Create-Table-singers.sql
├── .gitignore
├── pom.xml
└── README.md
```

---

## 🔧 Configuração do Banco de Dados

No arquivo `application.properties`, configure com os dados do seu PostgreSQL:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/singers
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
---
```
🚀 Como Executar
Certifique-se de que o PostgreSQL está rodando.

Crie o banco de dados chamado singers.

Clone o repositório:

bash
Copy
Edit
git clone https://github.com/seuusuario/CrudSingers.git
Altere o application.properties com suas credenciais do banco.

Execute o projeto no IntelliJ ou pelo terminal:

bash
Copy
Edit
./mvnw spring-boot:run
Use o Postman ou Insomnia para testar as rotas da API.
```
---
```
📬 Endpoints da API
POST /singers → Criar cantor

GET /singers → Listar cantores

PUT /singers → Atualizar cantor

DELETE /singers/{id} → Remover cantor
```
---
💻 Autor
Desenvolvido por João FIlipe Alves


