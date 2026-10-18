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

3) Vantagens da Simulação 
    - Baixo custo 
    - Segurança
    - Previsibilidade 
    - Flexibilidade 
    - Otimização 

### Diferença entre Modelagem e Simulação 
    - Modelagem é quando é criado a representação de um sistema, definindo variáveis e equações, buscando compreender o funcionamento.
    Já a Simulação é quando executa essa representação no computador, testa os comportamentos e analisa os resultados. 


### Tipos de Variáveis:
1) Variáveis discretas:
    - O número não se quebra 
    - Numeros inteiros (qtd de alunos na sala, numeros de carros em uma fila, qtd de estoque...)

2) Variáveis contínuas:
    - Variáveis que podem assumir qualquer valor
    - Float, double... (temperatura, velocidade, tempo...)

### Sistema Discretos e Contínuos:
    - Além de identificar as variáveis, precisamos classificar como o sistema se comporta ao longo do tempo 

1) Sistemas Discretos:
    - São sistemas que as mudanças acontecem em instantes específicos ou por meio de eventos
    - Ex: Uma fila de carro:
        - Tamanho da fila = Tamanho da fila atual + carros chegando - Carros saindo
    - O sistema é discreto pois estamos contando os carros e atualizando a quantidade em etapas 

2) Sistema Contínuos:
    - Sistemas que as variáveis podem mudar continuamente ao longo do tempo 
    - Ex: Velocidade de um carro, temperatura de um ambiente
    - Representadosm por equações diferenciais

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
    

| Modelagem          | Característica                          | Exemplo                     |
| ------------------ | --------------------------------------- | --------------------------- |
| Determinística     | Mesmas entradas, mesmos resultados.     | Trajetória de um projétil.  |
| Estocástica        | Utiliza probabilidades e aleatoriedade. | Previsão meteorológica.     |
| Baseada em agentes | Simula indivíduos e suas interações.    | Comportamento de multidões. |


### Verificação e Validação 

1) Verificação 
    - É o processo de confirmar que o modelo computacional foi implementado corretamente, ou seja, que o código faz exatamento o que a equação do modelo conceitual determina 
    - Código esta correto em relação ao modelo?
    - O modelo esta implementado corretamente?

2) Validação 
    - É o processo de confirmar que o modelo conceitual, por sua vez, representa adequadamente o sistema real que se pretende estudar 
    - Se esta funcionado, cumprindo o que deveria cumprir 
    - Mais dificil do que verificar pois: testa, aplica, altera...
    - Depende de informações do mundo real e de avaliar se o comportamento representado é suficiente ou não


| Verificação                                       | Validação                                        |
| ------------------------------------------------- | ------------------------------------------------ |
| Analisa a implementação.                          | Analisa a representação da realidade.            |
| Confere o código e as regras.                     | Confere o comportamento e os resultados.         |
| Verifica se o programa segue o modelo matemático. | Verifica se o modelo representa o fenômeno real. |
| Pode utilizar testes de casos-limite.             | Pode utilizar dados históricos.                  |


### Técnicas de Verificação 
1) Comparação com solução analítica 
    - Compara os resultados da simulação com os resultados da equação matemática 

2) Testes de casos-limite 
    - Testa o modelo em condições extremas ou muito simples, onde o resultado esperado é conhecido

3) Correspondência entre Lógica e Equação 
    - Verifica se o código respeita as regras de negócio 

### Técnicas de Validação 
1) Comparação com dados históricos 
    - Compara os resultados da simulação com dados ja registrados/existentes

2) Validação da face
    - Aprersenta o modelo e seus resultados para um especialista para ele dizer se é plausível 

3) Análise de sensibilidade 
     - Modificar os parâmetros de um sistema para ver como os resultados se comportam 
    
4) Validação preditiva 
    - Utiliza uma parte dos dados históricos para calibrar o modelo e outra parte para avaliar a capacidade de previsão 


| Técnica                  | O que faz?                                                            |
| ------------------------ | --------------------------------------------------------------------- |
| Dados históricos         | Compara os resultados com registros reais.                            |
| Validação de face        | Solicita a avaliação de especialistas.                                |
| Análise de sensibilidade | Modifica parâmetros e observa os resultados.                          |
| Validação preditiva      | Verifica a capacidade de previsão com dados não utilizados no ajuste. |


### Quando um modelo falha 
1) Falha de parâmetros
    - Quando a estrutura matemática esta correta mas os valores utilizados não condizem com a realidade 

2) Falha na estrutura
    - Ocorre quando um modelo não considera fatores importantes 

3) Falha de extrapolação 
    - Quando utilizamos um modelo ultrapassando os limites ou condições para qual foi criado 


| Falha        | Problema                      | Solução                           |
| ------------ | ----------------------------- | --------------------------------- |
| Parâmetros   | Valores incorretos.           | Calibrar os parâmetros.           |
| Estrutura    | Faltam elementos importantes. | Revisar o modelo conceitual.      |
| Extrapolação | Utilização fora dos limites.  | Respeitar os limites de validade. |


### Ajuste e Iteração 
    - Um modelo pode precisar passar várias vezes pelas etapas de teste, correção e aperfeiçoamento

    1) Identificamos o problema.
    2) Ajustamos os parâmetros ou a estrutura.
    3) Executamos a simulação novamente.
    4) Verificamos a implementação.
    5) Validamos os novos resultados.

    - Sempre que um modelo é alterado ele precisa ser verificado de novo

