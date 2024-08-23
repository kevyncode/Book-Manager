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
