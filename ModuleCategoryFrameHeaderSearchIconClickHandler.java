package gg.vape.ui.click.frame.impl;

import gg.vape.module.none.ClientSettings;
import gg.vape.ui.click.component.GuiClickListener;

public class ModuleCategoryFrameHeaderSearchIconClickHandler implements GuiClickListener {
   final ModuleCategoryFrameHeader m;

   public void onPrimaryClick() {
      ClientSettings.moduleSearchActive = !ClientSettings.moduleSearchActive;
      ClientSettings.refreshModuleCategoryHeaders();
   }

   public ModuleCategoryFrameHeaderSearchIconClickHandler(ModuleCategoryFrameHeader moduleCategoryFrameHeader) {
      this.m = moduleCategoryFrameHeader;
   }
}
