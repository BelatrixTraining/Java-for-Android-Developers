# Java-for-Android-Developers
Java for Android Developers (10h)

## Principios S.O.L.I.D (2h)

SOLID es un acrónimo que engloba los 5 primeros principios de diseño orientado a objetos propuestos por Robert Martin también conocido como Uncle Bob.

**S** ingle Responsability Principle (SRP)
**O** pen Closed Principle (OCP)
**L** iskov Substitution Principle (LSP)
**I** nterface Segregation Principle (ISP)
**D** ependency Inversion Principle (DIP)

Aplicando estos principios aumentamos la calidad de nuestro código y la posibilidad de obtener un software escalable, mantenible, testeable y libre de "code smells".

1. **"Single Responsability Principle" o "Principio de Responsabilidad Única**"
En el contexto de este principio definimos responsabilidad como una razón de cambio lo que también puede interpretarse como, una clase debe realizar una única función.
Es bueno siempre recordar que una razón de cambio solo es una razón de cambio si el cambio verdaderamente ocurre. Por lo que no sería adecuado aplicar este o cualquier otro principio de esta característica si es que no existe un síntoma.

public class Circulo implements Figura{

private double radio;

public Circulo(double radio) {
this.radio = radio;
}

public double getRadio() {
return radio;
}

public void setRadio(double radio) {
this.radio = radio;
}
}

public class Cuadrado implements Figura{

private double lado;

public Cuadrado(double lado) {
this.lado = lado;
}

public double getLado() {
return lado;
}

public void setLado(double lado) {
this.lado = lado;
}
}

public class CalculadorArea {

private List<Figura> figuras;

public CalculadorArea(List<Figura> figuras) {
this.figuras = figuras;
}

public double sumarAreas() {
return 0;
}

public void output() {
System.out.println("La suma total de todas las áreas es: " + sumarAreas());
}
}

public class Main {

public static void main(String[] args) {
Circulo circulo = new Circulo(10);
Cuadrado cuadrado = new Cuadrado(5);
Circulo circulo1 = new Circulo(5);

List<Figura> figuras = new ArrayList<>();
figuras.add(circulo);
figuras.add(cuadrado);
figuras.add(circulo1);

CalculadorArea calculadorArea = new CalculadorArea(figuras);
calculadorArea.output();
}
}
El SRP es uno de los principios más simples pero a su vez mas difíciles de hacerlo bien. Juntar responsabilidades es algo que hacemos naturalmente e identificar esas responsabilidades y separarlas de si mismas tiene que ver mucho con lo que el diseño de software realmente trata.

2. **"Open-Closed Principle" o "Principio Abierto-Cerrado"**
Este principio nos habla acerca de que una entidad de software debería estar abierta a la extensión pero cerrada a la modificación. Esto significa que deberíamos ser capaces de extender el comportamiento de la clase sin necesidad de modificar el código que ya ha sido escrito en esta. 
Aplicar SRP nos ayudará bastante para poder aplicar correctamente este principio pero esto **no** asegurará que se cumpla. Y claro está que aplicar este principio tampoco asegurará la aplicación de SRP.
El polimorfismo será también de gran ayuda para esto.

public class CalculadorArea {

private List<Figura> figuras;

public CalculadorArea(List<Figura> figuras) {
this.figuras = figuras;
}

public double sumarAreas() {
double sumaTotal = 0;
for (Figura figura : figuras) {
if (figura instanceof Cuadrado) {
sumaTotal += ((Cuadrado) figura).getLado() * ((Cuadrado) figura).getLado();
} else if (figura instanceof Circulo) {
sumaTotal += Math.PI * ((Circulo) figura).getRadio() * ((Circulo) figura).getRadio();
}
}
return sumaTotal;
}
}


3. **"Liskov Substitution Principle" o "Principio de Substitución de Liskov"**
Este principio se refiere a que toda subclase debe poder ser substituida por la clase padre y no alterar así la validez del programa.

public class Rectangulo {
protected double ancho;
protected double alto;

public double getAncho() {
return ancho;
}

public void setAncho(double ancho) {
this.ancho = ancho;
}

public double getAlto() {
return alto;
}

public void setAlto(double alto) {
this.alto = alto;
}

public double calcularArea() {
return ancho * alto;
}
}


public class Cuadrado extends Rectangulo {

@Override
public void setAncho(double ancho) {
this.ancho = ancho;
this.alto = ancho;
}

@Override
public void setAlto(double alto) {
this.alto = alto;
this.ancho = ancho;
}
}


public class Main {

public static void main(String[] args) {
Rectangulo rectangulo = new Rectangulo();
rectangulo.setAlto(20);
rectangulo.setAncho(10);
if (rectangulo.calcularArea() == 200.0) {
System.out.println("Bien");
}

Cuadrado cuadrado = new Cuadrado();
cuadrado.setAlto(20);
cuadrado.setAncho(10);
if (cuadrado.calcularArea() == 200.0) {
System.out.println("Bien");
} else {
System.out.println("Mal");
}
}
}

4. **"Interface Segregation Principle" o "Principio de Segregación de Interfaces"**

5. **"Dependency Inversion Principle" o "Principio de Inversión de Dependencias"**

## Referencias 

- http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod
- http://devexperto.com/principio-responsabilidad-unica/
