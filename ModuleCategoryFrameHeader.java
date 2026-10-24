package gg.vape.ui.click.frame.impl;

import gg.vape.module.Mod;
import gg.vape.module.none.ClientSettings;
import gg.vape.ui.click.GuiMouseEvent;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.component.IconButtonComponent;
import gg.vape.ui.click.component.gui.TextLabel;
import gg.vape.ui.click.component.module.ModuleComponent;
import gg.vape.ui.click.frame.FrameHeaderComponent;
import gg.vape.ui.font.SmoothFontRenderer;
import gg.vape.utils.render.ImageRenderer;
import gg.vape.utils.render.RenderUtils;

public class ModuleCategoryFrameHeader extends FrameHeaderComponent {
   private TextLabel K = new TextLabel("", (double)0.75F);
   private int ZG = 0;
   private IconButtonComponent Q = new IconButtonComponent("upcollapse", 0.3);
   private TextLabel G = new TextLabel("Edit");
   private String R;
   private String O;
   private IconButtonComponent v = new IconButtonComponent("moduleback");
   private IconButtonComponent o = new IconButtonComponent("newhide", 0.7);
   private TextLabel I = new TextLabel("", (double)0.75F);
   private ModuleCategoryFrame i;

   public void I() {
   }

   public void F() {
   }

   public void y(int n) {
      this.ZG = n;
   }

   public static ModuleCategoryFrame e(ModuleCategoryFrameHeader moduleCategoryFrameHeader) {
      return moduleCategoryFrameHeader.i;
   }

   public void h() {
      if (ClientSettings.moduleSearchActive) {
         ClientSettings.moduleSearchActive = false;
         ClientSettings.refreshModuleCategoryHeaders();
      }

      if (this.i.N$src$Lgg_vape_module_Mod_$1rbaf6a() != null) {
         this.i.G((Mod)null);
      }

      ClientSettings.refreshCategoryHeader(this.i.G$src$Lgg_vape_module_Category_$qyt4o7());

      for(GuiComponent guiComponent : this.w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0().f()) {
         if (!(guiComponent instanceof FrameHeaderComponent)) {
            if (!(guiComponent instanceof ModuleComponent)) {
               guiComponent.setVisible(false);
            } else {
               guiComponent.setVisible(!this.i.q() && ((ModuleComponent)guiComponent).getModule().isVisible());
            }
         }
      }

      this.w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0().l$src$V$1mibm4x();
   }

   public void g(GuiMouseEvent guiMouseEvent) {
   }

   public ModuleCategoryFrameHeader(ModuleCategoryFrame moduleCategoryFrame, String string, String string2) {
      super(moduleCategoryFrame);
      this.i = moduleCategoryFrame;
      this.O = string;
      this.R = string2;
      this.o.addClickListener(new ModuleCategoryFrameHeaderSearchIconClickHandler(this));
      this.o.w("Edit hidden modules");
      this.v.addClickListener(new ModuleCategoryFrameHeaderClearModuleSelectionClickHandler(this));
      this.G.addClickListener(new ModuleCategoryFrameHeaderSearchLabelClickHandler(this));
      this.Q.addClickListener(new ModuleCategoryFrameHeaderCollapseToggleClickHandler(this, moduleCategoryFrame));
      this.addChildren(new GuiComponent[]{this.G, this.v, this.o, this.Q, this.I, this.K});
   }

   public void u() {
      if (this.i.N$src$Lgg_vape_module_Mod_$1rbaf6a() != null && ClientSettings.moduleSearchActive) {
         this.i.G((Mod)null);
      }

   }

   public void s(Mod mod) {
      if (mod == null) {
         this.K.setLabelText("");
      } else {
         this.K.setLabelText("< " + mod.getName().toUpperCase().substring(0, 3));
         this.K.setClickListener(new ModuleCategoryFrameHeaderActionClickHandler(this, mod));
      }
   }

   public void H() {
      SmoothFontRenderer smoothFontRenderer = this.getFontRenderer(0.9);
      double d = smoothFontRenderer.d(this.R);
      double d2 = this.n() + this.L() / (double)2.0F - d / (double)2.0F + (double)1.0F;
      float f = (float)ImageRenderer.getImageWidth(this.O) / 3.5F;
      float f2 = (float)ImageRenderer.getImageHeight(this.O) / 3.5F;
      double d3 = (double)((float)this.G$src$D$1b2f02a() + 6.0F);
      double d4 = this.n() + this.L() / (double)2.0F - (double)(f2 / 2.0F) + (double)1.0F;
      smoothFontRenderer.d(this.R, d3 + (double)f + (double)4.0F, d2, J.A);
      if (this.i.N$src$Lgg_vape_module_Mod_$1rbaf6a() != null && !ClientSettings.moduleSearchActive) {
         this.o.setVisible(false);
         this.G.setVisible(false);
         this.v.setOverrideColor(J.A);
         this.v.setVisible(true);
         this.v.K(this.G$src$D$1b2f02a() + (double)5.0F);
         this.v.S(this.n());
         this.v.Y(this.L());
         this.Q.setVisible(false);
         this.K.setVisible(true);
         this.I.setVisible(true);
         this.I.K(this.G$src$D$1b2f02a() + this.A() - (double)5.0F - this.I.A());
         this.I.S(this.n());
         this.I.Y(this.L());
         this.K.K(this.G$src$D$1b2f02a() + this.A() - (double)10.0F - this.I.A() - this.K.A());
         this.K.S(this.n());
         this.K.Y(this.L());
      } else {
         this.K.setVisible(false);
         this.I.setVisible(false);
         this.Q.setVisible(true);
         ImageRenderer.drawImage(J.A, (float)d3, (float)d4, this.O, f, f2, false);
         this.v.setVisible(false);
         if (ClientSettings.moduleSearchActive) {
            this.o.setVisible(false);
            this.G.setFontScale((double)0.75F);
            this.G.setVisible(true);
            this.G.setLabelText("Done");
            this.G.K(this.G$src$D$1b2f02a() + this.A() - (double)10.0F - (double)16.0F - smoothFontRenderer.N(this.G.getText()) / (double)2.0F);
            this.G.S(this.n());
            this.G.Y(this.L());
         } else {
            boolean bl = this.w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0().getBounds().Z(RenderUtils.h());
            if (((ModuleCategoryFrameHeader)this.getParentFrameComponent().j$src$Lgg_vape_ui_click_frame_FrameHeaderComponent_$175vsfc()).g$src$I$pd0er5() > 0) {
               double d5 = smoothFontRenderer.N("" + this.ZG);
               if (bl) {
                  smoothFontRenderer.d("" + this.ZG, this.G$src$D$1b2f02a() + this.A() - (double)5.0F - (double)16.0F - (double)3.0F - d5, d2, J.Z);
               }

               this.o.setIconResource("newhide");
            } else {
               this.o.setIconResource("newedit");
            }

            this.o.setVisible(bl);
            this.G.setVisible(false);
            this.o.setOverrideColor(ClientSettings.moduleSearchActive ? J.f : null);
            this.o.K(this.G$src$D$1b2f02a() + this.A() - (double)10.0F - (double)16.0F);
            this.o.S(this.n() + (double)1.0F);
            this.o.Y(this.L());
         }

         this.Q.K(this.G$src$D$1b2f02a() + this.A() - (double)7.5F - (double)8.0F);
         this.Q.S(this.n());
         this.Q.Y(this.L());
         this.Q.setIconResource(this.i.q() ? "downexpand" : "upcollapse");
      }

   }

   public void S(Mod mod) {
      if (mod == null) {
         this.I.setLabelText("");
      } else {
         this.I.setLabelText(mod.getName().toUpperCase().substring(0, 3) + " >");
         this.I.setClickListener(new ModuleCategoryFrameHeaderNextModuleClickHandler(this, mod));
      }
   }

   public int g$src$I$pd0er5() {
      return this.ZG;
   }
}
