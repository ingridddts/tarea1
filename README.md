# Tarea 1 
503212-1 Programación II (S1-2023)


Integrantes:
- José Alarcón R.
- Ingrid Triviño S.



Enunciado:

El trabajo consiste en modificar el código del expendedor de bebidas que ha hecho en PA3P. En particular, 
además de bebidas, se desea vender dulces. El proyecto sigue con una entrada para monedas, un selector 
numérico para elegir el tipo de producto y un retorno de producto. Cada vez que se le ingresa una moneda y un 
número, retorne siempre un producto del tipo solicitado, si queda alguno en el depósito interno correspondiente.
Debe haber un comprador que compre un producto, recupere todo el vuelto, lo consume, y responda su tipo y 
cuanta plata le devolvió expendedor

• Si el producto es más barato que el valor de la Moneda debe devolver la diferencia en monedas de $100 
como vuelto.

• Si no hay productos, devuelve la misma Moneda como vuelto. Debe utilizar una excepción personalizada 
(NoHayProductoException)

• Si se quiere comprar un producto por un valor inferior al precio, solo devuelve la misma Moneda como 
vuelto. Debe utilizar una excepción personalizada (PagoInsuficienteException)

• Si se quiere comprar Bebidas sin dinero (moneda null) no retorna vuelto, ni producto. Debe utilizar una 
excepción personalizada (PagoIncorrectoException)

UML: 
![UML tarea1](https://user-images.githubusercontent.com/131918653/235595911-3d6eaa22-b802-42f3-9d50-2e188a22bf71.PNG)
