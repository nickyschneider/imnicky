public class Principal
{
 
//Método main para criar aluno, avaliar aluno e imprimir aluno
    
public static void main(String [] args) {
   System.out.println("Olá, seja bem-vindo!");

   for(int x=1; x<=10; x++){
   Aluno aluno = Principal.criaAluno();
   Principal.avaliaAluno(aluno); 
   System.out.print(aluno.imprimeAluno());
   
   }
}

//Método para criar aluno

public static Aluno criaAluno() {
        String nome = Teclado.leString("\nDigite o nome do aluno: ");
        String dataNascimento = Teclado.leString("Digite a data de nascimento: ");
        int codigoMatricula = Teclado.leInt("Digite o código de matrícula do aluno: ");
        String curso = Teclado.leString("Digite o curso: ");
        String semestre = Teclado.leString("Digite o semestre: ");
        
        Aluno a1 = new Aluno(nome, codigoMatricula, curso, semestre, dataNascimento);
        return a1;
}

//Método para avaliar aluno

public static void avaliaAluno(Aluno a1){
        
        double trabalhoGA = Teclado.leDouble("Digite a nota do trabalho do grau A: ");
        double provaGA = Teclado.leDouble("Digite a nota da prova do grau A: ");
        double trabalhoGB = Teclado.leDouble("Digite a nota do trabalho do grau B: ");
        double provaGB = Teclado.leDouble("Digite a nota da prova do grau B: ");
        
        a1.setTrabalhoGA(trabalhoGA);
        a1.setProvaGA(provaGA);
        a1.setTrabalhoGB(trabalhoGB);
        a1.setProvaGB(provaGB);
        a1.calculaMediaFinal();
        
}
}