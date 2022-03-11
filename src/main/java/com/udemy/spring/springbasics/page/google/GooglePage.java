package com.udemy.spring.springbasics.page.google;

import com.udemy.spring.springbasics.page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePage extends Base {

    @Autowired
    private SearchComponent searchComponent;

    @Autowired
    private SearchResult searchResult;

    @Value("${app.url}")
    private String url;

    public  void goTo(){
        this.driver.get(url);
        this.driver.manage().window().maximize();
    }

    public  void tearDown(){
        this.driver.quit();
    }

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public void setSearchComponent(SearchComponent searchComponent) {
        this.searchComponent = searchComponent;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(SearchResult searchResult) {
        this.searchResult = searchResult;
    }

    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }
}
