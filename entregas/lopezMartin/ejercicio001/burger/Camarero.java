package entregas.lopezMartin.ejercicio001.burger;

class Camarero extends Empleado {

    public void recibir(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
        tieneHamburguesa = true;
    }

    public void servir() {
        System.out.println("Sale una " + hamburguesa.describir());
        hamburguesa.mostrar();
    }
}