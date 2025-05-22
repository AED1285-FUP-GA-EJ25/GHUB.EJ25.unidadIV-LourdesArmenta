Algoritmo LeeMatriz2X3
	//Proposito: Leer un matriz de orden 2X3
	leerMatriz();
	
FinAlgoritmo
Funcion leerMatriz()
	definir x como Caracter;
	definir i,j Como Entero;
	dimension x[2,3];
	para i<- 0 hasta 1 con paso 1 Hacer
		para j<-0 hasta 2 con paso 1 Hacer
			Escribir "Propociona valor de x[",i,"][",j,"]= " Sin Saltar;
			Leer x[i,i];
		FinPara
	FinPara
	
FinFuncion
