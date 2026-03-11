# CT App - Sistema de Gestão para Academias de Jiu-Jitsu

O **CT App** é uma plataforma robusta projetada para digitalizar a gestão de Centros de Treinamento. 
Focado em escalabilidade e organização, o sistema utiliza uma arquitetura multi-tenant para atender 
diversos CTs em uma única base de código.

## 🚀 Tecnologias Utilizadas

* **Linguagem:** Java 21
* **Framework:** Spring Boot 3.4
* **Banco de Dados:** PostgreSQL 16 (via Docker)
* **Segurança:** Spring Security
* **Migrações:** Flyway
* **Arquitetura:** Clean Architecture (Domain, Application, Infrastructure, API)

## 🛠️ Como Executar o Projeto

1.  **Pré-requisitos:** Possuir Docker e Java 21 instalados.
2.  **Subir o Banco:** Na raiz do projeto, execute:
    ```bash
    docker-compose up -d
    ```
3.  **Rodar a Aplicação:** Utilize sua IDE de preferência ou execute:
    ```bash
    ./mvnw spring-boot:run
    ```

## 🏗️ Estrutura do Projeto

O projeto segue os princípios da Clean Architecture:
* `domain`: Entidades de negócio e interfaces de repositório.
* `application`: Serviços e lógica de aplicação.
* `infrastructure`: Configurações de segurança, banco de dados e drivers externos.
* `api`: Controladores REST e DTOs de entrada/saída.

## 📜 Licença
PT:

Este projeto é proprietário. Todos os direitos pertencem a **Caio Eduardo Ferreira Frederico**. 
É proibida a reprodução, modificação ou redistribuição deste código sem autorização expressa.
Consulte o arquivo `LICENSE` para mais detalhes.

EN:

This is a proprietary project. All rights belong to **Caio Eduardo Ferreira Frederico**. 
Reproduction, modification, or redistribution of this code without express 
authorization is prohibited. See the `LICENSE` file for more details.