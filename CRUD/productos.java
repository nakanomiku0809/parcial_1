import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public static void crearProducto(Producto producto) 
throws IOException {
    FileWriter fw = new FileWriter("productos.csv", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(producto.toString());
    bw.newLine();
    bw.close();
}

public static List<producto> leerPrductos() throws IOException {
    List<producto> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("productos.csv"));
    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Producto(Integer.parseInt(datos[0]),datos[1],datos[2],datos[3],datos[4],datos[5]));
    }
    sc.close();
    return lista;
}