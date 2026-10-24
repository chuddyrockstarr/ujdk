package gg.vape.ui.click.frame.impl;

import gg.vape.Vape;
import gg.vape.module.Category;
import gg.vape.module.Mod;
import gg.vape.module.none.ClientSettings;
import gg.vape.ui.click.component.module.ModuleComponent;
import gg.vape.unmap.ModeSelection;
import gg.vape.utils.StringUtils;
import gg.vape.wrapper.impl.Minecraft;

public class ModuleSearchFrame extends ModuleCategoryFrame {
   private ModuleSearchFrameHeader Rt;

   public void D(String string) {
      this.removeMarkedChildren();
      ClientSettings.activeTooltips = null;
      if (string != null && string.length() >= 1) {
         for(Mod mod : Vape.INSTANCE.getModManager().collectMods()) {
            if (!mod.getCategory().equals(Category.NONE)) {
               String string2 = StringUtils.y(mod.getName());
               String string3 = StringUtils.y(string);
               if (string2.contains(string3)) {
                  ModuleComponent moduleComponent = new ModuleComponent(this, mod);
                  this.h(moduleComponent, new Object[0]);
                  moduleComponent.buildValueComponents();
               }
            }
         }

      }
   }

   public boolean V$src$Z$1xhop3l() {
      return ((ModeSelection)ClientSettings.INSTANCE.searchBarStyle.getValue()).equals(ClientSettings.INSTANCE.floatingSearchBarMode) || ClientSettings.INSTANCE.showLegitMode.getEffectiveValue();
   }

   public void w() {
   }

   public String getName() {
      return "ModuleSearch";
   }

   public ModuleSearchFrame() {
      super(Category.NONE);
      this.setDisabledOverlayColor(J.r);
      this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().M(false);
      this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().M("wrap");
      this.I2 = false;
      this.Rt = new ModuleSearchFrameHeader(this);
      this.Y(this.Rt);
   }

   public ModuleSearchFrameHeader n$src$Lgg_vape_ui_click_frame_impl_ModuleSearchFrameHe$xia8v2() {
      return this.Rt;
   }

   public void p() {
      this.M((double)Minecraft.J() / ((double)4.0F * Vape.INSTANCE.getClientSettings().getGuiScaleFactor()) - this.A() / (double)2.0F, (double)7.0F);
   }

   public void v() {
   }

   public void Y() {
      if (this.n() != (double)7.0F) {
         this.p();
      }

   }

   public void V() {
   }
}
