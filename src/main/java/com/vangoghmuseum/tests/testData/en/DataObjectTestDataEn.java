package com.vangoghmuseum.tests.testData.en;

import com.vangoghmuseum.tests.testData.DataObjectTestData;

import java.util.HashMap;
import java.util.Map;

public class DataObjectTestDataEn implements DataObjectTestData {

    @Override
    public Map<String, String> getSearchedArtObject() {
        Map<String, String> dataObject = new HashMap<>();
        dataObject.put("F-number", "F0464");
        dataObject.put("JH-number", "JH1589");
        dataObject.put("Object number", "s0032V1962");
        dataObject.put("Dimensions", "72 cm x 91.5 cm, 89.8 cm x 109.2 cm, 8.0 cm x 16.8");
        dataObject.put("Provenance", "With his brother Theo van Gogh, Paris, after the end of September 1888; " +
                "after his death on 25 January 1891, inherited by his widow, Jo van Gogh-Bonger, " +
                "and their son, Vincent Willem van Gogh, Paris; administered until her death on 2 September 1925 " +
                "by Jo van Gogh-Bonger, Bussum/Amsterdam/Laren; transferred by Vincent Willem van Gogh, Laren, " +
                "on 10 July 1962 to the Vincent van Gogh Foundation, Amsterdam; agreement concluded between " +
                "the Vincent van Gogh Foundation and the State of the Netherlands, in which the preservation " +
                "and management of the collection, and its placing in the Rijksmuseum Vincent van Gogh, " +
                "to be realized in Amsterdam, is entrusted to the State, 21 July 1962; given on loan until " +
                "the opening of the museum on 2 June 1973 to the Stedelijk Museum, Amsterdam; on permanent " +
                "loan to the Rijksmuseum Vincent van Gogh from 2 June 1973 and at the Van Gogh Museum, Amsterdam, " +
                "since 1 July 1994.");
        dataObject.put("artist", "Vincent van Gogh");
        dataObject.put("Credits (obliged to state)", "Van Gogh Museum, Amsterdam (Vincent van Gogh Foundation)");
        return dataObject;
    }
}
