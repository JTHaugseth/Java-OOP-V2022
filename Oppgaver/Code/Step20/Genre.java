package Step20;
public enum Genre {
    CRIME("CRIME"),
    ACTION("ACTION"),
    FANTASY("FANTASY"),
    CLASSIC("CLASSIC"),
    OTHER("OTHER");

    private String name;
    /**
     * Enum can contain a construtor
     * @param name
     */
    Genre(String name) {
        this.name = name;
    }
}