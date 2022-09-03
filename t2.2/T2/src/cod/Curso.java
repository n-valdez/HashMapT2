package cod;

public class Curso {
	private int codFacultad;
	private int nroCurso;
	private String nombreMateria;
	private Character dia;
	private Character turno;
	private int nroAula;
	private Character estadoCurso;

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(int codFacultad, int nroCurso, String nombreMateria, Character dia, Character turno, int nroAula,
			Character estadoCurso) {
		super();
		this.codFacultad = codFacultad;
		this.nroCurso = nroCurso;
		this.nombreMateria = nombreMateria;
		this.dia = dia;
		this.turno = turno;
		this.nroAula = nroAula;
		this.estadoCurso = estadoCurso;
	}

	public int getCodFacultad() {
		return codFacultad;
	}

	public void setCodFacultad(int codFacultad) {
		this.codFacultad = codFacultad;
	}

	public int getNroCurso() {
		return nroCurso;
	}

	public void setNroCurso(int nroCurso) {
		this.nroCurso = nroCurso;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public Character getDia() {
		return dia;
	}

	public void setDia(Character dia) {
		this.dia = dia;
	}

	public Character getTurno() {
		return turno;
	}

	public void setTurno(Character turno) {
		this.turno = turno;
	}

	public int getNroAula() {
		return nroAula;
	}

	public void setNroAula(int nroAula) {
		this.nroAula = nroAula;
	}

	public Character getEstadoCurso() {
		return estadoCurso;
	}

	public void setEstadoCurso(Character estadoCurso) {
		this.estadoCurso = estadoCurso;
	}

	@Override
	public String toString() {
		return "Curso [codFacultad=" + codFacultad + 
				", nroCurso=" + nroCurso + 
				", nombreMateria=" + nombreMateria + 
				", dia=" + dia + 
				", turno=" + turno + 
				", nroAula=" + nroAula + 
				", estadoCurso=" + estadoCurso + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codFacultad;
		result = prime * result + nroCurso;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (codFacultad != other.codFacultad)
			return false;
		if (nroCurso != other.nroCurso)
			return false;
		return true;
	}
	
	public boolean compareTo() {
		return false;
		
		
	}

}
