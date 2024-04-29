package org.uma.iis.item;

import org.uma.iis.UpdatableItem;

/**
 * The AgedBrie class represents a specific type of item, "Aged Brie", in the inventory management system.
 * It inherits from the UpdatableItem class and provides specific functionalities for handling "Aged Brie".
 */
public class AgedBrie extends UpdatableItem {

  /**
   * The name of the "Aged Brie" item.
   */
  public static final String AGED_BRIE = "Aged Brie";

  /**
   * Creates a new AgedBrie object with the provided sellIn and quality values.
   * @param sellIn The number of days before the item expires.
   * @param quality The quality of the item.
   */
  public AgedBrie(int sellIn, int quality) {
    super(AGED_BRIE, sellIn, quality);
  }

  /**
   * Updates the quality of the "Aged Brie" item when it has not yet expired.
   * Increases the quality by 1.
   */
  @Override
  protected void updateRegularQuality() {
    increaseQuality();
  }

  /**
   * Updates the quality of the "Aged Brie" item when it has expired.
   * Increases the quality by 1.
   */
  @Override
  protected void updateExpiredQuality() {
    increaseQuality();
  }
}

