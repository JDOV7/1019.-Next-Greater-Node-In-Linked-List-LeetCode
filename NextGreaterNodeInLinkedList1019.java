package leetcode;

public class NextGreaterNodeInLinkedList1019 {

    public void NextGreaterNodeInLinkedList1019() {
        int i = 0, j = 0;
        ListNode lHeadT = head;
        if (head == null) {
            return new int[0];
        }
        while (lHeadT != null) {
            j++;
            lHeadT = lHeadT.next;
        }
        int iArrRedult[] = new int[j];
        ListNode lHeadI = head;
        while (lHeadI.next != null) {
            boolean bControl = true;
            ListNode lHeadJ = lHeadI;
            while (lHeadJ != null) {
                if (lHeadJ.val > lHeadI.val) {
                    iArrRedult[i] = lHeadJ.val;
                    bControl = false;
                    break;
                }
                lHeadJ = lHeadJ.next;
            }
            i++;
            lHeadI = lHeadI.next;
            if (bControl) {
                iArrRedult[i] = 0;
            }
        }
        for (int i : iArrRedult) {
            System.out.print(i + " ");
        }
    }
}
