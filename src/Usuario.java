public class Usuario {
    private String login;
    private String senhaHash;

    public Usuario(String login, String senhaHash) {
        this.login = login;
        this.senhaHash = senhaHash;
    }

    @Override
    public String toString() {
        return login + ";" + senhaHash;
    }
}
