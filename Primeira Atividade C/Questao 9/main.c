#include <stdio.h>
#include <stdlib.h>

typedef struct {
    char nome[100];
    int faltas;
    float nota;
} aluno_t;

int main() {
    aluno_t *a;

    a = (aluno_t*) malloc(sizeof(aluno_t));

    // Entrada de dados
    printf("Digite seu nome: ");
    fgets(a->nome, 100, stdin);

    printf("Quantas faltas: ");
    scanf("%d", &a->faltas);

    printf("Qual a sua nota: ");
    scanf("%f", &a->nota);

    // Saída de dados
    printf("\n--- Resultado ---\n");
    printf("Nome do aluno: %s", a->nome);
    printf("Numero de faltas: %d\n", a->faltas);
    printf("Sua nota final: %.2f\n", a->nota);

    if(a->nota >= 7 && a->faltas <= 25)
        printf("Voce foi APROVADO\n");
    else
        printf("Voce foi REPROVADO\n");

    free(a);

    return 0;
}
