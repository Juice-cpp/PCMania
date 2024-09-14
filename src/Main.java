import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float matricula = 454f;

        MemoriaUSB mExterna1 = new MemoriaUSB();
        mExterna1.nome = "Pen-drive";
        mExterna1.capacidade = 16;

        MemoriaUSB mExterna2 = new MemoriaUSB();
        mExterna2.nome = "Pen-drive";
        mExterna2.capacidade = 32;

        MemoriaUSB mExterna3 = new MemoriaUSB();
        mExterna3.nome = "HD Externo";
        mExterna3.capacidade = 1;


        Computador promo1 = new Computador();
        promo1.marca = "Positivo";
        promo1.preco = matricula;
        promo1.sistema.nome = "Linux Ubutunu";
        promo1.sistema.tipo = 32;
        promo1.processador.nome = "Pentium Core i3";
        promo1.processador.capacidade = 2200;
        promo1.disco.nome = "HD";
        promo1.disco.capacidade = 500;
        promo1.mRAM.nome = "Memória RAM";
        promo1.mRAM.capacidade = 8;
        promo1.addMemoriaUSB(mExterna1);

        Computador promo2 = new Computador();
        promo2.marca = "Acer";
        promo2.preco = matricula + 1234f;
        promo2.sistema.nome = "Windows 8";
        promo2.sistema.tipo = 64;
        promo2.processador.nome = "Pentium Core i5";
        promo2.processador.capacidade = 3370;
        promo2.disco.nome = "HD";
        promo2.disco.capacidade = 1;
        promo2.mRAM.nome = "Memória RAM";
        promo2.mRAM.capacidade = 16;
        promo2.addMemoriaUSB(mExterna2);

        Computador promo3 = new Computador();
        promo3.marca = "Vaio";
        promo3.preco = matricula + 5678f;
        promo3.sistema.nome = "Windows 10";
        promo3.sistema.tipo = 64;
        promo3.processador.nome = "Pentium Core i7";
        promo3.processador.capacidade = 4500;
        promo3.disco.nome = "HD";
        promo3.disco.capacidade = 2;
        promo3.mRAM.nome = "Memória RAM";
        promo3.mRAM.capacidade = 32;
        promo3.addMemoriaUSB(mExterna3);

        Cliente cliente = new Cliente();

        System.out.println("Olá, seja bem vindo ao PCMania!");
        System.out.print("Insira seu nome: ");
        cliente.nome = entrada.nextLine();
        System.out.print("Insira seu CPF: ");
        cliente.cpf = entrada.nextLong();


        System.out.println("-----------------------------");
        System.out.println("Selecione o que deseja fazer:");
        System.out.println("(0) Sair da loja");
        System.out.println("(1) Ver a promoção 1");
        System.out.println("(2) Ver a promoção 2");
        System.out.println("(3) Ver a promoção 3");

        int acao = entrada.nextInt();
        int addCarrinho;
        Computador[] Carrinho = new Computador[10];
        int i = 0;
        while(acao != 0) {
            if(acao == 1) {
                promo1.mostraPCConfigs();
                System.out.print("Adicionar ao carrinho (1)Sim (0)Não: ");
                addCarrinho = entrada.nextInt();
                if(addCarrinho == 1) {
                    Carrinho[i] = promo1;
                }
            }
            else if(acao == 2) {
                promo2.mostraPCConfigs();
                System.out.print("Adicionar ao carrinho (1)Sim (0)Não: ");
                addCarrinho = entrada.nextInt();
                if(addCarrinho == 1) {
                    Carrinho[i] = promo2;
                }
            }
            else if(acao == 3) {
                promo3.mostraPCConfigs();
                System.out.print("Adicionar ao carrinho (1)Sim (0)Não: ");
                addCarrinho = entrada.nextInt();
                if(addCarrinho == 1) {
                    Carrinho[i] = promo3;
                }
            }
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
            System.out.println("Selecione o que deseja fazer:");
            System.out.println("(0) Sair da loja");
            System.out.println("(1) Ver a promoção 1");
            System.out.println("(2) Ver a promoção 2");
            System.out.println("(3) Ver a promoção 3");

            i++;
            acao = entrada.nextInt();
        }

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("Informação do cliente: ");
        System.out.println("Nome: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);

        for(Computador pc : Carrinho) {
            if(pc != null) {
                pc.mostraPCConfigs();
            }
        }
        float total = cliente.calculaTotalCompra(Carrinho);
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("Total: " + total);
    }
}