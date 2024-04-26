public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazer_login(String usuarioDigitado, String senhaDigitada) throws LoginInvalidoException {
        if (usuario.equals(usuarioDigitado) && senha.equals(senhaDigitada)) {
            return true;
        } else {
            throw new LoginInvalidoException("Usuário ou senha incorretos.");
        }
    }
}
