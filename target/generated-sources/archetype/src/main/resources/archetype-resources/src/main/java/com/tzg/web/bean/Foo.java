package com.tzg.webapp.${package}.bean;

import com.tzg.service.support.proto.ProtoBean;

import java.io.Serializable;

public class Foo extends ProtoBean implements Serializable {

    private long id;

    private String name;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) {this.name = name; }
	
	@Override
    public String toString() {
        return "Foo{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

}