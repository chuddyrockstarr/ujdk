package gg.vape.ui.click.component.gui;

import gg.vape.ui.click.animation.ColorAnimation;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.font.SmoothFontRenderer;
import gg.vape.unmap.ColorUtil;
import gg.vape.utils.render.GuiRenderPrimitives;
import java.awt.Color;
import org.jetbrains.annotations.Nullable;

public class TextButton extends TextLabel {
   private boolean deriveTextColorFromBackground;
   private boolean animateTextColor;
   public static final float IN = 2.0F;
   public static final float IQ = 1.0F;
   private Color hoverTextColor;
   private boolean useThemeBackground;
   private Color normalTextColor;
   private ColorAnimation backgroundAnimation;
   private ColorAnimation textAnimation;
   private float iconSize;
   private @Nullable String iconResource;
   private float cornerRadius;
   private Color borderColor;
   private float borderAlpha;

   public void setBorderAlpha(float borderAlpha) {
      this.borderAlpha = borderAlpha;
   }

   public void setCornerRadius(float cornerRadius) {
      this.cornerRadius = cornerRadius;
   }

   public void setIconSize(float iconSize) {
      this.iconSize = iconSize;
   }

   public TextButton(String string, double d, Color color, Color color2) {
      this(string, d, color, color2, (Color)null, 2.0F, 1.0F, (double)0.0F, (double)0.0F);
   }

   public void setAnimateTextColor(boolean animateTextColor) {
      this.animateTextColor = animateTextColor;
   }

   public double x() {
      return (double)0.0F;
   }

   public void setIconResource(String iconResource) {
      this.iconResource = iconResource;
   }

   public void setDeriveTextColorFromBackground(boolean deriveTextColorFromBackground) {
      this.deriveTextColorFromBackground = deriveTextColorFromBackground;
   }

   public void setUseThemeBackground(boolean useThemeBackground) {
      this.useThemeBackground = useThemeBackground;
   }

   public TextButton(String string, double d, Color color, Color color2, double d2, double d3) {
      this(string, d, color, color2, (Color)null, 2.0F, 1.0F, d2, d3);
   }

   public TextButton setTransparentBackgroundBorder(Color borderColor) {
      this.borderColor = borderColor;
      this.backgroundAnimation = new ColorAnimation(0.0375, new Color(0, 0, 0, 0), this.backgroundAnimation.getEndColor());
      return this;
   }

   public TextButton setBorderAndBackgroundColor(Color borderColor, Color backgroundColor) {
      this.borderColor = borderColor;
      this.backgroundAnimation = new ColorAnimation(0.0375, backgroundColor, this.backgroundAnimation.getEndColor());
      return this;
   }

   public TextButton(String string, Color color, Color color2) {
      this(string, 0.9, color, color2, (Color)null, 2.0F, 1.0F, (double)0.0F, (double)0.0F);
   }

   public TextButton(String string, Color color) {
      this(string, 0.9, (Color)null, color, (Color)null, 2.0F, 1.0F, (double)0.0F, (double)0.0F);
   }

   public ColorAnimation getBackgroundAnimation() {
      return this.backgroundAnimation;
   }

   public TextButton(String string, double d, Color color, Color color2, Color color3, float f, float f2, double d2, double d3) {
      super(string, d);
      this.normalTextColor = J.Z;
      this.hoverTextColor = J.Z;
      this.borderColor = null;
      this.borderAlpha = 1.0F;
      this.cornerRadius = 2.0F;
      this.deriveTextColorFromBackground = true;
      this.iconSize = 8.0F;
      this.animateTextColor = false;
      this.useThemeBackground = false;
      if (color != null) {
         this.setDisabledOverlayColor(color);
      }

      this.backgroundAnimation = new ColorAnimation(0.0375, this.getDisabledOverlayColor(), color2);
      this.textAnimation = new ColorAnimation(0.0375, this.normalTextColor, this.hoverTextColor);
      if (color3 != null && color != null) {
         this.setBorderAndBackgroundColor(color3, color);
      }

      this.cornerRadius = f;
      this.borderAlpha = f2;
      if (d2 != (double)0.0F) {
         this.o(d2);
      }

      if (d3 != (double)0.0F) {
         this.Y(d3);
      }

   }

   public GuiComponent setBackgroundAnimationColors(Color normalColor, Color hoverColor) {
      this.backgroundAnimation = new ColorAnimation(0.0375, normalColor, hoverColor);
      return super.setDisabledOverlayColor(normalColor);
   }

   public TextButton(String string, double d, Color color, Color color2, Color color3, float f, float f2) {
      this(string, d, color, color2, color3, f, f2, (double)0.0F, (double)0.0F);
   }

   public void H() {
      if (this.useThemeBackground) {
         Object object = J.z();
         this.backgroundAnimation.setStartColor((Color)object);
         this.backgroundAnimation.setEndColor(((Color)object).brighter());
      }

      if (this.isShowDisabledOverlay()) {
         GuiRenderPrimitives.B(this.G$src$D$1b2f02a(), this.n(), this.A(), this.L(), this.backgroundAnimation.getInterpolatedColor(), this.cornerRadius);
      } else if (this.w$src$Z$e457mb()) {
         GuiRenderPrimitives.B(this.G$src$D$1b2f02a(), this.n(), this.A(), this.L(), new Color(100, 100, 100, 10), this.cornerRadius);
      }

      if (this.borderColor != null) {
         GuiRenderPrimitives.P(this.G$src$D$1b2f02a(), this.n(), this.A(), this.L(), this.borderColor, this.cornerRadius, this.borderAlpha, 1.0F);
      }

      Object object = this.isUsingAlternateFont() ? this.getAlternateFontRenderer(this.fontScale) : this.getFontRenderer(this.fontScale);
      double d = ((SmoothFontRenderer)object).d(this.text);
      double d2 = this.G$src$D$1b2f02a() + this.A() / (double)2.0F + (double)(this.iconResource != null ? this.iconSize / 2.0F : 0.0F);
      double d3 = this.n() + this.L() / (double)2.0F - d / (double)2.0F + (double)0.5F;
      Color color = this.deriveTextColorFromBackground ? ColorUtil.getContrastingGray(this.backgroundAnimation.getInterpolatedColor(), 70, 240) : this.getTextColor();
      ((SmoothFontRenderer)object).W(this.text, d2, d3, color);
      if (this.iconResource != null) {
         float f = this.iconSize;
         double d4 = this.G$src$D$1b2f02a() + this.A() / (double)2.0F - ((SmoothFontRenderer)object).N(this.text) / (double)2.0F - (double)(f / 2.0F);
         GuiRenderPrimitives.F(this.iconResource, d4, this.n() + this.L() / (double)2.0F, (double)f, (double)f, color);
      }

   }

   public TextButton setNormalTextColor(Color normalTextColor) {
      this.normalTextColor = normalTextColor;
      this.textAnimation = new ColorAnimation(0.0375, normalTextColor, this.hoverTextColor);
      return this;
   }

   public void setHovered(boolean hovered) {
      if (this.w$src$Z$e457mb() != hovered) {
         this.backgroundAnimation.J();
         this.textAnimation.J();
      }

      super.setHovered(hovered);
   }

   public Color getTextColor() {
      return this.animateTextColor ? this.textAnimation.getInterpolatedColor() : this.normalTextColor;
   }

   public void setHoverTextColor(Color hoverTextColor) {
      this.hoverTextColor = hoverTextColor;
      this.textAnimation = new ColorAnimation(0.0375, this.normalTextColor, hoverTextColor);
   }

   public double C() {
      return (double)0.0F;
   }

   public TextButton(String string, double d, Color color) {
      this(string, d, (Color)null, color, (Color)null, 2.0F, 1.0F, (double)0.0F, (double)0.0F);
   }
}
