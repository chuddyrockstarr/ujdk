package gg.vape.ui.click.frame;

import gg.vape.friend.ui.OnlineCombatStatsSettingsFrame;
import gg.vape.ui.click.GuiMouseEvent;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.component.IconButtonComponent;
import gg.vape.ui.font.SmoothFontRenderer;
import gg.vape.utils.render.ImageRenderer;
import java.awt.Color;

public class SettingsFrameHeaderComponent extends FrameHeaderComponent {
   private String i;
   private IconButtonComponent I = new IconButtonComponent("newpin");
   private String R;
   private IconButtonComponent Q = new IconButtonComponent("settingdots");

   public void u() {
   }

   public void F() {
   }

   public IconButtonComponent x$src$Lgg_vape_ui_click_component_IconButtonComponent_$x1h5th() {
      return this.Q;
   }

   private void A$src$V$18zygv7() {
      SmoothFontRenderer smoothFontRenderer = this.getFontRenderer(0.9);
      Color color = J.A;
      double d = smoothFontRenderer.d(this.i);
      float f = (float)ImageRenderer.getImageWidth(this.R) / 3.5F;
      float f2 = (float)ImageRenderer.getImageHeight(this.R) / 3.5F;
      double d2 = this.n() + this.L() / (double)2.0F - d / (double)2.0F + (double)1.0F;
      double d3 = this.n() + this.L() / (double)2.0F - (double)(f2 / 2.0F) + (double)1.0F;
      double d4 = this.G$src$D$1b2f02a() + (double)6.0F;
      this.I.setImageDivisor((double)3.5F);
      this.Q.setImageDivisor(3.2);
      smoothFontRenderer.d(this.i, d4 + (double)f + (double)4.0F, d2, color);
      ImageRenderer.drawImage(color, (float)d4, (float)d3, this.R, f, f2, false);
      this.I.setOverrideColor(this.w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0().y$src$Z$1f55jvh() ? J.f : J.W.darker());
      this.I.K(this.G$src$D$1b2f02a() + this.A() - (double)20.0F);
      this.I.S(this.n() + (double)1.0F);
      this.I.Y(this.L());
      this.I.o((double)10.0F);
      this.Q.setOverrideColor(this.w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0() instanceof CollapsibleFrame && !((CollapsibleFrame)this.w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0()).q() ? J.f : null);
      this.Q.K(this.G$src$D$1b2f02a() + this.A() - (double)12.0F);
      this.Q.S(this.n() + (double)1.0F);
      this.Q.Y(this.L());
   }

   public void H() {
      this.A$src$V$18zygv7();
   }

   public void g(GuiMouseEvent guiMouseEvent) {
   }

   public SettingsFrameHeaderComponent(Frame frame, String string, String string2) {
      super(frame);
      this.R = string;
      this.i = string2;
      this.I.addClickListener(new SettingsFrameHeaderToggleClickListener(this));
      this.Q.addClickListener(new SettingsFrameHeaderCollapseClickListener(this, frame));
      this.addChildren(new GuiComponent[]{this.Q, this.I});
      this.I.setImageDivisor((double)3.5F);
   }

   public void I() {
      if (this.w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0() instanceof CollapsibleFrame && !((CollapsibleFrame)this.w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0()).q() && !(this.w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0() instanceof OnlineCombatStatsSettingsFrame)) {
         ((CollapsibleFrame)this.w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0()).w();
      }

   }
}
