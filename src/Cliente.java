public class Cliente {
    public String nome;
    public long cpf;

    public float calculaTotalCompra(Computador[] Carrinho) {
        float total = 0f;
        for(Computador pc : Carrinho) {
            if(pc != null) {
                total += pc.preco;
            }
        }
        return total;
    }
}
