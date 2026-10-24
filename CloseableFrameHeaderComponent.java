package gg.vape.ui.click.frame;

import gg.vape.ui.click.GuiMouseEvent;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.component.IconButtonComponent;
import gg.vape.ui.font.SmoothFontRenderer;
import gg.vape.utils.render.ImageRenderer;
import java.awt.Color;

public class CloseableFrameHeaderComponent extends FrameHeaderComponent {
   private String O;
   private static int[] Q;
   private double v;
   private String I;
   private boolean G;
   private boolean K;
   private IconButtonComponent R;

   public CloseableFrameHeaderComponent(Frame frame, String string, String string2) {
      this(frame, string, string2, (double)1.0F);
   }

   public void F() {
   }

   public void g(GuiMouseEvent guiMouseEvent) {
   }

   static boolean c(CloseableFrameHeaderComponent closeableFrameHeaderComponent, boolean bl) {
      closeableFrameHeaderComponent.K = bl;
      return closeableFrameHeaderComponent.K;
   }

   public void Y(boolean bl) {
      this.G = bl;
   }

   public static void o(int[] nArray) {
      Q = nArray;
   }

   public void H() {
      SmoothFontRenderer smoothFontRenderer = this.getFontRenderer(0.9);
      this.getClass();
      float f = 8.0F * (float)this.v * 0.9F;
      Color color = J.A;
      double d = smoothFontRenderer.d(this.O);
      double d2 = this.n() + this.L() / (double)2.0F - d / (double)2.0F;
      double d3 = this.n() + this.L() / (double)2.0F - (double)(f / 2.0F);
      double d4 = this.G$src$D$1b2f02a() + (double)6.0F;
      double d5 = (double)32.0F * ((double)f / (ImageRenderer.getImageWidth(this.I) * this.v));
      smoothFontRenderer.d(this.O, d4 + d5 + (double)2.0F, d2, color);
      if (this.G) {
         ImageRenderer.drawImage(color, (float)d4, (float)d3, this.I, f, f, false);
      }

      this.R.setOverrideColor(this.w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0().y$src$Z$1f55jvh() ? J.f : null);
      double d6 = this.G$src$D$1b2f02a() + this.A() - (double)7.5F;
      this.getClass();
      this.R.K(d6 - (double)8.0F);
      this.R.S(this.n());
      this.R.Y(this.L());
      this.R.setIconResource(this.K ? "downexpand" : "upcollapse");
   }

   public static int[] A$src$AI$cq4488() {
      return Q;
   }

   public void u() {
   }

   public void I() {
   }

   public CloseableFrameHeaderComponent(Frame frame, String string, String string2, double d) {
      super(frame);
      this.G = true;
      this.I = string;
      this.O = string2;
      this.v = d;
      this.K = ((CollapsibleFrame)frame).q();
      this.R = new IconButtonComponent(this.K ? "downexpand" : "upcollapse", 0.3);
      this.R.addClickListener(new FrameHeaderCloseToggleClickHandler(this, frame));
      this.addChildren(new GuiComponent[]{this.R});
   }

   static {
      o((int[])null);
   }
}
