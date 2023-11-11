/*package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceString {
    public PrintServiceString() {
    }
    List<String> integerList = new ArrayList<>();

    public void addValue(String value){
        integerList.add(value);
    }
    public String primeiro(){
        if (integerList.isEmpty()) {
            throw  new IllegalStateException("LISTA VAZIA");
        }
        else {
            return integerList.get(0);
        }
    }

    public List<String> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<String> integerList) {
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

 */
