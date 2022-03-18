# POO2022

<p>É só copiar e jogar no Eclipse</p>

Aula 17/03/2022 - Cópia, referência e encapsulamento, sobrecarga e reuso com o this

Professor.java:

package br.ucsal.aulas;

public class Professor {
	
	//Propriedades (properties)
	private String nome;
	private String cpf;
	private String email = "";
	private String senha;
	private double remuneracao = 0; //ou = 0d;
	
	//Construtor só com nome e cpf não nulos
	public Professor(String nome, String cpf) { 
		this(nome, cpf, nome + "@ucsal.br");		
	}
	
	//Construtor com nome, cpf e email não nulos
	public Professor(String nome, String cpf, String email) {
		
		//O this pega o escopo da instância, ou seja, ele referencia as propriedades.
		//Agora conseguimos acesso a todas as propriedades dessa classe.
		
		this.nome = nome;
		if (cpf.length() >= 11) {
			this.cpf = cpf;
		}
		this.email = email;
	}
	
	public void setNome(String valor) {
		nome = valor;
	}
	
	public void setCpf(String valor) {
		cpf = valor;
	}
	
	public void setEmail(String valor) {
		email = valor;
	}
	
	public void setSenha(String valor) {
		senha = valor;
	}
	
	public void setRemuneracao(double valor) {
		remuneracao = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public double getRemuneracao() {
		return remuneracao;
	}
	
	public void matricula (double valor) {
		remuneracao = remuneracao + (valor * 0.70);
	}
	
	public void cobraTaxa() {
		
		if (remuneracao >= 100) {
			remuneracao = remuneracao - 100;
		}
	}
	
	public void cancelarMatricula() {
		remuneracao = remuneracao - (50 * 0.7);
	}
	
}




------------------------------------------------------------------------------------------------
TestaProfessor.java:

package br.ucsal.aulas;

public class TestaProfessor {
	
	/*public static void cobraTaxa(Professor professor) {
		
		if (professor.remuneracao >= 100) {
			professor.remuneracao = professor.remuneracao - 100;
		}
	}*/
	
	/*public static void matricula(Professor professor, double valor) {
		professor.remuneracao = professor.remuneracao - valor;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor fernando = new Professor("Fernando", "000.000.000-00", "fernando@dominio.com.br"); //Instância 1 da classe Professor
		
		//fernando.setNome("Fernando");
		//fernando.setCpf("000.000.000-00");
		//fernando.setEmail("fernando@dominio.com.br");
		fernando.setSenha("talsenha123@@");
		fernando.setRemuneracao(100);
		//fernando.remuneracao = fernando.remuneracao + 50;
		fernando.matricula(100);
		
		System.out.println(fernando.getNome());
		System.out.println(fernando.getCpf());
		System.out.println(fernando.getEmail());		
		System.out.println(fernando.getRemuneracao());
		//System.out.println("Remuneração de Fernando: " + fernando.remuneracao);
		
		System.out.println();
		
		Professor gabriela = new Professor("Gabriela", "111.111.111-11", "gabriela@dominio.com.br"); //Instância 2 da classe Professor
		
		//gabriela.setNome("Gabriela");
		//gabriela.setCpf("111.111.111-11");
		//gabriela.setEmail("gabriela@dominio.com.br");
		gabriela.setSenha("talsenha1234@@");
		gabriela.setRemuneracao(200*0.7);
		//gabriela.remuneracao = 200*0.70;
		//gabriela.remuneracao = gabriela.remuneracao + 100;
		gabriela.matricula(200);
		
		System.out.println(gabriela.getNome());
		System.out.println(gabriela.getCpf());
		System.out.println(gabriela.getEmail());
		System.out.println(gabriela.getRemuneracao());
		//sSystem.out.println("Remuneração de Gabriela: " + gabriela.remuneracao);
		System.out.println();
		
		//matricula(fernando, 50); - Referência e valor
		fernando.matricula(50); // - Apenas Valor
		
		//matricula(gabriela, 100); - Referência e valor
		gabriela.matricula(100); // - Apenas valor
		
		//Cancelar matrícula
		//fernando.remuneracao = fernando.remuneracao - (50 * 0.70);
		//System.out.println("Remuneração de Fernando após o -: " + fernando.remuneracao);
		fernando.cancelarMatricula();
		
		//Taxa
		
		/*if (fernando.remuneracao >= 100) {
			fernando.remuneracao = fernando.remuneracao - 100;
		}
		
		if (gabriela.remuneracao >= 100) {
			gabriela.remuneracao = gabriela.remuneracao - 100;
		}*/
		
		//cobraTaxa(fernando);
		//cobraTaxa(gabriela);
		
		fernando.cobraTaxa();
		gabriela.cobraTaxa();
		
		//System.out.println("Remuneração de Fernando: " + fernando.remuneracao);
		//System.out.println("Remuneração de Gabriela: " + gabriela.remuneracao);
	}
	
}



