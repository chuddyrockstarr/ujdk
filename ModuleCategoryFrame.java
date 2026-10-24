package gg.vape.ui.click.frame.impl;

import com.google.gson.JsonObject;
import gg.vape.Vape;
import gg.vape.module.Category;
import gg.vape.module.Mod;
import gg.vape.module.ModuleDisplayScope;
import gg.vape.module.none.ClientSettings;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.component.module.ModuleComponent;
import gg.vape.ui.click.frame.CollapsibleFrame;
import gg.vape.ui.click.frame.FrameHeaderComponent;
import gg.vape.ui.click.frame.OutlinedFrameBase;
import gg.vape.utils.NameComparator;
import java.util.ArrayList;
import java.util.Collections;

public class ModuleCategoryFrame extends OutlinedFrameBase implements CollapsibleFrame {
   protected ModuleCategoryFrameHeader HF;
   private Category Hp;
   private static final String fb = "wrap";
   private boolean HU;
   private String HK;
   private Mod HI;

   public String getName() {
      return this.Hp.getName();
   }

   public Mod N$src$Lgg_vape_module_Mod_$1rbaf6a() {
      return this.HI;
   }

   public void s$src$V$1a2f6mi() {
      this.HF = new ModuleCategoryFrameHeader(this, this.Hp.getIconKey(), this.HK);
      this.Y(this.HF);
      ArrayList<Mod> arrayList = new ArrayList(Vape.INSTANCE.getModManager().collectMods());
      Collections.sort(arrayList, new NameComparator());

      for(Mod mod : arrayList) {
         if (mod.getCategory().equals(this.Hp) && mod.getModuleDisplayScope() != ModuleDisplayScope.STANDALONE_ONLY) {
            ModuleComponent moduleComponent = new ModuleComponent(this, mod);
            this.h(moduleComponent, new Object[0]);
            moduleComponent.buildValueComponents();
         }
      }

   }

   public void G(Mod mod) {
   }

   public void w() {
      if (this.HF != null) {
         this.HU = !this.HU;
         this.HF.h();
      }
   }

   public int A$src$I$wwnvku() {
      int n = 0;

      for(GuiComponent guiComponent : this.f()) {
         if (guiComponent instanceof ModuleComponent) {
            boolean bl = ((ModuleComponent)guiComponent).getModule().isVisible();
            ((ModuleComponent)guiComponent).setExpanded(false);
            if (!bl) {
               ++n;
            }

            if (ClientSettings.moduleSearchActive) {
               guiComponent.setVisible(true);
            } else {
               guiComponent.setVisible(bl);
            }
         } else if (!(guiComponent instanceof FrameHeaderComponent)) {
            guiComponent.setVisible(false);
         }
      }

      this.P$src$V$i0cha4();
      return n;
   }

   public void t(JsonObject jsonObject) {
      super.t(jsonObject);
      this.G((Mod)null);
   }

   public String L$src$Ljava_lang_String_$ahld16() {
      return this.HK;
   }

   public void c() {
      super.c();
   }

   public ModuleComponent W(Mod mod) {
      for(GuiComponent guiComponent : this.f()) {
         if (guiComponent instanceof ModuleComponent && ((ModuleComponent)guiComponent).getModule().equals(mod)) {
            return (ModuleComponent)guiComponent;
         }
      }

      return null;
   }

   public boolean q() {
      return this.HU;
   }

   public ModuleCategoryFrame(Category category) {
      this.HK = category.getName();
      this.Hp = category;
      if (!category.equals(Category.NONE)) {
         this.setDisabledOverlayColor(J.i);
         this.K((double)200.0F);
         this.S((double)100.0F);
         this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().M(false);
         this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().M("wrap");
         this.s$src$V$1a2f6mi();
         this.setVisible(false);
      }
   }

   public Category G$src$Lgg_vape_module_Category_$qyt4o7() {
      return this.Hp;
   }
}
