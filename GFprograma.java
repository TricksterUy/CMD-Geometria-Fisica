import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.IOException;

public class GFprograma {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws IOException, InterruptedException {

		usuario();
				System.out.println(
				"\nEn el presente programa encontraras material teórico referente a definiciónes y propiedades de Geometría y Física, léelo con atención, es un material muy útil, luego,");
		System.out.println(
				"si gustas, podrás comprobar que tanto has aprendido, para ello contaras con un cuestionario de 12 preguntas relacionadas a lo estudiado con opciones de verdadero y falso.\n");

		System.out.println("\n\t\t\t\t\tA darle riendas sueltas al aprendizaje, animate y buena suerte!\n");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		int menuf;
		do {
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Elige una de las siguientes opciones para comenzar:");
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n1) Definiciones y propiedades.");
			System.out.println("2) Realizar cuestionario.");
			System.out.println("3) Salir del programa.\n");
			menuf = teclado.nextInt();

			switch (menuf) {

			case 1:
				int menu;
				do {
					ClearConsole();
					System.out.println(
							"----------------------------------------------------------------------------------------------------------------------");
					System.out.println("\nHas accedido al menú de definiciones y propiedades de Geometría y Física");
					System.out.println("Elige una de las siguientes opciones para comenzar:\n");
					System.out.println(
							"----------------------------------------------------------------------------------------------------------------------");
					System.out.println("\n1) Geometría");
					System.out.println("2) Física");
					System.out.println("3) Volver al menu principal\n");
					menu = teclado.nextInt();

					switch (menu) {

					// OPCION DEL MENU GEOMETRIA

					case 1:
						ClearConsole();
						geometria();
						ClearConsole();
						break;

					// OPCION DEL MENU FISICA
					case 2:
						ClearConsole();
						fisica();
						ClearConsole();
						break;

					// OPCION DEL VOLVER AL MENU PRINCIPAL
					case 3:
						System.out.println("Volvemos al menu principal");
						ClearConsole();
						break;

					default:
						System.out.println("No ingreso una opción valida.");
					}
				} while (menu != 3);
				break;

			// OPCION DEL MENU REALIZAR QUIZZ
			case 2:
				ClearConsole();
				cuestionario();
				break;

			case 3:
				System.out.println(
						"--------------------------------------------------------------------------------------");
				System.out.println("\nHasta la proxima " + usuario + ", vuelve pronto!!\n");
				System.out.println(
						"--------------------------------------------------------------------------------------");
				break;

			default:
				System.out.println("No ingreso una opción valida");

			}
		} while (menuf != 3);
	}

	private static String usuario;

	public static void usuario() {
		System.out.print("Bienvenido/a, antes de proceder, por favor escribe tu nombre para identificarte: ");
		String respuesta = teclado.nextLine();
		usuario = respuesta;

		System.out.println(
				"\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("\nHola " + usuario);
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH");
		String horaActual = formateador.format(LocalDateTime.now());
		int hora = Integer.valueOf(horaActual);

		if (hora <= 12 && hora > 00) {
			System.out.println(", buenos dias, bienvenido/a al programa de propiedades y definiciónes.\n");
		} else if (hora >= 13 && hora <= 20) {
			System.out.println(", buenas tardes, bienvenido/a al programa de propiedades y definiciónes.\n");
		} else if (hora >= 20 && hora <= 00) {
			System.out.println(", buenas noches, bienvenido/a al programa de propiedades y definiciónes.\n");
		}
	}

	public static void geometria() {
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n"+usuario + " has seleccionado el menú de Geometría");
		System.out.println(
				"Navega a través de las diferentes opciones del sub menú o vuelve al menú principal para cambiar de materia\n");
		int submenug;
		do {
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(
					"\n" + usuario + " elige una de las opciones del siguiente sub menu para ver su definición:\n");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n(1) Isometría");
			System.out.println("(2) Simetría axial");
			System.out.println("(3) Simetría central");
			System.out.println("(4) Simetría rotacional");
			System.out.println("(5) Simetría traslacional");
			System.out.println("(6) Simetría antitraslación");
			System.out.println("(7) Punto unido");
			System.out.println("(8) Figura unida");
			System.out.println("(9) Figura doble");
			System.out.println("(0) Volver al sub menú de definiciones y propiedades\n");
			submenug = teclado.nextInt();

			switch (submenug) {
			case 1:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(1) Definicion isometría\n");
				System.out.println(
						"La isometría es una característica que, en el ámbito de la geometría, significa que en dos espacios o figuras geométricas se conservan las mismas distancias entre\n"
								+ "los puntos que las conforman.En la isometría, para explicarlo de una forma más sencilla, decimos que dos figuras son isométricas cuando son similares o congruentes.\n"
								+ "Incluso, aunque puedan estar ubicadas en lugares distintos, hayan sido giradas o hayan rotado.\n");

				break;
			case 2:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(2) Definicion simetría axial\n");
				System.out.println(
						"La simetría axial es aquella situación donde todos los semiplanos que se toman desde una determinada mediatriz muestran las mismas características.\n"
								+ "En otras palabras, la asimetría axial es aquella que se muestra en torno a un eje. Esto, a diferencia de la simetría central, que es respecto a un punto.\n");
				break;
			case 3:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(3) Definicion simetría central\n");
				System.out.println(
						"La simetría central es la situación en la que existen puntos homólogos respecto al punto que se denomina centro de simetría.\n"
								+ "En la simetría, para explicarlo de otro modo, a cada punto le corresponde otro que se encuentra a la misma distancia del punto de simetría.\n");
				break;
			case 4:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(4) Definicion simetría rotacional\n");
				System.out.println(
						"Decimos que una figura plana tiene simetría rotacional cuando podemos encontrar un centro (llamado centro de rotación) de manera que si giramos la figura completa\n"
						+"un cierto ángulo (mayor o igual a 0º y menor que 360º), la figura rotada coincide con la figura original.\n"
						+"Cuando una figura tiene simetría rotacional, a cada punto le corresponden otro punto (que se llama \"punto rotado\" o \"imagen\") a la misma distancia del centro,\n"
						+"de forma que el ángulo que forman ambos con el centro de rotación es siempre el mismo. El número de veces que se puede hacer coincidir la imagen rotada con figura\n"
						+"original se llama orden de la rotación. Cualquier figura tiene al menos una simetría rotacional de orden 1 alrededor de cualquier punto que elijamos como centro,\n"
						+ "pues basta elegir como ángulo de rotación 0º (es decir, dejar la figura como está).\n");
				break;
			case 5:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(5) Definicion simetría traslacional\n");
				System.out.println(
						"Decimos simetría traslacional es la simetría que tiene una figura si se puede hacer que coincida exactamente en la original cuando se traslada una distancia dada\n"
						+ "en una dirección dada. La simetría de traslación sólo existe para patrones infinitos. Cuando se trabaja con un patrón finito, se entiende que la simetría de\n"
						+ "traslación sólo sería verdadera si el patrón fuera a continuar indefinidamente.\n"
						+ "También podemos decir, con otras palabras que es una simetría en la que un patrón particular o diseño se mueve de un lado a otro.\n"
						+ "O de forma aún más clara, es un tipo de simetría en el que un objeto cambia de lugar sin rotar o sin la reflexión. La misma imagen se encuentra en otro lugar,\n"
						+ "incluso la orientación de la imagen es la misma.\n");
				break;
			case 6:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(6) Definicion simetría antitraslación\n");
				System.out.println(
						"Es toda transformación del plano en sí mismo igual al producto de una simetría axial por una traslación paralela al eje de simetría;\n"
						+ "siendo el eje de la antitraslación, el de simetría, y la magnitud de la misma, la de la traslación.\n"
						+ "Por ello, la antitraslación es una transformación discorde por ser el producto de una transformación acorde, la traslación y una\n"
						+ "transformación discorde, la simetría axial.\n");
				break;
			case 7:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(7) Definicion de punto unido\n");
				System.out.println("Un punto unido es una isometría si se transforma en sí mismo.\n");
				break;
			case 8:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(8) Definicion Figura unida\n");
				System.out.println("Una figura es unida en una isometría si todos sus puntos son unidos.\n");
				break;
			case 9:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(9) Definicion Figura doble\n");
				System.out.println("Una figura es doble en una isometría si su imagen es ella misma.\n");
				break;
			case 0:
				System.out.println("\nVolvemos al menu principal");
				break;
			default:
				System.out.println("\nNo ingreso una opcion valida, intentelo nuevamente.");
			}
		} while (submenug != 0);
	}

	public static void fisica() {

		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n"+usuario + " has seleccionado el menú de Física\n");
		System.out.println(
				"Navega a través de las diferentes opciones del sub menú o vuelve al menú principal para cambiar de materia\n");
		int submenuf;
		do {
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n" + usuario + " elige una de las opciones del siguiente sub menu para proceder:\n");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n(1) Descripción y propiedades que definen a un vector");
			System.out.println("(2) Ejemplos de magnitudes vectoriales y escalares. Diferencias entre ellas");
			System.out.println("(3) Ley de Coulomb: descripción de magnitudes e hipótesis de su formulación");
			System.out.println("(4) Equilibrio entre 2 cargas eléctricas");
			System.out.println("(5) Características de las líneas de campo eléctrico");
			System.out.println("(0) Volver al sub menú de definiciones y propiedades\n");
			submenuf = teclado.nextInt();
			   int asciiValue = 94;

		        char convertedChar = (char)asciiValue;

			switch (submenuf) {
			case 1:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(1) Descripción y propiedades que definen a un Vector\n");
				System.out.println("Se le llama Vector a un segmento de recta en el espacio que parte de un punto hacia otro, es decir, tiene dirección y sentido.\n"
						+ "Las propiedades que definen a un Vector son las siguientes:\n"
						+ "\n*Modulo o Magnitud: Se refiere a la longitud o amplitud del vector o segmento de recta.\n"
						+ "\n*Dirección: Se refiere a la inclinación que posee el vector con respecto a un eje horizontal imaginario, con el cual forma un ángulo.\n"
						+ "\n*Sentido: Se refiere a la orientación del vector, indicado por la cabeza de la flecha del mismo.\n");
				break;
			case 2:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(2) Ejemplos de magnitudes vectoriales y escalares. Diferencias entre ellas\n");
				System.out.println("*Magnitud Escalar: es aquella que queda completamente determinada con un número y sus correspondientes unidades.\n"
						+ "Ejemplos: masa, volumen, temperatura, densidad, presión, energía, carga eléctrica.\n"
						+ "\n*Magnitud Vectorial: es aquella que, además de un valor numérico y sus unidades (módulo) debemos especificar su dirección y sentido.\n"
						+ "Ejemplos: aceleración, velocidad de desplazamiento, campo eléctrico, peso, fuerza de gravedad.\n"
						+ "\nLa elección de un escalar o un vector para representar una magnitud física depende de la naturaleza de la misma; si estamos\n"
						+ "describiendo la temperatura de una habitación, la densidad de un cuerpo, su masa... necesitaremos representarlas mediante un número.\n"
						+ "Por el contrario, cuando trabajemos con magnitudes como la fuerza, la velocidad, la aceleración, el campo eléctrico, etc.,\n"
						+ "emplearemos vectores.\n");
				break;
			case 3:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(3) Ley de Coulomb: descripción de magnitudes e hipótesis de su formulación\n");
				System.out.println("Magnitudes Relacionadas:\n"
						+ "\nF: Fuerza expresada en Newtons[N]\n"
						+ "q1 y q2: Cargas expresadas en Culombios[C]\n"
						+ "r: Distancia de separación entre las cargas expresada en metros[m]\n"
						+ "K: Constante: 9·10E9 Nm"+convertedChar+"2/C"+convertedChar+"2 para el aire o vacío.\n"
						+ "\n\nHipótesis de su formulación:\n"
						+ "\nLa magnitud de cada una de las fuerzas eléctricas con las que interactúan dos cargas puntuales en reposo es directamente proporcional\n"
						+ "al producto de la magnitud de ambas cargas e inversamente proporcional al cuadrado de la distancia que las separa y tiene la dirección\n"
						+ "de la línea que las une. La fuerza es de repulsión si las cargas son de igual signo, y de atracción si son de signo contrario.\n");
				break;
			case 4:		        
		        System.out.println();
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(4) Equilibrio entre 2 cargas eléctricas\n");
				System.out.println("Posiciones de equilibrio:\n"
						+ "\nLa posición de equilibrio entre dos cargas a una distancia x, es aquella en la que la fuerza de atracción o repulsión entre las cargas\n"
						+ "es igual a cero, es decir, la FN (Fuerza Neta) = 0.\n"
						+ "\n-----------------------------------------------------------------------------------------------"
						+ "\nRepresentación de 3 cargas alineadas (qA, qB y qC) a una distancia L\n"
						+ "\n|-------------L-------------|\r\n"
						+ "  ---o--------o--------o---\r\n"
						+ "     qA       qC       qB\r\n"
						+ "     |--(x-L)--|\r\n"
						+ "\n-----------------------------------------------------------------------------------------------"
						+ "\n\n¿Cómo los calculamos? Haciendo uso de las siguientes formulas:\r\n"
						+ "\n-----------------------------------------------------------------------------------------------"
						+ "\n(I)\n"
						+ "\n|qA|L"+convertedChar+"2  -2.L|qA|x + (|qA|-|qB|)x"+convertedChar+"2 = 0\r\n"
						+ "|--c---| |---b--|    |----a----|\r\n"
						+ "\n-----------------------------------------------------------------------------------------------"
						+ "\n(II)\n"
						+ "\nax"+convertedChar+"2+bx+c=0 --------> utilizamos la formula de Bhaskara\n"
						+ "\nx= -b ± √(b"+convertedChar+"2 -4.a.c)\r\n"
						+ "   -----------------\r\n"
						+ "          2.a\r\n"
						+ "\n-----------------------------------------------------------------------------------------------"
						+ "\n(III)\n"
						+ "\nSi ax"+convertedChar+"2=0, entonces --------> x = -c/b\n");
				break;
			case 5:
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n(5) Características de las líneas de campo eléctrico\n");
				System.out.println("\nLas características de las líneas de campo eléctrico son las siguientes:\n");
				System.out.println("*Las líneas parten de las cargas positivas y apuntan a las cargas negativas.\n"
						+ "*No se cruzan.\n"
						+ "*A mayor densidad de las líneas de campo eléctrico mayor es la intensidad del campo eléctrico E. \n"
						+ "*Pueden ser rectas o curvas.\r\n"
						+ "*Son tangenciales a los vectores del campo eléctrico.\n"
						+ "*El número de líneas es igual a la carga sobre la constante de permisividad, q/ℇ0.\n");
				break;
			case 0:
				System.out.println("\nVolvemos al menu principal");
				break;
			default:
				System.out.println("\nNo ingreso una opcion valida, intentelo nuevamente.");
			}
		} while (submenuf != 0);
	}

	public static void cuestionario() {

		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"\nEn el presente cuestionario, se te realizaran un total de 12 preguntas, deberas de responder Verdadero (1) o Falso (2), al finalizar, se te mostrara el puntaje obtenido.");
		System.out.println(
				"\nTambién tendrás como opción (en caso de haberte equivocado), verificar en cual pregunta estuviste flojo, así en un futuro, puedas animarte, a hacerla nuevamente y");
		System.out.println("mejorar las calificaciones obtenidas.\n");

		System.out.println("\n" + usuario + " elige una de las opciones del siguiente sub menu para proceder:\n");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n(1) Estoy listo/a, vamos a realizar el cuestionario");
		System.out.println("(0) Quiero estudiar un poco más, volver al menu principal\n");
		int submenuc = teclado.nextInt();
		switch (submenuc) {

		case 1:
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Excelente " + usuario
					+ "!! Has elegido realizar la prueba, recuerda que deberas de responder Verdadero (1) o Falso (2)");
			System.out.println("\nListos o no, ahi vamos!");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			// PREGUNTAS DEL CUESTIONARIO
			int puntos = 0;

			System.out.println("Pregunta 1:");
			System.out.println("Isometría; decimos que dos figuras son isométricas cuando son similares o congruentes. Incluso, aunque puedan estar ubicadas en lugares distintos,\n"
					+ "hayan sido giradas o hayan rotado");
			System.out.print("Verdadero (1) o Falso (2): ");
			int quizz1 = teclado.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			if (quizz1 == 1) {
				puntos++;
			}
			System.out.println("Pregunta 2:");
			System.out.println("Una figura es doble en una isometría si todos sus puntos son unidos.");
			System.out.print("Verdadero (1) o Falso (2): ");
			int quizz2 = teclado.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			if (quizz2 == 2) {
				puntos++;
			}
			System.out.println("Pregunta 3:");
			System.out.println("Para identificar una Magnitud Escalar o Vectorial dependerá de la naturaleza de la misma; si estamos describiendo la temperatura de una habitación,\n"
					+ "la densidad de un cuerpo, su masa, necesitaremos representarlas mediante un vector. Por el contrario, cuando trabajemos con magnitudes como la fuerza,\n"
					+ "la velocidad, la aceleración, el campo eléctrico, etc., dependerán de la determinación de un número.");
			System.out.print("\nVerdadero (1) o Falso (2): ");
			int quizz3 = teclado.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			if (quizz3 == 2) {
				puntos++;
			}
			System.out.println("Pregunta 4:");
			System.out.println("Decimos que simetría traslacional, es un tipo de simetría en el que un objeto cambia de lugar sin rotar o sin la reflexión. La misma imagen se encuentra\n"
					+ "en otro lugar, incluso la orientación de la imagen es la misma.");
			System.out.print("\nVerdadero (1) o Falso (2): ");
			int quizz4 = teclado.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			if (quizz4 == 1) {
				puntos++;
			}
			System.out.println("Pregunta 5:");
			System.out.println("La hipótesis de la Ley de Coulomb dice que….\n"
					+ "La magnitud de cada una de las fuerzas eléctricas con las que interactúan dos cargas puntuales en reposo es directamente proporcional al producto de la magnitud\n"
					+ "de ambas cargas e inversamente proporcional de la distancia que las separa y tiene la dirección de la línea que las une. La fuerza es de atracción si las cargas son\n"
					+ "de igual signo, y de repulsión si son de signo contrario.");
			System.out.print("\nVerdadero (1) o Falso (2): ");
			int quizz5 = teclado.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			if (quizz5 == 2) {
				puntos++;
			}
			System.out.println("Pregunta 6:");
			System.out.println("La simetría central es aquella situación donde todos los semiplanos que se toman desde una determinada mediatriz muestran las mismas características.");
			System.out.print("\nVerdadero (1) o Falso (2): ");
			int quizz6 = teclado.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			if (quizz6 == 2) {
				puntos++;
			}
			System.out.println("Pregunta 7:");
			System.out.println("Decimos que una figura plana tiene simetría rotacional cuando podemos encontrar un centro (llamado centro de rotación) de manera que si giramos la figura\n"
					+ "completa un cierto ángulo (mayor o igual a 0º y menor que 360º), la figura rotada coincide con la figura original.");
			System.out.print("\nVerdadero (1) o Falso (2): ");
			int quizz7 = teclado.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			if (quizz7 == 1) {
				puntos++;
			}
			System.out.println("Pregunta 8:");
			System.out.println("Decimos que la simetría antitraslación, es toda transformación del plano en sí mismo igual al producto de una simetría axial por una traslación\n"
					+ "paralela al eje de simetría; siendo el eje de la antitraslación, el de simetría, y la magnitud de la misma, la de la traslación.");
			System.out.print("\nVerdadero (1) o Falso (2): ");
			int quizz8 = teclado.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			if (quizz8 == 1) {
				puntos++;
			}
			System.out.println("Pregunta 9:");
			System.out.println("La Fuerza Neta de dos cargas en equilibrio es igual a cero.");
			System.out.print("\nVerdadero (1) o Falso (2): ");
			int quizz9 = teclado.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			if (quizz9 == 1) {
				puntos++;
			}
			System.out.println("Pregunta 10:");
			System.out.println("Un punto unido es una isometría si se transforma en sí mismo.");
			System.out.print("\nVerdadero (1) o Falso (2): ");
			int quizz10 = teclado.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			if (quizz10 == 1) {
				puntos++;
			}
			System.out.println("Pregunta 11:");
			System.out.println("Según la definición de un Vector, podemos decir que no es necesario que tenga dirección y sentido.");
			System.out.print("\nVerdadero (1) o Falso (2): ");
			int quizz11 = teclado.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			if (quizz11 == 2) {
				puntos++;
			}
			System.out.println("Pregunta 12:");
			System.out.println("Algunas características de las líneas de campo eléctrico son que las líneas del campo eléctrico son tangenciales a los vectores, no se cruzan y parten\n"
					+ " de la carga positiva y apuntan hacia la carga negativa");
			System.out.print("\nVerdadero (1) o Falso (2): ");
			int quizz12 = teclado.nextInt();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
			if (quizz12 == 1) {
				puntos++;
			}

			// NOTAS DEL CUESTIONARIO Y ESCALA DEL PUNTAJE

			if (puntos <= 5) {
				System.out.println(usuario + " su puntaje final es de: " + puntos
						+ "/12, no te ha ido tan bien, se recomienda estudiar nuevamente el material teórico y luego anímate a volver a realizar el cuestionario..");
			}
			if (puntos >= 6 && puntos <= 8) {
				System.out.println(usuario + " su puntaje final es de: " + puntos
						+ "/12, no estuviste tan mal, revisa los errores que tuviste, repasa el material y anímate a volver a realizar el cuestionario.");
			}

			if (puntos >= 9 && puntos <= 11) {
				System.out.println(usuario + " su puntaje final es de: " + puntos
						+ "/12, has tenido un buen puntaje, si quieres mejorarlo aun más, revisa los errores que tuviste, repasa el material y anímate a volver a realizar el cuestionario.");
			}
			if (puntos == 12) {
				System.out.println(usuario + " su puntaje final es de: " + puntos
						+ "/12, has tenido un puntaje excelente, felicidades.");
			}

			System.out.println(
					"\n--------------------------------------------------------------------------------------------------------");

			System.out.print(usuario + " deseas ver en que perguntas tuviste errores?? Si (1) No (2): ");
			int error = teclado.nextInt();
			System.out.println(
					"---------------------------------------------------------------------------------------------------------");

			if (error == 1) {

				System.out.println("\nA continuación, se imprimirán las preguntas donde se registraron errores\n");

				// CORRECCION DE PREGUNTAS INCORRECTAS

				if (puntos == 12) {
					System.out.println(
							"Que haces aquí? No tuviste error alguno, respondiste 12/12 correctamente, felicidades!!!");
				}
				if (quizz1 == 2) {
					System.out.println("Pregunta n° 1, la respuesta correcta era \"Verdadero\" ");
				}
				if (quizz2 == 1) {
					System.out.println("Pregunta n° 2, la respuesta correcta era \"Falso\" ");
				}
				if (quizz3 == 1) {
					System.out.println("Pregunta n° 3, la respuesta correcta era \"Falso\" ");
				}
				if (quizz4 == 2) {
					System.out.println("Pregunta n° 4, la respuesta correcta era \"Verdadero\" ");
				}
				if (quizz5 == 1) {
					System.out.println("Pregunta n° 5, la respuesta correcta era \"Falso\" ");
				}
				if (quizz6 == 1) {
					System.out.println("Pregunta n° 6, la respuesta correcta era \"Falso\" ");
				}
				if (quizz7 == 2) {
					System.out.println("Pregunta n° 7, la respuesta correcta era \"Verdadero\" ");
				}
				if (quizz8 == 2) {
					System.out.println("Pregunta n° 8, la respuesta correcta era \"Verdadero\" ");
				}
				if (quizz9 == 2) {
					System.out.println("Pregunta n° 9, la respuesta correcta era \"Verdadero\" ");
				}
				if (quizz10 == 2) {
					System.out.println("Pregunta n° 10, la respuesta correcta era \"Verdadero\" ");
				}
				if (quizz11 == 1) {
					System.out.println("Pregunta n° 11, la respuesta correcta era \"Falso\" ");
				}
				if (quizz12 == 2) {
					System.out.println("Pregunta n° 12, la respuesta correcta era \"Verdadero\" ");
				}
				System.out.println(
						"---------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\nEso es todo " + usuario
						+ ", esperamos que el cuestionario haya resultado de tu agrado, gracias por realizarlo, seras devuelto al menu principal\n");
				System.out.println(
						"---------------------------------------------------------------------------------------------------------------------------------------------");
			} else {
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(
						"\nNada que ver por aquí, esperamos que el cuestionario haya resultado de tu agrado, gracias por realizarlo, vuelve pronto, seras devuelto al menu principal\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			}
			break;
		case 0:
			System.out.println("\nVolvemos al menu principal");
			break;
		default:
			System.out.println("\nNo ingreso una opcion valida, intentelo nuevamente.");

		}
	}

	public static void ClearConsole(String... arg) throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}

}