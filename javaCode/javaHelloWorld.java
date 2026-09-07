public class javaHelloWorld {
    public static void main(String[] args){
        var name = "[NAME]";
        if (args.length != 0) {
            name = args[0];
        }
        for(int i=0; i<10; i++){
            System.out.println(i + " time saying \"Hi " + name + "!\".");
        }
    }
}