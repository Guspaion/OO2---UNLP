package ar.edu.info.unlp.ejercicio22;

public interface MixingTank {
	
	public abstract boolean heatPower(int percentage);
	
	public boolean mixerPower(int percentage);
	
	public boolean purge();
	
	public double upTo();
	
	public double temperature();
}
