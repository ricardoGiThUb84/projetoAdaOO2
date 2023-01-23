import br.ada.projeto.dominio.Aluguel;
import br.ada.projeto.dominio.AluguelService;
import br.ada.projeto.dominio.RepositorioRegistro;

import java.util.Scanner;

import static br.ada.projeto.classesAuxiliares.ClienteFactory.criarCliente;

public class Aplicacao {
    public static void main(String[] args) {

        String sair = "";
        Scanner scan = new Scanner(System.in);

        String tipoCliente = "";
        String tipoVeiculo = "";
        int diaria;

        do{

            System.out.println("Bem-vindo ao Aluguel Service");

                System.out.println("Digite o tipo do cliente:   fisico | juridico");

                tipoCliente = scan.next();
                Aluguel aluguel = new Aluguel(criarCliente(tipoCliente));


                AluguelService aluguelService = new AluguelService(aluguel, RepositorioRegistro.getInstance());

                System.out.println("Digite o tipo do veículo:  pequeno  | medio | SUV");

                tipoVeiculo = scan.next();

                System.out.println("Digite a quantidade de dias do aluguel:");
                diaria = scan.nextInt();

                aluguelService.salvar(tipoCliente, tipoVeiculo, diaria,  aluguelService.valorAluguel(diaria, tipoVeiculo));

            System.out.println("Todos os registros cadastrados: ");
                aluguelService.mostrarRegistros();

                System.out.println("Para sair digite: sair ou qualquer tecla para continuar");
                sair = scan.next();

        }while(!sair.equalsIgnoreCase("sair"));

        scan.close();















    }
}