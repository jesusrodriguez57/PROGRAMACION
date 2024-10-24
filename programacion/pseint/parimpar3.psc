Algoritmo ParImparFunción3
	Leer n
	res= esPar(n)
	si res = verdadero 
		escribir "es par"
	SiNo
		escribir "es impar"
	FinSi
FinAlgoritmo

Función res = esPar(n)
Si n mod 2 = 0 Entonces
	res = verdadero
SiNo
	res = falso
FinSi
FinFunción
