Algoritmo Calculadora
	definir numero1 como real
	definir numero2 Como Real
	definir operacion como entero
	escribir "indica el primer numero"
	leer numero1 
	escribir "indica el segundo"
	leer numero2
	escribir "que quieres hacer"
	escribir "1, para sumar"
	escribir "2, para restar"
	escribir "3, para multiplicar"
	escribir "4, para dividir"
	leer operacion
	
	si operacion= 1 Entonces
		escribir numero1 " + " numero2 " = " numero1+numero2
	SiNo
		si operacion= 2 Entonces
			escribir numero1 " - " numero2 " = " numero1-numero2
		SiNo
			si operacion= 3 Entonces
				escribir numero1 " * " numero2 " = " numero1*numero2
			SiNo
				si operacion= 4 Entonces
					escribir numero1 " / " numero2 " = " numero1/numero2
				FinSi
			FinSi
		FinSi
	FinSi

FinAlgoritmo
