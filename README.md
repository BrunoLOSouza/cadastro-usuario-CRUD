# 📋 Cadastro de Usuário - CRUD com Spring Boot

Projeto desenvolvido com o objetivo de consolidar conhecimentos em **Java**, **Spring Boot**, **JPA** e **arquitetura em camadas**, implementando um CRUD completo de cadastro de usuários.

> **Status do projeto:** ✔️ Concluído (em constante evolução)

---

## 🔧 Funcionalidades

- ✅ Criar um novo usuário
- ✅ Buscar usuário por e-mail
- ✅ Atualizar dados do usuário por ID
- ✅ Remover usuário por e-mail

---

## 📁 Estrutura do Projeto

cadastro-usuario/
├── controlador/
│ └── UsuarioControlador.java
├── negocios/
│ └── UsuarioServiço.java
├── infraestrutura/
│ ├── entidades/
│ │ └── Usuario.java
│ └── repositorio/
│ └── UsuarioRepositorio.java
└── application.properties


---

## 🧰 Tecnologias utilizadas

- Java 24
- Spring Boot 3.5.4
- Spring Data JPA
- H2 Database (memória)
- Lombok
- Maven

---

## 🚀 Como executar o projeto localmente

1. **Clone o repositório:**

bash
git clone https://github.com/BrunoLOSouza/cadastro-usuario-CRUD.git
cd cadastro-usuario-CRUD

Abra no IntelliJ, Eclipse ou VS Code com suporte a Java

Execute a aplicação:

Pelo terminal: ./mvnw spring-boot:run

Ou diretamente pela IDE (classe CadastroUsuarioApplication.java)

Acesse a H2 Console (opcional):

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Usuário: sa | Senha: (deixe em branco)

📫 Endpoints da API

| Método | Endpoint          | Descrição                         |
| ------ | ----------------- | --------------------------------- |
| POST   | `/usuario`        | Cadastrar um novo usuário         |
| GET    | `/usuario?email=` | Buscar usuário por e-mail         |
| PUT    | `/usuario?id=`    | Atualizar dados do usuário por ID |
| DELETE | `/usuario?email=` | Deletar usuário por e-mail        |

👨‍💻 Autor
Feito com dedicação por Bruno L. de Oliveira Souza

