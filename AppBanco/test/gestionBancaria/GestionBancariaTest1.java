package gestionBancaria;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

public class GestionBancariaTest1 {

    @Test
    public void testMainFlujoCompleto() {
        // 1. Simular la entrada del teclado 
        String inputSimulado = "4\nCarlos Gomez\n1\n150\n3\n5\n";
        
        // Redirigimos el System.in para que lea nuestro String en lugar del teclado real
        InputStream entradaOriginal = System.in;
        System.setIn(new ByteArrayInputStream(inputSimulado.getBytes()));

        // 2. Capturar las salidas de la consola
        PrintStream salidaOriginal = System.out;
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaCapturada));

        try {
            // 3. Ejecutar el método main del programa
            String[] args = {};
            GestionBancaria.main(args);
            
            // Convertimos toda la ráfaga de texto que imprimió tu menú a un String legible
            String resultadoConsola = salidaCapturada.toString();

            // 4. Verificaciones 
            assertTrue("Debería mostrar el cambio de nombre del titular", 
                    resultadoConsola.contains("Nombre Titular: Carlos Gomez"));
            
            assertTrue("Debería mostrar el mensaje de salida", 
                    resultadoConsola.contains("Saliendo del sistema..."));
            
        } finally {
            // 5. Restaurar la consola original del sistema
            System.setIn(entradaOriginal);
            System.setOut(salidaOriginal);
        }
    }
}