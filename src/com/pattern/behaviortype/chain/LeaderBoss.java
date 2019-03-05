package com.pattern.behaviortype.chain;
/**
 * Description: 老板实现类
 *
 * @author zuogangju
 * @date 2019/3/4 16:56
 * @version V1.0
 */
public class LeaderBoss extends BaseLeader {

	@Override
	public int limit() {
		return Integer.MAX_VALUE;
	}

	@Override
	public void handle(int money) {
		System.out.println("老板批复报销"+ money +"元");
	}

	@Override
	public String getLeader() {
		return "当前是老板";
	}

}

