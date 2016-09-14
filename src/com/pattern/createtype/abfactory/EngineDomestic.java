package com.pattern.createtype.abfactory;
/**
 * 
* @ClassName: DomesticEngine
* @Description: 发动机接口实现
* @author zuozuo
* @date 2016年9月14日 上午11:44:21
 */
public class EngineDomestic implements Engine{
	@Override
	public void engine() {
		System.out.println("国产发动机");
	}
}
