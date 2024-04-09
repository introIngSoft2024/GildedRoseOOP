package org.uma.iis;

public class Normal extends UpdatableItem {
  public Normal(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  protected void updateRegularQuality() {
    decreaseQuality();
  }

  @Override
  protected void updateSellIn() {
    sellIn = sellIn - 1;
  }

  @Override
  protected void updateExpiredQuality() {
    decreaseQuality();
  }
}
