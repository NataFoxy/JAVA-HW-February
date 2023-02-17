public class MyLinkedList {
    private Node firstNode = null;
    private Node lastNode = null;
    private int size = 0;


    public boolean add(String value){
        Node newNode = new Node(null, null, value);
        if(firstNode==null){
            firstNode = newNode;
        }
        else{
            lastNode.setNext(newNode);
            newNode.setPrev(lastNode);
        }
        lastNode = newNode;
        size++;

        return true;
    }

    public void print(){
        Node temp = firstNode;
        while (temp!=null){
            System.out.println(temp.getValue());
            temp=temp.getNext();
        }

    }

    public String toString(){
        String rez="";
        Node temp= firstNode;
        while (temp!=null){
            rez+= temp.getValue()+"\n";
            temp=temp.getNext();
        }
        return rez;
    }

    public int size(){
        return size;
    }

    public String[] toArray(){
        String[] res= new String[size];
        int index=0;
        Node temp =firstNode;
        while (temp!=null){
            res[index++] = temp.getValue();
            temp=temp.getNext();
        }
        return res;

    }


    public String get (int index)throws IndexNotCorrectException {
        if(index<0 || index>=size) throw new IndexNotCorrectException();
        return toArray()[index];
    }

}
