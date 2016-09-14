package com.pattern.behaviortype.mediator;
/**
 * 
* @ClassName: Client
* @Description: 行为型-->中介者模式
* @author zuozuo
* @date 2016年9月14日 下午3:04:25
 */
public class Client {

	public static void main(String[] args) {
		//构造主板对象
		MainBoard mediator = new MainBoard();
		
		//分别构造各个零件
		CDDevice cd = new CDDevice(mediator);
		CPU cpu = new CPU(mediator);
		GraphicsCard gc = new GraphicsCard(mediator);
		SoundCard sc = new SoundCard(mediator);
		
		//将各个零件安装到主板
		mediator.setCDDevice(cd);
		mediator.setCPU(cpu);
		mediator.setGraphicsCard(gc);
		mediator.setSoundCard(sc);
		
		//播放电影
		cd.load();
	}

}
