package ListaOrdenacao.Ex2;


public class Dictionary {

    public static void main(String[] args) {

        TreeNode root= new TreeNode("Welcome", "Seja bem-vindo à enciclopédia!");

        //Armas
        TreeNode categoria1= new TreeNode("Armas", "A arma correta é essencial para seu sucesso em uma batalha.");

        TreeNode arma1= new TreeNode("Punhos","Quando todos recursos se esgotam, é preciso lutar com as próprias mãos.");
        TreeNode arma2= new TreeNode("Espada","Com uma lâmina afiada, a espada é uma opção bastante versátil.");
        TreeNode arma3= new TreeNode("Arco","Ideal para os antissociais, permite atingir os adversários de longe.");

        categoria1.addChild(arma1);
        categoria1.addChild(arma2);
        categoria1.addChild(arma3);

        //Habilidades
        TreeNode categoria2= new TreeNode("Habilidades", "Habilidades definem sua capacidade de combate.");

        TreeNode hab1= new TreeNode("Defesa","Quanto maior a habilidade de defesa, menor o dano tomado ao receber um ataque.");
        TreeNode hab2= new TreeNode("Ataque","Quanto maior a habilidade de ataque, maior o dano aplicado ao usar uma arma.");
        
        categoria2.addChild(hab1);
        categoria2.addChild(hab2);

        //Consumiveis
        TreeNode categoria3= new TreeNode("Consumiveis", "Consumíveis dão vantagens temporárias em batalha.");

        TreeNode con1= new TreeNode("Curativo","Restaura imediatamente um pouco dos seus pontos de vida.");
        TreeNode con2= new TreeNode("Fruta","Sacia a fome, evitando a perda de pontos de vida.");
        TreeNode con3= new TreeNode("Agua","Sacia a sede, evitanto a perda de pontos de vida.");
        
        categoria3.addChild(con1);
        categoria3.addChild(con2);
        categoria3.addChild(con3);


        root.addChild(categoria1);
        root.addChild(categoria2);
        root.addChild(categoria3);

        root.print();
        System.out.println("---------------------------------------------------------------------------------------------------------------");

        for(TreeNode child: root.getChildren()){
            child.print();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------");

        System.out.println(categoria1.getName());
        System.out.println("");
        for(TreeNode child: categoria1.getChildren()){
            child.print();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------");

        for(TreeNode child: root.getChildren()){
            child.print();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------");

        System.out.println(categoria2.getName());
        System.out.println("");
        for(TreeNode child: categoria2.getChildren()){
            child.print();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        
        for(TreeNode child: root.getChildren()){
            child.print();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(categoria3.getName());
        System.out.println("");
        for(TreeNode child: categoria3.getChildren()){
            child.print();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------");



        

    }
}
