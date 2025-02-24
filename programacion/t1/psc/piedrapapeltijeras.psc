Algoritmo piedrapapeltijeras
	Definir opcionusuario, opcionordenador Como Entero
	Definir opcionpiedra, opcionpapel, opciontijera Como Entero
	
	opcionpiedra = 1
	opcionpapel = 2
	opciontijera = 3
	Repetir
		
	
	Escribir "elige una opcion"
	Escribir "1. piedra"
	Escribir "2. papel"
	Escribir "3. Tijera"
	
	Leer opcionusuario
	
	opcionordenador = Azar(3) + 1
	SI opcionusuario = opcionpiedra Entonces
		Escribir " Has sacado piedra"
	SiNo
		Si opcionusuario = opcionpapel Entonces
			Escribir " Has sacado papel"
		SiNo
			Escribir " Has sacado tijera"
	
		FinSi
	FinSi
	Escribir opcionordenador
	SI opcionordenador = opcionpiedra Entonces
		Escribir " Ordenador ha sacado piedra"
	SiNo
		Si opcionordenador = opcionpapel Entonces
			Escribir " Ordenador ha sacado papel"
		SiNo
			Escribir " Ordenador ha sacado tijera"
			
		FinSi
	FinSi
	
	//DETERMINAR EL GANADOR//
	Si opcionusuario = opcionordenador Entonces
		Escribir "empate"
	SiNo
		Si (opcionusuario = piedra y opcionordenador = tijeras) o (opcionusuario = papel y opcionordenador = piedra) o (opcionusuario = tijeras y opcionordenador = papel) Entonces
			Escribir "Ganaste"
		SiNo
			Escribir "Te ganaron"
		FinSi
	FinSi
	Escribir "Quieres jugar otra? (S/N)"
	Leer seguirjugando
    Hasta Que seguirjugando = "n" o seguirjugando = "N"

FinAlgoritmo
