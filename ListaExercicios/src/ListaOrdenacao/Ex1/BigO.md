# Explicacao Ex 1.3

## Bubble
Average: O(n^2)
Best: O(n)
Worst: O(n^2)

O pior e o comum caso do bubble sao o mesmo, pois no bubble sort ele apenas compara com elemntos adjacentes para avaliar a troca, percorrendo a lista varias vezes O bubble eh infeiciente para grandes lista e rapido para pequenas lsitas, pois a quantidade de comparacoes e trocas aumenta de maneira quadratica, por isso o ^2, com o numero de itens na lista

## Selection
Average: O(n^2)
Best: O(n^2)
Worst: O(n^2)

O selection sort tem notacao somente de O(n^2) pois sua aplicacao sempre sera de um for dentro de outro for, pois ele pega um elemnto para comparar com todos afrente, fazendo com que sempre percorra a lista. Assim como o bubble sort, por serem quadraticos, sao ideias para pequenas lista e ruins para grandes listas, o caso do exercicio eh de uma pequena lista, ent se encaixa muito bem.

## Quick
Average: O(n*log n)
Best: O(n*log n)
Worst: O(n^2)

O quick sort por ser log de n, possui uma velocidade e efetividade superior aos outros, entretanto, o pior caso existe baseado na possibilidade do pivo ser mal escolhido prejudicando todo o processo, esse mesmo define o desempenho dentro da lista baseado na escolha do pivo e na habilidade do algoritmo separar a lista em 2. Mesmo assim, eh eficiente para grandes listas.

## Merge
Average: O(n*log n)
Best: O(n*log n)
Worst: O(n*log n)

O merge sort tem todas as suas notacoes Big O iguas e em log de n, o tornando eficiente independetmente do input e para grande listas, ateh pelo seu funcionamento de separar na metade recursivamente e depois juntar elas ordenadamente, mesmo tendo uma complexidade baixa.                     