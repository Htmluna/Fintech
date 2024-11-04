# Projeto de Gestão Financeira

Este projeto é uma aplicação Java para gerenciar dados financeiros de usuários, incluindo login, despesas fixas, extratos e rendimentos. A aplicação conecta-se a um banco de dados Oracle para armazenar e recuperar informações, utilizando DAOs (Data Access Objects) para realizar operações CRUD (Criar, Ler, Atualizar e Excluir).

## Estrutura do Projeto

### Pacotes

- **`br.com.fiap.dao`**: Contém as classes DAO responsáveis por interagir com o banco de dados.
- **`br.com.fiap.model`**: Contém as classes modelo que representam as tabelas do banco de dados.

### Classes Principais

- **Conexao**: Gerencia a conexão com o banco de dados Oracle, incluindo métodos para abrir e fechar a conexão.
- **DAOs**: Classes que implementam operações de CRUD para as tabelas:
  - `LoginDAO`: Gerencia as operações relacionadas aos dados de login dos usuários.
  - `DespesaFixaDAO`: Gerencia as operações de despesas fixas dos usuários.
  - `ExtratoDAO`: Gerencia os extratos financeiros.
  - `RendimentoDAO`: Gerencia as informações de rendimento dos usuários.
  - `CadastroDAO`: Gerencia os cadastros dos usuários.

### Banco de Dados

O projeto utiliza um banco de dados Oracle com as seguintes tabelas:
- **`T_login`**: Armazena informações de login dos usuários.
- **`T_desp_fx`**: Armazena as despesas fixas dos usuários.
- **`T_extrato`**: Armazena extratos financeiros dos usuários.
- **`T_rend`**: Armazena informações sobre rendimentos dos usuários.
- **`T_cadastro`**: Armazena dados de cadastro de cada usuário.

### Conexão com o Banco de Dados

A classe `Conexao` é responsável por gerenciar a conexão com o banco de dados. Inclui:
- **abrirConexao()**: Abre a conexão com o banco de dados Oracle.
- **getConexao()**: Retorna uma instância de conexão ativa.
- **fecharConexao()**: Fecha a conexão ativa com o banco de dados.

```java
// Exemplo de como abrir a conexão
Connection conexao = Conexao.getConexao();
