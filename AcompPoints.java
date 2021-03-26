package ordertrackingsystem_lab;

public abstract class AcompPoints implements ICompPoints {
	protected double points;
	
	AcompPoints(double points) {
		this.points=points;
	}
	
	public abstract double getPoints();

}
