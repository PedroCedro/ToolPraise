import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Datas dt = new Datas();
        String date = String.valueOf(dt.dataAtual);
        String var = "-001";
        Conexao con = new Conexao();

        //System.out.println(date+var);
        /*String primeiroNome = JOptionPane.showInputDialog(null, "Digite o nome: ");
        String sobrenome = JOptionPane.showInputDialog(null, "Digite o sobrenome: ");
        String dataNascimento = JOptionPane.showInputDialog(null, "Digite a data de nascimento (apenas números): ");
        String cpf = JOptionPane.showInputDialog(null, "Digite o cpf (apenas números): ");
        String email = JOptionPane.showInputDialog(null, "Digite o email: ");
        String telefone = JOptionPane.showInputDialog(null, "Digite o telefone (apenas números): ");*/
        String primeiroNome = "João";
        String sobrenome = "Lafaiete";
        String dataNascimento = "21/04/1988";
        String cpf = "016.164.751-89";
        String email = "joaoL@gmail.com";
        String telefone = "(62) 9 8566-8967";
        Pessoas p1 = new Pessoas(primeiroNome, sobrenome, dataNascimento, cpf, email, telefone);
        System.out.println("A id do usuário " + p1.getPrimeiroNome() + " é " + p1.getId());
        System.out.println(primeiroNome + " " +
                           sobrenome + " nasceu em " +
                           dataNascimento + "\nRegistrado no cpf de numero: " +
                           cpf + " cujo email é:  " +
                           email + "\nTelefone:  " + telefone);
        Funcoes f1 = new Funcoes(p1.getId(),p1.getPrimeiroNome(),"Ministrante");
        System.out.println("Na próxima escala o: "+p1.getPrimeiroNome()+" irá ser o "+f1.getFuncao());
        System.out.println(p1.toString());




    }
}