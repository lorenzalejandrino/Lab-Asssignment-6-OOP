class Book implements LibraryResource {
    private String title;

    public Book(String title) {
        setTitle(title);
    }

    @Override
    public void borrowResource() {
        System.out.println("Borrowing book with title: " + title);
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