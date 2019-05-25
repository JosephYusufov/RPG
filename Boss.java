public class Boss extends Monster{ //hw44#3,4

    public Boss() {  //hw44#3
        super();  //hw44#3
        attack *= 2;
        defense *= 2;
    }
    public String toString(){
        return super.toString() + "\n A lumbering Boss indeed!";  //hw46#1,2
    }
}

//tank
