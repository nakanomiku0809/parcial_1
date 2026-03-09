import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public static void crearReporte(Reporte reporte) 
throws IOException {
    FileWriter fw = new FileWriter("reporte_vendedores.csv", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(reporte.toString());
    bw.newLine();
    bw.close();
}

public static List<reporte> leerReporte() throws IOException {
    List<reporte> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("reporte_vendedores.csv"));
    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Reporte(datos[0],Integer.parseInt(datos[1]),Integer.parseInt(datos[2])));
    }
    sc.close();
    return lista;
}

public class Reporte {
    private String vendedor;
    private int total_ventas;
    private int productos_vendidos;

    public Reporte(String vendedor, int total_ventas, int productos_vendidos) {
        this.vendedor = vendedor.getnombre();
        this.total_ventas = pedidos.getcantidad()*productos.getprecio;
        this.productos_vendidos = pedidos.getcantidad();
    }

    @Override
    public String toString() {
        return id + "," + nombre + "," + email;
    }
}