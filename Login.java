import javax.swing.JOptionPane;
public class Login {
    static void main(String[] args) {
        String[] info = new String[2];
        String usuario = JOptionPane.showInputDialog("Digite o seu usuário:");
        info[0] = usuario;
        String senha = JOptionPane.showInputDialog("Digite sua senha:");
        info[1] = senha;
        String usuarioconfirm = JOptionPane.showInputDialog("Confirme o seu usuário:");
        String senhaconfirm = JOptionPane.showInputDialog("Confirme a sua senha:");
        if (usuarioconfirm.equals(usuario) && senhaconfirm.equals(senha)){
            JOptionPane.showMessageDialog(null, "Login efetuado com sucesso! Seja bem-vindo!");
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Credenciais incorretas!",
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
