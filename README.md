# Título: Gestão de Usuários no Sistema de Administração

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

# Titulo: Carros

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
