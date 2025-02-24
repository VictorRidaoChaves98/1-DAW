Algoritmo teoremaPitagoras
	Definir resultado, lado1, lado2, lado3 Como Entero
	Definir cateto1, cateto2, hipotenusa Como Entero
	Escribir "Dame el lado1"
	Leer lado1
	Escribir "Dame el lado2"
	Leer lado2
	Escribir "Dame el lado3"
	Leer lado3
	Si lado1 > lado2 Y lado1 > lado3 Entonces
		hipotenusa = lado1
		cateto1 = lado2
		cateto2 = lado3
	SiNo
		Si lado2 > lado1 y lado2 > lado3 Entonces
			hipotenusa = lado2
			cateto1 = lado1
			cateto2 = lado3
		SiNo
			hipotenusa = lado3
			cateto1 = lado1
			cateto2 = lado2
		FinSi
	FinSi
	
	Si hipotenusa^2 = cateto1^2 + cateto2^2 Entonces
		Escribir "Es un triangulo rectangulo"
	SiNo
		Escribir "No es un triangulo rectangulo"
	FinSi
FinAlgoritmo
