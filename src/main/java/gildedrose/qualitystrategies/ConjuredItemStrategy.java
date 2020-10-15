package gildedrose.qualitystrategies;

import gildedrose.Item;

public class ConjuredItemStrategy implements QualityStrategy{
    @Override
    public int calculateQuality(Item item) {
        int quality = item.quality;

        if (quality > 0){
            quality = -2;
        }
        if (quality < 0)
            quality = 0;
        return quality;
    }
}
