#include <stdio.h>

int main() {
    int i, j, temp, n, a[10];

    printf("Enter the Number of Elements: ");
    scanf("%d", &n);

    printf("Enter the Elements to be Sorted:\n");

    for(i = 0; i < n; i++) {
        scanf("%d", &a[i]); 
    }

    for(i = 0; i < n; i++) {
        for(j = i + 1; j < n; j++) {
            if(a[i] > a[j]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    printf("The Sorted Elements are:\n");
    for(i = 0; i < n; i++) {
        printf("%d\n", a[i]);
    }

    return 0;
}




