package com.pattern.behaviortype.chain;
/**
 * Description: 主管实现类
 *
 * @author zuogangju
 * @date 2019/3/4 16:55
 * @version V1.0
 */
public class LeaderDirector extends BaseLeader {

	@Override
	public int limit() {
		return 5000;
	}

	@Override
	public void handle(int money) {
		System.out.println("主管批复报销"+ money +"元");
	}

	@Override
	public String getLeader() {
		return "当前是主管";
	}

}

