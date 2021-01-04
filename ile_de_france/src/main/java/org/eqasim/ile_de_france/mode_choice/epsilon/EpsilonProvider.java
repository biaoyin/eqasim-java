package org.eqasim.ile_de_france.mode_choice.epsilon;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.population.Person;

public interface EpsilonProvider {
	double getEpsilon(Id<Person> personId, int tripIndex, String mode);
}
