class Naat {
    private String title;
    private String NaatKhan;
    private double duretion; // Sir here i am setting the time in minutes.

    public Naat(String title, String NaatKhan, double duration) {
        this.title = title;
        this.NaatKhan = NaatKhan;
        this.duretion = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getNaatKhan() {
        return NaatKhan;
    }

    public double getDuretion() {
        return duretion;
    }

    @Override
    public String toString() {
        return "title: " + title + ", Naat Khan: " + NaatKhan + ", duration: " + duretion + " mins";
    }
}
