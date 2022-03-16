package poo_practicas;
		// se puso a heredar de trabajadores.
public interface Jefes extends Trabajadores{
	// se puede obviar public abstract y java lo reconoce igual, pero es mejor ponerlo por principio
	public String tomar_decisiones (String decision);
}
