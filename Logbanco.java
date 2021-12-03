package singleton;

public class Logbanco {
    private static Logbanco unicaInstancia = null;

    int usuario =0;
    private Logbanco() {

    }
    static Logbanco getUnicaInstancia() {
        if (unicaInstancia == null)
            unicaInstancia = new Logbanco();
           return unicaInstancia;
    }

    public void conectar() {

        usuario+=1;
        System.out.println("Um usuario se conectou, quantidade de usuarios:" + usuario);

        }
    }









