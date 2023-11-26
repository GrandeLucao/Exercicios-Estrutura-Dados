package ListaOrdenacao.Ex2;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    private String name;

    private String desc;
    private TreeNode parent;
    private List<TreeNode> children;


    public TreeNode(String name, String desc){
        this.name=name;
        this.desc=desc;
        this.parent=null;
        this.children=new ArrayList<>();
    }

    public void addChild(TreeNode child){
        child.parent=this;
        children.add(child);
    }

    public TreeNode getChild(int index){
        if(index>=0 && index<children.size()){
            return children.get(index);
        }else{return null;}
    }
    
    public TreeNode getParent() {
        return parent;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void print(){
        System.out.println( " "+name+"\n        "+desc);   
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
    
}
