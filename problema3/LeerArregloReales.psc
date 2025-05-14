Algoritmo LeerArregloReales
	// Proposito: almacenar 10 numeros ereales en un arreglo unidimensinal
	leerArr();
	
FinAlgoritmo
Funcion leerArr()
	Definir x Como Real;
	Dimension x[10];
	Definir i Como Entero; // variable auxiliar para ser utilizada como indice
	Para i<-0 Hasta 9 Hacer
		Escribir 'Teclaa el valor de x[',i,']: ' Sin Saltar;
		Leer x[i];
	FinPara
FinFuncion
