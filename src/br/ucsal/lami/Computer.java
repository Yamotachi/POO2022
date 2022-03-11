package br.ucsal.lami;

public class Computer {
	
	//Vari�vel/Atributo da classe
	private double cpuSpeed;
	
	//Construtor
	Computer (double speed) {
		cpuSpeed = speed;
	}
	
	//M�todos (encapsulamento Get e Set) 
	void setCpuSpeed(double _cpuSpeed) {
		double cpu = 2.0;
		if (cpu <= 3 && cpu >= 1) {
			cpuSpeed = _cpuSpeed;
		}
	}
	
	double getCpuSpeed() {
		return cpuSpeed;
	}
}
