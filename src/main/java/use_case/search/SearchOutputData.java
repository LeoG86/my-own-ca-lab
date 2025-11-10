package use_case.search;

public class SearchOutputData {
    private final String name;
    private final String rate;

    public SearchOutputData(String name, String rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }
    public String getRate() {
        return rate;
    }
}
