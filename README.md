# Sistema de Gerenciamento de Biblioteca

## Descrição do Projeto

O Sistema de Gerenciamento de Biblioteca é um software desenvolvido em Java que facilita o gerenciamento de livros, membros e empréstimos em uma biblioteca. O sistema oferece funcionalidades como a adição, remoção e atualização de informações de livros e membros, além de permitir a realização e acompanhamento de empréstimos. Inicialmente planejado para uma interface de linha de comando (CLI), o sistema pode ser expandido para uma interface gráfica (GUI).

## Funcionalidades Principais

### Gerenciamento de Livros
- **Adicionar Livros**: Inserir novos livros no sistema com detalhes como título, autor, ano de publicação e ISBN.
- **Remover Livros**: Facilitar a remoção de livros que não estão mais disponíveis.
- **Atualizar Livros**: Modificar as informações dos livros existentes.
- **Listar Livros**: Exibir uma lista de todos os livros disponíveis na biblioteca.
- **Pesquisar Livros**: Pesquisa por livros específicos usando título, autor ou ISBN.

### Gerenciamento de Membros
- **Registrar Membros**: Adicionar novos membros ao sistema com informações detalhadas, incluindo nome, endereço, e-mail e telefone.
- **Atualizar Membros**: Atualizar as informações dos membros existentes.
- **Listar Membros**: Mostrar uma lista de todos os membros registrados.

### Gerenciamento de Empréstimos
- **Realizar Empréstimos**: Permitir que os membros registrados peguem livros emprestados.
- **Definir Datas de Vencimento**: Definir prazos para a devolução dos livros emprestados.
- **Histórico de Empréstimos**: Manter um registro de todos os empréstimos feitos.
- **Notificação de Atrasos**: Simular notificações no console para membros com livros em atraso.

### Relatórios
- **Relatórios de Empréstimos**: Gerar relatórios que mostram a quantidade de livros emprestados, membros com empréstimos ativos e livros mais populares.

## Desafios Adicionais
- **Persistência de Dados**: Implementar a persistência de dados usando arquivos de texto ou um banco de dados.
- **Renovação e Devolução**: Adicionar funcionalidades para renovação e devolução de livros.
- **Autenticação**: Criar um sistema de autenticação para diferenciar entre administradores e usuários comuns.
- **Sistema de Multas**: Implementar um sistema de multas para membros que devolvem livros atrasados.

  ---
  # Library Management System

## Project Description

The Library Management System is a software developed in Java that facilitates the management of books, members, and loans in a library. The system offers functionalities such as adding, removing, and updating book and member information, as well as handling and tracking loans. Initially planned for a command-line interface (CLI), the system can be expanded to a graphical user interface (GUI).

## Main Features

### Book Management
- **Add Books**: Insert new books into the system with details such as title, author, publication year, and ISBN.
- **Remove Books**: Facilitate the removal of books that are no longer available.
- **Update Books**: Modify the information of existing books.
- **List Books**: Display a list of all available books in the library.
- **Search Books**: Search for specific books using title, author, or ISBN.

### Member Management
- **Register Members**: Add new members to the system with detailed information, including name, address, email, and phone number.
- **Update Members**: Update the information of existing members.
- **List Members**: Show a list of all registered members.

### Loan Management
- **Perform Loans**: Allow registered members to borrow books.
- **Set Due Dates**: Define deadlines for returning borrowed books.
- **Loan History**: Maintain a record of all loans made.
- **Overdue Notifications**: Simulate notifications in the console for members with overdue books.

### Reports
- **Loan Reports**: Generate reports showing the number of books borrowed, members with active loans, and most popular books.

## Additional Challenges
- **Data Persistence**: Implement data persistence using text files or a database.
- **Renewal and Return**: Add functionalities for renewing and returning books.
- **Authentication**: Create an authentication system to differentiate between administrators and regular users.
- **Fine System**: Implement a fine system for members who return books late.

