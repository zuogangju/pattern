package com.pattern.behaviortype.chain;
/**
 * Description: 经理实现类
 *
 * @author zuogangju
 * @date 2019/3/4 16:56
 * @version V1.0
 */
public class LeaderManager extends BaseLeader {

	@Override
	public int limit() {
		return 10000;
	}

	@Override
	public void handle(int money) {
		System.out.println("经理批复报销"+ money +"元");
	}

	@Override
	public String getLeader() {
		return "当前是经理";
	}

}

