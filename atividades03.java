class Usuario {

    String email;
    String senha;

    //Construtor
    Usuario(String email, String senha){
        System.out.println("construtor chamado");
        this.email = email;
        this.senha = senha;
    }

    //Método
    void verificarUsuarioLogado(){

    }

}

class Scratch {
    public static void main(String[] args) {

        Usuario usuario = new Usuario( "alane@gmail.com", "123456");

        System.out.println("email: " + usuario.email + " senha: " + usuario.senha);
  
    }
}
