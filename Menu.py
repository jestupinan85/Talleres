def menu():
    print("===== MENÚ =====")
    print("Opcion 1: Ingresar datos")
    print("Opcion 2: Mostrar datos")
    print("Opcion 3: Salir")
    opcion = int(input("Seleccione una opcion: "))
    return opcion


opcion = 0
nombre = ""
edad = 0

while opcion != 3:
    opcion = menu()

    if opcion == 1:
        for k in range(5):
            nombre = input(f"Ingrese su nombre: {k+1}\n")
            edad = int(input("Ingrese su edad: "))
    elif opcion == 2:
        print("Su nombre es:", nombre)
        print("Su edad es:", edad)
    elif opcion == 3:
        print("Saliendo del programa...")
    else:
        print("Numero no valido")