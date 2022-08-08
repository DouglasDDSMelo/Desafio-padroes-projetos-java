package projeto.singleton;

/**
 * 
 * Executando um Singleton "preguiçoso" que não disponibiliza a instância para o usuário.
 *
 */

public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {} // o fato do construtor estar privado garante que ninguém acesse.	
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
