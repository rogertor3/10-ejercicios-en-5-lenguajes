// Definir una funcion Max()
// que tome como argumentos dos numeros y devuelva el mayor de ellos

function Max(num1, num2) {
  if (num1 > num2) {
    return num1;
  } else {
    return num2;
  }
}

// Definir una funcion max_de_tres()
// que tome como argumentos tres numeros y devuelva el mayor de ellos

function max_de_tres(num1, num2, num3) {
  if (num1 > num2 && num1 > num3) {
    return num1;
  } else if (num2 > num1 && num2 > num3) {
    return num2;
  } else {
    return num3;
  }
}

// definir una funcion que calcule la longitud de una lista o string

function longitud(lista) {
  var long = 0;
  for (var i = 0; i < lista.length; i++) {
    long++;
  }
  return long;
}

// definir una funcion que tome un caracter y devuelva true si es una vocal
// y false si no lo es

function esVocal(caracter) {
  if (
    caracter == "a" ||
    caracter == "e" ||
    caracter == "i" ||
    caracter == "o" ||
    caracter == "u"
  ) {
    return true;
  } else {
    return false;
  }
}

// Definir una funcion sum() que sume todos los valores de una lista de numeros

function sum(lista) {
  var suma = 0;
  for (var i = 0; i < lista.length; i++) {
    suma += lista[i];
  }
  return suma;
}

// Definir una funcion mult() que multiplique todos los valores de una lista de numeros

function mult(lista) {
  var mult = 1;
  for (var i = 0; i < lista.length; i++) {
    mult *= lista[i];
  }
  return mult;
}

// Definir una funcion inversa() que calcule la inversion de una cadena de caracteres

function inversa(cadena) {
  var invertida = "";
  for (var i = cadena.length - 1; i >= 0; i--) {
    invertida += cadena[i];
  }
  return invertida;
}

// Definir una funcion que reconozca un palindromo de una cadena de caracteres

function palindromo(cadena) {
  // eliminar espacios
  var cadena = cadena.replace(/\s/g, "");
  //   eliminar caracteres no alfabéticos
  var cadena = cadena.replace(/[^a-zA-Z]/g, "");
  var invertida = inversa(cadena);
  if (cadena == invertida) {
    return true;
  } else {
    return false;
  }
}

// Separar una cadena de caracteres segun un caracter especificado  por el usuario

function separar() {
  var cadena = prompt("Ingrese una cadena de caracteres");
  var caracter = prompt("Ingrese un caracter");
  var lista = cadena.split(caracter);
  return lista;
}

// definir una funcion generar_n_caracteres() que tome un entero y un caracter
// y devuelva el caracter multiplicado por el entero
function generar_n_caracteres() {
  var numero = prompt("Ingrese un numero");
  var caracter = prompt("Ingrese un caracter");
  var cadena = "";
  for (var i = 0; i < numero; i++) {
    cadena += caracter;
  }
  return cadena;
}
