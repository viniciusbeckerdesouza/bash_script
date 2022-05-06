class CadastroBasico {

    public static void main(String[] args) {
    
    String nome, sobrenome, sexo, cor, cidade, uf;
    int idade;
    double altura, peso, saldo;
    boolean fumante, aposentado, estrangeiro;
    
    nome = "João";
    sobrenome = "da Silva";
    sexo = "M";
    cor = "Pardo";
    cidade = "Recife";
    uf = "PE";
    idade = 59;
    altura = 1.78;
    peso = 76.2;
    saldo = 3999.71;
    fumante = true;
    aposentado = false;
    estrangeiro = false;
    
    
    
    System.out.println(nome + " " + sobrenome);
    System.out.println("Sexo: " + sexo);
    System.out.println("Cor: " + cor);
    System.out.println("Local: " + cidade + ", " + uf);
    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura + "m\nPeso: " + peso + "kg");
    System.out.println("Cor: " + cor);
    System.out.println("Saldo em conta: R$" + saldo);
        
    if (fumante == true) {
        System.out.println("Fuma? SIM");
    } else {System.out.println("Fuma? NÃO");}
        
    if (aposentado == true) {
        System.out.println("Trabalha? NÃO");
    } else {System.out.println("Trabalha? SIM");}    
    
    if (estrangeiro == true) {
        System.out.println("Brasileiro? NÃO");
    } else {System.out.println("Brasileiro? SIM");}
    
    }
}