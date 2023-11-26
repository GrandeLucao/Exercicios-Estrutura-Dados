package ListaOrdenacao.Ex2;

public class Dictionary {

    public static void main(String[] args) {
        BinaryTree binTree= new BinaryTree();

        binTree.addNode("Welcome", "Seja bem-vindo à enciclopédia!");
        binTree.addChildToParent("Welcome","Categoria", null);

        //Armas
        binTree.addChildToParent("Categoria", "Armas", "A arma correta é essencial para seu sucesso em uma batalha.");
        binTree.addChildToParent("Armas","Punhos","Quando todos recursos se esgotam, é preciso lutar com as próprias mãos.");
        binTree.addChildToParent("Armas","Espada","Com uma lâmina afiada, a espada é uma opção bastante versátil.");
        binTree.addChildToParent("Armas","Arco","Ideal para os antissociais, permite atingir os adversários de longe.");

        //Habilidades
        binTree.addChildToParent("Categoria", "Habilidades", "Habilidades definem sua capacidade de combate.");
        binTree.addChildToParent("Habilidades","Defesa","Quanto maior a habilidade de defesa, menor o dano tomado ao receber um ataque.");
        binTree.addChildToParent("Habilidades","Ataque","Quanto maior a habilidade de ataque, maior o dano aplicado ao usar uma arma.");

        //Consumiveis
        binTree.addChildToParent("Categoria", "Consumiveis", "Consumíveis dão vantagens temporárias em batalha.");
        binTree.addChildToParent("Consumiveis","Curativo","Restaura imediatamente um pouco dos seus pontos de vida.");
        binTree.addChildToParent("Consumiveis","Fruta","Sacia a fome, evitando a perda de pontos de vida.");
        binTree.addChildToParent("Consumiveis","Agua","Sacia a sede, evitanto a perda de pontos de vida.");

        binTree.inOrderTraversal(binTree.root.getChild(1));

    }
}
