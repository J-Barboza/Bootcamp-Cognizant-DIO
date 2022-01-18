# Cognizant Java Developer

## Introdução ao Git e ao GitHub

> ### Sobre o Curso
> Instrutor: **Otávio Reis**


### Comandos Git
#### Fonte de referência
>1 - [Documentação - Referência em **git-scm.com**](https://git-scm.com/docs)
>2 - [Comandos Git - Aprenda Git do básico ao avançado **github.io**](https://comandosgit.github.io/)

#### Commandos básicos
> **git init**
> Crie um repositório Git vazio ou reinicialize um existente
> Este comando cria um repositório Git vazio - basicamente um diretório .git com subdiretórios para objetos, refs / heads, refs / tags e arquivos de modelo. Um branch inicial sem nenhum commit será criado. Se a variável de ambiente $ GIT_DIR for definida, ela especifica um caminho a ser usado em vez de ./.git para a base do repositório. Se o diretório de armazenamento do objeto for especificado por meio da variável de ambiente $ GIT_OBJECT_DIRECTORY, os diretórios sha1 serão criados abaixo - caso contrário, o diretório $ GIT_DIR / objects padrão será usado.

> **git status**
> Exibe caminhos que têm diferenças entre o arquivo de índice e o commit HEAD atual, caminhos que têm diferenças entre a árvore de trabalho e o arquivo de índice e caminhos na árvore de trabalho que não são rastreados pelo Git (e não são ignorados pelo gitignore [5] ) O primeiro é o que você faria com o commit executando git commit; o segundo e o terceiro são o que você pode confirmar executando git add antes de executar git commit.

> **git-add**
> Adicione o conteúdo do arquivo ao índice
> Este comando atualiza o índice utilizando o conteúdo atual encontrado na árvore de trabalho para preparar o conteúdo para o próximo commit. Em geral ele adiciona o conteúdo atual dos caminhos existentes como um todo, mas com algumas opções ele também pode ser utilizado para adicionar o conteúdo com apenas a parte das alterações aplicadas nos arquivos da árvore de trabalho ou remover os caminhos que não existam mais na árvore de trabalho.

> **git commit**
> Registre as alterações no repositório
> Crie um novo commit contendo o conteúdo atual do índice e a mensagem de log fornecida descrevendo as mudanças. O novo commit é um filho direto de HEAD, geralmente a ponta do branch atual, e o branch é atualizado para apontar para ele (a menos que nenhum branch esteja associado à árvore de trabalho, caso em que HEAD é "desanexado" conforme descrito em git -checkout [1]).

> **git push**
>  Atualizar referências remotas junto com objetos associados
>  Atualiza referências remotas usando referências locais, enquanto envia os objetos necessários para completar as referências fornecidas no repositório remoto.