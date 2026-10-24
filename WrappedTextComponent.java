package gg.vape.ui.click.component.gui;

import gg.vape.Vape;
import gg.vape.ui.click.component.SimpleTextLabelComponent;
import gg.vape.ui.font.SmoothFontRenderer;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WrappedTextComponent extends SimpleTextLabelComponent {
   private double measuredWidth = (double)0.0F;
   private boolean wrappingEnabled = true;
   private boolean bold;
   private double textOffsetX = (double)0.0F;
   private double wrapWidth = (double)0.0F;
   private List<String> wrappedLines;
   private double measuredHeight = (double)0.0F;
   private boolean centered = false;

   public void setBold(boolean bold) {
      this.bold = bold;
   }

   public void setWrapWidth(double wrapWidth) {
      this.wrapWidth = wrapWidth;
      this.wrappedLines = null;
   }

   private void renderWrappedLines() {
      SmoothFontRenderer fontRenderer = this.bold ? Vape.INSTANCE.getFontManager().W(this.fontScale, false) : Vape.INSTANCE.getFontManager().E(this.fontScale, false);
      if (fontRenderer != null) {
         double currentY = this.n();
         double maxWidth = (double)0.0F;
         List<String> lines = this.getWrappedLines();
         if (lines != null) {
            for(String line : lines) {
               if (line != null && !line.isEmpty()) {
                  if (this.centered) {
                     fontRenderer.v(line, this.G$src$D$1b2f02a() + this.textOffsetX, currentY, this.getTextColor());
                  } else {
                     fontRenderer.d(line, this.G$src$D$1b2f02a() + this.textOffsetX, currentY, this.getTextColor());
                  }

                  currentY += fontRenderer.d(line) + (double)2.0F;
                  double lineWidth = fontRenderer.N(line);
                  if (lineWidth > maxWidth) {
                     maxWidth = lineWidth;
                  }
               }
            }
         }

         this.measuredWidth = maxWidth;
         this.measuredHeight = Math.max((double)12.0F, currentY - this.n());
      }
   }

   public List<String> getWrappedLines() {
      if (this.wrappedLines == null) {
         if (this.text != null && !this.text.isEmpty()) {
            SmoothFontRenderer fontRenderer = this.bold ? Vape.INSTANCE.getFontManager().W(this.fontScale, false) : Vape.INSTANCE.getFontManager().E(this.fontScale, false);
            this.wrappedLines = this.wrapLines(Arrays.asList(this.text.split("\n")), fontRenderer);
            double maxWidth = (double)0.0F;
            double totalHeight = (double)0.0F;
            if (fontRenderer != null) {
               for(String line : this.wrappedLines) {
                  if (line != null && !line.isEmpty()) {
                     double w = fontRenderer.N(line);
                     if (w > maxWidth) {
                        maxWidth = w;
                     }

                     totalHeight += fontRenderer.d(line) + (double)2.0F;
                  }
               }
            }

            this.measuredWidth = maxWidth;
            this.measuredHeight = Math.max((double)12.0F, totalHeight);
         } else {
            this.wrappedLines = new ArrayList();
            this.measuredWidth = (double)0.0F;
            this.measuredHeight = (double)12.0F;
         }
      }

      return this.wrappedLines;
   }

   private ArrayList<String> wrapLines(List<String> sourceLines, SmoothFontRenderer fontRenderer) {
      ArrayList<String> wrappedResult = new ArrayList();
      if (fontRenderer == null) {
         if (sourceLines != null) {
            wrappedResult.addAll(sourceLines);
         }

         return wrappedResult;
      } else {
         double maxWrap = this.getWrapWidth();
         if (maxWrap <= (double)0.0F) {
            maxWrap = (double)130.0F;
         }

         if (sourceLines != null) {
            for(String sourceLine : sourceLines) {
               if (sourceLine != null && !sourceLine.isEmpty()) {
                  String[] words = sourceLine.split(" ");
                  StringBuilder currentLine = new StringBuilder();

                  for(String word : words) {
                     if (currentLine.length() == 0) {
                        currentLine.append(word);
                     } else {
                        String testLine = currentLine + " " + word;
                        if (fontRenderer.N(testLine) <= maxWrap) {
                           currentLine.append(" ").append(word);
                        } else {
                           wrappedResult.add(currentLine.toString());
                           currentLine = new StringBuilder(word);
                        }
                     }
                  }

                  if (currentLine.length() > 0) {
                     wrappedResult.add(currentLine.toString());
                  }
               }
            }
         }

         if (wrappedResult.isEmpty() && sourceLines != null) {
            wrappedResult.addAll(sourceLines);
         }

         return wrappedResult;
      }
   }

   public void setWrappingEnabled(boolean wrappingEnabled) {
      this.wrappingEnabled = wrappingEnabled;
   }

   public void setText(String text) {
      super.setText(text);
      this.wrappedLines = null;
   }

   public void c() {
      super.c();
      this.renderWrappedLines();
   }

   public WrappedTextComponent(String text, double fontScale, Color color, boolean bold, double textOffsetX) {
      super(text, fontScale);
      this.setTextColor(color);
      this.bold = bold;
      this.textOffsetX = textOffsetX;
   }

   public double A() {
      if (this.wrappedLines == null) {
         this.getWrappedLines();
      }

      return this.measuredWidth > (double)0.0F ? this.measuredWidth : super.A();
   }

   public double C() {
      if (this.wrappedLines == null) {
         this.getWrappedLines();
      }

      return this.measuredHeight > (double)0.0F ? this.measuredHeight : super.C();
   }

   public WrappedTextComponent(String text, double fontScale, Color color, boolean bold) {
      super(text, fontScale);
      this.setTextColor(color);
      this.bold = bold;
   }

   public void H() {
   }

   public void setCentered(boolean centered) {
      this.centered = centered;
   }

   public double getWrapWidth() {
      if (this.wrapWidth > (double)0.0F) {
         return this.wrapWidth;
      } else {
         return this.getExplicitWidth() > (double)0.0F ? this.getExplicitWidth() : (double)130.0F;
      }
   }

   public WrappedTextComponent(String text, double fontScale) {
      super(text, fontScale);
   }
}
