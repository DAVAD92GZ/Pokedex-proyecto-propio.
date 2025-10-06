package Herencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Blastoise blastoise = new Blastoise(83, 79, 78, "waterSpout", "hydro pume");
        Charizard charizard = new Charizard(84, 78, 100, "ember", "Sacred Fire");
        Hatterene hatterene = new Hatterene(40,69,70, "moonBlast", "magic powder");
        Snivy snivy = new Snivy(78, 70, 70,"frenzy plant","ciclon de hojas");       
        Pikachu pikachu = new Pikachu(80,72,92, " cola de hierro", "bolt strike"); 

        List<AjustableStats> pokemons = new ArrayList<>();
        pokemons.add(blastoise);
        pokemons.add(charizard);
        pokemons.add(hatterene);
        pokemons.add(snivy);
        pokemons.add(pikachu);

        boolean running = true;
        while (running) {
            mostrarMenu();
            int op = leerEntero("Elige una opción: ");
            switch (op) {
                case 1:
                    mostrarStatsDeTodos(pokemons);
                    break;
                case 2:
                    modificarStatsDeUnPokemon(pokemons);
                    break;
                case 0:
                    running = false;
                    System.out.println("Se cerro el programa =(");
                    break;
                default:
                    System.out.println("seleciona otra opcion");
            }
        }

        input.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n POKEDEX");
        System.out.println("Seleciona una de las siguientes opciones:");
        System.out.println("1) Ver stats de todos los Pokémon");
        System.out.println("2) Modificar stats de un Pokémon en especifico");
        System.out.println("0) Salir");
    }

    private static void mostrarStatsDeTodos(List<AjustableStats> lista) {
        System.out.println("\n Stats iniciales");
        for (int i = 0; i < lista.size(); i++) {
            AjustableStats p = lista.get(i);
            System.out.println("[" + i + "] " + nombreDe(p) + " (Tipo: " + tipoDe(p) + ")");
            p.verStats();
            System.out.println();
        }
    }

    private static void modificarStatsDeUnPokemon(List<AjustableStats> lista) {
        if (lista.isEmpty()) {
            System.out.println("selciona un pokemon parar podificar.");
            return;
        }

        System.out.println("\nSeleciona un pokemon que quieres modificar");
        for (int i = 0; i < lista.size(); i++) {
            AjustableStats p = lista.get(i);
            System.out.println("[" + i + "] " + nombreDe(p) + " (Tipo: " + tipoDe(p) + ")");
        }

        int idx = leerEntero("Número: ");
        if (idx < 0 || idx >= lista.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        AjustableStats elegido = lista.get(idx);
        System.out.println("\n elegiste: " + nombreDe(elegido) + " (Tipo: " + tipoDe(elegido) + ")");
        elegido.verStats();
        verLimsSiSePuede(elegido);

        boolean editar = true;
        while (editar) {
            System.out.println("\n que deseas modificar de las stats iniciales del pokemon.");
            System.out.println("1) Vida");
            System.out.println("2) Daño");
            System.out.println("3) Velocidad");
            System.out.println("4) Ver stats actuales");
            System.out.println("5) Ver límites");
            System.out.println("0) Volver");

            int op = leerEntero("Opcion: ");
            switch (op) {
                case 1: {
                    int nv = leerEntero("Nueva vida: ");
                    if (elegido.setVidaLim(nv)) {
                        System.out.println("Se actualizo la vida a: " + ((Pokemones)elegido).getVida());
                    } else {
                        System.out.println("Es demasiado alto el valor, el pokemon explotaria con este valor.");
                        verLimsSiSePuede(elegido);
                    }
                    break;
                }
                case 2: {
                    int nd = leerEntero("Nuevo daño: ");
                    if (elegido.setDanoLim(nd)) {
                        System.out.println("Se ha actualizado el daño a: " + ((Pokemones)elegido).getDano());
                    } else {
                        System.out.println("Es demasiado alto el valor, el pokemon mataria a todos con ese daño.");
                        verLimsSiSePuede(elegido);
                    }
                    break;
                }
                case 3: {
                    int nvel = leerEntero("Nueva velocidad: ");
                    if (elegido.setVelocidadLim(nvel)) {
                        System.out.println("Velocidad se actualizo a: " + ((Pokemones)elegido).getVelocidad());
                    } else {
                        System.out.println("Es demasiado alto el valor, el pokemon romperia la velocidad de la luz, con esa velocidad.");
                        verLimsSiSePuede(elegido);
                    }
                    break;
                }
                case 4:
                    elegido.verStats();
                    break;
                case 5:
                    verLimsSiSePuede(elegido);
                    break;
                case 0:
                    editar = false;
                    break;
                default:
                    System.out.println("Opcion no es correcta, vuelve a elegir.");
            }
        }
    }

    private static int leerEntero(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String line = input.nextLine().trim();
                if (line.isEmpty()) {
                    line = input.nextLine().trim();
                }
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("seleciona otro");
            }
        }
    }

    private static String nombreDe(Object o) {
        return o.getClass().getSimpleName();
    }

    private static String tipoDe(Object p) {
        if (p instanceof Agua) {
        	return "Agua";
        }
        if (p instanceof Fuego) {
        	return "Fuego";
        }
        if (p instanceof Hada) {
        	return "Hada";
        }
        if (p instanceof Planta) {
        	return "Planta";
        }
        if (p instanceof Electrico) {
        	return "Electrico";
        }
        return "Desconocido";
    }

    private static void verLimsSiSePuede(AjustableStats p) {
        if (p instanceof Pokemones) {
            ((Pokemones) p).verLims();
        } else {
            System.out.println("fuera de los stats limite del pokemon.");
        }
    }
}
