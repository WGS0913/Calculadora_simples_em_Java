# Calculadora_simples_em_Java

Esse é o meu primeiro projeto em Java e ele é uma calculadora simples! A ideia é que o programa peça para o usuário digitar dois números e escolher uma operação matemática para ser realizada entre esses números. E o melhor é que ele vai continuar repetindo isso até que o usuário decida sair do programa digitando "0".

No começo do código, a gente importa duas coisas importantes: uma é a classe `Locale`, que vai ajudar a mostrar os números com o ponto decimal no formato americano (tipo 3.14), e a outra é a classe `Scanner`, que é muito útil para ler as coisas que o usuário digita no teclado.

Aqui no `main`, a gente declara algumas variáveis que vão ser usadas no programa, como `x`, `y`, e `resultado`, que são os números que o usuário vai digitar e o resultado das operações. A variável `sc` é do tipo `Scanner` e ela vai nos ajudar a ler os números e as escolhas do usuário.

Depois, a gente tem um loop `do-while`, que vai ficar repetindo o código dentro dele várias vezes. Isso é legal porque podemos fazer várias operações sem precisar reiniciar o programa toda hora.

Aí a gente tem a função `limparTela()` que é responsável por limpar a tela do console antes de mostrar uma nova operação. Eu achei bem legal essa parte, assim fica mais organizado!

Depois, a gente pede pro usuário digitar os dois números e a operação que ele quer fazer. A opção da operação é escolhida usando um número de 1 a 4, sendo que 1 é soma, 2 é multiplicação, 3 é divisão, e 4 é subtração. Se o usuário digitar 0, o programa entende que ele quer sair e encerra.

Pra fazer a operação, a gente usa um `switch-case`, que é tipo um "se-então-senão" especial para várias opções. Dependendo da escolha do usuário, o programa vai somar, multiplicar, dividir ou subtrair os números que ele digitou.

Por fim, a gente mostra o resultado na tela e faz uma pausa de 2 segundos antes de mostrar a próxima operação. A função `pausarExecucao()` ajuda a criar essa pausa.

Eu gostei muito desse projeto, porque é simples e já consegui aprender várias coisas novas em Java. É muito legal poder fazer operações matemáticas e ver o resultado direto no console! Vou continuar praticando e aprimorando meus conhecimentos em Java.
