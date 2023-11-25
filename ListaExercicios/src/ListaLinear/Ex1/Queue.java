package ListaLinear.Ex1;

public class Queue<T> {
    private Node<T> first;
    private Node<T> last;

    public Queue(){
        this.first=null;
        this.last=null;
    }

    public void enqueue(T data){
        Node<T> newNode=new Node<>(data);
        if(isEmpty()){
            first=newNode;
            last=newNode;
        }else{
            last.setNext(newNode);
            last=newNode;
        }
    }

    public T dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue esta vazia");
        }
        T data=first.getData();
        first=first.getNext();
        if(first==null){
            last=null;
        }
        return data;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public T First(){
        if(isEmpty()){
            throw new IllegalStateException("Queue esta vazia");
        }
        return first.getData();
    }

    public T Last(){
        if(isEmpty()){
            throw new IllegalStateException("Queue esta vazia");
        }
        return last.getData();
    }

    public int count(){
        Node<T> current=first;
        int numbE=0;
        while(current!=null){
            numbE++;
            current=current.getNext();
        }
        return numbE;
    }

    public void clear(){
        first=null;
        last=null;
    }

    public void display(){
        Node<T> current=first;
        while(current!=null){
            System.out.println(current.getData()+"\n");
            current=current.getNext();
        }
    }
}
