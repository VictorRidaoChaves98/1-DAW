import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Jedi> jedis = new ArrayList<>();
        List<Sith> siths = new ArrayList<>();
        List<Nave> naves = new ArrayList<>();
        List<Planeta> planetas = new ArrayList<>();
        List<Droide> droides = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n🌟 STAR WADS MENU 🌟");
            System.out.println("1. Prepararse antes de la batalla");
            System.out.println("2. Comenzar batalla Jedis vs Siths");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    // Añadir Jedis
                    jedis.add(new Jedi("Luke Skywalker", 5, 3));
                    jedis.add(new Jedi("Obi-Wan Kenobi", 4, 2));
                    jedis.add(new Jedi("Yoda", 6, 3));

                    // Añadir Siths
                    siths.add(new Sith("Darth Vader", 3, 3));
                    siths.add(new Sith("Darth Sidious", 4, 3));
                    siths.add(new Sith("Darth Maul", 4, 2));

                    // Añadir Planetas
                    planetas.add(new Planeta("Tatooine", 3));
                    planetas.add(new Planeta("Coruscant", 4));
                    planetas.add(new Planeta("Mustafar", 5));

                    // Añadir Naves
                    naves.add(new Nave("X-Wing", 500, List.of("Luke")));
                    naves.add(new Nave("Halcón Milenario", 450, List.of("Han", "Chewbacca")));
                    naves.add(new Nave("A-Wing", 520, List.of("Leia")));

                    // Añadir Droides
                    droides.add(new Droide("R2-D2"));
                    droides.add(new Droide("C-3PO"));
                    droides.add(new Droide("BB-8"));

                    System.out.println("✅ Preparación completada.");
                    System.out.println("Jedis preparados:");
                    jedis.forEach(j -> System.out.println("- " + j.getNombre()));
                    System.out.println("Siths preparados:");
                    siths.forEach(s -> System.out.println("- " + s.getNombre()));
                    System.out.println("Planetas existentes:");
                    planetas.forEach(p -> System.out.println("- " + p));
                    System.out.println("Naves disponibles:");
                    naves.forEach(n -> System.out.println("- " + n));
                    System.out.println("Droides listos:");
                    droides.forEach(d -> System.out.println("- " + d));
                }

                case 2 -> {
                    if (jedis.isEmpty() || siths.isEmpty()) {
                        System.out.println("⚠️ Debes prepararte antes de iniciar la batalla.");
                        break;
                    }

                    int ronda = 1;
                    int iJedi = 0, iSith = 0;

                    while (iJedi < jedis.size() && iSith < siths.size()) {
                        Jedi jedi = jedis.get(iJedi);
                        Sith sith = siths.get(iSith);

                        System.out.println("\nRonda " + ronda);
                        System.out.println("**************");
                        System.out.println(jedi + " VS " + sith);

                        // Turno Jedi
                        jedi.luchar(sith);
                        if (sith.getSalud() <= 0) {
                            iSith++;
                            continue;
                        }

                        // Turno Sith
                        sith.luchar(jedi);
                        if (jedi.getSalud() <= 0) {
                            iJedi++;
                        }

                        ronda++;
                    }

                    System.out.println("\n🏁 Batalla finalizada.");
                    if (iJedi >= jedis.size()) {
                        System.out.println("❌ Los Jedis han sido derrotados. El Imperio gana.");
                    } else {
                        System.out.println("✅ ¡La Resistencia Jedi ha triunfado!");
                    }
                }

                case 3 -> System.out.println("👋 Que la fuerza te acompañe...");

                default -> System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}
