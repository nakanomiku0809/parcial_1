lista<proMas>productosMas
ventasTotC(){
    leerPedidos()
    leerPrductos()
    leerCliente()
    leerCliente.get([2]);
}

public static int vendedorMF()throws IOException{
    leerPedidos()
    leerPrductos()
    leerVendedores()
    int tot,vende;
    vende=productos[0].getvendedor_id();
    tot=productos[0].getprecio()*pedidos[0].getcantidad();
    for(i,i<long(productos);i++)
    if(productos[i].getprecio()*pedidos[i].getcantidad()<productos[i+1].getprecio()*pedidos[i+1].getcantidad()){
        tot=productos[i+1].getprecio()*pedidos[i+1].getcantidad()
        vende=productos[i+1].getvendedor_id();
    }
    return System.out.println(vendedores.getnombre(vende)),System.out.println(tot);
}

public static String buscarProd()throws IOException{
    Scanner read = new Scanner();
    String categoria
    System.out.println("ingrese categoria");
    categoria=read.nextLine;

}

public static String GenerarRe()throws IOException{
    crearReporte()
}