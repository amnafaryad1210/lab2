public class Lab2{
public static void main(String[] args){
Lab2p p =new Lab2p(5,"amna",5,3.6);


System.out.println(p.getId());

System.out.println(p.getName());

System.out.println(p.getQuantity());

System.out.println(p.getPrice());

p.setId(5);

p.setName("biscoff");

p.setQuantity(8);

p.setPrice(8.9);

System.out.println(p.getId());

System.out.println(p.getName());

System.out.println(p.getQuantity());

System.out.println(p.getPrice());

}
}