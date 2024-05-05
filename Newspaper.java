class Journal implements LibraryResource {
    private String title;

    public Journal(String title) {
        setTitle(title);
    }

    @Override
    public void borrowResource() {
        System.out.println("Borrowing journal with title: " + title);
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