package service;

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Programmer;

/**
 * @Description 关于开发团队的管理:添加\删除等
 * @Author mapKey
 * @Date 7/11/2022 11:36 AM
 * @Since version-1.0
 */
public class TeamService {
    private static int counter = 1;//给memberId赋值使用
    private int MAX_MEMBER = 5;//限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队成员
    private int total;//记录开发团队中实际人数

    /**
     * @Description 获取开发团队中的所有成员
     * @Param
     * @Return 包含所有成员对象的数组，数组大小与成员人数一致
     */

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * @Description 将指定的员工添加到开发团队中
     * 参数：待添加成员的对象
     * 异常：添加失败， TeamException中包含了失败原因
     */
    public void addMember(Employee e) throws TeamException {
        //成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        //该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        // 该员工已在本开发团队中
        if (isExist(e)) {
            throw new TeamException("该员工已在本开发团队中");
        }

        //该员工已是某团队成员
        //该员正在休假，无法添加
        Programmer p = (Programmer) e;//前面不是Programmer 的已经过滤掉了
  /*      if ("BUSY".equals(p.getStatus().getNAME())) {//if (p.getStatus().getNAME().equals("BUSY")) {
            throw new TeamException("该员工已是某团队成员");
        } else if ("VOCATION".equals(p.getStatus().getNAME())) {
            throw new TeamException("该员正在休假，无法添加");
        }*/
        switch (p.getStatus()) {
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VOCATION:
                throw new TeamException("该员正在休假，无法添加");
        }
        //团队中至多只能有一名架构师
        //团队中至多只能有两名设计师
        //团队中至多只能有三名程序员

        //获取team中已有成员中架构师,设计师,程序员的人数
        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }
        //嵌套写对的
        // &&会造成逻辑短路 且 不能第一次就分流三个身份,有特殊情况
        if (p instanceof Architect) {
            if (numOfArch >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (numOfDes >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if (p instanceof Programmer) {
            if (numOfPro >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        // 将p(e)添加到现有team中
        team[total++] = p;
        //p属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);

    }

    /**
     * @Description 判断指定员工是否已经存在于现有的开发团队中
     * @Param
     * @Return
     */
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {
                return true;
            }

        }
        return false;
    }

    /**
     * @Description removeMember(memberId : int)方法：从团队中删除成员
     * 参数：待删除成员的memberId
     * 异常：找不到指定memberId的员工，删除失败
     * @Param
     * @Return
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i == total) {
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }
        //数组删除,后面的元素覆盖前面的元素, 删除最后一个元素,则进不去下面循环
        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }
        team[--total] = null;



    }
}
