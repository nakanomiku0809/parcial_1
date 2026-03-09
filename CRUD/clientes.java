import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public static void crearCliente(Cliente cliente) 
throws IOException {
    FileWriter fw = new FileWriter("clientes.csv", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(cliente.toString());
    bw.newLine();
    bw.close();
}

public static List<cliente> leerCliente() throws IOException {
    List<cliente> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("clientes.csv"));
    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Cliente(Integer.parseInt(datos[0]),datos[1],datos[2]));
    }
    sc.close();
    return lista;
}