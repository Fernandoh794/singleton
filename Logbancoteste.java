package singleton;

public class Logbancoteste {

    public static void main(String[] args) {

        // pra mostrar que está alocado no mesmo lugar da memoria
        Logbanco log1 = Logbanco.getUnicaInstancia();
        Logbanco log2 = Logbanco.getUnicaInstancia();

        System.out.println(log1);
        System.out.println(log2);

        Logbanco.getUnicaInstancia().conectar();
        Logbanco.getUnicaInstancia().conectar();
        Logbanco.getUnicaInstancia().conectar();
        Logbanco.getUnicaInstancia().conectar();


    }
}
