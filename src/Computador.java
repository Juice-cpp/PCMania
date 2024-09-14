public class Computador {
    public String marca;
    public float preco;
    public SistemaOperacional sistema;
    public HardwareBasico processador;
    public HardwareBasico mRAM;
    public HardwareBasico disco;
    public MemoriaUSB discoExterno;

    public Computador() {
        sistema = new SistemaOperacional();
        processador = new HardwareBasico();
        mRAM = new HardwareBasico();
        disco = new HardwareBasico();
    }

    public void mostraPCConfigs() {
        System.out.println("-----------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Processador: " + processador.nome + " (" + processador.capacidade + "Mhz)");
        System.out.println(mRAM.nome + ": " + mRAM.capacidade + " Gb");
        if(disco.capacidade < 10) {
            System.out.println("Armazenamento: " + disco.nome + " " + disco.capacidade + "Gb");
        }
        else {
            System.out.println("Armazenamento: " + disco.nome + " " + disco.capacidade + "Tb");
        }
        System.out.println("Sistema: " + sistema.nome + " (" + sistema.tipo + ")");
        if(discoExterno.capacidade < 10) {
            System.out.println("Acompanha: " + discoExterno.nome + " " + discoExterno.capacidade + "Gb");
        }
        else {
            System.out.println("Acompanha: " + discoExterno.nome + " " + discoExterno.capacidade + "Tb");
        }
    }
    public void addMemoriaUSB (MemoriaUSB musb) {
        this.discoExterno = musb;
    }
}
