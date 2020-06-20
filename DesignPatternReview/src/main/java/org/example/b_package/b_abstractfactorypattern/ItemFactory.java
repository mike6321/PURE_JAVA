package org.example.b_package.b_abstractfactorypattern;

public interface ItemFactory {
	ItemInfo createItemInfo();
	ItemInstance createItemInstance();
	ItemLog createItemLog();
}
