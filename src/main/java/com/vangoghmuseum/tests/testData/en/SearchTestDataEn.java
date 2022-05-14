package com.vangoghmuseum.tests.testData.en;

import com.vangoghmuseum.tests.models.SearchQuery;
import com.vangoghmuseum.tests.testData.SearchTestData;

public class SearchTestDataEn implements SearchTestData {

    @Override
    public SearchQuery getDefaultSearchQuery() {
        return SearchQuery.builder().SearchKey("The Yellow House").SearchResultCont(60).build();
    }
}
