public interface NavegadorInternet {
    public default void pesquisar_site(){
        System.out.println("Pesquisando site");
    }
    public default void acessar_site(){
        System.out.println("Acessando site");
    }
}
