package gildedrose.qualitystrategies;

import gildedrose.Item;

public class QualityUpdateStrategy {

    public static QualityStrategy getStrategy(Item item){
        return switch (item.name){
            case "Backstage passes to a TAFKAL80ETC concert" -> new BackstagePassStrategy();
            case "Aged Brie" -> new AgedBrieStrategy();
            case "Sulfuras, Hand of Ragnaros" -> new LegendaryStrategy();
            case "Conjured Mana Cake" -> new ConjuredItemStrategy();
            default -> new DefaultStrategy();
        };
    }
}
