public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        doubleLink linkList = new doubleLink();
        linkList.insertBeginning(5); /* insert values into linkedlist */
        linkList.insertBeginning(1);
        linkList.insertBeginning(58); 
        linkList.insertBetween(linkList.head, 8);
        linkList.delete(8);
        linkList.delete(9);
        linkList.display();


    }
}
