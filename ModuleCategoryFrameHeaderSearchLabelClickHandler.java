package gg.vape.ui.click.frame.impl;

import gg.vape.module.none.ClientSettings;
import gg.vape.ui.click.component.GuiClickListener;

public class ModuleCategoryFrameHeaderSearchLabelClickHandler implements GuiClickListener {
   final ModuleCategoryFrameHeader r;

   public void onPrimaryClick() {
      ClientSettings.moduleSearchActive = !ClientSettings.moduleSearchActive;
      ClientSettings.refreshModuleCategoryHeaders();
   }

   public ModuleCategoryFrameHeaderSearchLabelClickHandler(ModuleCategoryFrameHeader moduleCategoryFrameHeader) {
      this.r = moduleCategoryFrameHeader;
   }
}
