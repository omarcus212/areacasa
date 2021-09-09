package areadacasa;

import java.util.Scanner;

import javax.print.attribute.standard.Compression;

public class AreaDaCasa {
  
    public static void main(String[] args) {
		
    	Scanner leitor = new Scanner (System.in);
    	
    	
    	double largura,comprimento,total;
    	String resposta = "s";
    	String comodo;
        double areatotal = 0;
    	
    	
    	while(resposta.equals("s")) {
    		
    		System.out.print("qual o comodo: ");
    		comodo = leitor.next();
    		
    		System.out.print ("qual a largura: ");
    		largura = leitor.nextInt();
    		
    		System.out.print("qual a comprimento: ");
    		comprimento = leitor.nextInt();
    		
    		total=largura*comprimento;
    		System.out.println("resultado é  = "+total);
    		
    		
    		
    		System.out.print("quer continuar(s),(n): ");
    		resposta = leitor.next();
    		
    		total=total+areatotal;
    		
    		
    	}
    	System.out.println("finalizado: " +areatotal);
    	leitor.close();
    	 
    	
    	
    	
    	
    	
	}	
	
}
