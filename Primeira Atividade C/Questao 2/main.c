#include <stdio.h>

int main() {
    float nota, freq;

    scanf("%f %f", &nota, &freq);

    if(nota >= 7 && freq >= 75)
        printf("Aprovado\n");
    else
        printf("Reprovado\n");

    return 0;
}
