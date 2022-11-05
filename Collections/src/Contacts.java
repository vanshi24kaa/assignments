public class Contacts
{
    private Long number;
    Long numbers;
    Contacts(Long Number)
    {
        this.number=Number;
    }
    public Long getNumber(){
        return number;
    }

    public void setNumber() {
        setNumber();
    }

    public void setNumber(Long Number ) {
        this.number = Number;
    }
    @Override
    public String toString(){
        return "Contacts{" + "number=" + number + "}";
    }
}