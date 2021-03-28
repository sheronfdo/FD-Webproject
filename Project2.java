import java.util.Arrays;
import java.util.List;


public class Project2 {
    
public static void main(String[] args) {
List<Bulb> bulbs  = Arrays.asList(new Bulb("philips", "123", 100, 100), new Bulb("oms", "123", 30, 100));

UnsortedBulbList bulbList = new UnsortedBulbList();
bulbList.add(bulbs);

System.out.println(bulbList);

}

   
}


