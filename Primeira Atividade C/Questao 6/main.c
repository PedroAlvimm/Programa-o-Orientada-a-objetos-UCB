#include <stdio.h> // funçoes de entrada e saida de dados

 int main() {
     int i;

     i = 0;

     // while verifica primeiro, depois executa
     while (i < 10) {
         printf("while: %d\n", i);
         i++;
         }

     // do executa, depois verifica
     do {
         printf("do: %d\n", i);
         i++;
         } while (i < 10);

     return 0;
     }

// A) Saida:
while: 0
while: 1
...
while: 9
do: 10

// B) Qual a diferen¸ca entre o while e do do..while?

        // while → testa antes
        // do while → executa pelo menos 1 vez

// C) Como fica a implementação do bloco?

                    //for(int i=0; i<10; i++){
                        //printf("%d\n", i);

//C) Qual a diferen¸ca entre while e for? Quando usar um ou outro?
            //for → quando sabe o número de repetições
                //while → quando não sabe
}