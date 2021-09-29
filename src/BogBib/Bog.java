package BogBib;

public class Bog {
    private String titel;
    private int isbnNumber;
    private int udgivelsesår;

    public Bog(String titel, int isbnNumber, int udgivelsesår){
        this.titel = titel;
        this.isbnNumber = isbnNumber;
        this.udgivelsesår = udgivelsesår;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel){
        this.titel = titel;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
    }
}
