# E-Commerce JSF
Projeto de e-commerce com JSF e JPA para a disciplina de Tópicos Java para Web (TJW).

Instruções:

*Banco de dados:*
- Crie um database chamado "store";
- Tenha um usuário chamado "admin" e com a senha "123" no seu serviço do banco de dados mysql;
- Após o download do projeto, import o arquivo "store.sql" para o banco de dados "store".

*Tomcat:*
- Utilizei o Tomcat v9.0;
- Caso queira utilizar esta versão, este é o link da página do instalador: https://tomcat.apache.org/download-90.cgi;
- Instale o novo server no eclipse, clicando na opção "New Server" ("Novo servidor");
- Selecione a pasta em que os arquivos do Tomcat baixado estão localizados;
- Finalize a instalação do "New Server".

*Projeto:*
- Importe o projeto como um Maven project;
- Execute um Maven -> Update Project, para baixar as dependências;
- Adicione o web module do projeto no Tomcat, definindo a url base - no meu caso, a url base é "/LojinhaDoGrau";
- Execute o Tomcat - no meu caso, ele roda na porta 8080;
- A url usada para teste: "http://localhost:8080/LojinhaDoGrau/index.jsf".

*Usuários:*
- Login: jonh1036@hotmail.com     Senha: 123    Administrador?: Não
- Login: ronaldo01@gmail.com      Senha: 123    Administrador?: Não
