#Clase Estudiante con atributos nombre y notas, metodo calcular definitiva y clasificar.
class Estudiante:
    def __init__(self, nombre, notas):
        self.nombre=nombre
        self.notas=notas
        
    def calcular_definitiva(self):
        return calcular_definitiva(self.notas)
    
    def clasificar(self):
        definitiva=self.calcular_definitiva()
        return clasificar(definitiva)
#Funciones para validar notas, calcular definitiva y clasificar.
def validar_notas(nota):
    return 0<=nota<=5

def calcular_definitiva(notas):
    return sum(notas)/len(notas)

def clasificar(definitiva):
    if definitiva>=4.5:
        return "Promedio alto"
    elif definitiva<3:
        return "Promedio bajo"
    else:
        return "Promedio basico"
#Lista para almacenar estudiantes y ciclo para ingresar datos.
estudiantes=[]
while True:
    nombre=input("Nombre (fin para salir): ")
    if nombre.lower()=="fin":
        break
    notas=[]
    for i in range(3):
        while True:
            nota=float(input(f"Ingresar nota {i+1}: "))
            if validar_notas(nota):
                notas.append(nota)
                break
            else:
                print("Nota invalida")
    estudiante=Estudiante(nombre,notas)
    estudiantes.append(estudiante)
#Funciones para calcular mejor promedio y cantidad de aprobados.
def calcular_mejor_promedio(estudiantes):
    mejor_promedio=0
    for e in estudiantes:
        definitiva=e.calcular_definitiva()
        if definitiva>mejor_promedio:
            mejor_promedio=definitiva
    return mejor_promedio

def calcular_aprobados(estudiantes):
    aprobados=0
    for e in estudiantes:
        if e.calcular_definitiva()>=3:
            aprobados+=1
    return aprobados
#Imprimir resultados para cada estudiante, mejor promedio y cantidad de aprobados.
for e in estudiantes:
    print("-----")
    print("Nombre: ", e.nombre)
    print("Definitiva: ", e.calcular_definitiva())
    print("Clasificacion: ", e.clasificar())
    print("-----")
    print(f"Mejor promedio: {calcular_mejor_promedio(estudiantes)}")
    print("Cantidad de aprobados: ", calcular_aprobados(estudiantes))