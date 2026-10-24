package gg.vape.ui.click.frame;

import func.skidline.RectData;
import gg.vape.Vape;
import gg.vape.input.MouseInput;
import gg.vape.mapping.MappedClasses;
import gg.vape.module.none.ClientSettings;
import gg.vape.ui.click.GuiMouseEvent;
import gg.vape.ui.click.MouseButton;
import gg.vape.ui.click.MousePosition;
import gg.vape.ui.click.animation.ColorAnimation;
import gg.vape.ui.click.component.ColorDividerComponent;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.layout.ComponentLayout;
import gg.vape.utils.render.GuiRenderPrimitives;
import gg.vape.utils.render.RenderUtils;
import gg.vape.wrapper.impl.Util;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GLContext;

public abstract class FrameComponent extends GuiComponent {
   private static final String mb;
   private FrameHeaderComponent N5;
   private static int NX;
   private @Nullable Color N2;
   private boolean NK;
   private boolean G;
   private double b;
   private static final long yb;
   private boolean a;
   private boolean NU;
   protected RectData No;
   private double Nd;
   protected boolean NS;
   private boolean O;
   private boolean i;
   private boolean Nk;
   private FrameScrollbarPlacement Ni;
   private boolean R;
   private boolean Nj;
   private ComponentLayout NI;
   protected RectData NH;
   private boolean N9;
   private boolean v;
   private int NZ;
   private boolean NW;
   public double K = (double)300.0F;
   private boolean Q;
   private ColorAnimation NR;
   private RectData N7;
   private MousePosition NA;
   private ColorAnimation Nn;
   private ColorDividerComponent I;
   private boolean o;

   public void T(double d) {
      for(GuiComponent guiComponent : this.f()) {
         if (!(guiComponent instanceof FrameHeaderComponent)) {
            guiComponent.S(((RectData)this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().m().get(guiComponent)).W() + d);
         }
      }

   }

   public RectData s$src$Lfunc_skidline_RectData_$1a7j2ql() {
      return this.NH;
   }

   public void F(FrameScrollbarPlacement frameScrollbarPlacement) {
      this.Ni = frameScrollbarPlacement;
   }

   public void I(boolean bl) {
      this.NW = bl;
      this.O$src$V$hzsoor();
   }

   public void g(@Nullable Color color) {
      this.N2 = color;
   }

   public static int k$src$I$if6wzo() {
      return NX;
   }

   public void m(GuiComponent guiComponent, GuiComponent guiComponent2) {
      this.NI.v(guiComponent, guiComponent2);
      this.l$src$V$1mibm4x();
   }

   public void T(boolean bl) {
      this.Nj = bl;
   }

   public void H(boolean bl) {
      try {
         if (GuiRenderPrimitives.V()) {
            long l = Util.glfwGetCurrentContext();
            if (l == 0L) {
               throw new Exception("");
            }
         } else if (MappedClasses.Y2 != null) {
            GLContext.getCapabilities();
         }
      } catch (Exception var5) {
         this.F(bl);
         return;
      }

      this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().L();
      this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().p();
      this.D$src$V$htqy5s();
      if (this.NS) {
         this.W(this.J$src$D$hx1pag());
      }

      for(GuiComponent guiComponent : this.f()) {
         if (guiComponent instanceof FrameComponent) {
            FrameComponent frameComponent = (FrameComponent)guiComponent;
            frameComponent.z$src$V$infu7a();
            if (!frameComponent.isChildRenderingSuppressed() || bl) {
               frameComponent.H(bl);
            }
         }
      }

   }

   public void N(ComponentLayout componentLayout) {
      this.NI = componentLayout;
   }

   public Color v$src$Ljava_awt_Color_$1s755as() {
      return this.N2 != null ? this.N2 : J.s;
   }

   public void X(boolean bl) {
      this.G = bl;
   }

   public void E(boolean bl) {
      this.N9 = bl;
   }

   public void r(boolean bl) {
      this.R = bl;
   }

   public boolean s$src$Z$ijla57() {
      return this.G;
   }

   public void D(boolean bl) {
      this.NS = bl;
   }

   public boolean g$src$Z$iczr0v() {
      return this.R;
   }

   public void s(boolean bl) {
      this.Q = bl;
   }

   public int u$src$I$ikouxa() {
      return this.NZ;
   }

   public double J$src$D$hx1pag() {
      return this.b;
   }

   public void a(boolean bl) {
      this.O = bl;
   }

   public boolean G(double d, double d2) {
      return this.getBounds().J(d, d2);
   }

   public void F(boolean bl) {
      this.i = true;
      this.o = bl;
   }

   public void Y(FrameHeaderComponent frameHeaderComponent) {
      this.N5 = frameHeaderComponent;
      this.h(frameHeaderComponent, mb);
   }

   public boolean k$src$Z$if6xeb() {
      return this.NS;
   }

   public boolean Q$src$Z$i0w9yx() {
      return this.O;
   }

   private void l(GuiComponent guiComponent, boolean bl) {
      for(GuiComponent guiComponent2 : guiComponent.f()) {
         if (guiComponent2 instanceof FrameComponent) {
            FrameComponent frameComponent = (FrameComponent)guiComponent2;
            frameComponent.z$src$V$infu7a();
            if (!frameComponent.isChildRenderingSuppressed() || bl) {
               frameComponent.H(bl);
               this.l(frameComponent, bl);
            }
         }
      }

   }

   public void addChildren(GuiComponent... guiComponentArray) {
      for(GuiComponent guiComponent : guiComponentArray) {
         this.h(guiComponent);
      }

   }

   public void F() {
   }

   public ComponentLayout l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij() {
      return this.NI;
   }

   public double O$src$D$hzso99() {
      return this.Nd;
   }

   public void k(boolean bl) {
      this.a = bl;
   }

   public void removeMarkedChildren() {
      for(GuiComponent guiComponent : new CopyOnWriteArrayList(this.f())) {
         if (guiComponent.isRemovable()) {
            this.removeChild(guiComponent);
         }
      }

   }

   private void D$src$V$htqy5s() {
      this.NS = this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().y() >= this.K && this.NU;
   }

   public void w(boolean bl) {
      this.NK = bl;
   }

   public List<GuiComponent> f() {
      return this.NI.c();
   }

   private void G$src$V$hvebxv() {
      if (this.Nk) {
         if (!MouseInput.isButtonDown(MouseButton.LEFT_CLICK.ordinal())) {
            this.Nk = false;
         } else {
            double d = this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().y();
            MousePosition mousePosition = RenderUtils.h();
            double d2 = (double)(mousePosition.H - this.NA.H);
            this.NA = mousePosition;
            this.W(this.b - d2 * (d / this.K));
         }
      }
   }

   public FrameHeaderComponent j$src$Lgg_vape_ui_click_frame_FrameHeaderComponent_$175vsfc() {
      return this.N5;
   }

   public boolean v$src$Z$il8nxa() {
      return this.Nj;
   }

   public static int R$src$I$i1g25n() {
      int n = k$src$I$if6wzo();
      return 0;
   }

   public RectData N$src$Lfunc_skidline_RectData_$1o0utwi() {
      return this.No;
   }

   private void O$src$V$hzsoor() {
      if (this.NW) {
         Color color = this.getDisabledOverlayColor();
         Color color2 = color.darker();
         Color color3 = color.brighter();
         this.Nn = new ColorAnimation(0.15, new Color(Math.min(color.getRed(), 255), Math.min(color.getGreen(), 255), Math.min(color.getBlue(), 255), 0), color2);
         this.NR = new ColorAnimation(0.15, new Color(Math.min(color.getRed() + 5, 255), Math.min(color.getGreen() + 5, 255), Math.min(color.getBlue() + 5, 255), 30), color3);
      } else {
         this.Nn = new ColorAnimation(0.15, new Color(J.m.getRed(), J.m.getGreen(), J.m.getBlue(), 0), J.m);
         this.NR = new ColorAnimation(0.15, new Color(J.l.getRed(), J.l.getGreen(), J.l.getBlue(), 30), J.l);
      }

   }

   protected void R$src$V$i1g2gu() {
      double d = this.A();
      double d2 = this.Nd;
      double d3 = this.n() + this.L() - d2;
      Color color = this.v$src$Ljava_awt_Color_$1s755as();
      GuiRenderPrimitives.C(this.G$src$D$1b2f02a(), d3, d, d2, color);
   }

   public void R(double d, double d2) {
      for(GuiComponent guiComponent : this.f()) {
         guiComponent.K(guiComponent.G$src$D$1b2f02a() + d);
         guiComponent.S(guiComponent.n() + d2);
         if (guiComponent instanceof FrameComponent) {
            ((FrameComponent)guiComponent).R(d, d2);
         }
      }

   }

   public boolean z$src$Z$infuaq() {
      return this.a;
   }

   public boolean F$src$Z$huujfy() {
      return this.NW;
   }

   public void m(boolean bl) {
      this.v = bl;
   }

   public void dispatchMouseEvent(GuiMouseEvent guiMouseEvent) {
      if (this.No.J((double)guiMouseEvent.getX(), (double)guiMouseEvent.getY())) {
         this.NA = RenderUtils.h();
         this.Nk = true;
      } else if (this.NH.J((double)guiMouseEvent.getX(), (double)guiMouseEvent.getY())) {
         this.NA = (double)guiMouseEvent.getY() > this.No.W() ? new MousePosition((int)this.No.o(), (int)(this.No.W() + this.No.R())) : new MousePosition((int)this.No.o(), (int)this.No.W());
         this.Nk = true;
      } else {
         super.dispatchMouseEvent(guiMouseEvent);
      }
   }

   public void h(RectData rectData) {
      this.N7 = rectData;
   }

   public RectData getBounds() {
      return this.NS ? new RectData(this.G$src$D$1b2f02a(), this.n(), this.A(), this.d$src$D$ibccpu()) : new RectData(this.G$src$D$1b2f02a(), this.n(), this.A(), this.L());
   }

   public void u() {
      this.V();
   }

   public void Y() {
   }

   public static void C(int n) {
      NX = n;
   }

   public boolean H$src$Z$hvy4mo() {
      return this.N9;
   }

   public void I() {
      if (this.i) {
         this.H(this.o);
         this.i = false;
      }

      this.v();
   }

   public ArrayList<GuiComponent> X(ArrayList<GuiComponent> arrayList, int n) {
      int n2 = arrayList.size();

      for(int i = n; i < n2; ++i) {
         arrayList.addAll(((GuiComponent)arrayList.get(i)).f());
      }

      return arrayList.size() > n2 ? this.X(arrayList, n2 - 1) : arrayList;
   }

   public void C$src$V$nadrmg() {
      this.t(Double.MAX_VALUE);
   }

   public void f(double d) {
      this.Nd = d;
   }

   public void b(double d) {
      double d2 = this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().y();
      if (this.NK) {
         if (d < (double)0.0F) {
            d = (double)0.0F;
         }

         if (d > d2 - this.K) {
            d = d2 - this.K;
         }
      } else {
         if (d > (double)0.0F) {
            d = (double)0.0F;
         }

         if (d < -(d2 - this.K)) {
            d = -(d2 - this.K);
         }
      }

      if (this.NK) {
         if (d < (double)0.0F) {
            d = (double)0.0F;
         }
      } else if (d > (double)0.0F) {
         d = (double)0.0F;
      }

      this.b = d;

      for(GuiComponent guiComponent : this.f()) {
         if (!(guiComponent instanceof FrameHeaderComponent)) {
            double d3 = ((RectData)this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().m().get(guiComponent)).W();
            double d4 = d3 + d;
            guiComponent.S(d4);
         }
      }

      this.z$src$V$infu7a();
   }

   public void N(boolean bl) {
      this.NU = bl;
   }

   public void z(boolean bl) {
      double d = this.R ? (double)2.0F : (double)0.0F;
      GuiRenderPrimitives.p(this.G$src$D$1b2f02a(), this.n(), this.A(), bl ? this.K + d : this.getComponentHeight() + d, this.getDisabledOverlayColor(), this.Q && this.j$src$Lgg_vape_ui_click_frame_FrameHeaderComponent_$175vsfc() != null, 1.5F, 1.0F, 8.0F, J.u, this.NZ);
   }

   public abstract void V();

   public void P$src$V$i0cha4() {
      this.F(false);
   }

   public void h(GuiComponent guiComponent, Object... objectArray) {
      guiComponent.setParentFrameComponent(this);
      this.NI.o(guiComponent, objectArray);
      this.l$src$V$1mibm4x();
   }

   public void z$src$V$infu7a() {
      for(GuiComponent guiComponent : this.f()) {
         if (!(guiComponent instanceof FrameHeaderComponent) && !guiComponent.isIgnoreFrameClipping()) {
            double d = guiComponent.n();
            boolean bl = d + guiComponent.L() < this.n() || d > this.n() + this.K;
            guiComponent.setChildRenderingSuppressed(bl && this.NU);
         }
      }

   }

   public void l$src$V$1mibm4x() {
      this.H(false);
   }

   public void S(int n) {
      this.NZ = n;
   }

   public FrameComponent() {
      this.I = new ColorDividerComponent(J.l);
      this.NI = new ComponentLayout(this);
      this.No = new RectData((double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F);
      this.NH = new RectData((double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F);
      this.NU = true;
      this.Ni = FrameScrollbarPlacement.INSIDE;
      this.Nj = true;
      this.NW = false;
      this.NK = false;
      this.O = false;
      this.a = false;
      this.G = false;
      this.Q = true;
      this.R = true;
      this.NZ = (int)yb;
      this.N9 = false;
      this.N2 = null;
      this.Nd = (double)0.5F;
      this.O$src$V$hzsoor();
   }

   public double d$src$D$ibccpu() {
      return this.K;
   }

   public boolean isBlatantMod() {
      return this.v;
   }

   private boolean M$src$Z$hyp3lh() {
      double d = this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().y() - this.K;
      if (d <= (double)0.0F) {
         return false;
      } else {
         double d2 = 0.001;
         if (this.NK) {
            return this.b < d - 0.001;
         } else {
            return this.b > -d + 0.001;
         }
      }
   }

   public void M() {
      boolean bl = this.w$src$Z$e457mb() || this.Nk;
      this.NR.u(bl);
      this.Nn.u(bl);
      if (this.Nj) {
         GuiRenderPrimitives.e(this.NH.o(), this.NH.W(), this.NH.e(), this.NH.R(), this.Nn.getInterpolatedColor(), false, 1.0F, 0.5F);
      }

      GuiRenderPrimitives.e(this.No.o(), this.No.W(), this.No.e(), this.No.R(), this.NR.getInterpolatedColor(), false, 1.0F, 0.5F);
   }

   public void J() {
      if (this.NS) {
         int n = MouseInput.getScrollDelta();
         if (n != 0) {
            this.W(this.J$src$D$hx1pag() + (double)(n / 15));
         }

         if (this.No.Z(RenderUtils.h())) {
            return;
         }
      }

      super.J();
   }

   private static Exception b(Exception exception) {
      return exception;
   }

   public void c() {
      this.x$src$V$1xc6lqe();
      if (this.i) {
         this.H(this.o);
         this.i = false;
      }

      if (this.a) {
         this.H(this.G);
         this.i = false;
      }

      this.D$src$V$htqy5s();
      this.H();
      if (this.N7 == null && this.isShowDisabledOverlay()) {
         this.z(this.NS);
      }

      int n = this.NS && this.N5 != null ? 3 : 0;
      if (this.V$src$Z$1xhop3l()) {
         boolean bl = false;
         if (this.NS || this.N7 != null) {
            if (this.N7 != null) {
               RenderUtils.m(this.N7.o(), this.N7.W(), this.N7.e(), this.N7.R());
            } else {
               double d5 = this.G$src$D$1b2f02a() + this.A();
               double d4 = this.No.o() + this.No.e();
               double d3 = (double)0.0F;
               if (d4 > d5) {
                  d3 = d4 - d5;
               }

               double d2 = this.n() + (double)n;
               double d = this.K - (double)n;
               if (this.N5 == null) {
                  --d2;
                  ++d;
               }

               RenderUtils.m(this.G$src$D$1b2f02a(), d2, this.A() + d3, d);
            }

            bl = true;
         }

         try {
            if (this.N7 != null && this.isShowDisabledOverlay()) {
               this.z(this.NS);
            }

            this.z$src$V$infu7a();

            for(GuiComponent guiComponent : this.f()) {
               if (guiComponent.V$src$Z$1xhop3l() && !guiComponent.isChildRenderingSuppressed()) {
                  try {
                     guiComponent.c();
                  } catch (Exception exception) {
                     Vape.logThrowable(exception);
                  }
               }
            }

            if (this.J$src$D$hx1pag() != (double)0.0F && this.NS && this.N5 != null) {
               GuiRenderPrimitives.d(this.N5.G$src$D$1b2f02a(), this.N5.n() + (double)n, this.N5.A(), this.N5.L() - (double)n, this.getDisabledOverlayColor());
               GuiRenderPrimitives.C(this.N5.G$src$D$1b2f02a(), this.N5.n(), this.N5.A(), this.N5.L(), this.getDisabledOverlayColor());
               this.N5.c();
               this.I.K(this.G$src$D$1b2f02a());
               this.I.S(this.N5.n() + this.N5.L());
               this.I.c();
            }

            if (this.NS) {
               this.G$src$V$hvebxv();
               if (this.NK) {
                  double d6 = this.Ni == FrameScrollbarPlacement.INSIDE ? (double)3.0F : (double)0.0F;
                  double d4 = this.N5 != null ? this.N5.L() : (double)0.0F;
                  double d3 = this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().y();
                  double d2 = (this.K - d4) / d3 * this.K;
                  double d = this.n() + this.K - d2 - this.b / d3 * (this.K - d4);
                  this.No = new RectData(this.G$src$D$1b2f02a() + this.A() - d6, d, (double)2.0F, d2);
                  this.NH = new RectData(this.G$src$D$1b2f02a() + this.A() - d6, this.n() + d4, (double)2.0F, this.K - d4);
               } else {
                  double d7 = this.N5 != null ? this.N5.L() : (double)0.0F;
                  double d4 = this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().y();
                  double d3 = this.n() + d7 - this.b / d4 * (this.K - d7);
                  double d2 = (this.K - d7) / d4 * this.K;
                  double d = this.Ni == FrameScrollbarPlacement.INSIDE ? (double)3.0F : (double)0.0F;
                  this.No = new RectData(this.G$src$D$1b2f02a() + this.A() - d, d3, (double)2.0F, d2);
                  this.NH = new RectData(this.G$src$D$1b2f02a() + this.A() - d, this.n() + d7, (double)2.0F, this.K - d7);
               }

               this.M();
            }
         } catch (Exception exception) {
            Vape.logThrowable(exception);
         }

         if (bl) {
            RenderUtils.T();
         }

         if (this.NS && this.H$src$Z$hvy4mo() && this.M$src$Z$hyp3lh()) {
            this.R$src$V$i1g2gu();
         }

         if (this.O) {
            GuiRenderPrimitives.P(this.G$src$D$1b2f02a() - (double)0.5F, this.n() - (double)0.5F, this.A() + (double)1.0F, (bl ? this.K + (double)1.0F : this.L() + (double)1.0F) + (double)2.0F, this.getDisabledOverlayColor().brighter(), 2.0F, 1.0F, 1.0F);
         }

      }
   }

   public void removeChild(GuiComponent guiComponent) {
      this.NI.g(guiComponent);
      this.l$src$V$1mibm4x();
   }

   public void H() {
      this.Y();
   }

   public void t(double d) {
      this.K = d;
   }

   public void t$src$V$zbu1jn() {
      for(GuiComponent guiComponent : new CopyOnWriteArrayList(this.f())) {
         this.removeChild(guiComponent);
      }

   }

   public void W(double d) {
      double d2 = this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().y();
      if (ClientSettings.activeComponent == null && !(d2 < this.K) && !this.NU) {
      }

      this.b(d);
   }

   public void v() {
   }

   public GuiComponent setDisabledOverlayColor(Color color) {
      GuiComponent guiComponent = super.setDisabledOverlayColor(color);
      this.O$src$V$hzsoor();
      return guiComponent;
   }

   static {
      C(67);
      mb = "wrap";
      yb = 3850539658056302607L;
   }
}
