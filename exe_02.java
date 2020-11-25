import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in);) {
            boolean recebeB = true;
            int qtd;
            System.out.printf("Digite um número positivo maior que zero: ");
            qtd = leia.nextInt();
            while (qtd <= 0) {
                System.out.printf("Digite um número positivo maior que zero: ");
                qtd = leia.nextInt();
            }
            String b[] = new String[qtd];
            String ast[] = new String[qtd];
            String res[][] = new String[qtd][qtd];
            for (int i = 0; i < qtd * 2; i++) {
                for (int j = 0; j < qtd; j++) {
                    if (i < qtd) {
                        b[j] = "o";
                    } else {
                        ast[j] = "*";
                    }
                }
            }
            System.out.println();
            for (int i = 0; i < qtd; i++) {
                if(i % 2 == 0){
                    recebeB = true;
                }else{
                    recebeB = false;
                }
                for (int j = 0; j < qtd; j++) {
                    if (recebeB == true) {
                        System.out.print(res[i][j] = b[j]);
                        recebeB = false;
                    } else {
                        System.out.print(res[i][j] = ast[j]);
                        recebeB = true;
                    }
                }
                System.out.println();
            }
        }
    }
}