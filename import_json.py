import json
class Robot:
    def __init__(self, id, tipo, x, y, energia):
        self.id = id
        self.tipo = tipo
        self.x = x
        self.y = y
        self.energia = energia
    def __str__(self):
        return f"Robot {self.id} de tipo {self.tipo} esta en las coordenadas ({self.x}, {self.y}) con energia al {self.energia}% "
    def mover(self, dx, dy):
        if self.energia > 0:
            self.x += dx
            self.y += dy
            self.energia -= 1
        else:
            print("El robot no tiene suficiente energia para moverse.")
    def cargar_energia(self, cantidad):
        self.energia += cantidad
    def to_dict(self):
        return {
            "id": self.id,
            "tipo": self.tipo,
            "x": self.x,
            "y": self.y,
            "energia": self.energia
        }   
def guardar_en_json(robot):
    try:
        with open("robot.json", "w") as f:
            json.dump(robot.to_dict(), f, indent=4)
        print("Robot guardado correctamente")
    except Exception as e:
      print("Error al guardar:", e)

def cargar_desde_json():
    try:
        with open("robot.json", "r") as f:
            data = json.load(f)
        return Robot(**data)
    except FileNotFoundError:
        print("Archivo no encontrado")
    except Exception as e:
        print("Error:", e)

robot1 = Robot(1, "explorador", 0, 0, 5)

robot1.mover(1, 2)
robot1.cargar_energia(3)

guardar_en_json(robot1)

robot_cargado = cargar_desde_json()
print(robot_cargado)