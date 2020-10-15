package gildedrose.qualitystrategies;

import gildedrose.Item;

public class DefaultStrategy implements QualityStrategy {

    @Override
    public int calculateQuality(Item item) {
        int quality = item.quality - 1;

        if (item.sellIn <= 0)
            quality--;

        return Math.max(quality, 0);
    }
}