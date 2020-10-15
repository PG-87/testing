package gildedrose;

import gildedrose.qualitystrategies.QualityStrategy;

import static gildedrose.qualitystrategies.QualityUpdateStrategy.getStrategy;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateItems(){
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item item){
        QualityStrategy qualityStrategy = getStrategy(item);

        item.quality = qualityStrategy.calculateQuality(item);
        updateSellIn(item);
    }

    private void updateSellIn(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
    }
}
