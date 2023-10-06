public class Library {
    LibraryItem[] libraryItems = new LibraryItem[500];
    private static int itemCounter = 0;

    public void addItem(LibraryItem l1){

        if(itemCounter < libraryItems.length) {
            libraryItems[itemCounter++] = l1;
        }
        else{
            System.out.println("You already have exceed the limit!!!");
        }
    }
    public void borrowItem(LibraryItem l1){

        l1.setBorrowed(true);
    }
    public void returnItem(LibraryItem l1){

        l1.setBorrowed(false);
    }
    public void displayAvailableItems() {

            for(LibraryItem l1 : libraryItems) {
                if(l1 != null) {
                    System.out.println(l1);
                }


            }
        }

    public void displayBorrowedItems() {
        for(LibraryItem l1 : libraryItems){
            if(l1 != null && l1.isBorrowed()){
                System.out.println(l1);
            }


        }
    }
}
