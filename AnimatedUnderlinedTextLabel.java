package gg.vape.ui.click.component.gui;

import gg.vape.ui.click.animation.DoubleAnimation;
import gg.vape.ui.font.SmoothFontRenderer;
import gg.vape.utils.render.GuiRenderPrimitives;
import gg.vape.utils.render.ImageRenderer;
import gg.vape.utils.render.OpenGlBackendHolder;
import java.awt.Color;

public class AnimatedUnderlinedTextLabel extends UnderlinedTextLabel {
   private static final String ARROW_ICON_RESOURCE = "expandarrow";
   private final DoubleAnimation hoverAnimation = new DoubleAnimation(0.15, (double)0.0F, (double)1.0F);
   private float arrowSize = 4.0F;

   public double C() {
      SmoothFontRenderer smoothFontRenderer = this.getFontRenderer(this.fontScale);
      return smoothFontRenderer.d(this.text);
   }

   public AnimatedUnderlinedTextLabel(String text, double fontScale, Color textColor, Color underlineColor) {
      super(text, fontScale, textColor, underlineColor);
   }

   public void H() {
      SmoothFontRenderer fontRenderer = this.getFontRenderer(this.fontScale);
      double textHeight = fontRenderer.d(this.text);
      double width = this.A();
      double x = this.G$src$D$1b2f02a();
      double textY = this.n() + this.L() / (double)2.0F - textHeight / (double)2.0F;
      Color renderedTextColor = this.w$src$Z$e457mb() ? this.getTextColor().brighter() : this.getTextColor();
      Color renderedUnderlineColor = this.w$src$Z$e457mb() ? this.getUnderlineColor().brighter() : this.getUnderlineColor();
      if (this.w$src$Z$e457mb()) {
         if (!this.hoverAnimation.I$src$Z$c48gtw()) {
            this.hoverAnimation.c();
         }
      } else if (this.hoverAnimation.I$src$Z$c48gtw()) {
         this.hoverAnimation.Z();
      }

      fontRenderer.d(this.text, x, textY, renderedTextColor);
      OpenGlBackendHolder.backend.pushMatrix();
      float renderScale = 2.0F;
      OpenGlBackendHolder.backend.scale(0.5F, 0.5F, 0.5F);

      for(int underlineOffset = 0; (double)underlineOffset < width; ++underlineOffset) {
         GuiRenderPrimitives.V((double)((int)((this.G$src$D$1b2f02a() + (double)underlineOffset + (double)1.0F * this.fontScale) * (double)renderScale)), (double)((int)((textY + textHeight + (double)2.0F * this.fontScale) * (double)renderScale)), (double)1.0F * this.fontScale, (double)1.0F * this.fontScale, renderedUnderlineColor);
      }

      OpenGlBackendHolder.backend.popMatrix();
      ImageRenderer.drawImage(renderedTextColor, (float)this.G$src$D$1b2f02a() + (float)this.A() - 5.0F + this.hoverAnimation.getInterpolatedValue().floatValue(), (float)textY + 2.0F, "expandarrow", this.arrowSize, this.arrowSize, false);
   }

   public double x() {
      return super.x();
   }
}
