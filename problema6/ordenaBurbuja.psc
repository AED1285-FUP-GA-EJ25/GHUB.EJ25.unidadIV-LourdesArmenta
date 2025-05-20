Algoritmo ordenaBurbuja
	ordenar();
FinAlgoritmo

Funcion ordenar
	definir i,k como entero;
	definir aux como real;
	definir x como real;
	dimension x[10];
	para i<-0 hasta 9 con paso 1
		escribir "Introduce el dato de ",i,":";
		leer x[i];
	FinPara
	escribir "Ordena:";
	para k<-0 hasta 9 con paso 1
		para i<-0 hasta 8 con paso 1
			si(x[i]>x[i+1])
				aux = x[i];
				x[i]=x[i+1];
				x[i+1]=aux;
			FinSi
		FinPara
	FinPara
	para k<-0 hasta 9 con paso 1
		escribir x[k];
	FinPara
	
FinFuncion

