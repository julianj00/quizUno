import java.sql.SQLOutput;
import java.util.Scanner;

public class Cuenta {

   private int numero_de_cuenta, dni_cliente, saldo_actual, ingresarmonto, retirarmonto;

    public Cuenta() {
    }

    public Cuenta(int numero_de_cuenta, int dni_cliente, int saldo_actual) {
        this.numero_de_cuenta = numero_de_cuenta;
        this.dni_cliente = dni_cliente;
        this.saldo_actual = saldo_actual;
    }

    public int getNumero_de_cuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(int numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public int getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(int dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public int getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(int saldo_actual) {
        this.saldo_actual = saldo_actual;
    }



    @Override
    public String toString() {
        return "Cuenta{" +
                "numero_de_cuenta=" + numero_de_cuenta +
                ", dni_cliente=" + dni_cliente +
                ", saldo_actual=" + saldo_actual +
                ", ingresarmonto=" + ingresarmonto +
                '}';
    }

    public void esar_datos(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el monto a ingresar :    ");
       imt resarmonto= teclado.nextInt();
   saldo_actual+= gresarmonto;

    }

    public int retirar_datos(){



        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese el monto a ingresar :    ");
        retirarmonto= teclado.nextInt();


        int Asaldo= saldo_actual-retirarmonto;
        System.out.println("El saldo actual es:    "+Asaldo);
        return 0;
    }

    public int consultar_datos(){

        System.out.println("Los datos del usuario son:       "+"numero de cuenta:    "+numero_de_cuenta+"    Dni de cliente:   "+dni_cliente);
        return 0;
    }
    public int consultar_saldo(){

        System.out.println("Los datos del saldo actual son:       "+saldo_actual);
        return 0;

    }
}
