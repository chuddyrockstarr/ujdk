package gg.vape.ui.click.frame;

import gg.vape.module.none.ClientSettings;
import gg.vape.ui.click.component.GuiClickListener;

public class FrameHeaderMainLayerClickHandler implements GuiClickListener {
   public void onPrimaryClick() {
      ClientSettings.INSTANCE.switchFrameStack(ClientSettings.mainStack);
   }
}
