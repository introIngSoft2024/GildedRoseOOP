package org.uma.iis;

public abstract class UpdatableItem extends Item {
  public static final int MAX_QUALITY = 50;

  public UpdatableItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  public void updateItem() {
    updateRegularQuality();
    updateSellIn();
    if (hasExpired()) {
      updateExpiredQuality();
    }
  }

  protected abstract void updateRegularQuality();
  protected abstract void updateExpiredQuality();

  protected void updateSellIn() {
    sellIn = sellIn - 1;
  }

  protected boolean hasExpired() {
    return sellIn < 0;
  }

  protected void decreaseQuality() {
    if (quality > 0) {
      quality = quality - 1;
    }
  }

  protected void increaseQuality() {
    if (quality < MAX_QUALITY) {
      quality = quality + 1;
    }
  }
}
