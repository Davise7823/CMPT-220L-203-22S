public class ObjList {
    String item;
    ObjList newitem;

    public String add(String value){
        this.item = value;
        this.newitem = null;
        return this.item;
    }

    public void delete(int i){
        this.item = null;
    }
}