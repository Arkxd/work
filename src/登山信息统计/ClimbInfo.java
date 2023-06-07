package 登山信息统计;

public class ClimbInfo {
    private String peakName;
    private int climbTime;
    public ClimbInfo(String peakName,int climbTime) {
        /* 补充代码*/
        this.peakName = peakName;
        this.climbTime = climbTime;
    }
    public String getPeakName() {
        /*补充代码*/
        return peakName;
    }
    public int climbTime() {
        /*补充代码*/
        return climbTime;
    }
    public String toString() {
        /*补充代码*/
        return "山峰名称：" + peakName + "\n到达山顶时间：" + climbTime;
    }
}

