package org.uma.iis;

public class BackstagePass extends UpdatableItem {
  public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";

  public BackstagePass(int sellIn, int quality) {
    super(BACKSTAGE_PASS, sellIn, quality);
  }

  @Override
  protected void updateRegularQuality() {
    if (quality < MAX_QUALITY) {
      quality = quality + 1;

      if (sellIn < 11) {
        increaseQuality();
      }

      if (sellIn < 6) {
        increaseQuality();
      }
    }
  }

  @Override
  protected void updateSellIn() {
    sellIn = sellIn - 1;
  }

  @Override
  protected void updateExpiredQuality() {
    quality = 0;
  }
}
