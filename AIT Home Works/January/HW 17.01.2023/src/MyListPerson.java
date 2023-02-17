

public class MyListPerson {
    private Node first = null;
    private Node last=null;
    private int size=0;

   public boolean add(Person person){
       Node newNode = new Node(null, null, person );
       if(first==null){
           first=newNode;
       }
       else{
           last.setNext(newNode);
           newNode.setPrev(last);
       }
       last=newNode;
       size++;
       return true;
   }

    public boolean addFirst(Person person){
        Node newNode = new Node(null, null, person );
        if(first==null){
            last=newNode;
            first=newNode;
        }
        else {
            newNode.setNext(first);
            first.setPrev(newNode);
            first=newNode;
        }

        size++;
        return true;
    }

//    public boolean removePerson(Person person){
//        Node node = find(person);
//        if(node!=null){
//            remove(node);
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//
//    public Person removePersonByIndex(int index){
//        Node node = find(index);
//        if (node!=null){
//            return remove(node);
//        }
//        else{
//            return null;
//        }
//    }


    public Person remove(Node node){
        if(node==null && first==null) return null;
        Person res =node.getPerson();
        if(node==first || node==last){
            if(node==first){
                first=first.getNext();
                first.setPrev(null);
                node.setNext(null);
            }
            if (node==last){
                last = last.getPrev();
                last.setNext(null);
                node.setPrev(null);
            }
        }
        else{
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
            node.setPrev(null);
            node.setNext(null);
            node.setPerson(null);
        }
        size--;
        return res;
    }

    public Node find(Person person){
        Node res = first;
        while(res!=null){
            Person temp= res.getPerson();
            if(person==null && temp==null) return res;
            if(person.equals(temp)) return res;
            res=res.getNext();
        }
        return null;


    }

    private Node find(int index){
        if (index<0 || index>= size) throw new IllegalArgumentException();
        int counter = 0;
        Node res = first;
        while (counter<index){
            res=res.getNext();
            counter++;
        }
        return res;

    }


    public void print(){
        Node temp = first;
        while (temp!=null){
            System.out.println(temp.getPerson());
            temp=temp.getNext();
        }

    }

    public Person [] toArray(){
        Person[] res= new Person[size];
        int index=0;
        Node temp =first;
        while (temp!=null){
            res[index++] = temp.getPerson();
            temp=temp.getNext();
        }
        return res;

    }

}






