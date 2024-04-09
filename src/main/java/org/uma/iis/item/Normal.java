package org.uma.iis.item;

import org.uma.iis.UpdatableItem;

public class Normal extends UpdatableItem {
  public Normal(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  protected void updateRegularQuality() {
    decreaseQuality();
  }

  @Override
  protected void updateExpiredQuality() {
    decreaseQuality();
  }
}
