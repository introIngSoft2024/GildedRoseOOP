package org.uma.iis;

public class AgedBrie extends UpdatableItem {
  public static final String AGED_BRIE = "Aged Brie";

  public AgedBrie(int sellIn, int quality) {
    super(AGED_BRIE, sellIn, quality);
  }

  @Override
  protected void updateRegularQuality() {
    increaseQuality();
  }

  @Override
  protected void updateSellIn() {
    sellIn = sellIn - 1;
  }

  @Override
  protected void updateExpiredQuality() {
    increaseQuality();
  }
}
