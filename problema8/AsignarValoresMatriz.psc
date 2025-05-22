Algoritmo AsignarValoresMatriz
	asignaValoresMatriz();
	
FinAlgoritmo
Funcion asignaValoresMatriz()
	definir t,i,num como Entero;
	dimension num[3,4];
	para t<-0 hasta 2 con paso 1
		para i<-0 hasta 3 con paso 1
			num[t,i]=t*4+i*1;
		FinPara
	FinPara
	para t<-0 hasta 2 con paso 1 Hacer
		para i<-0 hasta 3 con paso 1
			imprimir "num[",t,"],[",i,"]=",num[t,i];
		FinPara
	FinPara
	
	
FinFuncion

