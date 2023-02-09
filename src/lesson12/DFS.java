package lesson12;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS { //duyệt theo chiều sâu của đồ thị
    public static void main(String[] args) {
        int[][] graph = {{0,1,0,0,0,0,0},
                         {1,0,1,1,1,0,0},
                         {0,1,0,0,0,1,0},
                         {0,1,0,0,0,1,1}};

        //Khai báo
        Stack<Integer> stack = new Stack<>(); //chứa các node con của node đang duyệt
        Set<Integer> approved = new HashSet<>(); //Những phần tử đã duyệt nhét vào set này


        //Khởi tạo
        stack.add(0); //add đỉnh đầu vào
        approved.add(0);

        //Duyệt theo stack
        while (!stack.isEmpty()) {
            //pop đỉnh stack ra (pop Node đang duyệt ra)
            int top = stack.pop();
            System.out.println(top+"\t");
            //xử lí top

            //tìm tất cả đỉnh kề với top mà chưa duyệt vào stack
            //(duyệt dòng thứ top, các node v (top,v)==1 --> node v có liên kết với top)
            for (int v = 0; v < graph.length; v++) {
                if (graph[top][v]==1 && !approved.contains(v)){
                    stack.add(v);
                    //đánh dấu đã duyệt v
                    approved.add(v);
                }
            }
        }

        //Tham khảo dùng đệ quy sau
    }
}
