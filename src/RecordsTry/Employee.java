package RecordsTry;

public record Employee(int id, String name,String name2) {
    public Employee{
        if(id <10 ){
            throw new IllegalArgumentException("value is graeter than 10");
        }
        if(name != "janaki"){
            throw new IllegalArgumentException("Name is not janaki");
        }
    }
    public Employee(int id, String name){
        this(id,name,null);
    }
}

class Test{
    public static void main(String[] args) {
        Employee e1= new Employee(15,"");
        System.out.println(e1.id()+"/n"+e1.name());
    }
}