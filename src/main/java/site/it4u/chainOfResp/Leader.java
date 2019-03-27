package site.it4u.chainOfResp;

/**
 * 抽象类（领导人）
 */
public abstract class Leader {

    private String name;

    private Leader nextLeader; // 责任链上的后继对象

    public Leader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 设定责任链上的后继对象
     * @param nextLeader
     */
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    /**
     * 处理请求的核心业务方法
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);
}
