# Controle de Estoque A3

Projeto desenvolvido para a disciplina **Programação de Soluções Computacionais** da **UNISUL**, com o objetivo de aplicar conceitos de programação, modelagem de software e controle de versionamento colaborativo no **GitHub**.

## 📦 Descrição

O sistema de Controle de Estoque permite gerenciar produtos de uma empresa comercial, oferecendo funcionalidades para:

- **Cadastro de Produtos** (CRUD)
- **Cadastro de Categorias** (CRUD)
- **Controle de Entradas e Saídas** de produtos
- **Relatórios Gerenciais** como:
    - Lista de Preços
    - Balanço Físico/Financeiro
    - Produtos abaixo da quantidade mínima
    - Produtos acima da quantidade máxima
    - Quantidade de produtos por categoria

## 🛠️ Tecnologias Utilizadas

| Tecnologia         | Versão          | Observações                                 |
|--------------------|-----------------|---------------------------------------------|
| Java               | 23              | Linguagem principal para o sistema          |
| MySQL              | 9.3.0           | Banco de dados para persistência de dados   |
| JDBC Driver        | -               | Conexão Java <-> MySQL                      |
| Apache NetBeans    | 25.0            | IDE utilizada para o desenvolvimento        |
| Git                | 2.40+           | Controle de versão e colaboração            |
| GitHub             | -               | Hospedagem do repositório e controle remoto |
| Oracle Academy     | -               | Cursos complementares para o projeto        |
| Swing (Java)       | Integrado ao Java | Interface gráfica do sistema (GUI)        |

## 📁 Estrutura do Projeto

- `src/` – Códigos-fonte Java
- `db/` – Scripts SQL para criação do banco de dados
- `relatorios/` – Modelos de relatórios
- `docs/` – Documentação e materiais auxiliares

## ✅ Requisitos Funcionais

- Cadastrar produtos com nome, preço unitário, unidade, quantidade mínima/máxima e categoria
- Cadastrar categorias com nome, tamanho e tipo de embalagem
- Realizar movimentações de estoque (entrada e saída de produtos)
- Avisar quando a quantidade de um produto está abaixo da mínima ou acima da máxima
- Reajustar o preço de todos os produtos por um percentual
- Gerar relatórios:
- Lista de Preços
- Balanço Físico/Financeiro
- Produtos abaixo da quantidade mínima
- Produtos acima da quantidade máxima
- Quantidade de produtos por categoria
- Interface gráfica para interação com o sistema

## ❌ Requisitos Não Funcionais

- Utilizar o padrão DAO para comunicação com o banco de dados
- Garantir a persistência dos dados em um banco MySQL
- Seguir convenções de boas práticas de codificação e organização de pacotes
- Utilizar controle de versão com Git/GitHub de forma colaborativa
- Código limpo, organizado e documentado
- Sistema simples, funcional e de fácil uso

## 🎯 Funcionalidades Principais

- Cadastro e gerenciamento de produtos e categorias
- Controle de movimentações (entrada/saída) de estoque
- Avisos para reposição de estoque (quantidade mínima/máxima)
- Relatórios detalhados para gestão do estoque

## 🎓 Objetivos Acadêmicos

Este projeto visa:

- Aplicar conceitos de modelagem de sistemas
- Trabalhar com padrões de projeto (DAO)
- Usar controle de versão em equipe (Git/GitHub)
- Praticar o desenvolvimento colaborativo
- Desenvolver um sistema funcional com interface gráfica

## 👥 Equipe

| Nome do Aluno           | Funcionalidade | Usuário Github  |
|-------------------------|----------------|-----------------|
| Gustavo                 | X              | @gustavoabrahao |
| Carlos                  | X              | @CarlosEduWeiss |
| Bernardo                | X              | @bnsant         |
| Roger                   | X              | @rogerpk        |
| Gabriel González Mattos | X              | @gabinhogmtts   |

## 📌 Requisitos para Rodar o Projeto

- Java 11 ou superior
- MySQL
- IDE Java (Apache NetBeans)
- Clonar o repositório e configurar o banco de dados a partir do script disponível


## 🎥 Apresentação

Link para o vídeo da apresentação: ...
