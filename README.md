# Projeto-POO-1

Existe uma linguagem de programação chamada Logo que é muito usada no Brasil em
escolas de primeiro e segundo grau. Nesta linguagem você pode programar os
movimentos na tela de um personagem, como uma tartaruga. Este personagem descreve
movimentos riscando ou não a tela. Imagine que o personagem move-se no eixo
cartesiano (x,y) e que seu objetivo é alcançar sua comida que está previamente definida
em alguma posição do eixo. O personagem não pode se mover nas regiões cujas
coordenadas são negativas. Com base nessa descrição, faça o que se pede:

a) Crie uma exceção chamada MovimentoInvalidoException que informe na mensagem
qual movimento foi inválido
b) Crie uma classe Robo que represente esse personagem contendo dois atributos
representando sua posição no eixo cartesiano e uma cor que o identifica. Crie um
construtor que recebe a cor do robô e o inicialize na posição (0,0). Crie também
métodos de get e set para as posições
c) Crie um método mover, que recebe como parâmetro uma String e altera a posição do
robô da seguinte forma:
-“up” move o robô no eixo y em uma posição acima.
- “down” move o robô no eixo y em uma posição abaixo.
- “right” move o robô no eixo x em uma posição para a direita.
- “left” move o robô no eixo x em uma posição para a esquerda.
Caso o movimento faça com que o robô entre numa zona negativa (x ou y menor que
0), lance a exceção da questão anterior e não permita o movimento. Após cada
movimento, mostre a posição do robô.
d) Sobrecarregue o método mover, mas ao invés de receber uma String, ele rece como
parâmetro um inteiro de 1 a 4, onde 1 representa “up”, 2 representa “down”, 3
representa “right” e 4 representa “left”
e) Um método que verifique se o robô encontrou o alimento (está na mesma posição) e
retorne um boolean.
