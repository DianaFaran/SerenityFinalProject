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
        searchSteps.searchForProduct("compot");
        searchSteps.checkNoResultsMessage();
    }
    @Test
    public void searchVeryLongText(){
        searchSteps.searchForProduct("uweyr9043758430fhoieu94758yfreif86554ygf8irejfme934t8u");
        searchSteps.checkNoResultsMessage();
    }
}
