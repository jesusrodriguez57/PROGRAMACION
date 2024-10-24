Algoritmo calificación
	definir nota Como Real
	escribir "di tu nota"
	leer nota
	si nota>=9 Entonces
		escribir "sobresaliente"
	SiNo
		si nota>=8 Entonces
			Escribir "notable"
		SiNo
			si nota >= 6 y nota<= 7 Entonces
				escribir "bien"
			SiNo
				si nota =5 Entonces
					escribir "suficuente"
					sino
						si nota<5 Entonces
							escribir "insuficiente"
						FinSi
						
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
