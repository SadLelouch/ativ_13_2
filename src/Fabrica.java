import java.util.ArrayList;
import java.util.Scanner;

public class Fabrica {
    public static void main(String[] args) {
        ArrayList<Veiculo> veicList = new ArrayList<Veiculo>();

        Scanner scan = new Scanner(System.in);
        Integer opc = 0;
        // Criação do menu de interação do sistema.
        while (opc != 3) {
            System.out.println("______________________________________:");
            System.out.println("|     Bem vindo ao nosso sistema     |");
            System.out.println("--------------------------------------");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("_______________________________________ ");
            System.out.println("| Menu de opções:                     |");
            System.out.println("| 1- Carro                            |");
            System.out.println("| 2- Moto                             |");
            System.out.println("---------------------------------------");
            System.out.println("Insira a opção que deseja: ");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    Carro carro = new Carro();
                    System.out.println("Modelo: ");
                    carro.setModelo(scan.nextLine());
                    carro.setModelo(scan.nextLine());

                    System.out.println("Cor: ");
                    carro.setCor(scan.nextLine());

                    System.out.println("Ano: ");
                    carro.setAno(scan.nextLine());

                    veicList.add(carro);

                    int i = 0;
                    for (Veiculo item : veicList) {
                        if (item instanceof Carro) {
                            carro = (Carro) item;
                        }
                        System.out.println("Posição: " + i);
                        System.out.println("Modelo: " + carro.getModelo());
                        System.out.println("Cor: " + carro.getCor());
                        System.out.println("Ano: " + carro.getAno());
                        System.out.println(" ");
                        i++;
                    }
                        continue;


                        case 2:
                            Moto moto = new Moto();
                            System.out.println("Modelo: ");
                            moto.setModelo(scan.nextLine());
                            moto.setModelo(scan.nextLine());

                            System.out.println("Cor: ");
                            moto.setCor(scan.nextLine());

                            System.out.println("Ano: ");
                            moto.setAno(scan.nextLine());

                            veicList.add(moto);

                            i = 0;
                            for (Veiculo item : veicList) {
                                if (item instanceof Moto) {
                                    moto = (Moto) item;
                                }
                                System.out.println("Posição: " + i);
                                System.out.println("Modelo: " + moto.getModelo());
                                System.out.println("Cor: " + moto.getCor());
                                System.out.println("Ano: " + moto.getAno());
                                System.out.println(" ");
                                i++;
                            }
                            continue;
                    }
            }
        }
    }