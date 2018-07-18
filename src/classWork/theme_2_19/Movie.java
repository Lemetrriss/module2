package classWork.theme_2_19;

class Movie {

    static final int CHILDRENS = 2;
    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;

    private String _title;
//    private int _priceCode;
    private MovieType type;
    Movie(String title, MovieType type) {
        _title = title;
        this.type = type;
    }

    MovieType getType() {
        return type;
    }

    void setType(MovieType type) {
        this.type = type;
    }

    String getTitle () {
        return _title;
    }

    double rentalCost(int daysRented){

        return getType().rentalCost(daysRented);
    }

    int rentalPoints(int daysRented) {

        return getType().rentalPoints(daysRented);
    }

}