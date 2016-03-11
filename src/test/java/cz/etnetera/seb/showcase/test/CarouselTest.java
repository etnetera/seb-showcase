package cz.etnetera.seb.showcase.test;

import org.junit.Test;

import cz.etnetera.seb.showcase.context.WithCarousel;
import cz.etnetera.seb.showcase.page.HomePage;

public class CarouselTest extends SebTest {

	@Test
	public void iterateCarousel() {
		int i = 0;
		int elements = seb.goTo(HomePage.class).getCarouselEl().getNumberOfSlides();
		seb.waiting(2).sleep();
		seb.report("Carousel number " + ++i);

		while (elements > 1) {
			seb.getPage(WithCarousel.class).getCarouselEl().showNextSlide();
			seb.waiting(2).sleep();
			seb.report("Carousel number " + ++i);
			elements--;
		}
	}

}
