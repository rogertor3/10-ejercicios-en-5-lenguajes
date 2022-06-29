# definir una funcion max()
# que tome como argumentos dos numeros y devuelva el mayor de ellos


def max(a,b):
    if a > b:
        return a
    else:
        return b

# definir una funcion max_de_tres()
# que tome tres numeros y devuelva el mayor de ellos


def max_de_tres(a,b,c):
    if a > b and a > c:
        return a
    elif b > a and b > c:
        return b
    else:
        return c

# definir una funcion que calcule la longitud de una lista o un string


def longitud(a):
    return len(a)

# Escribir una funcion que tome un caracter y devuelva true si es una vocal, de lo contrario devuelva false


def vocal(a):
    if a == "a" or a == "e" or a == "i" or a == "o" or a == "u":
        return True
    else:
        return False


# Escribir una funcion sum() que sume todos los valores de una lista
# Escribir una funcion Mult() que multiplique todos los valores de una lista

def suma(lista):
    suma = 0
    for i in lista:
        suma = suma + i
    return suma


def mult(lista):
    mult = 1
    for i in lista:
        mult = mult * i
    return mult

# definir una funcion inversa() que calcule la inversion de una cadena de caracteres


def inversa(a):

    return a[::-1]

# definir una funcion que reconozca un palindromo de una cadena de caracteres


def palindromo(a):
    # eliminar espacios de la cadena de caracteres
    a = a.replace(" ", "")
    if a == a[::-1]:
        return True
    else:
        return False


# Separar una cadena de caracteres segun un caracter


def separar(a,b):
    return a.split(b)


# definir una funcion generar_n_caracteres() que tome un entero y un caracter
# y devuelva el mismo caracter multiplicado por el numero ingresado


def generar_n_caracteres(int a,b):
    return (b * a)

# Definir un historigrama procedimiento() que tome una lista de numeros enteros e imprima un histograma en la pantalla


def procedimiento():
    lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    for i in lista:
        return ("*" * i)
