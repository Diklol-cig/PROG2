#include <stdio.h>

typedef char * string;

typedef struct{
    string title;
    string author;
    int pages;
} Book;

int main()
{
    Book book1;
    book1.title = "Dune";
    book1.author = "Frank";
    book1.pages = 69;

    printf("Szerző: %s\n", book1.author);
}