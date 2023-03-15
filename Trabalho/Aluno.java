import java.time.temporal.ValueRange;

public class Aluno {
    public static void main(String[] args) {
        System.out.println("Olá");

        DDadFacul universitario = new DDadFacul();

        universitario.dadfacul.nome = "Raphael";
        universitario.dadfacul.corpele = "branco";
        universitario.dadfacul.idade = 20;

        universitario.cpf = "047.051.831-69";
        universitario.AnoNascimento = 2001;
        universitario.cidade = "Sinop";
        universitario.estado = "MT";

        System.out.println(universitario.dadfacul.nome);
        System.out.println(universitario.dadfacul.corpele);
        System.out.println(universitario.dadfacul.idade);

        System.out.println(universitario.cpf);
        System.out.println(universitario.AnoNascimento);
        System.out.println(universitario.cidade);
        System.out.println(universitario.estado);
        
    }
}