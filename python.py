# definir una funcion max()
# que tome como argumentos dos numeros y devuelva el mayor de ellos


def max():
    a = int(input("Ingrese un numero: "))
    b = int(input("Ingrese otro numero: "))
    if a > b:
        print(a)
    else:
        print(b)

# definir una funcion max_de_tres()
# que tome tres numeros y devuelva el mayor de ellos


def max_de_tres():
    a = int(input("Ingrese un numero: "))
    b = int(input("Ingrese otro numero: "))
    c = int(input("Ingrese otro numero: "))
    if a > b and a > c:
        print(a)
    elif b > a and b > c:
        print(b)
    else:
        print(c)

# definir una funcion que calcule la longitud de una lista o un string


def longitud():
    a = input("Ingrese una palabra: ")
    print(len(a))

# Escribir una funcion que tome un caracter y devuelva true si es una vocal, de lo contrario devuelva false


def vocal():
    a = input("Ingrese un caracter: ")
    if a == "a" or a == "e" or a == "i" or a == "o" or a == "u":
        print(True)
    else:
        print(False)


# Escribir una funcion sum() que sume todos los valores de una lista
# Escribir una funcion Mult() que multiplique todos los valores de una lista
lista = [1, 2, 3, 4, 5]


def suma(lista):
    suma = 0
    for i in lista:
        suma = suma + i
    print(suma)


def mult(lista):
    mult = 1
    for i in lista:
        mult = mult * i
    print(mult)

# definir una funcion inversa() que calcule la inversion de una cadena de caracteres


def inversa():
    a = input("Ingrese una palabra: ")
    print(a[::-1])

# definir una funcion que reconozca un palindromo de una cadena de caracteres


def palindromo():
    a = input("Ingrese una palabra: ")
    # eliminar espacios de la cadena de caracteres
    a = a.replace(" ", "")
    if a == a[::-1]:
        print(True)
    else:
        print(False)


# Separar una cadena de caracteres segun un caracter


def separar():
    a = input("Ingrese una palabra: ")
    # ingresar un caracter de separador
    b = input("Ingrese un caracter: ")
    print(a.split(b))


# definir una funcion generar_n_caracteres() que tome un entero y un caracter
# y devuelva el mismo caracter multiplicado por el numero ingresado


def generar_n_caracteres():
    a = int(input("Ingrese un numero: "))
    b = input("Ingrese un caracter: ")
    print(b * a)

# Definir un historigrama procedimiento() que tome una lista de numeros enteros e imprima un histograma en la pantalla


def procedimiento():
    lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    for i in lista:
        print("*" * i)
