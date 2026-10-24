package gg.vape.ui.click.frame;

import gg.vape.ui.click.component.GuiComponent;

public class CenteredPopupFrame extends PopupFrame {
   private double ue = (double)0.0F;

   public void n(double d) {
      this.ue = d;
   }

   public void c() {
      double d = this.V$src$Lgg_vape_ui_click_component_GuiComponent_$jpbobc().G$src$D$1b2f02a() + this.V$src$Lgg_vape_ui_click_component_GuiComponent_$jpbobc().A() / (double)2.0F;
      double d2 = this.V$src$Lgg_vape_ui_click_component_GuiComponent_$jpbobc().n() + this.V$src$Lgg_vape_ui_click_component_GuiComponent_$jpbobc().L() / (double)2.0F + this.ue / (double)2.0F;
      double d3 = d - this.A() / (double)2.0F;
      double d4 = d2 - this.L() / (double)2.0F;
      this.K(d3);
      this.S(d4);
      this.l$src$V$1mibm4x();
      super.c();
   }

   public CenteredPopupFrame(GuiComponent guiComponent, GuiComponent guiComponent2) {
      super(guiComponent, guiComponent2);
   }
}
