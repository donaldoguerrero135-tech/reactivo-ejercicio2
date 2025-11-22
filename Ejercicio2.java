
import reactor.core.publisher.Flux;

public class Ejercicio2 {
    public static void main(String[] args) throws InterruptedException {

        Flux<Integer> flujo = Flux
                .range(1, 10)              // Genera una lista de números del 1 al 10
                .filter(n -> n % 2 == 0)   // Filtra los números pares
                .map(n -> n * 2);          // Multiplica los números filtrados por 2

        flujo.subscribe(
                valor -> System.out.println("Valor recibido: " + valor),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Flujo completado.")
        );

        // Pausa breve para permitir ver la salida asíncrona (no siempre necesaria, pero útil en ejemplos)
        Thread.sleep(1000);
    }
}
