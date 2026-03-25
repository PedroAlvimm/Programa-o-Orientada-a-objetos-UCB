#include <stdio.h>
#include <stdlib.h>

typedef struct Aluno {
    char nome[100];
    int faltas;
    float nota;
    struct Aluno *prox;
} aluno_t;

int main() {
    aluno_t *inicio = NULL, *novo, *temp;

    for(int i = 0; i < 2; i++) {
        novo = (aluno_t*) malloc(sizeof(aluno_t));

        printf("\n--- Cadastro do aluno %d ---\n", i + 1);

        printf("Digite seu nome: ");
        getchar(); // limpa buffer
        fgets(novo->nome, 100, stdin);

        printf("Quantas faltas: ");
        scanf("%d", &novo->faltas);

        printf("Qual a sua nota: ");
        scanf("%f", &novo->nota);

        novo->prox = NULL;

        // Inserção na lista
        if(inicio == NULL) {
            inicio = novo;
        } else {
            temp = inicio;
            while(temp->prox != NULL)
                temp = temp->prox;
            temp->prox = novo;
        }
    }

    // Exibição
    printf("\n====== RESULTADO DOS ALUNOS ======\n");

    temp = inicio;
    while(temp != NULL) {
        printf("\nNome do aluno: %s", temp->nome);
        printf("Numero de faltas: %d\n", temp->faltas);
        printf("Sua nota final: %.2f\n", temp->nota);

        if(temp->nota >= 7 && temp->faltas <= 25)
            printf("Voce foi APROVADO\n");
        else
            printf("Voce foi REPROVADO\n");

        temp = temp->prox;
    }

    return 0;
}