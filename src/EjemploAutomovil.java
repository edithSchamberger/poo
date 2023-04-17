public class EjemploAutomovil {
    public static void main(String[] args) {
        Auto toyota = new Auto();
        toyota.setColor("verde");
        toyota.setMotor(10.0);
        toyota.setModelo("toyota");
        
        //auto.imprimir();
        System.out.println(toyota.imprimir());
        toyota.acelerar();

        Auto auto1= new Auto();
      

        auto1.imprimir();

        System.out.println("kilometro por litro:  " + toyota.calcularConsumo(300, 0.7f));
    }
}
