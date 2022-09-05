package EstructuraDecontrol;

import java.util.Scanner;
public class EjemploSwitch {
	


		public static void main(String[] args) {
			/*Crear un programa que muestre las opciones
			 * de una calculadora estándar:
			 * Sumar (2 números)
			 * Restar (2 números)
			 * Multiplicar (2 números)
			 * Dividir (2 números - Tomar en cuenta la división entre cero)
			 * Residuo (2 números)
			 * Potencia (de una base a un exponente)
			 * Raiz cuadrada (tomar en cuenta el signo de la raiz)
			 * Inverso multiplicativo (Tomar en cuenta la división entre cero)
			 * Salir de la Aplicación*/
			Scanner lec = new Scanner (System.in);
	        double a,b,resultado;
	        int base,exponete;
	        double numero,raiz;
	        int c,d;        
	        int entrada;
	        String salida;
	        
	        System.out.println(".*.*.*.*Bienvenido a su menú de opciones.*.*.*.*");
	        System.out.println("--Calculadora Estadar--");
	        System.out.println("Operaciones: ");
	        System.out.println("1.Suma");
	        System.out.println("2.Resta");
	        System.out.println("3.Multiplicacion");
	        System.out.println("4.Division");
	        System.out.println("5.Residuo");
	        System.out.println("6.Potencia");
	        System.out.println("7.Raiz cuadrada");
	        System.out.println("8.Inverso multiplicativo");
	        System.out.println("9.Salir");
	    
	        entrada = lec.nextInt();
	       
	        switch(entrada) {
	       
	        case 1:
	       System.out.println("Escriba num1");
	       a=lec.nextDouble();
	       System.out.println("Escriba num2");
	       b=lec.nextDouble();
	       System.out.println("La suma de "+a+" y "+ b+" es "+(a+b));
	       break;
	       
	        case 2:
	    	   System.out.println("Escriba num1");
	    	   a=lec.nextDouble();
	    	   System.out.println("Escriba num2");
	    	   b=lec.nextDouble();
	    	   System.out.println("La resta/diferencia de "+a+" menos "+b+" es igual a "+(a-b));
	    	   break;
	    	   
	       case 3:
	    	   System.out.println("Escriba num1");
	    	   a=lec.nextDouble();
	    	   System.out.println("Escriba num2");
	    	   b=lec.nextDouble();
	    	   System.out.println("El producto de "+a+" y "+b+ " es igual a: "+(a*b));
	    	   break;
	       
	       case 4:
	    	   System.out.println("Escriba num1");
	    	   a=lec.nextDouble();
	    	   System.out.println("Escriba num2");
	    	   b=lec.nextDouble();
	    	   if (b==0) {
	    	   System.out.println("La division entre 0 no esta definida");
	    	   }else {
	    		   System.out.println("La division entre "+a+" y "+b+" es igual a "+(a/b));
	    		   
	    	   }
	    	   break;
	       
	       case 5:
	    	   System.out.println("Escriba num1");
	    	   a=lec.nextDouble();
	    	   System.out.println("Escriba num2");
	    	   b=lec.nextDouble();
	    	   System.out.println("El residuo entre "+a+ " y "+b+ " es igual a " +(a%b));
	    	   break;
	    	   
	    	   
	       case 6:
	    	   System.out.println("Ingrese la base");
	    	   base=lec.nextInt();
	    	   System.out.println("Ingrese el exponente");
	    	   exponete=lec.nextInt();
	    	   System.out.println("El resultado de una base elevado a una potencia es : " + Math.pow(base,exponete));
	    	   break;
	    	   
	    	   
	    	   
	       case 7:
	    	   System.out.println("Digite el numero a obtener la raiz cuadrada : ");
	    	  
	           numero=lec.nextDouble();
	    	   raiz = Math.sqrt(numero);
	    	   System.out.println("La raiz cuadrada de el numero es : + "+numero+" es " + raiz);
	    	   break;
	    	   
	    	   
	    	   
	       case 8:
	    	   System.out.println("Digite el inverso multiplicativo: ");
	    	   
	    	  System.out.println("Ingrese su numerador :");
	           a=lec.nextInt();
	           System.out.println("Ingrese su numerador 2 :");
	           b=lec.nextInt();
	           
	           System.out.println("Ingrese su denominador :");
               c=lec.nextInt();	    	   
	    	   System.out.println("Ingrese su denominador 2 :");
	    	   d=lec.nextInt();
	    	   if (c==0) {
		    	   System.out.println("La division entre 0 no esta definida");
		    	   }else {
		    		   System.out.println(" El inverso multiplicativo de : " + (c/d));
		    		   break;
	    	   
	    	   
	        
		     }
	       case 9:
	    	   System.out.println("El PROGRAMA HA FINALIZADO");	
	    	   salida=lec.nextLine();
	    	   
	       }
	       
		}
}

	
	
	



