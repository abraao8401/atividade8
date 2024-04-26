public class TesteLogin {
    public static void main(String[] args) {
            // Credenciais válidas
            String usuarioCorreto = "usuario";
            String senhaCorreta = "senha123";
    
            // Credenciais inválidas
            String usuarioIncorreto = "usuario_errado";
            String senhaIncorreta = "senha_errada";
    
            // Criando objeto de Login
            Login login = new Login(usuarioCorreto, senhaCorreta);
    
            try {
                // Testando login com credenciais corretas
                boolean sucesso = login.fazer_login(usuarioCorreto, senhaCorreta);
                System.out.println("Login bem-sucedido: " + sucesso);
    
                // Testando login com credenciais incorretas
                sucesso = login.fazer_login(usuarioIncorreto, senhaIncorreta);
                System.out.println("Login bem-sucedido: " + sucesso);
            } catch (LoginInvalidoException e) {
                System.out.println("Erro ao fazer login: " + e.getMessage());
            }
        
    }
}
