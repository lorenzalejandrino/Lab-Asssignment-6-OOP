class Newspaper implements LibraryResource {
    private String title;

    public Newspaper(String title) {
        setTitle(title);
    }

    @Override
    public void borrowResource() {
        System.out.println("Borrowing newspaper with title: " + title);
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}