
package methods;


public class BasicSwitch {
    public static void main(String[] args){
        final int SELECTOR = 5;
        switch(SELECTOR){
            case 1:
                System.out.println("Case 1: selected!");
            case 2:
                System.out.println("Case 2: Selected!");
            case 23:
                System.out.println("Case 2: Selected!");
                break;
            case 5698:
                System.out.println("Case 5698: Selected!");
                break;
            default:
                System.out.println("DEFAULT CASE ");
                
                 
        }//close inter
    }//close main
}//close class
