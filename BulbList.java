
public abstract class BulbList {
    
protected BulbNode headNode;
protected BulbNode lastNode;
protected int length;

public BulbList() {
headNode = null;
lastNode = null;
length = 0;
}

public void append(Bulb bulb) {
BulbNode node = new BulbNode(bulb);

if (headNode == null)
   {
headNode = new BulbNode(bulb);
       return;
   }
 
   /* 4. This new node is going to be the last node, so
        make next of it as null */
   node.next = null;
 
   /* 5. Else traverse till the last node */
   BulbNode lastNode = headNode;
   while (lastNode.next != null)
    lastNode = (BulbNode) lastNode.next;
 
   /* 6. Change the next of last node */
   lastNode.next = node;
   return;

}
}


