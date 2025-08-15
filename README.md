# Conversor de Monedas en Java

Este proyecto es una aplicación de consola en **Java** que permite convertir entre diferentes monedas en tiempo real utilizando la **API de ExchangeRate**.

## 📋 Características

- Menú interactivo con opciones de conversión predefinidas.
- Conversión en tiempo real usando la API pública de ExchangeRate.
- Cálculo automático del monto convertido.
- Manejo de errores si la API no responde o la opción es inválida.

## 🚀 Tecnologías utilizadas

- **Java 17+** (probado en Java 24)
- **Gson** (para procesar JSON)
- **HttpClient** (para realizar solicitudes HTTP a la API)

## 📦 Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- [Java JDK 17 o superior](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Gson 2.8.6](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.6)
- Conexión a internet (para acceder a la API)

## 🛠️ Instalación y ejecución

1. **Clona este repositorio:**
   ```
   git clone https://github.com/usuario/conversor-monedas-java.git
   cd conversor-monedas-java
Asegúrate de tener gson-2.8.6.jar en la carpeta lib/ y agregado al classpath.

Compila el proyecto:


javac -cp .;lib/gson-2.8.6.jar Moneda.java ConsultarMoneda.java Principal.java
Ejecuta la aplicación:


java -cp .;lib/gson-2.8.6.jar Principal
📖 Uso
Al iniciar el programa, verás un menú como este:

************************************************************************
Sea bienvenido al Conversor de Moneda de Mishell

1) Euro =>> Libra esterlina
2) Libra esterlina =>> Euro 
3) Euro =>> Yen japonés
4) Yen japonés =>> Euro 
5) Euro =>> Franco suizo
6) Franco suizo =>> Euro 
7) Euro =>> Dólar canadiense
8) Dólar canadiense =>> Euro 
9) SALIR
Elija una opcion valida.
********************************
Selecciona una opción del menú (1–8).

Introduce el valor a convertir.

El sistema te mostrará el resultado convertido en tiempo real.

🌍 Códigos ISO soportados
Algunos códigos ISO comunes que puedes usar si quieres modificar el menú:

Código	Moneda
USD	Dólar estadounidense
EUR	Euro
GBP	Libra esterlina
JPY	Yen japonés
CHF	Franco suizo
CAD	Dólar canadiense
MXN	Peso mexicano
BRL	Real brasileño
ARS	Peso argentino
COP	Peso colombiano
