def mostrar_menu():
    print("\n===== MENÚ PRINCIPAL =====")
    print("1. Mostrar números")
    print("2. Sumar números")
    print("3. Validar contraseña")
    print("4. Salir")
    return int(input("Seleccione una opción: "))


def mostrar_numeros(n):
    for k in range(1, n + 1):
        print(k)


def sumar_numeros():
    suma = 0
    num = -1

    while num != 0:
        num = int(input("Ingrese un número (0 para terminar): "))
        suma += num

    return suma


def validar_password():
    password_correcta = "Contraseña"

    while True:
        password = input("Ingrese la contraseña: ")
        if password == password_correcta:
            break

    print("Acceso concedido")


opcion = 0

while opcion != 4:
    opcion = mostrar_menu()

    if opcion == 1:
        n = int(input("Ingrese un número: "))
        mostrar_numeros(n)

    elif opcion == 2:
        print("La suma total es:", sumar_numeros())

    elif opcion == 3:
        validar_password()

    elif opcion == 4:
        print("Saliendo del programa...")

    else:
        print("Opción inválida")
