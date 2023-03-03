package chapter2.ch21;

public class Book {

    private String tittle;
    private String author;

    public Book(){

    }

    public Book(String tittle,String author){
        this.tittle = tittle;
        this.author = author;

    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showInfo(){
        System.out.println(tittle+","+author);
    }
}
