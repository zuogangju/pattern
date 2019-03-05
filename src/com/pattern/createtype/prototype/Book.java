package com.pattern.createtype.prototype;

import java.util.ArrayList;
/**
 * Description: 书
 *
 * @author zuogangju
 * @date 2019/3/4 14:02
 * @version V1.0
 */
public class Book implements Cloneable{
    /**
     * 价格
     */
    private int price;
    /**
     * 书名
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 图片
     */
    private ArrayList<String> image = new ArrayList<>();

    public Book() {
        super();
    }

    public Book(int price, String title, String content) {
        super();
        this.price = price;
        this.title = title;
        this.content = content;
    }

    public ArrayList<String> getImage(){
        return image;
    }

    public void setImage(String img){
        this.image.add(img);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @SuppressWarnings("unchecked")
	@Override
    protected Object clone() throws CloneNotSupportedException {
        Book book = (Book)super.clone();
        book.image = (ArrayList<String>) this.image.clone();
        return book;
    }

    /**
     * 显示数详情
     */
    public void showBook(){
        System.out.println("=====Start=====");
        System.out.println("title："+title);
        for(String img : image){
            System.out.println("image name:"+img);
        }
        System.out.println("======End======");
    }
}