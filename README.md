# UD8
Unidad 8 - Java

#### 1. Description
```
Contiene 4 ejercicios de la unidad 8 de introducción a la POO en Java.
```

#### 2. Link: https://github.com/sansung14/UD8

#### 3. Contenido

- Ejercicio1: 
  - Haz una clase llamada Persona que siga las siguientes condiciones:
  - Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
  - Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.
  - Se implantaran varios constructores:
    - Un constructor por defecto.
    - Un constructor con el nombre, edad y sexo, el resto por defecto.
    - Un constructor con todos los atributos como parámetro. 

- Ejercicio2:
  - Haz una clase llamada Password que siga las siguientes condiciones:
  - Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de 8.
  - Los constructores serán los siguiente:
    - Un constructor por defecto.
    - Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud

- Ejercicio3:
  - Crearemos una clase llamada Electrodomestico con las siguientes características:
  - Sus atributos son precio base, color, consumo energético (letras entre A y F) ypeso. Indica que se podrán heredar.
  - Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.
  - Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre esta en mayúsculas o en minúsculas.
  - Los constructores que se implementaran serán
    - Un constructor por defecto.
    - Un constructor con el precio y peso. El resto por defecto.
    - Un constructor con todos los atributos.

- Ejercicio4:
  - Crearemos una clase llamada Serie con las siguientes características:
  - Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
  - Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
  - Los constructores que se implementaran serán:
    - Un constructor por defecto.
    - Un constructor con el titulo y creador. El resto por defecto.
    - Un constructor con todos los atributos, excepto de entregado.
