package com.pattern.behaviortype.chain;
/**
 * Description: 组长实现类
 *
 * @author zuogangju
 * @date 2019/3/4 16:54
 * @version V1.0
 */
public class LeaderGroup extends BaseLeader {

	@Override
	public int limit() {
		return 1000;
	}

	@Override
	public void handle(int money) {
		System.out.println("组长批复报销"+ money +"元");
	}

	@Override
	public String getLeader() {
		return "当前是组长";
	}

} 
