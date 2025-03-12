import math
class FiguraGeometrica:
    def area_circulo(self, radio):
        return math.pi * radio * radio  # Círculo
    def area_rectangulo(self, base, altura):
        return base * altura  # Rectángulo
    def area_triangulo(self, base, altura):
        return (base * altura) / 2.0  # Triángulo
    def area_trapecio(self, base1, base2, altura):
        return ((base1 + base2) * altura) / 2.0  # Trapecio
    def area_pentagono(self, lado, apotema):
        return (5.0 * lado * apotema) / 2.0  # Pentágono
f1 = FiguraGeometrica()
f2 = FiguraGeometrica()
f3 = FiguraGeometrica()
f4 = FiguraGeometrica()
f5 = FiguraGeometrica()
print("Círculo: ", f1.area_circulo(1))
print("Rectángulo: ", f2.area_rectangulo(5.0, 8.0))
print("Triángulo: ", f3.area_triangulo(5, 8))
print("Trapecio: ", f4.area_trapecio(6, 4, 5))
print("Pentágono: ", f5.area_pentagono(5.0, 7))
