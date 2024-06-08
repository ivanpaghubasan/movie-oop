public class Store {
    
    private Movie[] movies;

    public Store() {
        this.movies = new Movie[10];
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies[index]);
    }

    public void setMovie(int index, Movie newMovie) {
        this.movies[index] = new Movie(newMovie);
    }

    public void printStore() {
        System.out.println("******************************MOVIE STORE*****************************");
        for (int i = 0; i < this.movies.length; i++) {
            System.out.println("["+ i +"]\t" + this.movies[i]);
        }
    }
}
