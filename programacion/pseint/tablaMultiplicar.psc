Algoritmo tablaMultiplicar
    definir num Como entero
    Definir i como entero
    Definir resultado como entero
    Definir continuar como texto
	
    Repetir
        Escribir "De qué número quieres la tabla?"
        Leer num
		Para i = 0 hasta 10 con paso 1 Hacer
			resultado = num * i
			Escribir num, " x ", i, " = ", resultado
		Fin Para
    Hasta que num = 0
Fin Algoritmo