package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
/**
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * @author falvojr
 */