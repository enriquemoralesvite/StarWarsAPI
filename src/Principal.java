import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Escribe el numero de la pelicula que quieres buscar: ");
        try{
            var numeroDePelicula = Integer.valueOf(lectura.nextInt());
            Pelicula pelicula= consulta.buscaPelicula(numeroDePelicula);
            System.out.println(pelicula);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(pelicula);
        } catch (InputMismatchException e){
            System.out.println("Número no encontrado o no válido. Entrada invalida: "+ lectura.next());
            System.out.println("Fin del programa");

        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Fin del programa");
        }


    }
}
