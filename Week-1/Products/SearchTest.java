public class SearchTest{
    public static void main(String[] args){
        Product[] products={
            new Product(1,"HeadSet","Electronics"),
            new Product(2,"Shirt","Clothing"),
            new Product(3,"Mobile","Electronics"),
            new Product(4,"Computer","Electronics"),
            new Product(5,"Shoes","Footwear")
        };

        Product f1=LinearSearch.search(products,"Computer");
        if(f1!=null){
            System.out.println("Linear Search: "+f1.getProductID()+"-"+f1.getProductName()+"("+f1.getCategory()+")");
        }
        else{
            System.out.println("Not Found");
        }
        Product f2=BinarySearch.search(products,"Computer");
        if(f2!=null)
            System.out.println("Binary Search: "+f2.getProductID()+"-"+f2.getProductName()+"("+f2.getCategory()+")");
        else
            System.out.println("Not Found");
    }
}

