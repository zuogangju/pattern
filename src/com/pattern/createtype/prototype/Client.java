package com.pattern.createtype.prototype;
/**
 * Description: 创建型-->原型模式
 *
 * @author zuogangju
 * @date 2019/3/4 14:02
 * @version V1.0
 */
public class Client {
	public static void main(String[] args) {
        try {
            Book book1 = new Book(50,"书1","内容");
            book1.setImage("图1");
            book1.showBook();
            Book book2 = (Book) book1.clone();
            book2.showBook();

            book2.setTitle("书2");
            book2.setImage("图2");
            book2.showBook();

            book1.showBook();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
