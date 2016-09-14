package com.pattern.createtype.prototype;
/**
 * 
* @ClassName: Client
* @Description: 创建型-->原型模式
* @author zuozuo
* @date 2016年9月14日 下午3:07:28
 */
public class Client {
	public static void main(String[] args) {
        try {
            Book book1 = new Book(50,"书1","内容");
            book1.addImage("图1");
            book1.showBook();

            Book book2 = (Book) book1.clone();
            book2.showBook();

            book2.setTitle("书2");
            book2.addImage("图2");
            book2.showBook();

            book1.showBook();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
