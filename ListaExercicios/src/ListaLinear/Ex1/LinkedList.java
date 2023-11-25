package ListaLinear.Ex1;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public LinkedList(){
        this.head=null;
        this.tail=null;
    }

    public void append(T data){
        Node<T> newNode=new Node<>(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.setNext(newNode);
            tail=newNode;
        }
    }

    public void prepend(T data){
        Node<T> newNode=new Node<>(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.setNext(head);
            head=newNode;
        }
        
    }

    public T get(int index){
        if(index<0){throw new IndexOutOfBoundsException("Index nao pode ser negativo");}

        Node<T> current=head;
        for(int i=0;i<index;i++){
            if(current==null){throw new IndexOutOfBoundsException("Index fora do alcance (?)");}
            current=current.getNext();
        }
        if(current==null){throw new IndexOutOfBoundsException("Index fora do alcance (?)");}
        return current.getData();
    }

    public boolean contains(T data){
        Node<T> current=head;
        while(current!=null){
            if(current.getData().equals(data)){return true;}
            current=current.getNext();
        }
        return false;

    }

    public void remove(T data){
        if(head==null){return;}

        if(head.getData().equals(data)){
            head=head.getNext();
            if(head==null){tail=null;}
            return;
        }

        Node<T> current=head;

        while(current.getNext()!=null && !current.getNext().getData().equals(data)){
            current=current.getNext();
        }

        if(current.getNext()!=null){
            current.setNext(current.getNext().getNext());
            if(current.getNext()==null){tail=current;}
        }

    }

    public void removeAt(int index){
        if(index<0){throw new IndexOutOfBoundsException("Index nao pode ser negativo");}

        if(index==0){
            head=head.getNext();
            if(head==null){
                tail=null;
            }
            return;
        }

        Node<T> current=head;
        for(int i=0;i<index-1;i++){
            if(current==null){throw new IndexOutOfBoundsException("Index fora do alcance (?)");}
            current=current.getNext();
        }

        if(current==null||current.getNext()==null){throw new IndexOutOfBoundsException("Index fora do alcance (?)");}

        current.setNext(current.getNext().getNext());
        if(current.getNext()==null){tail=current;}
    }

    public int count(){
        Node<T> current=head;
        int numbE=0;
        while(current!=null){
            numbE++;
            current=current.getNext();
        }
        return numbE;
    }

    public void clear(){
        head=null;
        tail=null;
    }

    public void display(){
        Node<T> current=head;
        while(current!=null){
            System.out.println(current.getData()+" ");
            current=current.getNext();
        }
    }    
}
