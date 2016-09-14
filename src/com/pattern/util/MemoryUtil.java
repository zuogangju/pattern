package com.pattern.util;

/**
 * 
 * @ClassName: MemoryUtil
 * @Description:查看虚拟机使用情况
 * @author zuozuo
 * @date 2016年9月14日 下午4:36:58
 */
public class MemoryUtil {
	public static void main(String[] args) {
		System.out.println(maxMemory());
	}
	public static String maxMemory(){
		Runtime run = Runtime.getRuntime();
		long max = run.maxMemory();
		long total = run.totalMemory();
		long free = run.freeMemory();
		long usable = max - total + free;
		StringBuilder sb=new StringBuilder();
		sb.append("最大内存 = " + max/1024/1024);
		sb.append("\n已分配内存 = " + total/1024/1024);
		sb.append("\n已分配内存中的剩余空间 = " + free/1024/1024);
		sb.append("\n最大可用内存 = " + usable/1024/1024);
		return sb.toString();
	}

}
