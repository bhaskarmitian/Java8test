package com.datastructure.linklist;

public class CustomLinkList {

    Node head;

    public void insert(int value) {
        Node node = new Node();
        node.data = value;
        node.next = null;
        if (head == null) {
            head = node;
        }else {
            Node n=head;
            while(n.next!=null){
              n=n.next;
            }
            n=n.next;
           // n.data=value;

        }

    }
    public void show() {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        CustomLinkList list = new CustomLinkList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.show();
    }
}
