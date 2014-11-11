#include <stdio.h>
#include <stdlib.h>

int factorial(int x) {
    int f = 1;
    for (int i = 2; i <= x; i++) {
    	f *= i;
    }
    return f;
}

int main(int argc, char *argv[] ) {
    if (argc <= 1) {
        printf("USAGE: %s <natural number>\n",argv[0]);
        return 0;
    }
    int x = atoi(argv[1]);
    if ((x < 0) || (x > 12)) {
        printf("Argument \"%s\" not a natural number or it is too big\n",argv[1]);
        return 0;
    }
    printf("x = %d\n",x);
    printf("%d! = %d\n",x,factorial(x));
    return 0;
}
