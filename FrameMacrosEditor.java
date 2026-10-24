package gg.vape.ui.click.frame.impl;

import gg.vape.Vape;
import gg.vape.module.Macro;
import gg.vape.ui.click.GuiMouseEvent;
import gg.vape.ui.click.component.AnimatedIconButtonComponent;
import gg.vape.ui.click.component.FadingTruncatedTextComponent;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.component.IconButtonComponent;
import gg.vape.ui.click.component.gui.InteractiveComponent;
import gg.vape.ui.click.component.gui.TextButton;
import gg.vape.ui.click.component.input.BindableInputComponent;
import gg.vape.ui.click.component.value.BooleanToggleComponent;
import gg.vape.ui.click.component.value.RandomRangeSliderComponent;
import gg.vape.ui.font.SmoothFontRenderer;
import gg.vape.utils.render.GuiRenderPrimitives;
import java.awt.Color;

public class FrameMacrosEditor extends InteractiveComponent {
   private RandomRangeSliderComponent Q;
   private Macro q1;
   private final TextButton q5;
   private BooleanToggleComponent qz;
   private final AnimatedIconButtonComponent K;
   private RandomRangeSliderComponent qR;
   private Macro q3;
   private BindableInputComponent qr;
   private final IconButtonComponent v;
   private FrameMacros qQ;
   private FadingTruncatedTextComponent I;
   private final TextButton b;
   private boolean qn;

   public void H() {
      SmoothFontRenderer smoothFontRenderer = this.getFontRenderer(0.9);
      double d2 = smoothFontRenderer.d(this.q1.getName());
      double d3 = this.n() + (double)9.0F - d2 / (double)2.0F;
      double d4 = this.n() + (double)9.0F;
      double d5 = this.G$src$D$1b2f02a() + (double)10.0F;
      this.I.K(d5);
      this.I.S(d3);
      this.I.setMaxWidth(this.qn ? this.A() - (double)20.0F - (double)8.0F : (double)65.0F - this.qr.A());
      if (this.qn) {
         GuiRenderPrimitives.d(this.G$src$D$1b2f02a() + (double)5.0F - (double)0.5F, this.n() + (double)0.5F, this.A() - (double)10.0F + (double)1.0F, this.L() - (double)1.0F, J.l);
      }

      GuiRenderPrimitives.d(this.G$src$D$1b2f02a() + (double)5.0F, this.n() + (double)1.0F, this.A() - (double)10.0F, this.L() - (double)2.0F, J.m);
      if (this.qn) {
         double d = this.G$src$D$1b2f02a() + (double)5.0F;
         double d6 = this.n() + (double)20.0F;
         double d7 = this.A() - (double)10.0F;
         this.qR.K(d);
         this.qR.S(d6);
         this.qR.o(d7);
         this.qz.K(d);
         double var23;
         this.qz.S(var23 = d6 + this.qR.L());
         this.qz.o(d7 - (double)6.0F);
         d6 = var23 + this.qz.L();
         if (this.qz.getBooleanValue().getEffectiveValue()) {
            this.Q.setVisible(true);
            this.Q.K(d);
            this.Q.S(d6);
            this.Q.o(d7);
            d6 += this.Q.L();
         } else {
            this.Q.setVisible(false);
            d6 += (double)5.0F;
         }

         double d8 = (this.A() - (double)25.0F) / (double)5.0F;
         double d9 = this.G$src$D$1b2f02a() + (double)10.0F;
         if (this.K != null) {
            this.K.K(d9);
            this.K.S(d6);
            this.K.Y((double)18.0F);
            this.K.o(d8);
         }

         double var26;
         this.q5.K(var26 = d9 + d8 + (double)2.5F);
         this.q5.S(d6);
         this.q5.Y((double)18.0F);
         this.q5.o(d8 * (double)2.0F);
         this.b.K(var26 + d8 * (double)2.0F + (double)2.5F);
         this.b.S(d6);
         this.b.Y((double)18.0F);
         this.b.o(d8 * (double)2.0F);
      }

      double d = this.G$src$D$1b2f02a() + this.A() - (double)15.0F;
      if (this.v.V$src$Z$1xhop3l()) {
         this.v.setOverrideColor(this.qn ? J.f : null);
         this.v.K(d);
         this.v.S(this.n());
         this.v.Y((double)18.0F);
         d -= (double)5.0F;
      }

      if (!this.qn) {
         this.qr.getBindLabel().setMaxWidth((double)20.0F);
         double var21;
         this.qr.K(var21 = d - this.qr.A());
         this.qr.S(this.n() + (double)4.0F);
         GuiRenderPrimitives.F("newclock", d = var21 - (double)9.0F, d4, (double)8.0F, (double)8.0F, J.K);
      }

   }

   public void g(GuiMouseEvent guiMouseEvent) {
      if (this.qQ.l$src$Lgg_vape_ui_click_frame_impl_FrameMacrosEditor_$1712c36() != null && this.qQ.l$src$Lgg_vape_ui_click_frame_impl_FrameMacrosEditor_$1712c36().equals(this) && !this.getBounds().J((double)guiMouseEvent.getX(), (double)guiMouseEvent.getY())) {
         if (!this.v.V$src$Z$1xhop3l()) {
            this.qQ.X((FrameMacrosEditor)null);
         } else {
            this.v.dispatchPrimaryClick();
         }
      } else {
         super.g(guiMouseEvent);
      }
   }

   public void I() {
   }

   public Macro z() {
      return this.q1;
   }

   public FrameMacrosEditor(FrameMacros frameMacros, Macro macro) {
      this.b = (new TextButton("Update", 0.8, J.B)).setTransparentBackgroundBorder(J.l);
      this.q5 = (new TextButton("Cancel", 0.8, J.B)).setTransparentBackgroundBorder(J.l);
      this.K = new AnimatedIconButtonComponent("newtrash", 0.8, J.d);
      this.v = new IconButtonComponent("settingdots");
      this.b.setDeriveTextColorFromBackground(false);
      this.q5.setDeriveTextColorFromBackground(false);
      this.qQ = frameMacros;
      this.q1 = macro;
      this.qr = new BindableInputComponent(macro);
      this.v.addClickListener(() -> {
         thisx.qn = !thisx.qn;
         if (thisx.qn) {
            frameMacros.X(this);
            thisx.q3 = Macro.create(macro.getName()).loadJson(macro.toJson());
            thisx.qz.setVisible(true);
            thisx.qR.setVisible(true);
            thisx.Q.setVisible(true);
            thisx.q5.setVisible(true);
            thisx.b.setVisible(true);
            thisx.K.setVisible(true);
            thisx.qr.setVisible(false);
         } else {
            frameMacros.X((FrameMacrosEditor)null);
            thisx.qz.setVisible(false);
            thisx.qR.setVisible(false);
            thisx.Q.setVisible(false);
            thisx.q5.setVisible(false);
            thisx.b.setVisible(false);
            thisx.K.setVisible(false);
            thisx.qr.setVisible(true);
         }

         frameMacros.l$src$V$1mibm4x();
      });
      this.qR = new RandomRangeSliderComponent(macro.getDelay());
      this.Q = new RandomRangeSliderComponent(macro.getDoubleClickDelay());
      this.qz = new BooleanToggleComponent(macro.getDoubleClick());
      this.qz.addMouseListener(new FrameMacrosEditorRefreshFrameMouseListener(this, frameMacros));
      this.K.addClickListener(() -> {
         Vape.INSTANCE.getMacrosManager().removeMacro(macro);
         frameMacros.X((FrameMacrosEditor)null);
      });
      this.q5.addClickListener(() -> {
         if (this.q3 != null) {
            macro.loadJson(this.q3.toJson());
         }

         this.v.dispatchPrimaryClick();
      });
      this.b.addClickListener(() -> {
         if (!this.v.V$src$Z$1xhop3l()) {
            frameMacros.X((FrameMacrosEditor)null);
         } else {
            this.v.dispatchPrimaryClick();
         }

      });
      this.qz.setVisible(false);
      this.qz.setUseExplicitWidth(true);
      this.qz.setDisabledOverlayColor(J.m);
      this.qR.setVisible(false);
      this.qR.setUseExplicitWidth(true);
      this.qR.setDisabledOverlayColor(J.m);
      this.Q.setVisible(false);
      this.Q.setUseExplicitWidth(true);
      this.Q.setDisabledOverlayColor(J.m);
      this.q5.setVisible(false);
      this.b.setVisible(false);
      this.K.setVisible(false);
      this.K.setDisabledOverlayColor(J.m);
      this.I = new FadingTruncatedTextComponent(macro.getName(), (double)40.0F, 0.9, J.Z, J.m, false, false);
      this.addChildren(new GuiComponent[]{this.I, this.v, this.qr, this.qz, this.qR, this.Q, this.q5, this.b, this.K});
   }

   public double C() {
      return this.qn ? (this.qz.getBooleanValue().getEffectiveValue() ? (double)120.0F : (double)90.0F) : (double)18.0F;
   }

   private void lambda$setInitialMode$4() {
      this.setVisible(false);
      this.qQ.X((FrameMacrosEditor)null);
   }

   private void lambda$setInitialMode$5() {
      this.q1 = Macro.create(this.q1.getName()).loadJson(this.q1.toJson());
      Vape.INSTANCE.getMacrosManager().addMacro(this.q1);
      this.setVisible(false);
      this.qQ.X((FrameMacrosEditor)null);
   }

   public double x() {
      return (double)110.0F;
   }

   public void F() {
   }

   public void u() {
   }

   public void N$src$V$13y6z98() {
      this.v.dispatchPrimaryClick();
      this.v.setVisible(false);
      this.qr.setVisible(false);
      this.K.setVisible(false);
      this.q5.setLabelText("Cancel");
      this.q5.setBackgroundAnimationColors(new Color(0, 0, 0, 0), J.d);
      this.b.setLabelText("Add");
      this.b.setBackgroundAnimationColors(new Color(0, 0, 0, 0), J.B);
      this.q5.setClickListener(this::lambda$setInitialMode$4);
      this.b.setClickListener(this::lambda$setInitialMode$5);
   }
}
