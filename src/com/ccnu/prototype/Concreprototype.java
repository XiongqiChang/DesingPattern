package com.ccnu.prototype;

public class Concreprototype extends  Prototype {

    String field ;
    public Concreprototype(String field){
        this.field = field;
    }
    @Override
    Prototype myClone() {
        return new Concreprototype(field);
    }

    @Override
    public String toString() {
        return field.toString();
    }
}
