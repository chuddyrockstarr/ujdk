package gg.vape.ui.click.component.gui;

import gg.vape.ui.font.SmoothFontRenderer;
import gg.vape.utils.render.GuiRenderPrimitives;
import java.awt.Color;

public class UnderlinedTextLabel extends TextLabel {
   private Color underlineColor;

   public UnderlinedTextLabel(String text, double fontScale, Color textColor, Color underlineColor) {
      super(text, fontScale);
      this.underlineColor = J.Z;
      this.setTextColor(textColor);
      this.underlineColor = underlineColor;
   }

   public double C() {
      SmoothFontRenderer smoothFontRenderer = this.getFontRenderer(this.fontScale);
      return smoothFontRenderer.d(this.text);
   }

   public void H() {
      SmoothFontRenderer smoothFontRenderer = this.getFontRenderer(this.fontScale);
      double d = smoothFontRenderer.d(this.text);
      double d2 = smoothFontRenderer.N(this.text) + (double)1.0F;
      double d3 = this.G$src$D$1b2f02a() + this.A() / (double)2.0F;
      double d4 = this.n() + this.L() / (double)2.0F - d / (double)2.0F;
      Color color = this.w$src$Z$e457mb() ? this.getTextColor().brighter() : this.getTextColor();
      smoothFontRenderer.W(this.text, d3, d4, color);
      double d5 = d3 - d2 / (double)2.0F + (double)1.0F;
      GuiRenderPrimitives.z(d5, d4 + d, d5 + d2, d4 + d, (double)1.0F, (double)1.5F, color);
   }

   public double x() {
      SmoothFontRenderer smoothFontRenderer = this.getFontRenderer(this.fontScale);
      return smoothFontRenderer.N(this.text);
   }

   public UnderlinedTextLabel(String text, double fontScale) {
      super(text, fontScale);
      this.underlineColor = J.Z;
   }

   public Color getUnderlineColor() {
      return this.underlineColor;
   }

   public UnderlinedTextLabel(String text, double fontScale, Color color) {
      super(text, fontScale);
      this.underlineColor = J.Z;
      this.setTextColor(color);
      this.underlineColor = color;
   }

   public UnderlinedTextLabel(String text) {
      super(text);
      this.underlineColor = J.Z;
   }
}
