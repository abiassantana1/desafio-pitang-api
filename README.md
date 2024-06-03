# Gestão de Usuários no Sistema de Administração

### Descrição:
Como administrador do sistema, eu quero poder gerenciar os usuários do sistema através de uma interface simples e intuitiva, para que eu possa adicionar, visualizar, editar e deletar usuários conforme necessário.
Como usuário do sistema, eu quero poder cadastrar um usuário, visualizar meus proprios dados, editar meus proprios dados e deletar minha conta.

## 1. História de Usuário: Criar Usuário
Título: Como usuário, quero criar um novo usuário para que ele possa acessar o sistema.

### Descrição:
Como: Usuários<br/>
Eu quero: Criar um novo usuário<br/>
Para que: Ele possa acessar o sistema<br/>

### Critérios de Aceitação:
O formulário de criação de usuário deve incluir campos para nome(nome e sobrenome), e-mail, login, senha, data de nascimento e telefone do usuário.<br/>
O e-mail deve ser único e validado, também deve ter no minimo 5 caracteres e no maximo 50.<br/>
Login deve ter no minimo 5 caracteres e no maximo 50.<br/>
Data de nascimento, o usuário deve ter no minimo 18 anos a contar da data atual.<br/>
A senha deve cumprir requisitos mínimos de segurança (por exemplo, comprimento mínimo, caracteres especiais).<br/>
O nome do usuario deve ter no minimo 3 caracteres e no maximo 200.<br/>
O sobrenome do usuario deve ter no minimo 3 caracteres e no maximo 200.<br/>
O numero de telefone deve seguir o padrão (DDD) 9XXXX-YYYY.<br/>
Após a criação, o novo usuário deve ser adicionado à lista de usuários.<br/>

## 2. História de Usuário: Ler (Listar) Usuários
Título: Como administrador, quero ver uma lista de todos os usuários para gerenciar facilmente o acesso ao sistema.

### Descrição:
Como: Administrador<br/>
Eu quero: Ver uma lista de todos os usuários<br/>
Para que: Eu possa gerenciar facilmente o acesso ao sistema<br/>

### Critérios de Aceitação:
A lista de usuários deve exibir informações como nome, e-mail, data de nascimento e telefone.<br/>
Cada linha da lista deve ter opções para visualizar, editar e excluir o usuário.<br/>

## 3. História de Usuário: Atualizar Usuário
Título: Como administrador, quero editar as informações de um usuário para manter os dados atualizados.

### Descrição:
Como: Administrador<br/>
Eu quero: Editar as informações de um usuário<br/>
Para que: Eu possa manter os dados atualizados<br/>

### Critérios de Aceitação:
Deve ser possível editar o nome, e-mail, senha, e papel do usuário.<br/>
Ao editar o e-mail, deve ser verificado se ele não está em uso por outro usuário.<br/>
Deve ser possível ativar ou desativar o usuário.<br/>
As alterações devem ser salvas e refletidas imediatamente na lista de usuários.<br/>

## 4. História de Usuário: Autenticar Usuário
Título: Como usuário, quero poder me autenticar para que possa acessar certas funcionalidades do sistema.

### Descrição:
Como: Usuários<br/>
Eu quero: Poder me autenticar<br/>
Para que: Possa acessar o sistema certas funcionalidades do sistemas<br/>

### Critérios de Aceitação:
O formulario de login deve contar campo de login e senha, o campo de senha deve permanecer privado (oculto por ***).<br/>
A efetuar o login as funcionalidades que necessitam de autenticação devem ser liberadas para o usuário<br/>

## 5. História de Usuário: Atualizar Proprio Usuário
Título: Como usuario autenticado no sistema, quero editar as minhas proprias informações para manter os dados atualizados.

### Descrição:
Como: Usuário autenticado no sistema<br/>
Eu quero: Editar as informações do meu proprio usuário<br/>
Para que: Eu possa manter os dados atualizados<br/>

### Critérios de Aceitação:
Deve ser possível editar os dados no proprio usuário logado no sistema.<br/>
Deve ser possível editar o nome(nome e sobrenome), e-mail, login, senha, data de nascimento e telefone.<br/>
Ao editar o e-mail, deve ser verificado se ele não está em uso por outro usuário.<br/>
Ao editar o login, deve ser verificado se ele não está em uso por outro usuário.<br/>
As alterações devem ser salvas e refletidas imediatamente na lista de usuários.<br/>

## 6. História de Usuário: Excluir Usuário
Título: Como administrador, quero excluir um usuário para remover o acesso de usuários que não precisam mais do sistema.

### Descrição:
Como: Administrador<br/>
Eu quero: Excluir um usuário<br/>
Para que: Eu possa remover o acesso de usuários que não precisam mais do sistema<br/>

### Critérios de Aceitação:
Deve haver uma opção para excluir o usuário na lista de usuários.<br/>
Ao clicar em excluir, deve aparecer um modal de confirmação perguntando se o administrador tem certeza de que deseja excluir o usuário.<br/>
Ao confirmar a exclusão, o usuário deve ser removido da lista de usuários.<br/>
Ao ser excluido um usuários, os carros associados a ele devem ser exluidos do sistema também.<br/>

## 7. História de Usuário: Excluir o proprio Usuário
Título: Como usuário autenticado, quero excluir meu proprio usuário para remover meus dados do sistema.

### Descrição:
Como: Usuário<br/>
Eu quero: Excluir meu proprio um usuário<br/>
Para que: Eu possa remover meus dados do sistema<br/>

### Critérios de Aceitação:
Deve haver uma opção para excluir o usuário na lista de usuários.<br/>
Ao clicar em excluir, deve aparecer um modal de confirmação perguntando se o administrador tem certeza de que deseja excluir o usuário.<br/>
Ao confirmar a exclusão, o usuário deve ser removido da lista de usuários.<br/>
Ao ser excluido um usuários, os carros asociados a ele devem ser exluidos do sistema também<br/>

## 8. História de Usuário: Visualizar Detalhes do Usuário
Título: Como administrador, quero visualizar os detalhes de um usuário específico para obter informações completas sobre o usuário.

### Descrição:
Como: Administrador<br/>
Eu quero: Visualizar os detalhes de um usuário específico<br/>
Para que: Eu possa obter informações completas sobre o usuário<br/>

### Critérios de Aceitação:
Deve haver uma opção para visualizar os detalhes do usuário na lista de usuários.<br/>
A página de detalhes do usuário deve exibir informações como nome, sobrenome, e-mail, login, senha, data de nascimento, telefone e data do último login.<br/>
Deve haver um botão para editar o usuário a partir da página de detalhes.<br/>
Deve ser possível retornar à lista de usuários a partir da página de detalhes.<br/>

## 9. História de Usuário: Visualizar Detalhes do proprio Usuário
Título: Como usuário, quero visualizar os detalhes do meu proprio usuário para obter informações completas sobre meu cadastro.

### Descrição:
Como: Usuário<br/>
Eu quero: Visualizar os detalhes do meu proprio usuário<br/>
Para que: Eu possa obter informações completas sobre meu cadastro<br/>

### Critérios de Aceitação:
Deve haver uma opção para visualizar os detalhes do usuário na lista de usuários.<br/>
A página de detalhes do usuário deve exibir informações como nome, sobrenome, e-mail, login, senha, data de nascimento e telefone.<br/>
Deve haver um botão para editar o usuário a partir da página de detalhes.<br/>
Deve ser possível retornar à lista de usuários a partir da página de detalhes.<br/>

# Carros

## 1. História de Usuário: Criar Carro
Título: Como usuário, quero adicionar um novo carro para que ele seja listado no meu perfil.

### Descrição:
Como: Usuário<br/>
Eu quero: Adicionar um novo carro<br/>
Para que: Ele seja listado no meu perfil<br/>

### Critérios de Aceitação:
O formulário de criação de carro deve incluir campos para marca, modelo, ano, e placa.<br/>
A placa deve ser única e validada.<br/>
Após a criação, o novo carro deve ser adicionado à lista de carros do usuário.<br/>

## 2. História de Usuário: Ler (Listar) Carros
Título: Como usuário, quero ver uma lista de todos os meus carros para gerenciar facilmente minhas propriedades.

### Descrição:
Como: Usuário<br/>
Eu quero: Ver uma lista de todos os meus carros<br/>
Para que: Eu possa gerenciar facilmente minhas propriedades<br/>

### Critérios de Aceitação:
A lista de carros deve exibir informações como marca, modelo, ano e placa.<br/>
Cada linha da lista deve ter opções para visualizar, editar e excluir o carro.<br/>

## 3. História de Usuário: Atualizar Carro
Título: Como usuário, quero editar as informações de um carro para manter os dados atualizados.

### Descrição:
Como: Usuário<br/>
Eu quero: Editar as informações de um carro<br/>
Para que: Eu possa manter os dados atualizados<br/>

### Critérios de Aceitação:
Deve ser possível editar a marca, modelo, ano, e placa do carro.<br/>
Ao editar a placa, deve ser verificado se ela não está em uso por outro carro.<br/>
As alterações devem ser salvas e refletidas imediatamente na lista de carros.<br/>

## 4. História de Usuário: Excluir Carro
Título: Como usuário, quero excluir um carro para remover dados de carros que não possuo mais.

### Descrição:
Como: Usuário<br/>
Eu quero: Excluir um carro<br/>
Para que: Eu possa remover dados de carros que não possuo mais<br/>

### Critérios de Aceitação:
Deve haver uma opção para excluir o carro na lista de carros.<br/>
Ao clicar em excluir, deve aparecer um modal de confirmação perguntando se o usuário tem certeza de que deseja excluir o carro.<br/>
Ao confirmar a exclusão, o carro deve ser removido da lista de carros.<br/>

## 5. História de Usuário: Visualizar Detalhes do Carro
Título: Como usuário, quero visualizar os detalhes de um carro específico para obter informações completas sobre o carro.

### Descrição:
Como: Usuário<br/>
Eu quero: Visualizar os detalhes de um carro específico<br/>
Para que: Eu possa obter informações completas sobre o carro<br/>

### Critérios de Aceitação:
Deve haver uma opção para visualizar os detalhes do carro na lista de carros.<br/>
A página de detalhes do carro deve exibir informações como marca, modelo, ano e placa.<br/>
Deve ser possível retornar à lista de carros a partir da página de detalhes.<br/>


# SOLUÇÃO
## Introdução
A solução proposta abrange a implementação de um sistema com funcionalidades de CRUD (Create, Read, Update, Delete) para gerenciamento de usuários e carros. Esta seção justifica a escolha das tecnologias e detalha a defesa técnica para cada componente da solução, destacando como a arquitetura e as práticas adotadas.

## Arquitetura da Solução
A arquitetura do sistema é baseada em uma abordagem de três camadas, cada uma desempenhando um papel crucial na construção de uma aplicação eficiente e de fácil manutenção:<br/>
Camada de Apresentação (Frontend)<br/>
Camada de Lógica de Negócio (Backend)<br/>
Camada de Persistência (Banco de Dados)<br/>
### 1. Camada de Apresentação (Frontend)<br/>
Tecnologias Utilizadas: Angular, Angular Material
#### Justificativa: 
Angular é uma das principais plataformas de desenvolvimento de aplicações de página única (SPA), oferecendo ferramentas poderosas para construção de interfaces dinâmicas e responsivas. O Angular Material fornece componentes de interface de usuário modernos e padronizados, que garantem uma experiência de usuário (UX) consistente e intuitiva.
#### Defesa Técnica: 
A utilização de Angular permite a criação de componentes reutilizáveis e modulares, facilitando a manutenção e escalabilidade do sistema. O Angular Material agiliza o desenvolvimento ao fornecer componentes prontos para uso, garantindo ao mesmo tempo conformidade com as práticas recomendadas de design.
### 2. Camada de Lógica de Negócio (Backend)
Tecnologias Utilizadas: Spring Boot, Spring Data JPA, Spring Security
#### Justificativa: 
Spring Boot é uma plataforma robusta para desenvolvimento de aplicações Java, oferecendo configuração mínima e uma ampla gama de funcionalidades prontas para uso. Spring Data JPA facilita a interação com o banco de dados através de uma abstração poderosa sobre o ORM Hibernate. Spring Security é a escolha natural para implementar autenticação e autorização, devido à sua flexibilidade e integração perfeita com outras partes do ecossistema Spring.
#### Defesa Técnica: 
O uso de Spring Boot permite uma rápida inicialização e desenvolvimento de APIs RESTful, com configurações que favorecem a produtividade do desenvolvedor. Spring Data JPA simplifica o acesso ao banco de dados, enquanto Spring Security assegura que apenas usuários autenticados e autorizados possam acessar determinadas funcionalidades, protegendo os dados do sistema contra acessos não autorizados.
### 3. Camada de Persistência (Banco de Dados)
Tecnologias Utilizadas: H2 Database 
#### Justificativa: 
O H2 é um banco de dados em memória leve e rápido, ideal para desenvolvimento e testes. Ele permite criar uma base de dados temporária que é destruída quando a aplicação é encerrada, facilitando o desenvolvimento ágil.
#### Defesa Técnica: 
Utilizar H2 em ambiente de desenvolvimento permite uma iteração rápida e testes isolados, sem a necessidade de configuração complexa de um banco de dados externo. Para ambientes de produção, a transição para um banco de dados relacional mais robusto como PostgreSQL ou MySQL pode ser feita facilmente, aproveitando a abstração proporcionada pelo Spring Data JPA.

## Implementação dos CRUDs

### CRUD de Usuários
#### Create (Criação):
Permite a criação de novos usuários através de um formulário no frontend.
O backend valida os dados recebidos e os armazena no banco de dados.
#### Read (Leitura):
Permite a leitura de dados dos usuários cadastrados.
Usuários podem visualizar seus próprios dados, enquanto administradores podem visualizar todos os usuários.
#### Update (Atualização):
Permite a atualização dos dados dos usuários existentes.
Usuários podem atualizar seus próprios dados, e administradores podem atualizar dados de qualquer usuário.
#### Delete (Exclusão):
Permite a exclusão de usuários.
Usuários podem deletar suas próprias contas, enquanto administradores podem deletar qualquer usuário.

### CRUD de Carros
#### Create (Criação):
Permite a criação de novos registros de carros.<br/>
Usuários autenticados podem cadastrar seus próprios carros, enquanto administradores podem cadastrar carros para qualquer usuário.


#### Read (Leitura):
Permite a leitura dos dados dos carros cadastrados.<br/>
Usuários podem visualizar seus próprios carros, enquanto administradores podem visualizar todos os carros cadastrados.

#### Update (Atualização):
Permite a atualização dos dados dos carros.<br/>
Usuários podem atualizar seus próprios carros, e administradores podem atualizar dados de qualquer carro.
#### Delete (Exclusão):
Permite a exclusão de carros.<br/>
Usuários podem deletar seus próprios carros, enquanto administradores podem deletar qualquer carro.
#### Segurança
##### Autenticação e Autorização:<br/>
A aplicação utiliza JWT (JSON Web Tokens) para autenticação, garantindo que apenas usuários autenticados possam acessar os endpoints protegidos.
Spring Security é configurado para proteger as rotas e definir permissões de acesso com base nas roles dos usuários.
##### Proteção Contra Ataques Comuns:<br/>
SQL Injection: Todas as interações com o banco de dados são feitas através de Prepared Statements providos pelo Spring Data JPA.


# instalação
entre na pasta do projeto e efetue os seguintes comandos:<br/>
### mvn install<br/>
Ao finalizar o comendo efetue o seguinte comando:<br/>
### mvn spring-boot:run<br/>

