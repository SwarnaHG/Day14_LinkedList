package LinkedList1;

public class LinkedList {

    Node head;

    Node tail;

    /**
     * method is used to add the elements
     */
    public void add(int data) {
        //node is created
        Node node = new Node(data);
        //data is inserted into the node
        node.data = data;
        node.next = null;//next node is null

        //checking if the head is null if it is null we dont have any nodes in the list
        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node n = head;//traverse between the next node ,hence n is taken
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;//next element gets replaced

            tail.next = node;
            tail = node;

        }
    }

    /**
     * show method is used to print all the elements in list
     */
    public void show() {
        Node node = head;
        while (node.next != null) {
            while (node != null) {
                System.out.println(node.data);
                node = node.next;
            }
            //for the last element we have to print at last after the loop
            System.out.println(node.data);
            //System.out.println(node.data);
        }

        public void toPush ( int data){
            /**
             * here we append the values
             */
            Node node = new Node(data);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head = node;
            }
        }
    }
}

