package lesson12;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS { //duyệt theo chiều rộng của đồ thị
    public static void main(String[] args) {
        int[][] graph = {{0,1,0,0,0,0,0},
                        {1,0,1,1,1,0,0},
                        {0,1,0,0,0,1,0},
                        {0,1,0,0,0,1,1}};

        //Khai báo
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> approved = new HashSet<>();

        //Khởi tạo
        queue.add(0); //add đỉnh đầu vào
        approved.add(0);

        //Duyệt theo queue
        while (!queue.isEmpty()) {
            //pop đỉnh stack ra (pop Node đang duyệt ra)
            int head = queue.remove();
            System.out.println(head +"\t");
            //xử lí top

            //tìm tất cả đỉnh kề với top mà chưa duyệt vào stack
            //(duyệt dòng thứ top, các node v (top,v)==1 --> node v có liên kết với top)
            for (int v = 0; v < graph.length; v++) {
                if (graph[head][v]==1 && !approved.contains(v)){
                    queue.add(v);
                    //đánh dấu đã duyệt v
                    approved.add(v);
                }
            }
        }

        //Tham khảo dùng đệ quy sau
    }
}
