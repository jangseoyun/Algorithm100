package inflearn.algorithm.dfs;

class Node {
    int data;
    Node lt, rt; // 인스턴스 변수 (객체 주소가 저장)

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

class Main {
    Node root;

    public void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            //System.out.print(root.data + " ");//전위 순회
            DFS(root.lt);
            //System.out.print(root.data + " ");//중위 순회
            DFS(root.rt);
            //System.out.print(root.data + " ");//후위 순회
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);

        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);

        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.DFS(tree.root);
    }
}
