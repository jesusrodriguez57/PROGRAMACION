Algoritmo ParImparFunción 
    Leer n
    res= parImpar(n)
	escribir res
FinAlgoritmo

Función res = parImpar(n)
	Si n mod 2 = 0 Entonces
		res = " es par"
	SiNo
		res = " es impar"
	FinSi
FinFunción
