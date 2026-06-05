package ejercicio2;

import java.util.List;

public class prueba {

    public static void main(String[] args) {

        empresa empresa = new empresa("santi S.A.");

        categoria cat1 = new categoria("principiatne",   150000);
        categoria cat2 = new categoria("maquina",   250000);
        categoria cat3 = new categoria("genio",  350000);

        empresa.agregarCategoria(cat1);
        empresa.agregarCategoria(cat2);
        empresa.agregarCategoria(cat3);

        domicilio dom1 = new domicilio("Juan B Justo",      1234);
        domicilio dom2 = new domicilio("Napoles", 567);
        domicilio dom3 = new domicilio("Rivadavia",       890);
        domicilio dom4 = new domicilio("Belgrano",        321);
        domicilio dom5 = new domicilio("Tucumán",         44);

        chofer ch1 = new chofer("Carlos Pérez",   cat1, dom1);
        chofer ch2 = new chofer("Ana García",     cat2, dom2);
        chofer ch3 = new chofer("Luis Rodríguez", cat2, dom3);
        chofer ch4 = new chofer("María López",    cat3, dom4);
        chofer ch5 = new chofer("Jorge Díaz",     cat1, dom5);

        empresa.agregarChofer(ch1);
        empresa.agregarChofer(ch2);
        empresa.agregarChofer(ch3);
        empresa.agregarChofer(ch4);
        empresa.agregarChofer(ch5);
        colectivo col1 = new colectivo("Mercedes Benz 1");
        colectivo col2 = new colectivo("Mercedes Benz 2");
        colectivo col3 = new colectivo("Mercedes Benz 2");
        empresa.agregarColectivo(col1);
        empresa.agregarColectivo(col2);
        empresa.agregarColectivo(col3);
        
        ch1.asignarColectivo(col1);
        ch2.asignarColectivo(col2);
        ch4.asignarColectivo(col3);


        System.out.println("DESVINCULANDO COLECTIVO DE ANA GARCÍA");
        ch2.desvincularColectivo();
        System.out.println(ch2);

        separator("Choferes sin colectivo");
        System.out.println("Total: " + empresa.cantidadChoferesSinColectivo());

        separator("Total de colectivos en la empresa");
        System.out.println("Total: " + empresa.cantidadColectivos());

        separator(" Choferes de categoría 'genio'");
        List<chofer> seniorList = empresa.choferesPorCategoria("genio");
        if (seniorList.isEmpty()) {
            System.out.println("No hay choferes en esa categoría.");
        } else {
            for (chofer c : seniorList)
                System.out.println("  → " + c.getNombre());
        }

        separator("Categorías con sueldo > $200.000");
        List<categoria> catsFiltradas = empresa.categoriasSueldoSuperiorA(200000);
        for (categoria cat : catsFiltradas)
            System.out.println("  → " + cat);

        separator("choferes con sueldo > $200.000");
        List<chofer> choferesFiltrados = empresa.choferesSueldoSuperiorA(200000);
        for (chofer c : choferesFiltrados)
            System.out.println("  → " + c.getNombre() + " (" + c.getCategoria().getNombreCategoria() + ")");

        separator("REASIGNANDO COLECTIVO COL2 A ANA GARCÍA");
        ch2.asignarColectivo(col2);
        System.out.println(ch2);
    }

    private static void separator(String title) {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("  " + title);
        System.out.println("╚══════════════════════════════════════════╝");
    }
}