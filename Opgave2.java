import java.util.LinkedList;
import java.util.List;

//opgave 2

public class Opgave2
{
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();

        list1.add(0,1);
        list1.add(1,3);
        list1.add(2,5);
        list1.add(3,7);
        list1.add(4,8);


        list2.add(0,2);
        list2.add(1,4);
        list2.add(2,6);

        alternate(list1,list2);
    }

    public static List alternate(List list1, List list2){
        List<Object> list3 = new LinkedList<>();

        if(list1.size() > list2.size()){

        for (int i = 0; i < list1.size() ; i++) {

            list3.add(list1.get(i));
            if(i < list2.size()) { // hvis list2 ikke har flere værdier prøver den ikke at tilføje dem
                list3.add(list2.get(i));
            }
        }
        }else if(list2.size() > list1.size()){ // hvis liste 2 er større
            for (int j = 0; j < list2.size() ; j++) {
                list3.add(list2.get(j));
                if(j < list1.size()) { // hvis list1 ikke har flere værdier prøver den ikke at tilføje dem
                    list3.add(list1.get(j));
                }
            }
        }else{
            for (int i = 0; i < list1.size() ; i++) { // hvis begge lister har samme antal værdier
                list3.add(list1.get(i));
                list3.add(list2.get(i));
            }
        }
        System.out.println(list3); // lige så man kan se om den gør det rigtigt

        return list3;
    }
}
