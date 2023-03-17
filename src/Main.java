import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int Ncuenta, Dnicliente, Sactual, sss;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu numero de cuenta:   ");
        Ncuenta=teclado.nextInt();
        System.out.println("Ingresa tu dni de cliente   ");
        Dnicliente=teclado.nextInt();
        System.out.println("Ingresa tu saldo actual:   ");
        Sactual=teclado.nextInt();

        Cuenta oper1=new Cuenta(Ncuenta,Dnicliente,Sactual );

        System.out.println("El numero de cuenta es:   "+oper1.getNumero_de_cuenta());
        System.out.println("El dni de cliente es  :   "+oper1.getDni_cliente());
        System.out.println("Tu saldo actual es   :   "+oper1.getSaldo_actual());


        System.out.println(oper1.ingresar_datos());
        System.out.println(oper1.retirar_datos());
        System.out.println(oper1.consultar_datos());
        System.out.println(oper1.consultar_saldo());



    }
}