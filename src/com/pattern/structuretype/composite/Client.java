package com.pattern.structuretype.composite;
/**
 * 
* @ClassName: Client
* @Description: 结构行-->组合模式
* @author zuozuo
* @date 2016年9月14日 下午2:57:52
 */
public class Client {
	public static void main(String[] args) {
		//构造一个目录对象表示C盘根目录
		Dir diskC = new Folder("C");
		
		//C盘根目录下有一个文件Log.txt
		diskC.addDir(new File("Log.txt"));
		
		//C盘根目录下有三个目录Windows、PerfLogs、Program File
		Dir dirWin = new Folder("Windows");
		
		//Windows目录下有文件explorer.exe
		dirWin.addDir(new File("explorer.exe"));
		diskC.addDir(dirWin);
		
		//PerfLogs目录
		Dir dirPer = new Folder("PerfLogs");
		
		//PerfLogs目录下有文件null.txt
		dirPer.addDir(new File("null.txt"));
		diskC.addDir(dirPer);
		
		//Program File目录
		Dir dirPro = new Folder("Program File");
		
		//Program File目录下有文件ftp.txt
		dirPro.addDir(new File("ftp.txt"));
		diskC.addDir(dirPro);
		
		//打印出文件结构
		diskC.print();
	}
}
