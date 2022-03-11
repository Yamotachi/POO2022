package br.ucsal.lami;

public class Exemplo01 {

	public static void main(String[] args) {
		//Criar uma instância computador
		Computer myPC = new Computer(2.5);
		
		//Atribuir a velocidade
		double cpu = 2.0;
		myPC.setCpuSpeed(cpu);
		
		//Imprimir
		System.out.print(myPC.getCpuSpeed());

	}
	
}
