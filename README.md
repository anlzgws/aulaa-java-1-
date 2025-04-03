public class Aula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nomePardal;
         String nomecalopsita;
          String corcalopsita;
           String somcalopsita;
           
           System.out.println("Qual o nome do pardal?");
           nomePardal = scanner.netxLine();
           pardal pardal1 = new pardal(nomePardal);
           
            System.out.println("Qual o nome do pardal:" + pardal1.getName());
            System.out.println("cor pena do pardal:" + pardal1.getcorPena());
            System.out.println("Qual o nome do pardal:" + pardal1.getName());
    }
}
