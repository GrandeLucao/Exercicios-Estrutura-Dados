package ListaOrdenacao.Ex2;

public class StringTreeNode {
    String name;
    String desc;
    StringTreeNode left;
    StringTreeNode right;

    public StringTreeNode(String data, String desc) {
        this.name=data;
        this.desc=desc;
        this.left=null;
        this.right=null;
    }

    public StringTreeNode getChild(int index){
        if(index==0){
            return this.left;
        }else if(index==1){
            return this.right;
        }else{
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    }

    public void addChild(String newName, String newDesc){
        if(newName.compareTo(this.name)<0){
            if(this.left==null){
                this.left=new StringTreeNode(newName,newDesc);
            }else{
                this.left.addChild(newName,newDesc);
            }
        }else if(newName.compareTo(this.name)>0){
            if(this.right==null){
                this.right=new StringTreeNode(newName,newDesc);
            }else{
                this.right.addChild(newName,newDesc);
            }
        }
    }
}
