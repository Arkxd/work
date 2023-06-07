package 登山信息统计;

import java.util.ArrayList;
import java.util.List;

public class ClimbingClub {
    private List<ClimbInfo> climbList;

    public ClimbingClub() {
        //构造方法
        climbList = new ArrayList<ClimbInfo>();
    }
    public void add(String peakName,int time) {
        //  将攀登信息添加到集合中
        this.climbList.add(new ClimbInfo(peakName, time));
    }
    public void Print() {
        for (Object obj :climbList) {
            System.out.println(obj);
        }
    }
}
