package com.vangoghmuseum.tests.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SearchQuery {
    String SearchKey;
    int SearchResultCont;
}
