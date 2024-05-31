# Título: Gestão de Usuários no Sistema de Administração

### Descrição:
Como administrador do sistema, eu quero poder gerenciar os usuários do sistema através de uma interface simples e intuitiva, para que eu possa adicionar, visualizar, editar e deletar usuários conforme necessário.
Como usuário do sistema, eu quero poder cadastrar um usuário, visualizar meus proprios dados, editar meus proprios dados e deletar minha conta.

## 1. História de Usuário: Criar Usuário
Título: Como ususuáriosu, quero criar um novo usuário para que ele possa acessar o sistema.

### Descrição:
Como: Usuários
Eu quero: Criar um novo usuário
Para que: Ele possa acessar o sistema

### Critérios de Aceitação:
O formulário de criação de usuário deve incluir campos para nome(nome e sobrenome), e-mail, login, senha, data de nascimento e telefone do usuário.
O e-mail deve ser único e validado, também deve ter no minimo 5 caracteres e no maximo 50.
Login deve ter no minimo 5 caracteres e no maximo 50.
Data de nascimento, o usuário deve ter no minimo 18 anos a contar da data atual.
A senha deve cumprir requisitos mínimos de segurança (por exemplo, comprimento mínimo, caracteres especiais).
O nome do usuario deve ter no minimo 3 caracteres e no maximo 200.
O sobrenome do usuario deve ter no minimo 3 caracteres e no maximo 200.
O numero de telefone deve seguir o padrão (DDD) 9XXXX-YYYY.
Após a criação, o novo usuário deve ser adicionado à lista de usuários.

## 2. História de Usuário: Ler (Listar) Usuários
Título: Como administrador, quero ver uma lista de todos os usuários para gerenciar facilmente o acesso ao sistema.

### Descrição:
Como: Administrador
Eu quero: Ver uma lista de todos os usuários
Para que: Eu possa gerenciar facilmente o acesso ao sistema

### Critérios de Aceitação:
A lista de usuários deve exibir informações como nome, e-mail, data de nascimento e telefone.
Deve ser possível filtrar a lista por nome, e-mail e data de nascimento.
Deve ser possível ordenar a lista por qualquer coluna.
Cada linha da lista deve ter opções para visualizar, editar e excluir o usuário.

## 3. História de Usuário: Atualizar Usuário
Título: Como administrador, quero editar as informações de um usuário para manter os dados atualizados.

### Descrição:
Como: Administrador
Eu quero: Editar as informações de um usuário
Para que: Eu possa manter os dados atualizados

### Critérios de Aceitação:
Deve ser possível editar o nome, e-mail, senha, e papel do usuário.
Ao editar o e-mail, deve ser verificado se ele não está em uso por outro usuário.
Deve ser possível ativar ou desativar o usuário.
As alterações devem ser salvas e refletidas imediatamente na lista de usuários.

## 4. História de Usuário: Atualizar Proprio Usuário
Título: Como usuario, quero editar as minhas proprias informações para manter os dados atualizados.

### Descrição:
Como: Usuários
Eu quero: Editar as informações do meu proprio usuário
Para que: Eu possa manter os dados atualizados

### Critérios de Aceitação:
Deve ser possível editar o nome(nome e sobrenome), e-mail, login, senha, data de nascimento e telefone.
Ao editar o e-mail, deve ser verificado se ele não está em uso por outro usuário.
Ao editar o login, deve ser verificado se ele não está em uso por outro usuário.
As alterações devem ser salvas e refletidas imediatamente na lista de usuários.

## 5. História de Usuário: Excluir Usuário
Título: Como administrador, quero excluir um usuário para remover o acesso de usuários que não precisam mais do sistema.

### Descrição:
Como: Administrador
Eu quero: Excluir um usuário
Para que: Eu possa remover o acesso de usuários que não precisam mais do sistema

### Critérios de Aceitação:
Deve haver uma opção para excluir o usuário na lista de usuários.
Ao clicar em excluir, deve aparecer um modal de confirmação perguntando se o administrador tem certeza de que deseja excluir o usuário.
Ao confirmar a exclusão, o usuário deve ser removido da lista de usuários.
Ao ser excluido um usuários, os carros asociados a ele devem ser exluidos do sistema também

## 6. História de Usuário: Visualizar Detalhes do Usuário
Título: Como administrador, quero visualizar os detalhes de um usuário específico para obter informações completas sobre o usuário.

### Descrição:
Como: Administrador
Eu quero: Visualizar os detalhes de um usuário específico
Para que: Eu possa obter informações completas sobre o usuário

### Critérios de Aceitação:
Deve haver uma opção para visualizar os detalhes do usuário na lista de usuários.
A página de detalhes do usuário deve exibir informações como nome, sobrenome, e-mail, login, senha, data de nascimento, telefone e data do último login.
Deve haver um botão para editar o usuário a partir da página de detalhes.
Deve ser possível retornar à lista de usuários a partir da página de detalhes.

## 7. História de Usuário: Visualizar Detalhes do proprio Usuário
Título: Como usuário, quero visualizar os detalhes do meu proprio usuário para obter informações completas sobre meu cadastro.

### Descrição:
Como: Usuário
Eu quero: Visualizar os detalhes do meu proprio usuário
Para que: Eu possa obter informações completas sobre meu cadastro

### Critérios de Aceitação:
Deve haver uma opção para visualizar os detalhes do usuário na lista de usuários.
A página de detalhes do usuário deve exibir informações como nome, sobrenome, e-mail, login, senha, data de nascimento e telefone.
Deve haver um botão para editar o usuário a partir da página de detalhes.
Deve ser possível retornar à lista de usuários a partir da página de detalhes.

# Titulo: Carros

## 1. História de Usuário: Criar Carro
Título: Como usuário, quero adicionar um novo carro para que ele seja listado no meu perfil.

### Descrição:
Como: Usuário
Eu quero: Adicionar um novo carro
Para que: Ele seja listado no meu perfil

### Critérios de Aceitação:
O formulário de criação de carro deve incluir campos para marca, modelo, ano, e placa.
A placa deve ser única e validada.
Após a criação, o novo carro deve ser adicionado à lista de carros do usuário.

## 2. História de Usuário: Ler (Listar) Carros
Título: Como usuário, quero ver uma lista de todos os meus carros para gerenciar facilmente minhas propriedades.

### Descrição:
Como: Usuário
Eu quero: Ver uma lista de todos os meus carros
Para que: Eu possa gerenciar facilmente minhas propriedades

### Critérios de Aceitação:
A lista de carros deve exibir informações como marca, modelo, ano e placa.
Deve ser possível filtrar a lista por marca, modelo, e ano.
Deve ser possível ordenar a lista por qualquer coluna.
Cada linha da lista deve ter opções para visualizar, editar e excluir o carro.

## 3. História de Usuário: Atualizar Carro
Título: Como usuário, quero editar as informações de um carro para manter os dados atualizados.

### Descrição:
Como: Usuário
Eu quero: Editar as informações de um carro
Para que: Eu possa manter os dados atualizados

### Critérios de Aceitação:
Deve ser possível editar a marca, modelo, ano, e placa do carro.
Ao editar a placa, deve ser verificado se ela não está em uso por outro carro.
As alterações devem ser salvas e refletidas imediatamente na lista de carros.

## 4. História de Usuário: Excluir Carro
Título: Como usuário, quero excluir um carro para remover dados de carros que não possuo mais.

### Descrição:
Como: Usuário
Eu quero: Excluir um carro
Para que: Eu possa remover dados de carros que não possuo mais

### Critérios de Aceitação:
Deve haver uma opção para excluir o carro na lista de carros.
Ao clicar em excluir, deve aparecer um modal de confirmação perguntando se o usuário tem certeza de que deseja excluir o carro.
Ao confirmar a exclusão, o carro deve ser removido da lista de carros.

## 5. História de Usuário: Visualizar Detalhes do Carro
Título: Como usuário, quero visualizar os detalhes de um carro específico para obter informações completas sobre o carro.

### Descrição:
Como: Usuário
Eu quero: Visualizar os detalhes de um carro específico
Para que: Eu possa obter informações completas sobre o carro

### Critérios de Aceitação:
Deve haver uma opção para visualizar os detalhes do carro na lista de carros.
A página de detalhes do carro deve exibir informações como marca, modelo, ano e placa.
Deve ser possível retornar à lista de carros a partir da página de detalhes.
