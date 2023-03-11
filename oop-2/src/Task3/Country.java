package Task3;

public class Country {
    String name;
    long area;

    public Country(String name, long area) {
        this.area = area;
        this.name = name;
    }

    public void showMarkdownTable() {
        System.out.println("| name | area |\n|------|------|\n| " + name + " | " + area + " |");
    }

    public void showMarkdownTable(boolean isUpperCase) {
        String message = "| name | area |\n|------|------|\n| " + name + " | " + area + " |";
        if(isUpperCase) message = message.toUpperCase();
        System.out.println(message);
    }
}
