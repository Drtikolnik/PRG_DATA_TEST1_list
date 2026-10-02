public class obousmernyList {

    private Node head;
    private Node tail;

/*
    public void add(String jmeno, String druh, int vek) {
        Zvire zvire = new Zvire(jmeno, druh, vek);
        Node newNode = new Node(zvire);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.setNext(tail);
            tail.setPrev(newNode);
            tail = newNode;
        }


    }
*/

    public void addFirst(String jmeno, String druh, int vek) {
        Zvire zvire = new Zvire(jmeno, druh, vek);
        Node newNode = new Node(zvire);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }


    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData().toString());
            current = current.getNext();
        }



    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("niczde");
        }else{
            head = head.getNext();
            //tail = head.getPrev();
        }
    }


    public void printAllOlderThan5() {
        Node current = head;
        while (current != null) {
            if( current.getData().getVek() > 5 ){
                System.out.println(current.getData().toString());
            }

            current = current.getNext();
        }

    }







    public void printOldest() {

        Zvire nejstarsi = null;






        Node current = head;
        while (current != null) {

        }
    }



















}