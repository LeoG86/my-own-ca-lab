package use_case.search;

import use_case.login.LoginOutputData;

public interface SearchOutputBoundary {
    void prepareSuccessView(LoginOutputData outputData);
    void prepareFailureView(String errorMessage);
}
