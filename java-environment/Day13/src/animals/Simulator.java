package animals;

public class Simulator {

	public static void main(String[] args) {
		Platypus p = new Platypus();
		p.name = "Perry";
		p.generateBodyHeat();
		p.poison();
		
		Mammal m = new Mammal();
		m.name = "Generic Mammal Name";
		m.generateBodyHeat();
		
		Mammal m_2 = new Platypus();
		m_2.name = "Other Generic Mammal";
		m_2.generateBodyHeat();
		/*
		 * Cast operator: (type)
		 */
		if (m_2 instanceof Platypus)
			((Platypus)m_2).poison();
		
		/*
		 * Binary Operation that returns a boolean:
		 * <ref_var> instanceof <Class/Datatype> 
		 */
		if (m instanceof Platypus)
			((Platypus)m).poison();
	}
}
