package com.pattern.createtype.builder;
/**
 * Description: 具体产品实现
 *
 * @author zuogangju
 * @date 2019/3/4 14:23
 * @version V1.0
 */
public class ConcreteBuilder implements Builder {
	/**
	 * 部件A B C
	 */
	Part partA, partB, partC;
	
	@Override
	public void buildPartA() {
		//这里是具体如何构建partA的代码
		partA = new ConcretePartA();
		partA.method();
	}

	@Override
	public void buildPartB() {
		//这里是具体如何构建partB的代码
		partB = new ConcretePartB();
		partB.method();
	}

	@Override
	public void buildPartC() {
		//这里是具体如何构建partC的代码
		partC = new ConcretePartC();
		partC.method();
	}

	@Override
	public Product getResult() {
		//返回最后组装成品结果
		System.out.println("组装完成");
		return null;
	} 
	
}
