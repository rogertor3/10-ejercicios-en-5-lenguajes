// definir una funcion max()
// que tome como argumentos dos numeros y devuelva el mayor de ellos

#include <stdio.h>

int max(int a, int b)
{
    if (a > b)
    {
        return a;
    }
    else
    {
        return b;
    }
}

// Definir una funcion max_de_tres()
// que tome como argumentos tres numeros y devuelva el mayor de ellos
int max_de_tres(int a, int b, int c)
{
    int max = a;
    if (b > max)
    {
        max = b;
    }
    if (c > max)
    {
        max = c;
    }
    return max;
}

// definir una funcion que calcule la longitud de una lista o string
int longitud(char *s)
{
    int i = 0;
    while (s[i] != '\0')
    {
        i++;
    }
    return i;
}

// definir una funcion que tome un caracter y devuelva true si es una vocal
// y false si no lo es
int es_vocal(char c)
{
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

// Definir una funcion sum() que sume todos los valores de una lista de numeros
int sum(int *lista, int n)
{
    int i = 0;
    int suma = 0;
    while (i < n)
    {
        suma += lista[i];
        i++;
    }
    return suma;
}

// Definir una funcion mult() que multiplique todos los valores de una lista de numeros
int mult(int *lista, int n)
{
    int i = 0;
    int mult = 1;
    while (i < n)
    {
        mult *= lista[i];
        i++;
    }
    return mult;
}

// Definir una funcion inversa() que calcule la inversion de una cadena de caracteres
char *inversa(char *s)
{
    int i = 0;
    int j = longitud(s) - 1;
    while (i < j)
    {
        char aux = s[i];
        s[i] = s[j];
        s[j] = aux;
        i++;
        j--;
    }
    return s;
}

// Definir una funcion que reconozca un palindromo de una cadena de caracteres
int palindromo(char *cadena)
{
    int longitud = strlen(cadena);
    if (longitud <= 1)
        return 1;
    int inicio = 0, fin = longitud - 1;
    while (cadena[inicio] == cadena[fin])
    {
        inicio++;
        fin--;
        if (inicio > fin)
            return 1;
    }
    return 0;
}

// Separar una cadena de caracteres segun un caracter especificado  por el usuario
char **separar(char *cadena, char separador)
{
    int i = 0;
    int j = 0;
    int k = 0;
    int longitud = strlen(cadena);
    char **lista = (char **)malloc(longitud * sizeof(char *));
    while (i < longitud)
    {
        if (cadena[i] == separador)
        {
            lista[j] = (char *)malloc(k * sizeof(char));
            strcpy(lista[j], cadena + i - k);
            k = 0;
            j++;
        }
        else
        {
            k++;
        }
        i++;
    }
    lista[j] = (char *)malloc(k * sizeof(char));
    strcpy(lista[j], cadena + i - k);
    return lista;
}

// definir una funcion generar_n_caracteres() que tome un entero y un caracter
// y devuelva el caracter multiplicado por el entero
char *generar_n_caracteres(int n, char c)
{
    char *s = (char *)malloc(n * sizeof(char));
    int i = 0;
    while (i < n)
    {
        s[i] = c;
        i++;
    }
    return s;
}
// Definir un historigrama procedimiento() que tome una lista de numeros enteros e imprima un histograma en la pantalla
void procedimiento(int *lista, int n)
{
    int i = 0;
    while (i < n)
    {
        int j = 0;
        while (j < lista[i])
        {
            printf("*");
            j++;
        }
        printf("\n");
        i++;
    }
}