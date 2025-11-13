# 🌐 GS 9 — Comunidades de Aprendizagem Colaborativa e Global

## 👥 Membros do Grupo

| Nome                        | RM         |
| --------------------------- | ---------- |
| **Rafael Arcoverde Melo**   | **550206** |
| **Rafael Nascimento Gomes** | **550843** |

---

## 📝 **Descrição do Tema**

O tema **“Comunidades de aprendizagem colaborativa e global”** aborda como a tecnologia facilita a troca de conhecimento, colaboração entre pessoas e a construção de ambientes de aprendizado distribuídos ao redor do mundo.

---

## 📌 **Finalidade da API**

A API desenvolvida tem como objetivo:

* Expor informações sobre o tema da GS.
* Retornar dados dos membros responsáveis pelo projeto.
* Servir como base de estudo para práticas DevOps, CI/CD e versionamento automatizado.

Endpoints simples foram implementados apenas para demonstrar funcionamento, build, containerização e pipelines.

---

## ▶️ **Como Executar Localmente**

### **1. Via Maven**

```bash
mvn clean package
java -jar target/gs-9-collab-learning-0.1.0.jar
```

### **2. Via Docker**

Pull da imagem:

```bash
docker pull rafaelngomes/gs-9-collab-learning:latest
```

Executar:

```bash
docker run -p 8081:8081 rafaelngomes/gs-9-collab-learning
```

---
## 🌐 **Acesso Local à API**

Além do Swagger, a API possui um endpoint simples para teste:

👉 **http://localhost:8081/info**

Esse endpoint retorna informações básicas da aplicação (tema e membros).

---

## 📚 **Swagger**

A documentação automática estará disponível em:

👉 **[http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html)**

---

## 🐳 **Imagem no Docker Hub**

🔗 **[https://hub.docker.com/repository/docker/rafaelngomes/gs-9-collab-learning/general](https://hub.docker.com/repository/docker/rafaelngomes/gs-9-collab-learning/general)**

---

# ⚙️ **Workflows CI/CD Implementados**

## 🔵 **CI — Continuous Integration**

Executado a cada *push* na branch `feature/*`.

O workflow realiza:

* Checkout do código
* Configuração do Java 17
* Build do projeto com Maven
* Garantia que o código compila sem erros

Arquivo: `.github/workflows/ci.yml`

---

## 🟢 **CD — Continuous Delivery**

Executado ao abrir um *Pull Request* para a branch `develop`.

Ele realiza:

* Checkout do projeto
* Build Maven
* Login no Docker Hub
* Build da imagem Docker
* Publicação automática no Docker Hub

Arquivo: `.github/workflows/cd.yml`

---

## 🟡 **Versionamento Automático**

Todo *push* na branch `main` gera automaticamente uma nova **tag semântica**, como:

* `v0.0.1`
* `v0.0.2`
* ...

Utiliza a action:
`anothrNick/github-tag-action@v1`

Configurações importantes:

* Histórico completo (`fetch-depth: 0`)
* Permissão de escrita (`permissions: contents: write`)

Arquivo: `.github/workflows/versioning.yml`

---
