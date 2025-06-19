import java.util.*;

public class BinarySearch{
    public static Product search(Product[] products,String name){
        Arrays.sort(products,Comparator.comparing(Product::getProductName));
        int l=0,r=products.length-1;
        while(l<=r){
            int m=(l+r)/2;
            Product mid=products[m];
            int c=mid.getProductName().compareToIgnoreCase(name);
            if(c==0)
                return mid;
            else if(c<0) l=m+1;
            else r=m-1;
        }
        return null;
    }
}

