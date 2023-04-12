package dev.rk.servlet1.beans;

import java.util.List;

public class Item {
    private int id;
    private String name;
    private String img;
    private String content;

    private List<String> moreImgs;

    public Item(int id, String name, String img, String content, List<String> moreImgs) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.content = content;
        this.moreImgs = moreImgs;
    }

    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public List<String> getMoreImgs() {
        return moreImgs;
    }
}
