import java.util.*;
public class NumberSequence{
    
    private int numElements;
    ArrayList<Integer> sequence = new ArrayList<Integer>();
    
    public NumberSequence(int n){
       numElements = n;
    }
    
    public void fibonacci(){
        sequence.clear();//empty
        for(int i = 0; i<numElements; i++){
        if(i==0){
            sequence.add(1);
        }
        if (i==1){
            sequence.add(1);
        }
        else if(i>1){
            sequence.add(sequence.get(i-2) + sequence.get(i-1));
        }
        }
        System.out.println(sequence);
    }
    
    public void cubic(){
        sequence.clear();
        for(int i = 0; i<numElements; i++){
            sequence.add((i+1)*(i+1)*(i+1));
        }
        System.out.println(sequence);
    }
    
    public void square(){
        sequence.clear();
        for(int i = 0; i<numElements; i++){
            sequence.add((i+1)*(i+1));
        }
        System.out.println(sequence);
    }
    
    public void triangle(){
        sequence.clear();
        for(int i = 1; i<numElements; i++){
            int sum = 0;
            while(i>0){
                sum += i;
                i--;
            }
            sequence.add(sum);
        }
        System.out.println(sequence);
    }
    
    public ArrayList getSequence(){
        return sequence;
    }
}