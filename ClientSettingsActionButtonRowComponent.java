package gg.vape.ui.click.frame.impl;

import gg.vape.ui.click.GuiMouseEvent;
import gg.vape.ui.click.component.GuiClickListener;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.component.gui.AnimatedCenteredTextLabelComponent;

public class ClientSettingsActionButtonRowComponent extends GuiComponent {
   private AnimatedCenteredTextLabelComponent b;

   public void g(GuiMouseEvent guiMouseEvent) {
   }

   public double C() {
      return (double)15.0F;
   }

   public void I() {
   }

   public void u() {
   }

   public double x() {
      return (double)110.0F;
   }

   public void F() {
   }

   public ClientSettingsActionButtonRowComponent(String string, GuiClickListener guiClickListener) {
      this.b = new AnimatedCenteredTextLabelComponent(string, J.l);
      this.b.addClickListener(guiClickListener);
      this.addChildren(new GuiComponent[]{this.b});
   }

   public void H() {
      this.b.K(this.G$src$D$1b2f02a() + (double)5.0F);
      this.b.S(this.n() + (double)1.0F);
      this.b.o(this.A() - (double)10.0F);
      this.b.Y(this.L() - (double)2.0F);
   }
}
