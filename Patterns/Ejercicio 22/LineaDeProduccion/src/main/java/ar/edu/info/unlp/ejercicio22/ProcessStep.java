package ar.edu.info.unlp.ejercicio22;

public abstract class ProcessStep {
	private boolean result;
	
	public ProcessStep() {
		
	}
	
	public boolean execute(MixingTank tank) {
		if(this.basicExecute(tank)) {
			this.setSuccess();
		} else {
			this.setFailure();		
		}
		return this.result;
	}
	
	public boolean isDone() {
		this.setSuccess();
		return this.result;
	}
	
	private void setSuccess() {
		this.result = true;
	}
	
	private void setFailure() {
		this.result = false;
	}
	
	protected abstract boolean basicExecute(MixingTank tank);
}
