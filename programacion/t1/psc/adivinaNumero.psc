//Se le pide al usuario que adivine el numero en 10 intentos
Algoritmo adivinaNumero
	Definir numerosuerte, numerousuario Como Entero
	numerosuerte = azar(100) + 1
	numerointentos = 0
	Escribir "Adivine el numero entre el 1 y el 10"
	Leer numerousuario
	Mientras numerousuario <> numerosuerte Y numerointentos < 10 Hacer
		
		Si numerosuerte > numerousuario Entonces
			Escribir "Muy bajo"
		SiNo
			Escribir "Muy alto"
		FinSi
		
		//Incrementar a 1 por cada interaccion
		numerointentos = numerointentos + 1
		Escribir "Ha tenido ", numerointentos, " intento"
		Leer numerousuario
		
	Fin Mientras
	Si numerousuario = numerosuerte Entonces
		Escribir "Muy bien tonto ", numerosuerte
	SiNo
		Escribir "Pringao, el numero era ", numerosuerte
	FinSi
FinAlgoritmo
