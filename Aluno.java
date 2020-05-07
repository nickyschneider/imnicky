public class Aluno
{
  //Definição dos atributos
  
  protected String nome;
  protected int codigoMatricula;
  protected String curso;
  protected String semestre;
  protected String dataNascimento;
  protected double trabalhoGA;
  protected double provaGA;
  protected double trabalhoGB;
  protected double provaGB;
  protected double mediaFinal;
  
  //Metodo construtor
   
  public Aluno(String nome, int codigoMatricula, String curso, String semestre, String dataNascimento){
        this.nome = nome;
        this.codigoMatricula = codigoMatricula;
        this.curso = curso;
        this.semestre = semestre;
        this.dataNascimento = dataNascimento;
        this.trabalhoGA = 0;
        this.trabalhoGB = 0;
        this.provaGA = 0;
        this.provaGB = 0;
        this.mediaFinal = 0;
   }
  
  //Métodos de acesso Getters e Setters
  
  public String getNome() {   
        return nome;
  }
  
  public int getCodigoMatricula() {
        return codigoMatricula;
  }
  
  public String getCurso() {  
        return curso;
  }
  
  public String getSemestre() {
        return semestre;
  }
  
  public String getDataNascimento() {   
        return dataNascimento;
  }
    
  public double getTrabalhoGA() {
        return trabalhoGA;
  }
  
  public double getProvaGA() {
      return provaGA;
  }
  
  public double getTrabalhoGB() {
        return trabalhoGB;
  }
  
  public double getProvaGB() {
        return provaGB;
  }
  
  public double getMediaFinal() {
        return mediaFinal;
  }
  
  public void setTrabalhoGA(double trabalhoGA) {
        this.trabalhoGA = trabalhoGA;
  }

  public void setProvaGA(double provaGA) {
        this.provaGA = provaGA;
  }

  public void setTrabalhoGB(double trabalhoGB) {
        this.trabalhoGB = trabalhoGB;
  }

  public void setProvaGB(double provaGB) {
        this.provaGB = provaGB;
  }

  public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
  }
  
  //Método para calcular media final
  
  public void calculaMediaFinal(){
    
      this.mediaFinal = ((this.trabalhoGA * 0.4 + this.provaGA * 0.6) + (this.trabalhoGB * 0.4 + this.provaGB * 0.6)*2)/3;
        
  }
  
  //Método para imprimir aluno criado
  
  public String imprimeAluno(){
        
      String s = ("\nNome: " + nome + "\nData de nascimento: " + dataNascimento + "\nMatrícula: " + codigoMatricula + "\nCurso: " + curso + "(" + semestre + " semestre)" 
       + "\nNota Trabalhos GA: " + trabalhoGA + "\nNota Prova GA: " + provaGA + "\nNota Trabalhos GB: " + trabalhoGB + "\nNota Prova GB: " + provaGB + "\nMédia Final: " + mediaFinal + "\n");
        
      return s;
  }
}