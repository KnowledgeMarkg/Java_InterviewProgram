package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Max_Min_Collection {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(50);
        arrayList.add(23);
        arrayList.add(40);
        arrayList.add(8);

        Integer i = (int) arrayList.stream().count();
        List<Integer> list = arrayList.stream().map(e->e+5).collect(Collectors.toList());
        System.out.println("Number Of Count in Arraylist "+i);
        System.out.println("New ArrayList "+list);
        List<Integer> newList = arrayList.stream().filter(e->e%2==0).collect(Collectors.toList());
        List<Integer> sort = arrayList.stream().sorted((e1, e2)-> e2.compareTo(e1)).collect(Collectors.toList());
        Stream<Integer> sorted = arrayList.stream().sorted((e1,e2)-> (e1>e2) ? 1 :(e1<e2) ? -1 : 0);
        System.out.println(newList);
        System.out.println("Decsendin Order "+sort);
        System.out.println("Assending Order ");
        sorted.forEach(e-> System.out.print(e+" "));
        System.out.println();
        Integer min = arrayList.stream().min((e1, e2)-> (e1>e2) ? 1 : (e1<e2) ? -1 : 0).get();
        System.out.println("Mimimum Value is " +min);
        Integer max = arrayList.stream().max((e1, e2)-> e1.compareTo(e2)).get();
        System.out.println("Maximum Value is "+max);
        
        arrayList.stream().forEach(e->{
        	System.out.println("Square Of "+ e +" is "+e*e);
        });
    }
}
