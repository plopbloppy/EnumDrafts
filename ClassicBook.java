public enum ClassicBook {
    ANIMAL_FARM("Orwell", "political satire", 92, 1945),
    DEATH_OF_A_SALESMAN("Miller", "tragedy", 144, 1949),
    FAHRENHEIT_451("Bradbury", "dystopian fiction", 180, 1953),
    HAMLET("Shakespeare", "Shakespearean tragedy", 330, 1623),
    IN_THE_SKIN_OF_A_LION("Ondaajte", "historical fiction", 256, 1987),
    NINETEEN_EIGHTY_FOUR("Orwell", "dystopian-politcal fiction", 328, 1949),
    THEIR_EYES_WERE_WATCHING_GOD("Hurston", "psychological fiction", 219, 1937),
    THE_GREAT_GATSBY(),
    THE_JOY_LUCK_CLUB,
    THE_TRAGEDIE_OF_MACBETH,


    private String author;
    private String genre;
    private int pageCount;
    private int yearPublished;

    ClassicBook(String author, String genre, int pageCount, int yearPublished) {
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
        this.yearPublished = yearPublished;
    
    }
}

// genre, time it takes to read, setting(background information) ** year
// published
// Create an enum of your liking
// The enum should:
// Have at least 10 enum values
// Each value should have two or more
// constants associated with it
// Have instance variables and a constructor
// Have four or more instance methods
