package final_test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysAndRooms_841 {
    public static void main(String[] args) {
        //Ý tưởng: tạo set tạm để chứa key
        //Vào rooms[i] -> kiểm tra set.contains(i)?
            //Đúng: remove(i), add tất cả key trong room[i] vào set
            //Sai: return false
        //----> Note: có thể chọn phòng không theo thứ tự
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //Khai báo set
        Set<Integer> keySet = new HashSet<>(rooms.get(0));

        //Duyệt room - lưu - kiểm tra key
        for (int i = 1; i < rooms.size(); i++) {
            if (keySet.contains(i)) {
                keySet.removeAll(keySet);
                keySet.addAll(rooms.get(i));
            } else return false;
        }
        return true;
    }
}
