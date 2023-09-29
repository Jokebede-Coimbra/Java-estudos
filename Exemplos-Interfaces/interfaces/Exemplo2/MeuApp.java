package Exemplo2;

public class MeuApp {
    public void calculaSalarioDeFuncionario(Funcionario funcionario){

		if (funcionario instanceof Gerente){
			//calculo para gerente
		}else if (funcionario instanceof Coordenador){
			//calculo para coordenador
		}else if (funcionario instanceof Operador){
			//calculo para operador
		}

	}
}    
