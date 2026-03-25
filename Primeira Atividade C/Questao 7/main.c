#include <stdio.h>

// Acerca de Manipulaçãao de Arquivos.

//a) Explique os diferentes modos de abertura de arquivos.

//Em C, os arquivos são abertos com a função fopen, que recebe o nome do arquivo e o modo de abertura.
//Os principais modos são "r" (leitura), "w" (escrita, apagando o conteúdo), "a" (adição ao final), além dos modos combinados como "r+", "w+" e "a+".
//Também existem modos binários como "rb" e "wb" para manipulação de arquivos não-texto.
                            Modos
                            "r" → ler
                            "w" → escrever (apaga)
                            "a" → adicionar
                            "rb" / "wb" → binário





//b) Explique o funcionamento das funçoes fgets, fprintf, fread, fwrite.

// A função fgets é utilizada para ler uma linha de texto de um arquivo, armazenando em uma string.
// A função fprintf escreve dados formatados em arquivos texto, semelhante ao printf.
//Já fread e fwrite são usadas para manipulação de arquivos binários,
//permitindo ler e escrever blocos de memória diretamente, sendo muito utilizadas com estruturas (structs).
                        b) Funções
                        fgets() → lê string
                        fprintf() → escreve formatado
                        fread() → lê binário
                        fwrite() → escreve binário

}