## Modelagem e Simulação 
## Revisão para a Prova dia 19/10

1) Modelagem 
    - Modelar alguma coisa 
    - Definir qual o problema 
    - Coleta e analise de dados 
    - Fazer uma formula matemática 
        - Variáveis discretas: o numero não se quebra, são numeros inteiros 
        - Variáveis continuas: float, double... São variáveis que podem ser quebradas 

2) Simulação 
    - Tentar represemtar algo do mundo real no computador 
    - Testar algo para ver se vai dar certo ou não 
    - Validação computacional 
    - Mais barato 

### Tipos de Modelagem

- Deterministico 
    - Resultado único e prevísivel para um conjunto de entradas 
    - Ex: Calculo de trajetória de projétil 
    - Para um mesmo numero de entradas o sistema sempre produzira a mesma saída 

- Estocático 
    - Incorpora elementos aleatórios, produzindo diferentes resultados possíveis 
    - Ex: previsão meterológica 
    - O comportamento do futuro não pode ser previsto com certeza, apenas com uma certa probabilidade

- Baseada em Agentes 
    - Simula comportamentos individuais que geram padrões coletivos 
    - Ex: Comportamento de multidões
    - Cada agente age por conta própria, como se fossse um personagem com suas próprias regras 

### Verificação e Validação 

1) Verificação 
    - É o processo de confirmar que o modelo computacional foi implementado corretamente ou seja, que o código faz exatamento o que a equação do modelo conceitual determina 
    - Se esta fazendo o que deveria fazer 

2) Validação 
    - É o processo de confirmar que o modelo conceitual, por sua vez, representa adequadamente o sistema real que se pretende estudar 
    - Se esta funcionado, cumprindo o que deveria cumprir 
    - Mais dificil do que verificar pois: testa, aplica, altera...

### Técnicas de Verificação 
    - Comparação com solução analítica 
    - Testes de casos-limite 

### Técnicas de Validação 
    - Comparação com dados históricos 
    - Validação da face
    - Análise de sensibilidade 
    - Validação preditiva 
