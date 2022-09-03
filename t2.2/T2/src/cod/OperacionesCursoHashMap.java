package cod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class OperacionesCursoHashMap {
	private HashMap<Integer, Curso> mapaCursos = new HashMap<>();
	private Queue<Curso> colaCursos = new PriorityQueue<>();

	private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public void Menu() throws IOException {

		int opcion = 0;

		while (opcion != 5) {

			System.out.println("Selecione una opcion");
			System.out.println("1- Agregar Curso");
			System.out.println("2- Actualizar Curso");
			System.out.println("3- Modificar Curso ");
			System.out.println("4- Eliminar Curso");
			System.out.println("5- Salir");

			System.out.println("Ingrese una opcion:");

			opcion = Integer.parseInt(entrada.readLine());

			switch (opcion) {
			case 1:
				agregarCurso();
				break;
			case 2:
				consultarCurso();
				break;
			case 3:
				modificarCurso();
				break;
			case 4:
				eliminarCurso();
				break;
			case 5:
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Opcion incorrecta");
			}

		}

	}

	private void agregarCurso() throws IOException {
		Curso cursoNuevo = new Curso();

		System.out.println("Ingrese codigo de Facultad:");
		cursoNuevo.setCodFacultad(Integer.parseInt(entrada.readLine()));

		System.out.println("Ingrese Nro Curso:");
		cursoNuevo.setNroCurso(Integer.parseInt(entrada.readLine()));

		System.out.println("Ingrese Nombre de Materia:");
		cursoNuevo.setNombreMateria(entrada.readLine());

		System.out.println("Ingrese el dia (L, M, X, J, V):");
		cursoNuevo.setDia(entrada.readLine().charAt(0));

		System.out.println("Ingrese el turno (M=mañana, T=Tarde y N=Noche):");
		cursoNuevo.setTurno(entrada.readLine().charAt(0));

		System.out.println("Ingrese el nro de Aula:");
		cursoNuevo.setNroAula(Integer.parseInt(entrada.readLine()));

		System.out.println("Ingrese el estado de Curso (A=Activo, I=Inactivo, B=Baja):");
		cursoNuevo.setEstadoCurso(entrada.readLine().charAt(0));

		if (mapaCursos.containsKey(cursoNuevo.getCodFacultad())) {
			System.out.println("Curso existente, desea sobreescribir los datos (SI/NO)");
			String respuesta = entrada.readLine();
			if (respuesta.equalsIgnoreCase("NO")) {
				return;
			}
		}
		mapaCursos.put(cursoNuevo.getCodFacultad(), cursoNuevo);
		System.out.println("Curso agregado");

	}

	private void consultarCurso() {
		if (mapaCursos.isEmpty()) {
			System.out.println("El mapa no contiene cursos");
			return;
		}

		for (Integer codCurso : mapaCursos.keySet()) {
			Curso cur = mapaCursos.get(codCurso);
			System.out.println("Clave Curso: " + codCurso + ", Curso: " + cur.toString());
		}
		System.out.println("Cantidad de Cursos:" + mapaCursos.size());
	}

	private void modificarCurso() throws NumberFormatException, IOException {
		if (mapaCursos.isEmpty()) {
			System.out.println("El mapa no contiene cursos");
			return;
		}

		Integer codCurso;
		System.out.println("Ingrese la clave de curso a Modificar: ");
		codCurso = Integer.parseInt(entrada.readLine());
		
		Integer codFacu;
		System.out.println("Ingrese codigo de Facultad:");
		codFacu = Integer.parseInt(entrada.readLine());
		
		System.out.println("Ingrese Nro Curso: ");
		Integer nroCurso = Integer.parseInt(entrada.readLine());

		if (mapaCursos.containsKey(codCurso)) {
			
			Curso curActualizar = mapaCursos.get(codCurso);

			System.out.println("Curso a Modificar");
			System.out.println(curActualizar.toString());

			System.out.println("Ingrese el dia (L, M, X, J, V):");
			curActualizar.setDia(entrada.readLine().charAt(0));

			System.out.println("Ingrese el turno (M=mañana, T=Tarde y N=Noche):");
			curActualizar.setTurno(entrada.readLine().charAt(0));

			System.out.println("Ingrese el estado de Curso (A=Activo, I=Inactivo, B=Baja):");
			curActualizar.setEstadoCurso(entrada.readLine().charAt(0));

			mapaCursos.put(codCurso, curActualizar);
			System.out.println("Curso Modificado");
			
		}else {
			
			System.out.println("El codigo de Facultad que ingreso no existe!");
			
		}
	}

	private void eliminarCurso() throws NumberFormatException, IOException {

		if (mapaCursos.isEmpty()) {
			System.out.println("El mapa no contiene cursos");
			return;
		}

		// agregar los datos
		System.out.println("Ingrese la Clave de curso a eliminar:");
		Integer codCurso = Integer.parseInt(entrada.readLine());

		System.out.println("Ingrese Nro Curso");
		Integer nroCurso = Integer.parseInt(entrada.readLine());

		System.out.println("Ingrese el dia (L, M, X, J, V)");
		Character dia = entrada.readLine().charAt(0);

		System.out.println("Ingrese el turno (M=mañana, T=Tarde y N=Noche)");
		Character turno = entrada.readLine().charAt(0);

		if (mapaCursos.containsKey(codCurso)) { // validar si es diferente de Activo 'A'
			Curso curEliminado = mapaCursos.remove(codCurso);
			System.out.println("Curso Eliminado");
			System.out.println(curEliminado.toString());
		} else {
			System.out.println("El codigo de Curso no existe");
		}

	}

}
