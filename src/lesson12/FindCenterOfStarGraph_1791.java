package lesson12;

public class FindCenterOfStarGraph_1791 {
    //Ý tưởng: center là đỉnh chung của tất cả các cạnh

    public static void main(String[] args) {
        int[][] edges = {{1,2},{2,3},{4,2}};
        int starCenter = findCenter(edges);
        System.out.println(starCenter);
    }

    public static int findCenter(int[][] edges) {
        //Xét 2 cạnh bất kì: [0,1] và [1,1]

        // Nếu đỉnh [0][0] của cạnh [0,1] bằng 1 trong 2 đỉnh của cạnh [1,1] ([1][0] và [1][1])
        // --> đỉnh [0][0] là center
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ) return edges[0][0];

            //else đỉnh [0][1] của cạnh [0,1] (đỉnh còn lại là center)
        else return edges[0][1];
    }
}
