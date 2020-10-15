package gildedrose.qualitystrategies;

import gildedrose.Item;

public class BackstagePassStrategy implements QualityStrategy{
    @Override
    public int calculateQuality(Item item) {
        int quality = item.quality;
        quality++;

        if (item.sellIn <= 10) {
            quality++;
        }

        if (item.sellIn <= 5) {
            quality++;
        }

        if (item.sellIn <= 0) {
            quality = 0;
        }

        if (quality > 50){
            quality = 50;
        }
        return item.quality = quality;
    }
}
