public class LinearSearch{
    public static Product search(Product[] products,String name){
        for(Product p:products){
            if(p.getProductName().equalsIgnoreCase(name))
                return p;
        }
        return null;
    }
}

