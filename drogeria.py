#nombre, si necesita formula medica, unidades quedan, si quedan medicamentos, precio por unidad
#
class Medicamentos:
    
    def __init__(self, nombre, formula, unidades, precio):
        self.__nombre=nombre
        self.__formula=formula
        self.__unidades=unidades
        self.__unidades_disponibles
        self.__precio=precio
    def __str__(self):
        formula="Si" if self.formula else "No"
        return f"El medicamento {self.__nombre}, ¿necesita formula? {self.__formula}, quedan {self.__unidades}, vale {self.__precio:,.0f}"
    def get_nombre(self):
        return self.__nombre
    def get_formula(self):
        return self.__formula
     def get_unidades(self):
        return self.__unidades
    def get_unidades_disponibles(self):
        if unidades<=5:
            return "Toca comprar unidades"
    def get_precio(self):
        return self.__precio
    def vender(self, cantidad):
       if cantidad <=0:
           print(f" Cantidad invalida para '{self__nombre}'")
           return 0
        if cantidad > self.__unidades:
            print(f" No hay unides suificientes de '{self.__nombre}'."
                  f"Disponible: {self.__unidades}, solicitado: {cantidad}.")
            return 0
        self.unidades-=cantidad
        total=cantidad*self.__precio
        print(f"Venta:{cantidad} unidad(es) de '{self.nombre}'"
              f"por {self.precio}")
        return total
nombre={}
while True:


#tkinter y en 3 archivos

    