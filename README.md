Cadastro de Produtos — Spring Boot

API REST desenvolvida em Java com Spring Boot para cadastro e gerenciamento de produtos.

Tecnologias
Java
Spring Boot
Spring Web
Spring Data JPA
H2 Database
Lombok
Maven
Funcionalidades
Cadastro de produtos
Listagem de produtos
Busca de produto por ID
Edição de produtos
Exclusão de produtos
Validação de nome e quantidade
Tratamento global de exceções
Respostas de erro estruturadas em JSON
Endpoints
Método	Endpoint	Função
POST	/produtos	Cadastrar produto
GET	/produtos	Listar produtos
GET	/produtos/{id}	Buscar produto por ID
PUT	/produtos/{id}	Editar produto
DELETE	/produtos/{id}	Excluir produto
Estrutura

O projeto utiliza uma separação por responsabilidades:

Controller: recebe e responde às requisições HTTP.
Service: concentra as regras de negócio e validações.
Repository: realiza a comunicação com o banco através do Spring Data JPA.
Model: representa a entidade Produto.
Exception: concentra as exceções personalizadas e o tratamento global de erros.
Objetivo

Projeto desenvolvido com foco em prática de Spring Boot, APIs REST, JPA, tratamento de exceções e arquitetura em camadas, como parte da construção de um portfólio em Java.