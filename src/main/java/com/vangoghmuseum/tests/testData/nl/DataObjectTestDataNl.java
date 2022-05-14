package com.vangoghmuseum.tests.testData.nl;

import com.vangoghmuseum.tests.testData.DataObjectTestData;

import java.util.HashMap;
import java.util.Map;

public class DataObjectTestDataNl implements DataObjectTestData {

    @Override
    public Map<String, String> getSearchedArtObject() {
        Map<String, String> dataObject = new HashMap<>();
        dataObject.put("F-nummer", "F0464");
        dataObject.put("JH-nummer", "JH1589");
        dataObject.put("Inventarisnummer", "s0032V1962");
        dataObject.put("Afmetingen", "72 cm x 91.5 cm, 89.8 cm x 109.2 cm, 8.0 cm x 16.8 kg");
        dataObject.put("Herkomst", "Na eind september 1888 bij zijn broer Theo van Gogh, Parijs; na zijn overlijden " +
                "op 25 januari 1891 geërfd door zijn weduwe Jo van Gogh-Bonger en hun zoon Vincent Willem van Gogh, " +
                "Parijs; tot haar overlijden op 2 september 1925 beheerd door Jo van Gogh-Bonger, Bussum/Amsterdam/Laren; " +
                "10 juli 1962 overgedragen door Vincent Willem van Gogh, Laren aan de Vincent van Gogh Stichting, Amsterdam; " +
                "21 juli 1962 overeenkomst Vincent van Gogh Stichting en de Staat der Nederlanden waarin zorg en beheer " +
                "van de collectie en plaatsing daarvan in een te realiseren Rijksmuseum Vincent van Gogh te Amsterdam " +
                "aan de Staat wordt toevertrouwd; tot de opening van het museum op 2 juni 1973 in bruikleen gegeven " +
                "aan het Stedelijk Museum, Amsterdam; vanaf 2 juni 1973 in permanent bruikleen gegeven " +
                "aan het Rijksmuseum Vincent van Gogh, vanaf 1 juli 1994 Van Gogh Museum, Amsterdam.");
        dataObject.put("kunstenaar", "Vincent van Gogh");
        dataObject.put("Credits (verplicht te vermelden)", "Van Gogh Museum, Amsterdam (Vincent van Gogh Stichting)");
        return dataObject;
    }
}
