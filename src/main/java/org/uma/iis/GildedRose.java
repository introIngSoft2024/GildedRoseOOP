package org.uma.iis;

class GildedRose {
  public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
  public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
  public static final String AGED_BRIE = "Aged Brie";
  public static final int MAX_QUALITY = 50;
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (Item item : items) {
      updateItem(item);
    }
  }

  private void updateItem(Item item) {
    updateRegularQuality(item);
    updateSellIn(item);
    if (hasExpired(item)) {
      updateExpiredQuality(item);
    }
  }

  private void updateRegularQuality(Item item) {
    switch (item.name) {
      case AGED_BRIE:
        increaseQuality(item);
        break;
      case BACKSTAGE_PASS:
        if (item.quality < MAX_QUALITY) {
          item.quality = item.quality + 1;
          updateBackstagePassQuality(item);
        }
        break;
      case SULFURAS:
        break;
      default:
        decreaseQuality(item);
    }
  }

  private void updateSellIn(Item item) {
    if (!item.name.equals(SULFURAS)) {
      item.sellIn = item.sellIn - 1;
    }
  }

  private void updateExpiredQuality(Item item) {
    switch (item.name) {
      case AGED_BRIE:
        increaseQuality(item);
        break;
      case BACKSTAGE_PASS:
        item.quality = 0;
        break;
      case SULFURAS:
        break;
      default:
        decreaseQuality(item);
        break;
    }
  }

  private boolean hasExpired(Item item) {
    return item.sellIn < 0;
  }

  private void updateBackstagePassQuality(Item item) {
    if (item.sellIn < 11) {
      increaseQuality(item);
    }

    if (item.sellIn < 6) {
      increaseQuality(item);
    }
  }


  private void decreaseQuality(Item item) {
    if (item.quality > 0) {
      item.quality = item.quality - 1;
    }
  }

  private void increaseQuality(Item item) {
    if (item.quality < MAX_QUALITY) {
      item.quality = item.quality + 1;
    }
  }
  private boolean isBackstagePass(Item item) {
    return item.name.equals(BACKSTAGE_PASS);
  }
}
