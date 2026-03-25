#include <stdio.h>

//O que ´e um vetor?

//a) Explique o funcionameno de um vetor e como ele ´e tratado no C.

//--Um vetor é uma estrutura de dados que armazena múltiplos elementos do mesmo tipo em posições contíguas de memória.
//--No C, os vetores possuem tamanho fixo e são acessados por índices iniciados em zero.
//--Além disso, o nome do vetor representa o endereço do primeiro elemento, sendo tratado como um ponteiro.
      //EXEMPLO
#include <stdio.h>
int main() {
    int v[5]; // vetor com 5 posições

    v[0] = 10;
    v[1] = 20;
    v[2] = 30;
    v[3] = 40;
    v[4] = 50;

    printf("%d\n", v[2]); // imprime 30

    return 0;
}



//b) Explique o que uma string e como ela ´e tratada em C.
//--Em C, uma string é um vetor de caracteres (char) terminado pelo caractere especial \0, que indica o fim da string.
//--Diferente de outras linguagens, C não possui um tipo string nativo, sendo necessário utilizar vetores de caracteres e funções da biblioteca <string.h> para manipulá-las.

  // EXEMPLO
//"Pedro"
//"Olá mundo"