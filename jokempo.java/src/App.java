import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declarando e atribuindo variáveis
        int jogador = 0;
        int maquina = 0;
        int placar_jogador = 0;
        int placar_maquina = 0;
        int controle = 0;



        // Instanciando objetos
        Scanner scan = new Scanner(System.in);
        Random random = new Random();



        // Print inicial
        System.out.println("Bem-vindo ao jokenpô");


        while (true){
            
            // Validação do valor do jogador 
            while (true) {
                try {
                    System.out.println("Escolha uma opção\n1 - Pedra\n2 - Papel\n3 - Tesoura\nDigite somente números:");
                    jogador = scan.nextInt();


                    if (jogador == 1 || jogador == 2 || jogador == 3) {
                        break;  // quebra o while somente se a entrada for valida

                    } else {
                        System.out.println("Número inválido, por favor digite somente números de 1 a 3.");
                    }



                } catch (InputMismatchException e) {
                    System.out.println("Há não, houve algum erro, tente novamente.");
                    scan.next();  // trava para não entrar em um loop infinito 
                }
            }


            // método de sorteio da maquina
            maquina = random.nextInt(3) + 1; // para excluir o zero 
            System.out.println("lado escolhido pela maquina" +maquina);



            // calculando resultados
            if (jogador == maquina){ 
                System.out.println("\n---------- EMPATE ----------\n");
                System.out.println("\nNinguem será pontuado\n");
            }


            else if ((jogador == 1 && maquina == 3) || (jogador == 2 && maquina == 1) || (jogador == 3 && maquina == 2)){
                System.out.println("\n\n---------- VENCEDOR: JOGADOR ----------\n\n");
                placar_jogador ++;
            } 


            else {
                System.out.println("\n\n---------- VENCEDOR: MÁQUINA ----------\n\n");
                placar_maquina ++;
            }

            // print placar
            System.out.println("******** PONTUAÇÃO ********");
            System.out.println("Jogador: " + placar_jogador + " pontos.");
            System.out.println("Máquina: " + placar_maquina + " pontos.");


            

             // validação do controle do jogo
             try{
                while (true) { 
                    
                    System.out.println("Deseja continuar jogando? digite 1 para continuar ou 2 para finalizar");
                    controle = scan.nextInt();

                    if (controle == 1 || controle == 2) {
                       break;             
                    }
                    else {
                        System.out.println("Número invalido, Por favor digite somente 1 ou 2"); 
                        controle = scan.nextInt(); 
                    }
                    
                }
                
                
                } catch (InputMismatchException e) {
                    System.out.println("burrro");
                }
                    
                
                
                 // condição para finalização 
                    if (controle == 2 ){
                        break;
                    }



       


    

        
    

    // print de finalização 
   

    
    
}
System.out.println("Programa finalizado");
}
}