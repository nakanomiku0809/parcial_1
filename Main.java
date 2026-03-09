
int op=0;
Scanner sc = new Scanner(System.in);
System.out.println(1. Mostrar los 3 productos más vendidos);
System.out.println(2. Mostrar el vendedor con mayor facturación);
System.out.println(3. Mostrar las ventas totales por ciudad de clientes));
System.out.println(4. Buscar productos por categoría ordenados por precio);
System.out.println(5. Generar reporte de ventas por vendedor);
System.out.println(6. Salir);
op=sc.nextInt();
switch(op){
    case 1:
        productosMas()
        break;
    case 2:
        vendedorMF()
        break;
    case 3:
        ventasTotC()
        break;
    case 4:
        buscarProd()
        break;
    case 5:
        crearReporte()
        break;
    case 6:
        break;
}