## Quetões de Revisão para prova 

1) Qual a diferença entre modelagem e simulação?
    - Modelagem é fazer uma representação de como um sistema deve ser, definindo variáveis e equações, já a simulação é quando esse representação é colocada em prática em um computador, testando comportamento e analisando resultados. 

2) Qual a diferença entre um sistema discreto e um contínuo?
    - Um sistema discreto apresenta mudanças de estado em instantes específicos ou pela ocorrência de eventos. Já um sistema contínuo apresenta variáveis que podem mudar continuamente ao longo do tempo.

3) Qual a diferença entre modelagem determinística e estocástica?
    - Deterministica: apresenta um resultado único e prevísivel, para certo numero de entradas tem um certo numero de saídas. Estocática: o comportamento futuro não é previsto com certeza, apenas com probabilidades em cima dos fatos.

4) Qual a diferença entre verificação e validação?
    - Verificação é ter a certeza que o código faz o que a equação e o modelo determina, ou seja, se o modelo conceitual foi aplicado corretamente, já a validação é se o sistema esta cumprindo o que deveria cumprir, verifica se o modelo representa o fenômeno real.

5) Um modelo pode estar verificado, mas não validado?
    - Sim. Um modelo pode estar verificado quando seu código implementa corretamente as equações, mas não estar validado porque seus resultados não representam adequadamente a realidade.

6) O que é análise de sensibilidade?
    - Modificar os parâmetros de um sistema para ver como os resultados se comportam 

7) Qual a diferença entre falha de parâmetros e falha de estrutura?
    - Falha nos parâmetros é quando a estrutura matemática do modelo está correta, porém os valores utilizados não representam adequadamente a realidade. Já na falha de estrutura é quando o modelo não considera fatores importantes

8) O que é extrapolação?
    - Quando utilizamos um modelo ultrapassando o limite para qual foi feito 

9) Para verificar uma simulação de estoque, um estudante configura demanda e reposição iguais a zero. Qual deve ser o resultado?
    - O estoque deve permanecer constante, pois não houve saída nem entrada, o estoque fica igual

10) Por que um modelo precisa ser verificado e validado novamente depois de uma alteração?
    - Um modelo precisa ser verificado e validado novamente porque qualquer alteração pode introduzir erros na implementação ou modificar seu comportamento, comprometendo a representação da realidade. 

11) No modelo da fila de trânsito contínuo (aceleração), proponha uma técnica de verificação e também uma técnica de validação específicas para esse modelo.
    - Verificação: testar um caso-limite, como acelaração igual a zero e verificar se os carros mantêm velocidade constante 
    - Validação: comparar os resultados da simulação com os dados reais de trânsito, como velocidade e aceleração dos veículos 

12) No modelo da fila de trânsito contínuo (aceleração), proponha um cenário de falha para as três investigações estudadas (parâmetro, estrutura e extrapolação) e discuta como elas podem comprometer o modelo atual e de que forma (verificação ou validação)?
    - Parâmetro: informar uma média de aceleração diferente da realidade, isso gera resultados incorretos e exige recalibração.
    - Estrutura: não considerar veículos além de carros, como motos, caminhões, bicicletas, assim o modelo ficaria incompleto 
    - Extrapolação: permitir velocidades fisicamente impossíveis por utilizar o modelo fora de seus limites. Compromete a validação. 

13) No modelo da fila de trânsito contínuo (aceleração), o que aconteceria com o tempo entre a simulação e o cálculo de aceleração? t fosse reduzido de 0,5s para 0,01s? Essa diferença mudaria a entrada/saída de carros com? t muito pequeno ? Haveria falha? Justifique.
    - Faria a simulação realizar muito mais cálculos, tornando a evolução dos carros mais detalhada, a entrada e a saída não seriam alteradas necessariamente, pois dependem das regras do modelo. Não haveria falha automáticamente, mas o modelo deveria ser verificado e validado novamente.

14) Explique, com um exemplo próprio (diferente da fila de trânsito), a diferença entre um modelo que está verificado mas não validado, e também um modelo que está validado mas não verificado. É possível este último caso persistir por muito tempo sem ser percebido? Por quê?
    - Verificado mas não validado: AGENTE de IA que preve score de crédito para bancos, porém o AGENTE foi treinado com dados fícticios que não representam os clientes reais 
    - Validado mas não verificado: Sistema de cálculo de média das notas dos alunos soma dois pontos a mais na nota 1 e diminui dois pontos na nota 2, fazendo o resultado ser o mesmo mas com dados incorretos
