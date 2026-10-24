package gg.vape.ui.click.component.gui;

import gg.vape.ui.click.animation.ColorAnimation;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.font.SmoothFontRenderer;
import gg.vape.utils.render.GuiRenderPrimitives;
import java.awt.Color;

public class AnimatedCenteredTextLabelComponent extends TextLabel {
   private float borderAlpha;
   private ColorAnimation borderAnimation;
   private Color textColor;

   public double C() {
      return (double)0.0F;
   }

   public AnimatedCenteredTextLabelComponent setTextColor(Color textColor) {
      this.textColor = textColor;
      return this;
   }

   public AnimatedCenteredTextLabelComponent(String text, Color borderColor) {
      super(text);
      this.textColor = J.Z;
      this.borderAlpha = 1.0F;
      this.borderAnimation = new ColorAnimation(0.15, borderColor, borderColor.brighter());
   }

   public void H() {
      GuiRenderPrimitives.P(this.G$src$D$1b2f02a(), this.n(), this.A(), this.L(), this.borderAnimation.getInterpolatedColor(), 2.0F, this.borderAlpha, 1.0F);
      SmoothFontRenderer smoothFontRenderer = this.isUsingAlternateFont() ? this.getAlternateFontRenderer(this.fontScale) : this.getFontRenderer(this.fontScale);
      double d = smoothFontRenderer.d(this.text);
      double d2 = this.n() + this.L() / (double)2.0F - d / (double)2.0F;
      smoothFontRenderer.W(this.text, this.G$src$D$1b2f02a() + this.A() / (double)2.0F, d2, this.getTextColor());
   }

   public GuiComponent setBorderAnimationColors(Color normalColor, Color hoverColor) {
      this.borderAnimation = new ColorAnimation(0.15, normalColor, hoverColor);
      return super.setDisabledOverlayColor(normalColor);
   }

   public double x() {
      return (double)0.0F;
   }

   public void setBorderAlpha(float borderAlpha) {
      this.borderAlpha = borderAlpha;
   }

   public Color getTextColor() {
      return this.textColor;
   }

   public void setHovered(boolean hovered) {
      if (this.w$src$Z$e457mb() != hovered) {
         this.borderAnimation.J();
      }

      super.setHovered(hovered);
   }
}
