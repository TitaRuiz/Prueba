package com.example.prueba;

import com.example.prueba.modelo.Producto;
import com.example.prueba.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

@SpringBootApplication
public class PruebaApplication implements CommandLineRunner {
    @Autowired
    private IProductoServicio servicio;

    public static void main(String[] args) {
        SpringApplication.run(PruebaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        List<Producto> productos = servicio.listar();
//        System.out.println(productos.size());
//        System.out.println(productos);

        //Obtener todos los registros y todos los campos de la tabla de productos
//        productos.stream().forEach(System.out::println);
        //-- Obtenerr una consulta con Productid, productname, supplierid, categoryId, UnistsinStock, UnitPrice
//        productos.stream()
//                        .map(p -> p.getId() + " " + p.getNombre() + " " + p.getProveedor()+" "+ p.getCategoriaId() + p.getUnidadesExistencia() + p.getPrecioUnitario())
//                                .forEach(System.out::println);
        //Obtener una consulta con Productid, productname y valor del inventario, valor inventrio (UnitsinStock * UnitPrice)
//        productos.stream()
//                .filter(p -> p.getPrecioUnitario()!=null)
//                        .map(p -> p.getId() + " " + p.getNombre() + " " + p.getUnidadesExistencia()*p.getPrecioUnitario())
//                                .forEach(System.out::println);
//        // Cuanto vale el punto de reorden
//        productos.stream()
//                        .filter(p -> p.getUnidadesOrdenar()!=null);



        System.out.println("----------------Filtros----------------");
//        servicio.filtrarTexto("A").forEach(System.out::println);
//        servicio.toda().forEach(System.out::println);
        servicio.agrupacionPromedio().forEach(System.out::println);
//          servicio.proyeccion().forEach(System.out::println);
//        System.out.println(servicio.agregacion());
//        Filtro de product
//        productos.stream().filter(p -> p.getId()>10).forEach(System.out::println);
//        productos.stream()
//                .filter(p -> p.getPrecioUnitario() != null)
//                .filter(p -> p.getPrecioUnitario() > 20)
//                .forEach(System.out::println);
//        productos.stream()
//                .filter(p -> p.getNombre().startsWith("A"))
//                        .forEach(System.out::println);
//        productos.stream()
//                .filter(p -> p.getNombre().contains("s"))
//                .sorted((o1, o2) -> o1.getNombre(). > o2.getNombre());
//        productos.stream().filter(p -> p.getNombre().contains("Chai")).forEach(System.out::println);
//        productos.stream()
//                .sorted((o1, o2) -> o2.getId() - o1.getId())
//                .forEach(System.out::println);
//        productos.stream()
//                .sorted(Comparator.comparing(Producto::getNombre) )
//                .forEach(System.out::println);

        //Ordenarlo por precio
//        productos.stream()
//                .filter(p -> p.getPrecioUnitario()!=null)
//                .sorted(Comparator.comparing(Producto::getPrecioUnitario).reversed())
//                .forEach(System.out::println);
//        double precioMaximo = productos.stream()
//                .filter(p -> p.getPrecioUnitario()!=null)
//                .mapToDouble(Producto::getPrecioUnitario)
//                .max()
//                .orElse(0);
//        System.out.println(precioMaximo);
//        double precioMinimo = productos.stream()
//                .filter(p -> p.getPrecioUnitario()!=null)
//                .mapToDouble(Producto::getPrecioUnitario)
//                .min()
//                .orElse(0);
//        System.out.println(precioMinimo);
//
//        double cantidadMaxima = productos.stream()
//                .filter(p -> p.getUnidadesEsistencia()!=null)
//                .mapToDouble(Producto::getUnidadesEsistencia)
//                .max()
//                .orElse(0);
//        System.out.println(cantidadMaxima);
//        double precioPromedio =
//                productos.stream()
//                        .filter(p -> p.getPrecioUnitario() != null)
//                        .mapToDouble(Producto::getPrecioUnitario)
//                        .average()
//                        .orElse(0);
//        System.out.println(precioPromedio);
//        System.out.println("Maximo---registro");
//        Producto maximoPrecio = productos.stream()
//                .filter(p -> p.getPrecioUnitario()!=null)
//                .max(Comparator.comparing(Producto::getPrecioUnitario))
//                .orElse(new Producto());
//        System.out.println(maximoPrecio.toString());
//        Producto minimoPrecio = productos.stream()
//                .filter(p -> p.getPrecioUnitario()!=null)
//                .min(Comparator.comparing(Producto::getPrecioUnitario))
//                .orElse(new Producto());
//        System.out.println(minimoPrecio.toString());
//        System.out.println(productos.stream()
//                .filter(p -> p.getPrecioUnitario() != null)
//                .mapToDouble(Producto::getPrecioUnitario)
//                .summaryStatistics());
//        DoubleSummaryStatistics estadisticas = productos.stream()
//                .filter(p -> p.getPrecioUnitario() != null)
//                .mapToDouble(Producto::getPrecioUnitario)
//                .summaryStatistics();
//        System.out.println(estadisticas.getCount());
//        System.out.println(estadisticas.getMax());
//        System.out.println(estadisticas.getMax());
//        System.out.println(estadisticas.getAverage());


//                productos.stream()
//                        .mapToInt(Producto::getCategoriaId)
//                        .distinct()
//                        .forEach(System.out::println);

//        System.out.println(productos.stream()
//                .filter(producto -> producto.getCategoriaId()!=null && producto.getCategoriaId()==1)
//                .count());
//        //Ayudan a la paginación
//        productos.stream()
//                .skip(70)
//                .limit(5)
//                .forEach(System.out::println);

//        boolean almenosUno = productos.stream()
//                .anyMatch(p->p.getCategoriaId()==null);
//        System.out.println(almenosUno);
        //map es utiliza una función entra lo que sea y sale lo que sea
        //Entra un paametro en este caso el producto y sale un valor
//            productos.stream()
//                    .filter(p -> p.getPrecioUnitario()!=null)
//                    .map(p->{
//                        p.setPrecioUnitario(p.getPrecioUnitario()*1.1);
//                        return p.getId()+"_"+p.getNombre()+"-"+p.getPrecioUnitario(); //podemos devolver lo que se quiera
//                        //el propio objeto p, un string o cualquier otro atributo de la clase
//                    })
//                    .forEach(System.out::println);
            //Flatmap cambia en el aspecto que devuelve un stream en el que pueden contener varios elementos
//            productos.stream()
//                    .filter(p -> p.getPrecioUnitario()!=null)
//                    .flatMap(p->{
//                        p.setPrecioUnitario(p.getPrecioUnitario()*1.1);
//                        return Stream.of(
//                                p.getId(),p.getNombre(),p.getPrecioUnitario()); //podemos devolver lo que se quiera
//                        //el propio objeto p, un string o cualquier otro atributo de la clase
//                    })
//                    .forEach(System.out::println);
//        List<Producto> nuevaLista = productos.stream()
//                .filter(p -> p.getPrecioUnitario()!=null)
//                .peek(System.out::println)
//                .filter(p -> p.getPrecioUnitario()>200)
//                .peek(System.out::println)
//                .collect(Collectors.toList());
//
//        System.out.println(nuevaLista);
//        Map<Short,List<Producto>> resultadoGroupBy = productos.stream()
//                .filter(p -> p.getPrecioUnitario()!=null)
//                .collect(Collectors.groupingBy(Producto::getCategoriaId));
//        System.out.println(resultadoGroupBy);

//        double suma =DoubleStream.of(1.0,4.0,9.0)
//                .map(Math::sqrt)
//                .peek(System.out::println)
//                .sum();
//        System.out.println("resultado suma->"+suma);
//
//
//
//        // Consulta: Productid, productname y valor del inventario (UnitsinStock * UnitPrice)
//        List<String> consulta1 = productos.stream()
//                .map(p -> "Productid: " + p.getId() + ", productname: " + p.getNombre() + ", valor del inventario: " + (p.getPrecioUnitario() * p.getPrecioUnitario()))
//                .collect(Collectors.toList());
//
//        // Cálculo: Cuánto vale el punto de reorden
//        double puntoDeReorden = productos.stream()
//                .mapToDouble(p -> p.getUnidadesExistencia() * p.getPrecioUnitario())
//                .sum();
//
//        // Consulta: Productid, productname y precio, el nombre del producto en mayúscula
//        List<String> consulta2 = productos.stream()
//                .map(p -> "Productid: " + p.getId() + ", productname: " + p.getNombre().toUpperCase() + ", precio: " + p.getPrecioUnitario())
//                .collect(Collectors.toList());
//
//        // Consulta: Productid, productname y precio, el nombre del producto con 10 caracteres
//        List<String> consulta3 = productos.stream()
//                .map(p -> "Productid: " + p.getId() + ", productname: " + p.getNombre().substring(0, 10) + ", precio: " +p.getPrecioUnitario())
//                .collect(Collectors.toList());
//
//        // Consulta: Longitud del nombre del producto
//        List<Integer> consulta4 = productos.stream()
//                .map(p -> p.getNombre().length())
//                .collect(Collectors.toList());
//
//        // Consulta: Nombre del producto en minúscula
//        List<String> consulta5 = productos.stream()
//                .map(p -> p.getNombre().toLowerCase())
//                .collect(Collectors.toList());

        // Consulta: Productid, productname y precio, el nombre del producto con 10 caracteres en mayúscula
//        List<String> consulta6 = productos.stream()
//                .map(p -> "Productid: " + p.getId() + ", productname: " + p.getNombre().substring(0, Math.min(p.getNombre().length(), 10)).toUpperCase() + ", precio: " + p.getPrecioUnitario())
//                .collect(Collectors.toList());

//        // Filtro: Clientes cuyo país sea Spain
//        List<String> clientesSpain = customers.stream()
//                .filter(c -> c.getPais().equals("Spain"))
//                .map(c -> "CustomerID: " + c.getCustomerID() + ", CompanyName: " + c.getCompanyName() + ", País: " + c.getPais())
//                .collect(Collectors.toList());
//
//        // Filtro: Clientes cuyo país comience con la letra U
//        List<String> clientesUPais = customers.stream()
//                .filter(c -> c.getPais().startsWith("U"))
//                .map(c -> "CustomerID: " + c.getCustomerID() + ", CompanyName: " + c.getCompanyName() + ", País: " + c.getPais())
//                .collect(Collectors.toList());

//        Map<String, Integer> resultado = productos.stream()
//                .filter(p -> p.getProveedor().equals(17) || p.getProveedor().equals(19) || p.getProveedor().equals(16))
//                .collect(Collectors.groupingBy(Producto::getCategoriaId,
//                        Collectors.summingInt(Producto::getUnidadesExistencia)))
//                .entrySet().stream()
//                .filter(entry -> entry.getValue() < 100)
//                .sorted(Comparator.comparingInt(Map.Entry::getValue))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Imprimir el resultado
//        resultado.forEach((categoria, suma) -> System.out.println(categoria + ": " + suma));

//        productos.stream().sorted(Comparator.comparing(Producto::getNombre)).forEach(System.out::println);
        //ordenar por nombre y por categoria de forma descendente
//        System.out.println("................................................................");
//        productos.stream()
//                .filter(p-> p.getCategoriaId()!=null)
//                .sorted(Comparator.comparing(Producto::getCategoriaId).reversed().thenComparing(Producto::getNombre).reversed())
//                .map(p -> p.getCategoriaId() + " "+ p.getNombre())
//                .forEach(System.out::println);
//        DoubleSummaryStatistics estadisticas =productos.stream()
//                .filter(p -> p.getPrecioUnitario()!=null)
//                .mapToDouble(Producto::getPrecioUnitario)
//                .summaryStatistics();
//        System.out.println("Maximo " + estadisticas.getMax());
//        System.out.println("Mínimo " + estadisticas.getMin());
//        System.out.println("Promedio " + estadisticas.getAverage());
        System.out.println("noche");
//        System.out.println(servicio.filtroPorCategoria(1));
//        servicio.filtroPorCategoriaNativa(1)
//                .stream()
//                .map(p -> p.getId() + p.getCategoriaId()+"/"+p.getCategoriaId())
//                .forEach(System.out::println);
    }
}
