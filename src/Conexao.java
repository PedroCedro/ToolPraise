import javax.swing.*;
import java.sql.*;

public class Conexao {

    private String urlDb;
    private String usuarioDb;
    private String senhaDb;
    private Connection conDb;
    private boolean statusDb;

    public Conexao (){
        urlDb="jdbc:postgresql://localhost:5432/LouvorApp";
        usuarioDb="postgres";
        senhaDb="senha12345";
        try {
            Class.forName("org.postgresql.Driver");
            conDb = DriverManager.getConnection(urlDb,
                    usuarioDb,
                    senhaDb);
            String deuCerto = "Conectado ao PostgreSQL!";
            setStatusDb(true);
            System.out.println(deuCerto);
            conDb.close();

        } catch (Exception e){
            String deuErrado = "Erro ao conectar com o PostgreSQL!";
            System.out.println(deuErrado);
            setStatusDb(false);
            e.printStackTrace();

        }

    }

    public boolean isStatusDb() {
        return statusDb;
    }

    public void setStatusDb(boolean statusDb) {
        this.statusDb = statusDb;
    }
}



