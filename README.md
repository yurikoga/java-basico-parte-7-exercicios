# 🚀 Java Básico — Spring Boot Profissional (Parte 7)

Repositório dedicado às resoluções e anotações técnicas dos **10 primeiros exercícios** (*nível Muito Simples*) da apostila *Java Básico - Parte 7: Spring Boot Profissional*, desenvolvidos no **IntelliJ IDEA**[cite: 165, 196]. O foco desta etapa cobre fundamentos de segurança com Spring Security, criptografia de senhas, anatomia de JWT, documentação OpenAPI, containerização com Docker, cache e integração contínua[cite: 165, 196].

## 📋 Exercícios Resolvidos

| Exercício | Tema / Recurso | Descrição |
| :--- | :--- | :--- |
| `01` | Autenticação vs. Autorização | Definição conceitual e exemplos práticos diferenciando identidade e permissão de acesso. |
| `02` | `SecurityFilterChain` | Configuração de segurança liberando rotas `/public/**` e exigindo autenticação nas demais. |
| `03` | `BCryptPasswordEncoder` | Criação de bean `PasswordEncoder` e validação de hash com `encode()` e `matches()`. |
| `04` | `@PreAuthorize` | Proteção em nível de método restringindo execução a usuários com `ROLE_ADMIN`. |
| `05` | Anatomia de `JWT` | Explicação das três partes do token (Header, Payload, Signature) e boas práticas de exposição de dados. |
| `06` | `OpenAPI` (`@Operation`) | Documentação de endpoint `GET` especificando resumo e códigos de resposta `200` e `404`. |
| `07` | `Dockerfile` | Criação de `Dockerfile` mínimo baseado em JRE para empacotar e executar o `.jar` da aplicação. |
| `08` | `Docker Compose` | Definição de arquivo `docker-compose.yml` provisionando um container MySQL com a base `escola`. |
| `09` | `@Cacheable` | Aplicação de cache em camada de serviço no método `buscarProduto(id)`. |
| `10` | `GitHub Actions` (CI) | Criação de pipeline automatizado executando `./mvnw verify` a cada push ou pull request. |

## 🛠️ Tecnologias Utilizadas

* **Linguagem & Framework:** Java 17+ & Spring Boot 4.1.x[cite: 166]
* **Segurança & Docs:** Spring Security 7.1.x & springdoc-openapi[cite: 166, 175]
* **Infraestrutura & CI:** Docker, Docker Compose & GitHub Actions[cite: 166, 196]
* **IDE:** IntelliJ IDEA[cite: 165]
