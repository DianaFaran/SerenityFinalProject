package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchTest extends BaseTest {
    @Steps
    private SearchSteps searchSteps;

    @Test
    public void searchSpecificProduct(){
        searchSteps.searchForProduct("hoodie");
        searchSteps.verifyProductIsInList("Hoodie");
    }
    @Test
    public void searchRandomWords(){
        searchSteps.searchForProduct("masina fructe");
        searchSteps.checkNoResultsMessage();
    }
    @Test
    public void searchRandomCharacters(){
        searchSteps.searchForProduct("lkcjdsf7e9543itejf87e5");
        searchSteps.checkNoResultsMessage();
    }
    @Test
    public void searchVeryLongText(){
        searchSteps.searchForProduct("serenity emailable summary reports for status and release up + brand logobrand logobrand logobrand logobrand logobrand logobrand logobrand logoSerenity is an Open Source project. Source code is hosted on GitHub, and the binaries are published to JCenter ");
        searchSteps.checkNoResultsMessage();
    }
}
