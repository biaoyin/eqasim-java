package org.eqasim.examples.zurich_carsharing.mode_choice.utilities.variables;
import org.eqasim.core.simulation.mode_choice.utilities.variables.BaseVariables;

public class CarsharingVariables implements BaseVariables {
	final public double travelTime_min;
	final public double cost_MU;
	final public double euclideanDistance_km;
	final public double accessEgressTime_min;
	final public boolean foundVehicle;

	public CarsharingVariables(double travelTime_min, double cost_MU, double euclideanDistance_km,
			double accessEgressTime_min, boolean foundVehicle) {
		this.travelTime_min = travelTime_min;
		this.cost_MU = cost_MU;
		this.euclideanDistance_km = euclideanDistance_km;
		this.accessEgressTime_min = accessEgressTime_min;
		this.foundVehicle = foundVehicle;
	}
}