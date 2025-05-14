Algoritmo LeerArregloCaracteres
	//Proposito: leer un arreglo de 5 elemenos de tipo Caracter e 
	// imprimirlos en orden invero
	leerEscribirArr();
	
FinAlgoritmo
Funcion leerEscribirArr()
	definir c Como Caracter;
	Dimension c[5];
	definir i Como Entero;
	para i<-0 hasta 4 con paso 1 Hacer
		escribir "Proporciona valor de elemento c[",i,"]:" sin saltar;
		Leer c[i];
		
	FinPara
	para i<- 4 hasta 0 con paso -1 Hacer
		Escribir "valor de elemento c[",i,"]=", c[i];
		
	FinPara
FinFuncion

	