package ListaLinear.Ex1;

public class Node<T> {
    private T data;
    private Node<T> previous;
    private Node<T> next;

    public Node(T data){
        this.data=data;
        this.previous=null;
        this.next=null;
    }

    public void insertBefore(Node<T> newNode){
        if(newNode!=null){
            newNode.next=this.next;
            newNode.previous=this;
            if(this.next!=null){
                this.next.previous=newNode;
            }
            this.next=newNode;
        }
    }

    public void insertAfter(Node<T> newNode){
        if(newNode!=null){
            newNode.previous=this.previous;
            newNode.next=this;
            if(this.previous!=null){
                this.previous.next=newNode;
            }
            this.previous=newNode;
        }
    }

    public void detach(){
        if(this.previous!=null) {
            this.previous.next=this.next;
        }
        if(this.next!=null){
            this.next.previous=this.previous;
        }
        this.previous=null;
        this.next=null;
    }   


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
