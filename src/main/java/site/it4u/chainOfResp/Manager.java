package site.it4u.chainOfResp;

/**
 * 经理
 */
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays() < 10) {
            System.out.println("员工:" + request.getEmpName() + "请假，天数："+ request.getLeaveDays() + "理由：" + request.getReason());
            System.out.println("经理：" + getName() + "审批通过");
        }else {
            if(getNextLeader() != null) {
                getNextLeader().handleRequest(request);
            }
        }
    }
}
