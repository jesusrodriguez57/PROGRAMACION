Algoritmo usuarioContraseņa
	definir usuario como cadena
	usuario="usuario"
	contraseņa ="contraseņa"
	escribir "pon tu usuario"
	Repetir
	leer usuario
	si usuario="usuario" Entonces
		escribir "has entrado"
	SiNo
		Escribir "usuario incorrecto"
		escribir "pon tu usuario de nuevo"
	FinSi	
	hasta que usuario="usuario"
	repetir
	si usuario ="usuario" Entonces
		escribir "pon la contraseņa"
		leer contraseņa
	FinSi
	si contraseņa ="contraseņa" Entonces
		escribir "contraseņa correcta"
	sino 
		escribir" contraseņa incorrecta ponla de nuevo"
	FinSi
	Hasta Que contraseņa ="contraseņa"
FinAlgoritmo
