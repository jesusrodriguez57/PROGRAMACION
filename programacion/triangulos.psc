Algoritmo triangulos
	definir lado1 Como Real
	definir lado2 Como Real
	definir lado3 Como Real
	
	escribir "primer lado"
	leer lado1
	escribir "segundo lado"
	leer lado2
	escribir "segundo lado"
	leer lado3
	si lado1+lado2 >lado3 y lado2 +lado3 > lado1 y lado3+lado1>lado2  Entonces
		triangulo=verdadero
		escribir "es un triangulo"
	sino 
		triangulo=falso
		escribir "eso no es un triangulo"
	finsi
	si triangulo=verdadero entonces
		si lado1 = lado2 y lado2 = lado3 Entonces
			escribir "es equilatero"
		SiNo
			si lado1<>lado2 y lado2 =lado3 o lado1<>lado3 y lado2=lado1 o lado1=lado3 y lado3<>lado2 Entonces
				escribir "es isosceles"
			sino 
				si lado1<> lado2 y lado2<>lado3 y lado3<>lado1 Entonces
					escribir "es escaleno"
				FinSi
			FinSi
		FinSi
	finsi
FinAlgoritmo