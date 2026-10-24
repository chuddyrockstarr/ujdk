package gg.vape.ui.click.frame;

import gg.vape.ui.click.GuiMouseEvent;
import gg.vape.ui.click.MouseButton;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.frame.impl.ModuleSearchFrame;

public abstract class FrameHeaderComponent extends GuiComponent {
   private Frame b;
   private static boolean a;

   public Frame w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0() {
      return this.b;
   }

   public static boolean U$src$Z$vux5o0() {
      boolean bl = l$src$Z$w7kfbb();
      return false;
   }

   public boolean isRemovable() {
      return false;
   }

   public void addChildren(GuiComponent... guiComponentArray) {
      super.addChildren(guiComponentArray);

      for(GuiComponent guiComponent : guiComponentArray) {
         guiComponent.setParentHeader(this);
      }

   }

   public double C() {
      return (double)18.0F;
   }

   public double x() {
      return (double)110.0F;
   }

   public void K(double d, double d2) {
      for(GuiComponent guiComponent : this.f()) {
         guiComponent.K(guiComponent.G$src$D$1b2f02a() + d);
         guiComponent.S(guiComponent.n() + d2);
         if (guiComponent instanceof FrameComponent) {
            ((FrameComponent)guiComponent).R(d, d2);
         }
      }

   }

   public void dispatchMouseEvent(GuiMouseEvent guiMouseEvent) {
      if (guiMouseEvent.getAction().equals(MouseButton.RIGHT_CLICK) && this.b instanceof CollapsibleFrame && !(this.b instanceof ModuleSearchFrame)) {
         ((CollapsibleFrame)this.b).w();
      } else {
         super.dispatchMouseEvent(guiMouseEvent);
      }
   }

   public FrameHeaderComponent(Frame frame) {
      this.b = frame;
   }

   public static boolean l$src$Z$w7kfbb() {
      return a;
   }

   public static void f(boolean bl) {
      a = bl;
   }

   public boolean D(int n, int n2) {
      for(GuiComponent guiComponent : this.f()) {
         if (guiComponent.getBounds().J((double)n, (double)n2)) {
            return false;
         }
      }

      return this.getBounds().J((double)n, (double)n2);
   }

   static {
      if (!l$src$Z$w7kfbb()) {
         f(true);
      }

   }
}
