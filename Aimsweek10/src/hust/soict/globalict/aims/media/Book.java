package hust.soict.globalict.aims.media;

import java.util.*;

public class Book extends Media{
    private Map<String,Integer> wordFrequency = new TreeMap<String,Integer>();
    private String content;
    private List<String> contentTokens = new ArrayList<String>();
    private List<String> authors = new ArrayList<String>();
    public Book() {
        super();
    }
    public Book(String title) {
        super(title);
    }
    public Book(String title, String category) {
        super(title, category);
    }
    public Book(String title, String category, float cost, String content) {

        super(title, category, cost);
        this.content = content;
    }
    public static Book createBook() {
        return new Book();
    }

    public void addAuthor(String authorName) {
        if(!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName) {
        if(authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }
    public String toString() {
        return "book - " + super.toString() + " - Authors: " + authors.toString();
    }
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo(scanner);
        System.out.println("Input number of authors: ");
        int n5 = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n5; i++) {
            System.out.println("Input author " + (i + 1) + ": ");
            String authorName = scanner.nextLine();
            addAuthor(authorName);
        };
    }
    public void processContent() {
        String cont = content.toLowerCase();
        for (int i=0; i < cont.length(); i++) {
            if (Character.isLetter(cont.charAt(i)) == false) {
                if (cont.charAt(i)!=' ') cont = cont.substring(0,i)+cont.substring(i+1);
            }
        }
        String[] split = cont.split(" ");
        for(int i =0;i<split.length;i++) {
            contentTokens.add(split[i]);
        }
        Collections.sort(contentTokens);
        int frequency = 0;
        for (int i=0;i<contentTokens.size();i++) {
            if (wordFrequency.containsKey(contentTokens.get(i)) == false) {
                wordFrequency.put(contentTokens.get(i), 1);
            } else {
                frequency = wordFrequency.get(contentTokens.get(i));
                frequency++;
                wordFrequency.replace(contentTokens.get(i), frequency);
            }
        }
    }
}