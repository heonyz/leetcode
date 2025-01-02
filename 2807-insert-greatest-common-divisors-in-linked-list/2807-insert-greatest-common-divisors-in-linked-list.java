class Solution {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) return head;

        ListNode node1 = head;
        ListNode node2 = head.next;

        while (node2 != null) {
            int gcdValue = calculateGCD(node1.val, node2.val);
            ListNode gcdNode = new ListNode(gcdValue);

            node1.next = gcdNode;
            gcdNode.next = node2;

            node1 = node2;
            node2 = node2.next;
        }

        return head;
    }

    private int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

// 주어진 연결 리스트의 노드 사이에 가장 큰 공약수를 삽입.
// 각 인접 노드 쌍의 GCD를 계산.
// 연결 리스트의 노드들을 순회하면서 새로운 노드를 삽입해야하기 때문에 순회와 삽입이 동시에 이루어져야 함.