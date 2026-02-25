# ARCN-TDD-Kata-Java-Lab

Este repositorio contiene una implementación de la clásica kata **FizzBuzz**, desarrollada siguiendo prácticas de **TDD (Desarrollo Guiado por Pruebas)** en Java. El objetivo principal del ejercicio es demostrar el ciclo de red, verde, refactorizando a medida que se agregan nuevas pruebas.

## Estructura del proyecto

- `src/main/java/org/example/FizzBuzz.java` – Clase con la lógica de FizzBuzz.
- `src/test/java/FizzBuzzTest.java` – Conjunto de pruebas unitarias que cubren los requisitos de la kata.
- `pom.xml` – Configuración de Maven (compilación Java 11, dependencias, etc.).

## Requisitos

La función `FizzBuzz.fizzbuzz(int)` devuelve:

1. "FizzBuzz" si el número es divisible por 3 y 5 (es decir, 15).
2. "Fizz" si es divisible únicamente por 3.
3. "Buzz" si es divisible únicamente por 5.
4. El número como cadena en cualquier otro caso (incluye cero y negativos).

## Desarrollo

Se comenzó con una implementación trivial que devolvía siempre el número. Luego se añadieron pruebas una por una:

- Número no divisible por 3 ni 5.
- Divisibles por 3, 5 y 15.
- Casos especiales: cero y números negativos.

Tras cada prueba fallida se implementó la lógica mínima para que pasara. Una vez verdes todas las pruebas se propuso una refactorización con `StringBuilder` para simplificar y hacer el código más escalable.

## Ejecución

```bash
mvn clean test
```

Debe ejecutarse con JDK 11, ajustado en el `pom.xml`.

## Posibles mejoras

- Añadir más reglas (por ejemplo, otros múltiplos).
- Convertir la lógica en una clase instanciable para permitir configuración dinámica.

---

Proyecto creado como parte del laboratorio de TDD.`