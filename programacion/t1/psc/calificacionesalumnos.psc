// el programa permitira ingresar las calificaciones de una cantidad indefinida de estudiantes
// y calculara tanto las calificaciones promedio de todo el grupo como cuantos estudiantes han aprobado y cuantos han suspendido
// el programa seguira pidiendo calificaciones hasta que el usuario ingrese un valor negativo
// lo cual indicara que ya no hay estudiantes.

Algoritmo calificacionesalumnos
	// 1º promedio de las notas
	// 2º cuantos estudiantes han aprobado y cuantos han suspendido
	Definir calificacion Como Entero
	Definir numeroalumnos Como Entero
	Definir sumacalificaciones Como Entero
	Definir numeroaprobados Como Entero
	Definir  numerosuspensos Como Entero
	Definir promedio Como Real
	
	numeroalumnos = 0
	sumacalificaciones = 0
	numeroaprobados = 0
	numerosuspensos = 0
	Repetir
		Escribir "introduce la calificacion"
		Leer calificacion
		Si calificacion >= 0 Entonces
			numeroalumnos = numeroalumnos + 1
			sumacalificaciones = sumacalificaciones + calificacion
			
			Si calificacion >= 5 Entonces
				numeroaprobados = numeroaprobados + 1
			SiNo
				numerosuspensos = numerosuspensos + 1
			FinSi
		FinSi
		
	Hasta Que calificacion < 0
	
	//Cuantos han aprobado o suspendido
	Si numeroalumnos > 0 Entonces
		promedio = sumacalificaciones / numeroalumnos
		
		Escribir "escribir el promedio de la nota es:" ,promedio
		Escribir "numero alumnos aprobados:" ,numeroaprobados
		Escribir "numero alumnos suspendidos:" ,numerosuspensos
	FinSi
FinAlgoritmo