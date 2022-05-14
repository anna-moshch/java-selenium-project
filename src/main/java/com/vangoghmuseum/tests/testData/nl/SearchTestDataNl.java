package com.vangoghmuseum.tests.testData.nl;

import com.vangoghmuseum.tests.models.SearchQuery;
import com.vangoghmuseum.tests.testData.SearchTestData;

public class SearchTestDataNl implements SearchTestData {

    @Override
    public SearchQuery getDefaultSearchQuery() {
        return SearchQuery.builder().SearchKey("Het Gele Huis").SearchResultCont(700).build();
    }
}
