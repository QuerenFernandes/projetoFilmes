public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Eragon";
        meuFilme.anoDeLancamento = 2006;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.categoriaDoFilme = "Fantasia";

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(0);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
