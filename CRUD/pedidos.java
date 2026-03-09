import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public static void crearPedidos(Pedido pedido) 
throws IOException {
    FileWriter fw = new FileWriter("pedidos.csv", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(pedido.toString());
    bw.newLine();
    bw.close();
}

public static List<pedidos> leerPedidos() throws IOException {
    List<pedido> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("pedidos.csv"));
    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Pedido(Integer.parseInt(datos[0]),datos[1],datos[2],datos[3],datos[4],datos[5]));
    }
    sc.close();
    return lista;
}