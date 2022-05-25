package RepetisionStep3;

public class Chapter {

    private String chapterTitle;
    private int pagesPerChapter;
    private int minutesPerPage;

    public Chapter(String chapterTitle, int pagesPerChapter, int minutesPerPage) {
        this.chapterTitle = chapterTitle;
        this.pagesPerChapter = pagesPerChapter;
        this.minutesPerPage = minutesPerPage;
    }

    public String getChapterTitle() {return chapterTitle;}

    public void setChapterTitle(String chapterTitle) {this.chapterTitle = chapterTitle;}

    public int getPagesPerChapter() {return pagesPerChapter;}

    public void setPagesPerChapter(int pagesPerChapter) {this.pagesPerChapter = pagesPerChapter;}

    public int getMinutesPerPage() {return minutesPerPage;}

    public void setMinutesPerPage(int minutesPerPage) {this.minutesPerPage = minutesPerPage;}

    public void printChapterInfo () {
        System.out.println("title: "+ chapterTitle + "\nPages per chapter: "+ pagesPerChapter + "\nminutes per page: "+ minutesPerPage);
    }
}
