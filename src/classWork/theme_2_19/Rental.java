package classWork.theme_2_19;

class Rental {

    private Movie _movie;
    private int _daysRented;

    Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    int getDaysRented() {
        return _daysRented;
    }

    Movie getMovie() {
        return _movie;
    }

    int rentalPoints() {
        return getMovie().rentalPoints(getDaysRented());
    }

    double rentalCost() {
        return getMovie().rentalCost(getDaysRented());
    }
}