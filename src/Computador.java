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
        System.out.println("Armazenamento: " + disco.nome + " " + disco.capacidade + "Gb");
        System.out.println("Sistema: " + sistema.nome + " (" + sistema.tipo + ")");
        System.out.println("Acompanha: " + discoExterno.nome + " " + discoExterno.capacidade + "Gb");
    }
    public void addMemoriaUSB (MemoriaUSB musb) {
        this.discoExterno = musb;
    }
}
