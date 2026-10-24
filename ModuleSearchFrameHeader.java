package gg.vape.ui.click.frame.impl;

import gg.vape.module.Mod;
import gg.vape.module.none.ClientSettings;
import gg.vape.ui.click.GuiMouseEvent;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.component.HalfScaleIconButtonComponent;
import gg.vape.ui.click.component.IconButtonComponent;
import gg.vape.ui.click.component.SquareIconButtonComponent;
import gg.vape.ui.click.component.input.ModuleSearchInputComponent;
import gg.vape.ui.click.component.module.ModuleComponent;
import gg.vape.ui.click.frame.FrameHeaderComponent;
import gg.vape.ui.click.frame.impl.hud.HudModuleListPanel;
import gg.vape.ui.click.frame.impl.hud.HudModuleOverviewListFrame;
import gg.vape.ui.click.frame.impl.hud.HudModuleSelectorFrame;
import gg.vape.unmap.ModeSelection;
import gg.vape.utils.render.GuiRenderPrimitives;
import gg.vape.value.ModuleNameSuggestionProvider;
import java.awt.Color;
import java.util.Comparator;

public class ModuleSearchFrameHeader extends FrameHeaderComponent {
   private final ModuleSearchFrame I;
   private final IconButtonComponent v = new HalfScaleIconButtonComponent("legit_switch");
   private final SquareIconButtonComponent R = new SquareIconButtonComponent("newclose");
   private final IconButtonComponent G = new IconButtonComponent("newsearch", 0.9);
   private final ModuleSearchInputComponent K = new ModuleSearchInputComponent(this);

   public void K$src$V$10w6uwu() {
      this.I.G((Mod)null);
      ((ModuleSearchFrame)ClientSettings.getFrame(ModuleSearchFrame.class)).D(this.K.getText());
   }

   public double C() {
      return (double)16.0F;
   }

   public void l$src$V$11ec2hr() {
      for(GuiComponent guiComponent : ((ModuleSearchFrame)ClientSettings.getFrame(ModuleSearchFrame.class)).f()) {
         if (guiComponent instanceof ModuleComponent) {
            ModuleComponent moduleComponent = (ModuleComponent)guiComponent;
            moduleComponent.collapseValueComponents();
         }
      }

   }

   public void I() {
   }

   private void lambda$new$1() {
      this.s();
   }

   public void Y(double d) {
      super.Y(d);
   }

   private void lambda$new$0() {
      ClientSettings.activeComponent = this.K;
   }

   public void u() {
      this.w$src$Lgg_vape_ui_click_frame_Frame_$y4htd0().l$src$V$1mibm4x();
   }

   public IconButtonComponent G$src$Lgg_vape_ui_click_component_IconButtonComponent_$1pnwa51() {
      return this.v;
   }

   public ModuleSearchFrameHeader(ModuleSearchFrame moduleSearchFrame) {
      super(moduleSearchFrame);
      this.I = moduleSearchFrame;
      this.setPropagateMouseEvents(true);
      this.G.addClickListener(this::lambda$new$0);
      this.R.addClickListener(this::lambda$new$1);
      this.K.addRefreshListener(new ModuleSearchFrameHeaderRefreshListener(this));
      this.v.addClickListener(this::lambda$new$2);
      ModuleNameSuggestionProvider moduleNameSuggestionProvider = new ModuleNameSuggestionProvider(true);
      moduleNameSuggestionProvider.setComparator((Comparator)null);
      this.K.setSuggestionProvider(moduleNameSuggestionProvider);
      this.addChildren(new GuiComponent[]{this.G, this.R, this.K, this.v});
   }

   public void s() {
      this.l$src$V$11ec2hr();
      this.K.setText("");
      this.K$src$V$10w6uwu();
   }

   public void F() {
   }

   public void H() {
      this.I.p();
      boolean bl = ((ModeSelection)ClientSettings.INSTANCE.searchBarStyle.getValue()).equals(ClientSettings.INSTANCE.floatingSearchBarMode);
      if (bl) {
         if (ClientSettings.INSTANCE.showLegitMode.getEffectiveValue()) {
            this.v.setVisible(true);
            this.v.K(this.G$src$D$1b2f02a() + (double)3.0F);
            this.v.S(this.n() + (double)1.0F);
            this.v.o((double)18.0F);
            this.v.Y(this.L());
            this.v.setUseExplicitHeight(true);
            this.v.setShowDisabledOverlay(true);
            this.v.setDisabledOverlayColor(Color.RED);
            if (this.v.w$src$Z$e457mb()) {
               this.v.setOverrideColor(J.z().brighter());
            } else {
               this.v.setOverrideColor(J.z());
            }
         } else {
            this.v.setVisible(false);
         }

         this.K.setUseExplicitHeight(true);
         double d = this.G$src$D$1b2f02a() + (double)6.0F;
         if (this.v.V$src$Z$1xhop3l()) {
            d = this.v.G$src$D$1b2f02a() + this.v.A() + (double)4.0F;
            GuiRenderPrimitives.d(this.v.G$src$D$1b2f02a() + this.v.A() + (double)1.0F, this.n() + (double)6.0F, (double)6.0F, 0.75F, new Color(100, 100, 100, 255));
         }

         this.K.K(d);
         this.K.S(this.n());
         this.K.o(this.v.V$src$Z$1xhop3l() ? this.A() - this.v.A() - this.R.A() - (double)4.0F : this.A() - this.R.A() - (double)3.0F);
         this.K.Y(this.L());
         if (!this.K.getText().isEmpty()) {
            this.G.setVisible(false);
            this.R.setVisible(true);
            this.R.K(this.G$src$D$1b2f02a() + this.A() - (double)13.0F);
            this.R.S(this.n() + (double)1.0F);
            this.R.o((double)10.0F);
            this.R.Y(this.L());
         } else {
            this.R.setVisible(false);
            this.G.setVisible(true);
            this.G.K(this.G$src$D$1b2f02a() + this.A() - (double)14.0F);
            this.G.S(this.n() + (double)0.5F);
            this.G.o((double)10.0F);
            this.G.Y(this.L());
         }

         this.K.setVisible(true);
         this.o((double)110.0F);
         this.setExplicitWidth((double)110.0F);
         this.setUseExplicitWidth(true);
      } else {
         if (ClientSettings.INSTANCE.showLegitMode.getEffectiveValue()) {
            this.v.setVisible(true);
            this.v.K(this.G$src$D$1b2f02a() + (double)3.0F);
            this.v.S(this.n() + (double)1.0F);
            this.v.o((double)18.0F);
            this.v.Y(this.L());
            this.v.setUseExplicitHeight(true);
            this.v.setShowDisabledOverlay(true);
            this.v.setDisabledOverlayColor(Color.RED);
            if (this.v.w$src$Z$e457mb()) {
               this.v.setOverrideColor(J.z().brighter());
            } else {
               this.v.setOverrideColor(J.z());
            }
         } else {
            this.v.setVisible(false);
         }

         this.K.setUseExplicitHeight(true);
         double d = this.G$src$D$1b2f02a() + (double)6.0F;
         if (this.v.V$src$Z$1xhop3l()) {
         }

         this.K.K(d);
         this.K.S(this.n());
         this.K.o(this.v.V$src$Z$1xhop3l() ? this.A() - this.v.A() - this.R.A() - (double)4.0F : this.A() - this.R.A() - (double)3.0F);
         this.K.Y(this.L());
         if (!this.K.getText().isEmpty()) {
            this.G.setVisible(false);
            this.R.setVisible(true);
            this.R.K(this.G$src$D$1b2f02a() + this.A() - (double)13.0F);
            this.R.S(this.n() + (double)1.0F);
            this.R.o((double)10.0F);
            this.R.Y(this.L());
         } else {
            this.R.setVisible(false);
            this.G.setVisible(true);
            this.G.K(this.G$src$D$1b2f02a() + this.A() - (double)14.0F);
            this.G.S(this.n() + (double)0.5F);
            this.G.o((double)10.0F);
            this.G.Y(this.L());
         }

         boolean bl2 = this.K.V$src$Z$1xhop3l();
         this.K.setVisible(false);
         this.G.setVisible(false);
         if (bl2) {
            this.s();
         }

         this.o((double)22.0F);
         this.setExplicitWidth((double)22.0F);
         this.setUseExplicitWidth(true);
      }
   }

   public ModuleSearchInputComponent A$src$Lgg_vape_ui_click_component_input_ModuleSearchIn$1efzz7n() {
      return this.K;
   }

   public void g(GuiMouseEvent guiMouseEvent) {
   }

   private void lambda$new$2() {
      this.K.setText("");
      this.K$src$V$10w6uwu();
      if (HudModuleSelectorFrame.overviewVisible) {
         ((HudModuleOverviewListFrame)ClientSettings.getFrame(HudModuleOverviewListFrame.class)).refreshFavorites();
      } else {
         ((HudModuleListPanel)ClientSettings.getFrame(HudModuleListPanel.class)).refreshModules();
      }

      ClientSettings.INSTANCE.switchFrameStack(ClientSettings.hudEditorStack);
   }
}
