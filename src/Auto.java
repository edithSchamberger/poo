//las clases siempre con mayusculas
// atributos y metodos en minisculas.
public class Auto {
    //variables, caracteristicas
    private String modelo="toyota";
    private String color;
    private Double motor;
    private int capacidadTanque=40;


  //getters and setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getMotor() {
        return motor;
    }

    public void setMotor(Double motor) {
        this.motor = motor;
    }

    // metodos, funciones
    public String imprimir(){
        StringBuilder datos = new StringBuilder();
        datos.append("\n"+this.motor + "\n"+ this.modelo+ "\n"+ this.color);
        return datos.toString();
    }
    public void acelerar(){
        System.out.println("acelarando");
    }
    public void frenando(){
        System.out.println("el auto: "+ modelo+ " se freno!");
    }


    //metodos
   /*
    public void calcularGastos(){

    }
*/
    /*podriamos dar la cantidad de kimelostros recorridos y el porcentaje que nos queda en el tanque
     si recorre 300 km y gasta el 70% del tanque, puedo obtener consumo = objtengo el rendimiento de km recorridos
    por litros de combustible*/
    public float calcularConsumo(int km, float combustibleGastado){
        return km/(capacidadTanque*combustibleGastado);
    }

}
