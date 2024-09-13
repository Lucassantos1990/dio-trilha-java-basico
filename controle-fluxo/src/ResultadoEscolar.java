public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 9;

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)// esse condição precisa me retornar true ou false
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");


    // essa outra maneira de deixar o codigo limpo

    int nota = 7;

    String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

    
    // Essa usando 3 condições 


    int nota = 6;
    String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
    System.out.println(resultado);


    }

}


