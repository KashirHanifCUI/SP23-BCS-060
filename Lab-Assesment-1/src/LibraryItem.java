public class LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;
    private LibraryItemType itemType;
    public LibraryItem(String title, String author,int year, LibraryItemType itemType) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.itemType = itemType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public LibraryItemType getItemType() {
        return itemType;
    }

    public void setItemType(LibraryItemType itemType) {
        this.itemType = itemType;
    }
    public boolean equals(Object o) {
        LibraryItem libraryItem = (LibraryItem) o;
        if((libraryItem.getTitle().equals(this.title)) && (libraryItem.getAuthor().equals(this.author))
            && (libraryItem.getYear() == this.year) && (libraryItem.isBorrowed == this.isBorrowed)
            && (libraryItem.itemType.equals(this.itemType))) {
            return true;
        }
        else {
            return false;
        }
    }
    public String toString()
    {
        return String.format("%s\t%s\t%04d\t%s",this.title,this.author,this.year,this.itemType);
    }
}
