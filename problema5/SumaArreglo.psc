Algoritmo SumaArreglo
	//Proposito: almacenar 10 numeros enteros en un arreglo unidimensinal
	definir suma Como Entero;
	suma<- sumArr();
	Escribir "La suma = ", suma;
	
FinAlgoritmo
Funcion suma<-sumArr()
	definir x Como Entero;
	Dimension x[10];
	definir i como Entero; //variable auxiliar para ser utilizada como indice
	//Leer el arreglo
	para i<-0 hasta 9 con paso 1 Hacer
		Escribir  "Teclaa el valor de x[",i,"]: " Sin Saltar;
		Leer x[i];
		
	FinPara
	//sumamos arreglo
	definir suma Como Entero;
	suma<- 0;
	para i<- 0 hasta 9 con paso 1 Hacer
		suma <- suma + x[i];
	
	FinPara
	
FinFuncion
