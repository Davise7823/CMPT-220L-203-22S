class listItem{
    String value;
    String listitem;

    public listItem setvalue (String value){
        this.value = value;
        return this;
    }

    public listItem setlistitem(String listitem){
        this.listitem = listitem;
        return this;
    }
}

public class listitems{
    public static void main(String args[]){
        listItem item = new listItem();
        item.setvalue("value").setlistitem("item");

        System.out.println(item);
    }
}