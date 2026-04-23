def menu():
  print("\n=====Menu de figuras=====")
  print("1. Figura 1")
  print("2. Figura 2")
  print("3. Figura 3")
  print("4. Figura 4")
  print("5. Salir")
def figura1(n):
  for i in range(1, n+1):
        print(" " * (n-i) + "* " * i)
def figura2(n):
  for i in range(n, 0, -1):
        print(" " * (n-i) + "* " * i)
def figura3(n):
  for i in range(1,n+1):
    print(""*+(n-i)+"*"*i)
def figura4(n):
  for i in range(n, 0, -1):
        print("*" * i)
rof=True
while rof:
  menu()
  opcion=int(input("Seleccione una opcion: "))
  n=5
  match opcion:
    case 1:
      figura1(n)
    case 2:
      figura2(n)
    case 3:
      figura3(n)
    case 4:
      figura4(n)
    case 5:
      rof=False