package gg.vape.ui.click.frame;

import func.skidline.RectData;
import gg.vape.utils.render.GuiRenderPrimitives;

public abstract class InsetFrameBase extends Frame {
   public void M() {
      this.No = new RectData(this.No.o() + (double)5.0F, this.No.W(), this.No.e(), this.No.R());
      super.M();
   }

   public void z(boolean bl) {
      GuiRenderPrimitives.d(this.G$src$D$1b2f02a() - (double)5.0F, this.n(), this.A() + (double)10.0F, bl ? this.K + (double)2.0F : this.L() + (double)2.0F, this.getDisabledOverlayColor());
   }

   public RectData getBounds() {
      return this.NS ? new RectData(this.G$src$D$1b2f02a() - (double)5.0F, this.n(), this.A() + (double)10.0F, this.d$src$D$ibccpu()) : new RectData(this.G$src$D$1b2f02a() - (double)5.0F, this.n(), this.A() + (double)10.0F, this.L());
   }

   public void o(double d) {
      super.o(d - (double)10.0F);
   }

   public void K(double d) {
      super.K(d + (double)5.0F);
   }
}
