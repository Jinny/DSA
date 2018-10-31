/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Admin
 */
public class ArrayQueue implements QueueInterface{
    private Object[]a;
    private int front, back;
    
    public ArrayQueue(int capacity){
        a= new Object[capacity];
    }
    
    public void add(Object object) {
        if(back==a.length)resize();
        a[back++]=object;
    }

   
    public Object first() {
        if(size()==0)
        throw new IllegalStateException("Queue is empty"); //To change body of generated methods, choose Tools | Templates.
        return a[front];
    }

    
    public Object remove() {
        if(size()==0)
        throw new IllegalStateException("Queue is empty"); //To change body of generated methods, choose Tools | Templates.
        Object object =a [front];
        a[front++]=null;
        return object;
    }

    
    public int size() {
        return back-front;
    }

    
    public boolean isEmpty() {
        return(size()==0);
    }
    private void resize(){
        Object[]aa=a;
        a=new Object[2*aa.length];
        System.arraycopy(aa,front,a,0,size());
    }
     public String toString(){
        String result; 
        if(size()!=0){
            result="{";
            for(int i=size()-1;i>=0;i--){
                result +=a[i];
                
                if(i!=0)
                    result += ",";
                else 
                    result +="}";
            }
        }else{
            result = "Empty stack!";
        }
        return result;
    }
    
}
