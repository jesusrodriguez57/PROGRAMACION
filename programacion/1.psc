Algoritmo usuarioContraseña
	definir usuario como cadena
	usuario="usuario"
	contraseña ="contraseña"
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
		escribir "pon la contraseña"
		leer contraseña
	FinSi
	si contraseña ="contraseña" Entonces
		escribir "contraseña correcta"
	sino 
		escribir" contraseña incorrecta ponla de nuevo"
	FinSi
	Hasta Que contraseña ="contraseña"
FinAlgoritmo
