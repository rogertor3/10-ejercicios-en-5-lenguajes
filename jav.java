// Definir una funcion Maximo()
// que tome como argumentos dos numeros y devuelva el mayor de ellos

class maximo {
    public static void main(String[] args) {
        // solicitar un numero al usuario
        System.out.println("Ingrese un numero: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese otro numero: ");
        int num2 = Integer.parseInt(System.console().readLine());
        // Encontrar el mayor de dos numeros
        if (num1 > num2) {
            // si el numero 1 es mayor que el numero 2
            // imprimir el numero 1
            System.out.println("El mayor es: " + num1);

        } else {
            // si el numero 2 es mayor que el numero 1
            // imprimir el numero 2
            System.out.println("El mayor es: " + num2);
        }
    }
}

// Definir una funcion max_de_tres()
// que tome como argumentos tres numeros y devuelva el mayor de ellos

class max_de_tres {
    public static void main(String[] args) {
        // solicitar un numero al usuario
        System.out.println("Ingrese un numero: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese otro numero: ");
        int num2 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese otro numero: ");
        int num3 = Integer.parseInt(System.console().readLine());
        // Encontrar el mayor de tres numeros
        if (num1 > num2 && num1 > num3) {
            // si el numero 1 es mayor que el numero 2 y el numero 3
            // imprimir el numero 1
            System.out.println("El mayor es: " + num1);

        } else if (num2 > num1 && num2 > num3) {
            // si el numero 2 es mayor que el numero 1 y el numero 3
            // imprimir el numero 2
            System.out.println("El mayor es: " + num2);
        } else {
            // si el numero 3 es mayor que el numero 1 y el numero 2
            // imprimir el numero 3
            System.out.println("El mayor es: " + num3);
        }
    }
}

// definir una funcion que calcule la longitud de una lista o string
class longitud {
    public static void main(String[] args) {
        // solicitar una cadena al usuario
        System.out.println("Ingrese una cadena: ");
        String cadena = System.console().readLine();
        // calcular la longitud de la cadena
        int longitud = cadena.length();
        // imprimir la longitud de la cadena
        System.out.println("La longitud de la cadena es: " + longitud);
    }
}

// definir una funcion que tome un caracter y devuelva true si es una vocal
// y false si no lo es

class esVocal {
    public static void main(String[] args) {
        // solicitar un caracter al usuario
        System.out.println("Ingrese un caracter: ");
        char caracter = System.console().readLine().charAt(0);
        // calcular si el caracter es una vocal
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            // si el caracter es una vocal
            // imprimir que es una vocal
            System.out.println("Es una vocal");
        } else {
            // si el caracter no es una vocal
            // imprimir que no es una vocal
            System.out.println("No es una vocal");
        }
    }
}

// Definir una funcion sum() que sume todos los valores de una lista de numeros
class sum {
    public static void main(String[] args) {
        // solicitar una lista de numeros al usuario
        System.out.println("Ingrese una lista de numeros: ");
        String lista = System.console().readLine();
        // calcular la suma de todos los valores de la lista
        int suma = 0;
        for (int i = 0; i < lista.length(); i++) {
            suma += lista.charAt(i) - '0';
        }
        // imprimir la suma de todos los valores de la lista
        System.out.println("La suma de todos los valores de la lista es: " + suma);
    }
}

// Definir una funcion mult() que multiplique todos los valores de una lista de
// numeros
class mult {
    public static void main(String[] args) {
        // solicitar una lista de numeros al usuario
        System.out.println("Ingrese una lista de numeros: ");
        String lista = System.console().readLine();
        // calcular la multiplicacion de todos los valores de la lista
        int mult = 1;
        for (int i = 0; i < lista.length(); i++) {
            mult *= lista.charAt(i) - '0';
        }
        // imprimir la multiplicacion de todos los valores de la lista
        System.out.println("La multiplicacion de todos los valores de la lista es: " + mult);
    }
}

// Definir una funcion inversa() que calcule la inversion de una cadena de
// caracteres
class inversa {
    public static void main(String[] args) {
        // solicitar una cadena al usuario
        System.out.println("Ingrese una cadena: ");
        String cadena = System.console().readLine();
        // calcular la inversion de la cadena
        String inversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            inversa += cadena.charAt(i);
        }
        // imprimir la inversion de la cadena
        System.out.println("La inversion de la cadena es: " + inversa);
    }
}

// Definir una funcion que reconozca un palindromo de una cadena de caracteres
class palindromo {
    public static void main(String[] args) {
        // solicitar una cadena al usuario
        System.out.println("Ingrese una cadena: ");
        String cadena = System.console().readLine();
        // eliminar espacios de la cadena
        cadena = cadena.replace(" ", "");
        // eliminar caracteres no alfanumericos
        cadena = cadena.replaceAll("[^a-zA-Z0-9]", "");
        // calcular si la cadena es un palindromo
        boolean palindromo = true;
        for (int i = 0; i < cadena.length() / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - i - 1)) {
                palindromo = false;
            }
        }
        // imprimir si la cadena es un palindromo
        if (palindromo) {
            System.out.println("La cadena es un palindromo");
        } else {
            System.out.println("La cadena no es un palindromo");
        }
    }
}

// Separar una cadena de caracteres segun un caracter especificado por el
// usuario
class separar {
    public static void main(String[] args) {
        // solicitar una cadena al usuario
        System.out.println("Ingrese una cadena: ");
        String cadena = System.console().readLine();
        // solicitar un caracter al usuario
        System.out.println("Ingrese un caracter: ");
        char caracter = System.console().readLine().charAt(0);
        // separar la cadena de caracteres segun el caracter especificado
        String[] separada = cadena.split(String.valueOf(caracter));
        // imprimir la cadena separada
        for (int i = 0; i < separada.length; i++) {
            System.out.println(separada[i]);
        }
    }
}

// definir una funcion generar_n_caracteres() que tome un entero y un caracter
// y devuelva el caracter multiplicado por el entero
class generar_n_caracteres {
    public static void main(String[] args) {
        // solicitar un entero al usuario
        System.out.println("Ingrese un entero: ");
        int entero = Integer.parseInt(System.console().readLine());
        // solicitar un caracter al usuario
        System.out.println("Ingrese un caracter: ");
        char caracter = System.console().readLine().charAt(0);
        // calcular el caracter multiplicado por el entero
        String caracter_multiplicado = "";
        for (int i = 0; i < entero; i++) {
            caracter_multiplicado += caracter;
        }
        // imprimir el caracter multiplicado por el entero
        System.out.println("El caracter multiplicado por el entero es: " + caracter_multiplicado);
    }
}

// Definir un historigrama de una lista de numeros
// imprimir usando el caracter '*'
class historigrama {
    public static void main(String[] args) {
        // solicitar una lista de numeros al usuario
        System.out.println("Ingrese una lista de numeros: ");
        String lista = System.console().readLine();
        // imprimir el historigrama de la lista
        for (int i = 0; i < lista.length(); i++) {
            System.out.print(lista.charAt(i) + " ");
            for (int j = 0; j < lista.charAt(i) - '0'; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
