
import java.awt.List;


public class UnsortedBulbList extends BulbList {
    
public UnsortedBulbList () {
super();
// TODO Auto-generated constructor stub
}

public void add(List<Bulb> bulbs) {
bulbs.forEach(bulb -> {
this.append(bulb);
});
}

 
