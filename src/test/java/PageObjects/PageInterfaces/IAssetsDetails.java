package PageObjects.PageInterfaces;

import PageObjects.PageComponents.AssetDetailsNavigation;

public interface IAssetsDetails {
    AssetDetailsNavigation assetDetailsNavigation = null;

    default AssetDetailsNavigation getAssetDetailsNavigation() {
        return assetDetailsNavigation;
    }
}
