#1. Crea una función llamada "edad" que le pide al usuario que ingrese su edad y le muestra un mensaje en la consola que dice "Tu edad es: XX años", donde XX es la edad ingresada por el usuario.
def edad():
    edad=input("ingrese su edad: ")
    return edad
edad=edad()
print("Tu edad es:",edad, "años")

#2. Crea una función llamada "suma" que le pide al usuario que ingrese dos números y muestra en la consola la suma de ambos.
a=int(input("Ingrese el primer numero: "))
b=int(input("Ingrese el segundo numero: "))
def suma():
    resultado=a+b
    return resultado
resultado=suma()
print("La suma da: ", resultado)

#3. Crea una función llamada "num_aleatorio" que genera un número aleatorio entre 1 y 100 y le pide al usuario que adivine el número. La función debe decirle al usuario si el número que ingresó es mayor o menor que el número aleatorio generado. Si el usuario adivina el número, la función debe imprimir "¡Felicitaciones, adivinaste el número!".
def num_aleatorio():
    import random
    numero=random.randint(1,100)
    return numero
numero=num_aleatorio()
usuario_numero=int(input("Ingrese un numero del 1 al 100: "))
if usuario_numero==numero:
    print("¡Felicidades! Has adivinado el número.")
else:
    print("Lo siento, el número no es correcto")

#4 Crea una función llamada "contador_vocales" que le pide al usuario que ingrese una cadena y cuenta el número de vocales que tiene la cadena. La función debe devolver el número de vocales.
def contador_vocales():
    cadena=input("Ingrese una cadena: ")
    vocales="aeiouAEIOU"
    contador=0
    for letra in cadena:
        if letra in vocales:
            contador+=1
    return contador
vocales=contador_vocales()
print("El número de vocales en la cadena es: ", vocales)