#include <stdio.h>
//Question 1 week 0
int search(int arr[], int n, int x)
{
    int i;
    for (i = 0; i < n; i++)
        if (arr[i] == x)
            return i;
    return -1;
}

int main()
{
    int arr[50];
    int x,i,n1 ;
    printf("Enter size of the array:\n");
    scanf("%d",&n1);
    printf("Enter array:\n");
    for(i=0;i<n1;i++){
        scanf("%d",&arr[i]);
    }
    printf("Enter the key to search:\n");
    scanf("%d",&x);
    int n = sizeof(arr) / sizeof(arr[0]);


    int result = search(arr, n, x);
    (result == -1)
        ? printf("Element is not present in array")
        : printf("Element is present at index %d", result);
    return 0;
}
