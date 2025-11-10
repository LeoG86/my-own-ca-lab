package use_case.search;

public class SearchInteractor implements SearchInputBoundary{
    private final SearchOutputBoundary searchPresenter;
    private static final String API_KEY = "ebcbe61c";
    private static final String API_URL = "http://www.omdbapi.com/?apikey="  + API_KEY + "&t=";

    public SearchInteractor(SearchOutputBoundary searchPresenter) {
        this.searchPresenter = searchPresenter;
    }

    public void execute(SearchInputData searchInputData) {
        String movie = searchInputData.getMovie().toLowerCase().trim();
        if (movie.equals("")) {
            searchPresenter.prepareFailureView("cannot be empty");
        }














    }



}
