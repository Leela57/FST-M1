package Activities;


abstract class Book {
    public abstract void SetTitle(String t);

    String title;

    public String getTitle() {
        //System.out.println(title);
        return title;

    }
}

class MyBook extends Book {
    @Override
    public void SetTitle(String t) {
        title=t;
        System.out.println("First" + title);

    }

}

public class Activity5 {
    public static void main(String[] args) {
        String title = "ABC";
        MyBook b = new MyBook();
        b.SetTitle(title);
        System.out.println(b.getTitle());


    }

}
