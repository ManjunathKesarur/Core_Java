class movie {
    String name;
    String hero;
    int releaseYear;

    movie(String name, String hero, int releaseYear) {
        this.name = name;
        this.hero = hero;
        this.releaseYear = releaseYear;
    }

    public static void main(String[] args) {
        movie m1 = new movie("KGF", "Yash", 2022);
        System.out.println(m1.name);
        System.out.println(m1.hero);
        System.out.println(m1.releaseYear);
    }
}