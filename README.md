# Teste de JCStress para a Classe Result do Projeto enem-db

## Uma Breve Descrição

JCStress (Java Concurrency Stress) é uma ferramenta para realizar testes de Concorrência em Java.
Neste projeto temos um exemplo de implementação de teste de Stress para a classe Result implementada no projeto 
[enem-db](https://github.com/JoMedeiros/enem-db/).

## Como rodar o teste

Para rodar o teste coloque a seguinte classe como classe `Main` nas configurações da sua IDE:
```
org.openjdk.jcstress.Main
```
Ao rodar os testes serão gerados um arquivo `.bin.gz` e um `index.html` na pasta `/results`. Abra o `html` no browser e 
irá aparecer a porcentagem de casos que passaram no teste.