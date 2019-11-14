package annotations;

public enum Tester {

    MAYANK("Mayank Chauhan");

    private String authorName;

    Tester(String name) {
        this.authorName = name;
    }

    public String getAuthorName(){
        return authorName;
    }
}
