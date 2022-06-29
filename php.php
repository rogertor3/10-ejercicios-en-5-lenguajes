<?php
# definir una funcion max_alt()  'La funcion max ya esta definida en php'
# que tome como argumentos dos numeros y devuelva el mayor de ellos
function Max_alt($a, $b)
{
    if ($a > $b) {
        return $a;
    } else {
        return $b;
    }
}

# definir una funcion max_de_tres()
# que tome tres numeros y devuelva el mayor de ellos
function Max_de_tres($a, $b, $c)
{
    $max = Max_alt($a, $b);
    $max = Max_alt($max, $c);
    return $max;
}

# definir una funcion que calcule la longitud de una lista o un string
function Longitud($lista)
{
    $i = 0;
    while ($lista[$i] != null) {
        $i++;
    }
    return $i;
}

# Escribir una funcion que tome un caracter y devuelva true si es una vocal, de lo contrario devuelva false
function Caracter($caracter)
{
    if ($caracter == 'a' || $caracter == 'e' || $caracter == 'i' || $caracter == 'o' || $caracter == 'u') {
        return true;
    } else {
        return false;
    }
}

# Escribir una funcion sum() que sume todos los valores de una lista
# Escribir una funcion Mult() que multiplique todos los valores de una lista

$lista = [1, 2, 3, 4, 5];
function sum_alt($lista)
{
    $sum = 0;
    for ($i = 0; $i < count($lista); $i++) {
        $sum += $lista[$i];
    }
    return $sum;
}
function Mult($lista)
{
    $mult = 1;
    for ($i = 0; $i < count($lista); $i++) {
        $mult *= $lista[$i];
    }
    return $mult;
}

# definir una funcion inversa() que calcule la inversion de una cadena de caracteres
function inversa($cadena)
{
    $inversa = "";
    for ($i = strlen($cadena) - 1; $i >= 0; $i--) {
        $inversa .= $cadena[$i];
    }
    return $inversa;
}

# definir una funcion que reconozca un palindromo de una cadena de caracteres

function palindromo($cadena)
{
    // eliminar espacios de la cadena de caracteres
    $cadena = str_replace(' ', '', $cadena);
    // eliminar caracteres no alfanumericos
    $cadena = preg_replace('/[^A-Za-z0-9]/', '', $cadena);
    // Uppercase to Lowercase
    $cadena = strtolower($cadena);
    $inversa = inversa($cadena);
    if ($cadena == $inversa) {
        return true;
    } else {
        return false;
    }
}

# Separar una cadena de caracteres segun un caracter
function separar($cadena, $caracter)
{
    $separar = explode($caracter, $cadena);
    return $separar;
}

# definir una funcion generar_n_caracteres() que tome un entero y un caracter
# y devuelva el mismo caracter multiplicado por el numero ingresado

function generar_n_caracteres($n, $caracter)
{
    $cadena = "";
    for ($i = 0; $i < $n; $i++) {
        $cadena .= $caracter;
    }
    return $cadena;
}

# Definir un historigrama procedimiento() que tome una lista de numeros enteros e imprima un histograma en la pantalla
function historigrama($lista)
{
    $histograma = "";
    for ($i = 0; $i < count($lista); $i++) {
        $histograma .= generar_n_caracteres($lista[$i], '*');
        $histograma .= "\n";
    }
    return $histograma;
}
