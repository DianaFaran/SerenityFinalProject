package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddToWishlistSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class WishlistTest extends BaseTest {
    @Steps
    AddToWishlistSteps addToWishlistSteps;

    @Test
    public void setAddToWishlistWithoutAccount(){
        addToWishlistSteps.navigateToSalePage();
        addToWishlistSteps.addToWishlist();
    }


}
