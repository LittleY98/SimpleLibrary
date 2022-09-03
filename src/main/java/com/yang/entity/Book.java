package com.yang.entity;

public class Book {

    private String uuid;

    private String name;

    private String remark;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public Book() {
    }

    public Book(String uuid) {
        this.uuid = uuid;
    }

    public Book(String uuid, String name, String remark) {
        this.uuid = uuid;
        this.name = name;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "uuid: " + uuid + "  书名:" + name + "  备注:" + remark;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book obj1 = (Book) obj;
            return this.getUuid().equals(obj1.getUuid());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getUuid().hashCode();
    }
}
