public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 18;
        cliente.nombre = "Javier";
        cliente.telefono ="555 55 55 55";
        cliente.credito = 1000.00;
        System.out.println(cliente.edad());
        System.out.println(cliente.nombre());
        System.out.println(cliente.telefono());
        System.out.println(cliente.credito());

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 18;
        trabajador.nombre = "Javier";
        trabajador.telefono ="555 55 55 55";
        cliente.salario = 1000.00;
        System.out.println(trabajador.edad());
        System.out.println(trabajador.nombre());
        System.out.println(trabajador.telefono());
        System.out.println(trabajador.salario());


    }

    class Persona {
        int edad;
        String nombre;
        String telefono;
    }

    class Cliente extends Persona {
        float credito;
    }

    class Trabajador extends Persona {
        float salario;
    }

}
