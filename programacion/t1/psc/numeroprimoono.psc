Algoritmo esnumeroprimo
	Definir numerito Como Entero
	definir esprimo como logico // 0 o 1
	esprimo = Verdadero
	
	Escribir "dame el numero (tiene que ser mayor que 1)"
	leer numerito
	
	si numerito <= 1 Entonces
		Escribir numerito, "no es un numero valido. Debe ser mayor de 1"
	SiNo
		Para divisor = 2 Hasta numerito - 1 Con Paso 1 Hacer
			Si numerito % divisor = 0 Entonces
				esprimo = Falso
			FinSi
		Fin Para
		Si esprimo = Verdadero Entonces
			Escribir numerito, " es primo"
		SiNo
			Escribir numerito, " no es primo"
		FinSi
	FinSi
	
FinAlgoritmo
