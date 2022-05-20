package anubhav.assignment6.org;

public class Example3{
    String name;

    public Example3(String name){
        this.name=name;
        System.out.println("name is: " + name);
    }

    public static void main(String[] args) {
        Example3 arr[] = new Example3[10];
        /*Till this part there is no output as
         * only the array of references is created
         * not the object itself
         */
        for(int i=0; i<10; i++){
            arr[i] = new Example3("Anubhav");
        }
    }
}
