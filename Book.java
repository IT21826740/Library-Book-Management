 class Book{
    String title;
    String author;
    int ISBN;
    int year;

    Book(String title,String author,int ISBN,int year) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.year= year;

    }

    void displayBook(){
        System.out.println("Titale : " + title);
        System.out.println("Author : "+ author);
        System.out.println("ISBN : "+ ISBN);
        System.out.println("Published Year: "+year);
    }


}