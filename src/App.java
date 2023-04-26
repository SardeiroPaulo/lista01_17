import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //entradas
        System.out.print("Qual a metragem a ser pintada em m2?");
        Scanner teclado = new Scanner(System.in);
        double metragem = teclado.nextDouble();
        teclado.close();
        // o programa pede o tamanho em metros quadrados a ser pintado
        //processamentos
        //cobertura 1 litro por 6 metros ^2 ;
        double cobertura = 1/6;
        double rendimentoemlitros  = 6;
        // latas de 18 litros por 80 reais
        double precolata = 80.00;
        double volumedalata = 18;
        //galões de 3,6 litros por 25 reais
        double precogalao = 25.00;
        //calcular quantas latas de 18 litros
        // 1 litro pinta 6 m
        // metragem = (6*18)
        double quantidadelatas = metragem / (volumedalata * rendimentoemlitros);
        //calcular valor total em latas
        double valortotallatas = quantidadelatas * precolata;
        //calcular quantos galões de 3,6 litros
        //calcular a melhor quantidade de latas e galões considerando quantidade de latas e galões cheios e 10% de folga, arredondando para cima
        //saidas
        //apresentar o resultado dos calculos
        System.out.printf("A metragem a ser pintada é de %f metros quadrados", metragem);
        System.out.println("");
        System.out.printf("a quantidade de lataas é: %f e o valor total é %f", quantidadelatas, valortotallatas);
    }   

}
