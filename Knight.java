public class Knight extends Protagonist{  //hw44#3,4
    
    public Knight (String name){  //hw44#3
        super(name);  //hw44#3
        strength *= 2;
        health *= 1.5;
    }

    public String toString(){
        return super.toString() + "\n A strong knight indeed!";  //hw46#1,2
    }
}
