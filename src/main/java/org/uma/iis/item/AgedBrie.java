package org.uma.iis.item;

import org.uma.iis.UpdatableItem;

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
  protected void updateExpiredQuality() {
    increaseQuality();
  }
}
