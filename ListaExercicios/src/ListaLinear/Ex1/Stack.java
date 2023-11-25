package ListaLinear.Ex1;

public class Stack<T> {
    private Node<T> top;

    public Stack(){
        this.top=null;
    }

    public void push(T data){
        Node<T> newNode=new Node<>(data);
        newNode.setNext(top);
        top=newNode;
    }

    public T pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack vazia");
        }
        T data=top.getData();
        top=top.getNext();
        return data;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public T peek(){
        if(isEmpty()){
            return null;
        }
        return top.getData();
    }

    public void display(){
        Node<T> current=top;
        while(current!=null){
            System.out.println(current.getData()+" ");
            current=current.getNext();
        }
    }

    public void clear(){
        top=null;
    }

    public int count(){
        Node<T> current=top;
        int numbE=0;
        while(current!=null){
            numbE++;
            current=current.getNext();
        }
        return numbE;
    }

}
