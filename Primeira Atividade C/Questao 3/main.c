#include <stdio.h>

 int main() {
     int a = 5;
     int b = 11;
     float c;

     scanf("%d %d", &a, &b);

     if(a > b || !(a > 0)) {
         c = (float)(b / a);
     } else {
         c = (float)(a / b);
     }
     printf("%.2f\n", c);
     return 0;
 }
// Consideranto que as entradas sejam o numero 5 e 11 o resultado vai ser 0.00.