package gg.vape.ui.click.frame;

import gg.vape.utils.render.GuiRenderPrimitives;

public abstract class OutlinedFrameBase extends Frame {
   private static boolean l6;

   public static void u(boolean bl) {
      l6 = bl;
   }

   public static boolean D$src$Z$g1pigg() {
      return l6;
   }

   public static boolean S$src$Z$g9yfcv() {
      boolean bl = D$src$Z$g1pigg();
      return false;
   }

   public void H() {
      super.H();
   }

   public void c() {
      super.c();
   }

   public void z(boolean bl) {
      GuiRenderPrimitives.P(this.G$src$D$1b2f02a() - (double)0.5F, this.n() - (double)0.5F, this.A() + (double)1.0F, bl ? this.K + (double)2.0F : this.getComponentHeight() + (double)2.0F, J.l, 2.1F, 1.0F, 1.0F);
      super.z(bl);
   }

   static {
      if (!D$src$Z$g1pigg()) {
         u(true);
      }

   }
}
