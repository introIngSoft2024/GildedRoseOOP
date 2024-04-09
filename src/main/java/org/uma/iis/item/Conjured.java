package org.uma.iis.item;

import org.uma.iis.UpdatableItem;

public class Conjured extends UpdatableItem {
  public Conjured(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  protected void updateRegularQuality() {
    decreaseQuality();
    decreaseQuality();
  }

  @Override
  protected void updateExpiredQuality() {
    decreaseQuality();
    decreaseQuality();
  }
}
