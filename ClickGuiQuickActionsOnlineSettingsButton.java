package gg.vape.ui.click.frame;

import gg.vape.ui.click.component.IconButtonComponent;
import gg.vape.utils.render.GuiRenderPrimitives;
import java.awt.Color;

public class ClickGuiQuickActionsOnlineSettingsButton extends IconButtonComponent {
   final ClickGuiQuickActionsComponent PY;

   public ClickGuiQuickActionsOnlineSettingsButton(ClickGuiQuickActionsComponent clickGuiQuickActionsComponent, String string, double d) {
      super(string, d);
      this.PY = clickGuiQuickActionsComponent;
   }

   public void H() {
      if (this.w$src$Z$e457mb()) {
         GuiRenderPrimitives.V(this.G$src$D$1b2f02a() + (double)1.5F, this.n() + (double)4.0F, (double)11.0F, (double)1.0F, new Color(255, 255, 255, 15));
      }

      super.H();
   }
}
