#include <stdio.h>

 int main() {
     int y = 5;
     int z = 11;
     int w;

     w = y + z;
        if (y > z) {
            w = y * z;
     }
        printf("%d", w);

     return 0;
 }
//w = 5 + 11 = 16.
//if(5 > 11) → falso.
// a saida foi o numero 16.
