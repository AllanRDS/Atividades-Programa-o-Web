import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        String codigo;
        String cpf;

        int codigo2;

        Cliente cliente = new Cliente();
        
        nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente :");
        cliente.setNome(nome);
        
        codigo = JOptionPane.showInputDialog(null, "Digite o código :");
        codigo2 = Integer.parseInt(codigo);
        
        cliente.setCodigo(codigo2);

        cpf = JOptionPane.showInputDialog(null, "Digite o Cpf :");
        cliente.setCpf(cpf);

        JOptionPane.showMessageDialog(null, "O nome do Cliente é : " + cliente.getNome());
        JOptionPane.showMessageDialog(null, "O código do Cliente é  : " + cliente.getCodigo());
        JOptionPane.showMessageDialog(null, "O cpf do Cliente é  : " + cliente.getCpf());
    }
}