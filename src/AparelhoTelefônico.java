public interface AparelhoTelefônico {
    public default void ligar(){
        System.out.println("Ligando para a pessoa");
    }
    public default void pesquisar_contato(){
        System.out.println("Pesquisando contato");
    }
    public default void atender(){
        System.out.println("Telefonema atendido");
    }
    public default void desligar(){
        System.out.println("Desligando telefonema");
    }
}
