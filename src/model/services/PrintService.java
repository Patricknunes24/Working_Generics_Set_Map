package model.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintService<T> {
    public PrintService() {
    }
    List<T> integerList = new ArrayList<>();

    public void addValue(T value){
        integerList.add(value);
    }
    public T primeiro(){
        if (integerList.isEmpty()) {
            throw  new IllegalStateException("LISTA VAZIA");
        }
        else {
            return integerList.get(0);
        }
    }

    public List<T> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<T> integerList) {
        this.integerList = integerList;
    }

    public void print(){
        if (!integerList.isEmpty()){
            System.out.println(integerList.get(0));
        }
        for(int i=0;i<integerList.size();i++){
            System.out.println(integerList.get(i));
        }
    }


}
