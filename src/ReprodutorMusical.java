public interface ReprodutorMusical {
    default void reproduzir_musica() {
        System.out.println("Reproduzindo música");
    }
    default void pausar_musica(){
        System.out.println("Pausando a música");
    }
    default void baixar_musica(){
        System.out.println("Baixando a música");
    }
     default void pesquisar_musica(){
        System.out.println("Pausando a música");
    }
}
