package inflearn.algorithm.dfs;

class Node {
    int data;
    Node2 lt, rt; // 인스턴스 변수 (객체 주소가 저장)

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

class Main {
    Node2 root;

    public void DFS(Node2 root) {
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
        tree.root = new Node2(1);

        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);

        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.DFS(tree.root);
    }
}
