package LinkedList;

public class LinkedList {
    /**
     * This class will generally show the implemenation of linked list
     * where in the method is used to add the elements into the list and show method is used
     * to display the list data
     */
    Node head;
    Node tail;

    /**
     * method is used to add the elements
     */
    public void add(int data) {
        //node is created
        Node node = new Node(data);

        //checking if the head is null if it is null we dont have any nodes in the list
        /*
         * checking if the head is null if it
         * is null we dont have any nodes in the list
         */
        if (head == null) {
            head = node;
            tail = node;
            public void toPush ( int data){
                head = node;
            }
        }

        public void toAddNodeAtFirst ( int data){
            /*
             * method to add the node at the first
             */
            Node node = new Node(data);
            if (head == null) {
                head = node;
                tail = node;
            } else
                node.next = head;
            head = node;
        }
    }
}


