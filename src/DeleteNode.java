public class DeleteNode {
    public static void main(String[] args) {

    }
    public void deleteNode(ListNode node) {


        ListNode temp=node;
        ListNode prev=null;
        while(temp.next!=null){
            temp.val=temp.next.val;
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;


    }
}
