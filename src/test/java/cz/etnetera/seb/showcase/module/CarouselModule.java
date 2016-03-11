package cz.etnetera.seb.showcase.module;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import cz.etnetera.seb.element.SebElement;
import cz.etnetera.seb.module.Module;

public class CarouselModule extends Module {

	@FindBy(css = ".heroes__items .hero")
	protected List<CarouselSlideModule> slideEls;

	@FindBy(css = ".heroes__items .hero.is--active")
	protected CarouselSlideModule activeSlideEl;

	@FindBy(css = ".slider__arrow.slider__arrow--previous")
	protected SebElement previousTriggerEl;

	@FindBy(css = ".slider__arrow.slider__arrow--next")
	protected SebElement nextTriggerEl;

	@Override
	protected void setup() {
		super.setup();
		waiting().untilTrue(
				s -> previousTriggerEl.isPresent() && nextTriggerEl.isPresent() && activeSlideEl.isPresent());
	}

	public List<CarouselSlideModule> getSlideEls() {
		return slideEls;
	}

	public CarouselSlideModule getActiveSlideEl() {
		return activeSlideEl;
	}

	public SebElement getPreviousTriggerEl() {
		return previousTriggerEl;
	}

	public SebElement getNextTriggerEl() {
		return nextTriggerEl;
	}

	public int getNumberOfSlides() {
		return slideEls.size();
	}

	public CarouselModule showPreviousSlide() {
		previousTriggerEl.click();
		return this;
	}

	public CarouselModule showNextSlide() {
		nextTriggerEl.click();
		return this;
	}

}
