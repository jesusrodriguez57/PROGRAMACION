Algoritmo usuarioContrase�a
	definir usuario como cadena
	usuario="usuario"
	contrase�a ="contrase�a"
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
		escribir "pon la contrase�a"
		leer contrase�a
	FinSi
	si contrase�a ="contrase�a" Entonces
		escribir "contrase�a correcta"
	sino 
		escribir" contrase�a incorrecta ponla de nuevo"
	FinSi
	Hasta Que contrase�a ="contrase�a"
FinAlgoritmo
