package gg.vape.ui.click.frame;

import gg.vape.friend.ui.OnlineCombatStatsSettingsFrame;
import gg.vape.friend.ui.OnlinePlayerPreviewSettingsFrame;
import gg.vape.friend.ui.OnlineRadarSettingsFrame;
import gg.vape.module.none.ClientSettings;
import gg.vape.module.none.TextGuiSettingsFrame;
import gg.vape.ui.click.GuiMouseEvent;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.component.IconButtonComponent;
import gg.vape.ui.click.frame.impl.VisibleModuleListFrame;
import gg.vape.ui.click.frame.impl.online.OnlineConnectionSettingsFrame;
import gg.vape.ui.click.frame.impl.target.TargetInfoSettingsFrame;
import gg.vape.unmap.ColorUtil;
import gg.vape.utils.render.GuiRenderPrimitives;
import java.util.ArrayList;
import java.util.List;

public class ClickGuiQuickActionsComponent extends GuiComponent {
   private IconButtonComponent O;
   private List<ClickGuiQuickActionActiveFrameIndicator> v = new ArrayList();
   private IconButtonComponent Q;
   private IconButtonComponent i = new IconButtonComponent("newfavorites", 0.8);

   public double C() {
      return (double)18.0F;
   }

   public double x() {
      return (double)110.0F;
   }

   private static void lambda$new$0() {
      OnlineConnectionSettingsFrame.getInstance().e(false);
   }

   public ClickGuiQuickActionsComponent() {
      this.setDisabledOverlayColor(J.i);
      this.O = new ClickGuiQuickActionsOnlineSettingsButton(this, "vape_online", (double)0.75F);
      this.Q = new ClickGuiQuickActionsFrameButton(this, "newoverlays", 0.6);
      this.Q.addClickListener(new ClickGuiQuickActionsFrameToggleClickHandler(this));
      this.Q.w("Open overlays menu");
      this.O.addClickListener(ClickGuiQuickActionsComponent::lambda$new$0);
      this.i.addClickListener(new ClickGuiQuickActionsVisibleModulesClickHandler(this));
      this.i.w("Favorites");
      this.addChildren(new GuiComponent[]{this.O, this.i, this.Q});
      this.v.add(new ClickGuiQuickActionActiveFrameIndicator("newtextgui", ClientSettings.getFrame(TextGuiSettingsFrame.class), 5));
      this.v.add(new ClickGuiQuickActionActiveFrameIndicator("newrearview", ClientSettings.getFrame(OnlinePlayerPreviewSettingsFrame.class), 6));
      this.v.add(new ClickGuiQuickActionActiveFrameIndicator("newduelinfo", ClientSettings.getFrame(OnlineCombatStatsSettingsFrame.class), 6));
      this.v.add(new ClickGuiQuickActionActiveFrameIndicator("newtargetinfo", ClientSettings.getFrame(TargetInfoSettingsFrame.class), 7));
      this.v.add(new ClickGuiQuickActionActiveFrameIndicator("newradar", ClientSettings.getFrame(OnlineRadarSettingsFrame.class), 7));
   }

   public void g(GuiMouseEvent guiMouseEvent) {
   }

   public void H() {
      GuiRenderPrimitives.C(this.G$src$D$1b2f02a(), this.n(), this.A(), this.L(), this.getDisabledOverlayColor());
      this.O.K(this.G$src$D$1b2f02a() + (double)3.0F);
      this.O.S(this.n());
      this.O.Y(this.L());
      this.i.K(this.G$src$D$1b2f02a() + this.A() - (double)32.0F);
      this.i.S(this.n());
      this.i.Y(this.L());
      this.i.setOverrideColor(((VisibleModuleListFrame)ClientSettings.getFrame(VisibleModuleListFrame.class)).V$src$Z$1xhop3l() ? (this.i.w$src$Z$e457mb() ? J.Y : J.I) : null);
      this.Q.K(this.G$src$D$1b2f02a() + this.A() - (double)18.0F);
      this.Q.S(this.n());
      this.Q.Y(this.L());
      boolean bl = false;
      double d = this.n() + this.L() / (double)2.0F;
      double d2 = (double)((float)(this.G$src$D$1b2f02a() + this.A() - (double)17.5F - (double)8.0F));

      for(ClickGuiQuickActionActiveFrameIndicator clickGuiQuickActionActiveFrameIndicator : this.v) {
         if (clickGuiQuickActionActiveFrameIndicator.F != null && clickGuiQuickActionActiveFrameIndicator.F.V$src$Z$1xhop3l()) {
            GuiRenderPrimitives.F(clickGuiQuickActionActiveFrameIndicator.y, d2, d, (double)clickGuiQuickActionActiveFrameIndicator.W, (double)clickGuiQuickActionActiveFrameIndicator.W, J.W);
            bl = true;
            d2 -= (double)(5.0F + (float)clickGuiQuickActionActiveFrameIndicator.W);
         }
      }

      this.Q.setOverrideColor(bl ? (this.Q.w$src$Z$e457mb() ? ColorUtil.offsetRgb(J.z(), (double)10.0F) : J.z()) : null);
   }

   public IconButtonComponent b$src$Lgg_vape_ui_click_component_IconButtonComponent_$1sg98rj() {
      return this.Q;
   }

   public void u() {
   }

   public void I() {
   }

   public void F() {
   }
}
