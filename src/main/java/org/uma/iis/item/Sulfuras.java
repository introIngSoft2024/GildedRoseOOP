package org.uma.iis.item;

import org.uma.iis.UpdatableItem;

public class Sulfuras extends UpdatableItem {
  public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

  public Sulfuras() {
    super(SULFURAS, 0, 80);
  }

  @Override
  protected void updateRegularQuality() {
    // Sulfuras objects do not update their regular quality
  }

  @Override
  protected void updateSellIn() {
    // Sulfuras objects do not update the sellIn value
  }

  @Override
  protected void updateExpiredQuality() {
    // Sulfuras objects do not update their quality when expired
  }
}
