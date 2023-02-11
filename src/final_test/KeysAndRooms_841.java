package final_test;

import java.util.*;

public class KeysAndRooms_841 {
    public static void main(String[] args) {
        //Ý tưởng:

        List<Integer> room0 = new ArrayList<>(Arrays.asList(1,3));
        List<Integer> room1 = new ArrayList<>(Arrays.asList(3,0,1));
        List<Integer> room2 = new ArrayList<>(Arrays.asList(2));
        List<Integer> room3 = new ArrayList<>(Arrays.asList(0));

        List<List<Integer>> rooms = new ArrayList<>(Arrays.asList(room0,room1,room2, room3));

        canVisitAllRooms(rooms);

    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] canEnter = new boolean[rooms.size()]; //Tạo ra 1 mảng lưu kết quả mở khóa của từng phòng
        canEnter[0] = true; //rooms[0] luôn vào được

        Stack<Integer> keys= new Stack(); //Tạo stack lưu trữ key
        keys.push(0); //Bỏ vào key đã có vào stack

        while (!keys.isEmpty()) {//Vẫn còn key trong stack thì còn lặp lại bước kiểm tra
            int curKey = keys.pop(); //Lấy key trong stack ra
            for (int key: rooms.get(curKey)) { //duyệt tất cả các keys trong phòng đang mở
                if (!canEnter[key]) { //Kiểm tra nếu key chưa được sử dụng
                    canEnter[key] = true;
                    keys.push(key); //Bỏ key thu được vào stack
                }
            }
        }


        //Nếu có 1 phòng không vào được -> return false
        for (boolean entered:canEnter) {
            if (!entered) return false;
        }

        return true; //return true khi tất cả các phòng đều vào được
    }
}
