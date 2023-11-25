package ListaOrdenacao.Ex2;

class BinaryTree {
    StringTreeNode root;

    public BinaryTree(){
        this.root=null;
    }

    public void addNode(String name, String desc) {
        root=addNodeRecursive(root, name,desc);
    }

    private StringTreeNode addNodeRecursive(StringTreeNode node, String name, String desc) {
        if(node==null){
            return new StringTreeNode(name,desc);
        }

        if(name.compareTo(node.name)<0){
            node.left=addNodeRecursive(node.left, name,desc);
        }else if(name.compareTo(node.name)>0){
            node.right=addNodeRecursive(node.right, name,desc);
        }
        return node;
    }

    public void inOrderTraversal(StringTreeNode node) {
        if(node!=null){
            inOrderTraversal(node.left);
            System.out.print(node.name +" "+node.desc+" \n ");
            inOrderTraversal(node.right);
        }
    }

    public StringTreeNode getChild(int index){
        if (root!=null){
            return root.getChild(index);
        }else{
            return null;
        }
    }

    public void addChildToParent(String parentData, String newName, String newDesc) {
        addNodeToParent(root, parentData, newName,newDesc);
    }

    private void addNodeToParent(StringTreeNode node, String parentData, String newName, String newDesc){
        if(node!=null){
            if(parentData.compareTo(node.name)==0){
                node.addChild(newName,newDesc);
            }else{
                addNodeToParent(node.left, parentData, newName, newDesc);
                addNodeToParent(node.right, parentData, newName, newDesc);
            }
        }
    }
}
