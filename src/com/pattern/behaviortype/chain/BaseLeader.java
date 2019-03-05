package com.pattern.behaviortype.chain;
/**
 * Description: 上级领导抽象接口
 *
 * @author zuogangju
 * @date 2019/3/4 16:53
 * @version V1.0
 */
public abstract class BaseLeader {
	/**
	 * 上级领导处理者
	 */
	BaseLeader nextHandler;
	
	/**
	 * 处理报账请求
	 * 
	 * @param money 能批复的报账额度 
	 * 
	 */
	public final void handleRequest(int money){
		System.out.println(getLeader());
		if(money <=limit()){
			handle(money);
		}else{
			System.out.println("报账额度不足，提交领导");
			if(null != nextHandler){
				nextHandler.handleRequest(money);
			}
		}
	}
	
	/**
	 * 自身能批复的额度权限
	 * 
	 * @return 额度
	 */
	public abstract int limit();
	
	/**
	 * 处理报账行为
	 * 
	 * @param money 具体金额
	 */
	public abstract void handle(int money);
	
	/**
	 * 获取处理者
	 * 
	 * @return 处理者
	 */
	public abstract String getLeader();
}
