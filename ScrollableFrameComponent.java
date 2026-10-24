package gg.vape.ui.click.frame;

import gg.vape.ui.click.layout.WrappingFlowLayout;
import org.jetbrains.annotations.Nullable;

public class ScrollableFrameComponent extends FrameComponent {
   private static final String eb = "wrap, widthwrap";
   private @Nullable Double qE;
   private @Nullable Double qb;
   private final WrappingFlowLayout qP;

   public @Nullable Double d$src$Ljava_lang_Double_$1rarrr3() {
      return this.qE;
   }

   public void V() {
   }

   public ScrollableFrameComponent v(@Nullable Double d) {
      this.qE = d;
      return this;
   }

   public @Nullable Double o$src$Ljava_lang_Double_$1bov8d0() {
      return this.qb;
   }

   public double x() {
      double d = this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().C();
      Double d2 = this.qE;
      return d2 != null ? Math.min(this.u$src$D$ba5a9m(), Math.max(d2, d)) : Math.min(this.u$src$D$ba5a9m(), d);
   }

   public ScrollableFrameComponent h(@Nullable Double d) {
      this.qb = d;
      return this;
   }

   public ScrollableFrameComponent(double d) {
      this.qP = new WrappingFlowLayout(this);
      this.qP.o(d);
      this.N(this.qP);
      this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().M("wrap, widthwrap");
   }

   public double u$src$D$ba5a9m() {
      return this.qP == null ? (double)0.0F : this.qP.B();
   }

   public ScrollableFrameComponent(double d, double d2) {
      this(d);
      this.qE = d;
      this.qb = d2;
   }

   private double R$src$D$aqwhhz() {
      double d = this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().y();
      Double d2 = this.qb;
      return d2 != null ? Math.max(d2, d) : d;
   }

   public double C() {
      double d = this.R$src$D$aqwhhz();
      return this.NS ? Math.min(d, this.d$src$D$ibccpu()) : d;
   }
}
