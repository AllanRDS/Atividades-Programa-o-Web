import javax.swing.JOptionPane;

public class Cliente {
    
    public Cliente () {

    }

    private int codigo;
    private String nome;
    private String cpf;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <=0) {
            JOptionPane.showMessageDialog(null, "Código não pode ser nulo ou vazio", "Erro", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Código não pode ser nulo: " + codigo);
        }

        else {
            this.codigo = codigo;
        }
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CPF não pode ser nulo ou vazio", "Erro", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("CPF não pode ser nulo: " + cpf);
            
        }

        else {
            this.cpf = cpf;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome não pode ser nulo ou vazio", "Erro", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Nome não pode ser nulo: " + nome);
            
        }

        else {
            this.nome = nome;
        }
    }
}