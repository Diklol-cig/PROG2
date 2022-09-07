#include <stdio.h>
#include <stdbool.h>

typedef char* string;

void ascii()
{
    for (int i =32; i<128; i++)
    {
        printf("%d: %c", i,i);
    }
}

void overflow()
{
    int num = 0;

    while (true)
    {
        num *= 2;
        if (num < 0)
        {
            break;
        }
    }
}

void kiir()
{
    for (int i = 1; i<=10;i++)
    {
        if(i=7)
        {continue;}
        else{
        printf("%d", i);
        }
    }
}

void vonal(int v,char c)
{
    for (int i = 0; i < v; i++)
    {
        printf("%c", c);
    }
}

int parose(int j)
{
    if (j % 2 != 0)
    return false;
    else
    return true;
}

void feltolt(const int n, int arr)
{
    for (int i = 0; i < n; i++)
    {
        arr[i]=i+1;
    }
}

void pointerek(int asd)
{
    int x = 5;
    int *p;
    p = &x;
    *p = 6;
}

//HAZI -- tomb_kereses
int main()
{
    string s = "Dani";
    for (int i = 0; i<5; i++)
    {
        printf("%d", i);
        printf("%s", s);
    }
    int j = 0;

    int arr[10];
    feltolt(arr);
    printf("%d",parose(j));
    vonal(10,'x');
    return 0;
}