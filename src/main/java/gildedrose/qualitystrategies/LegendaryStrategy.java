package gildedrose.qualitystrategies;

import gildedrose.Item;

public class LegendaryStrategy implements QualityStrategy{
    @Override
    public int calculateQuality(Item item) {
        return item.quality;
    }
}
