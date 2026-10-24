package gg.vape.ui.click.frame.impl;

import com.google.gson.JsonObject;
import gg.vape.Vape;
import gg.vape.friend.ui.OnlineFriendsFrame;
import gg.vape.module.Category;
import gg.vape.module.Mod;
import gg.vape.module.none.ClientSettings;
import gg.vape.ui.click.GuiMouseEvent;
import gg.vape.ui.click.component.ColorDividerComponent;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.component.SimpleTextLabelComponent;
import gg.vape.ui.click.component.SpacerComponent;
import gg.vape.ui.click.component.module.ModuleComponent;
import gg.vape.ui.click.frame.ClickGuiQuickActionsComponent;
import gg.vape.ui.click.frame.Frame;
import gg.vape.ui.click.frame.FrameNavigationButtonComponent;
import gg.vape.ui.click.frame.ModuleCategoryNavigationButtonComponent;
import gg.vape.ui.click.frame.impl.profile.ProfilesFrameNavigationButtonComponent;
import gg.vape.ui.click.frame.impl.profile.ProfilesSettingsFrame;
import gg.vape.ui.click.frame.impl.quickactions.QuickActionsFrame;
import gg.vape.unmap.ModeSelection;
import gg.vape.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class ClientSettingsSearchFrame extends ModuleCategoryFrame {
   private static final double MENU_WIDTH = (double)110.0F;
   private final ClientSettingsSearchFrameHeader header;
   private final List<GuiComponent> defaultMenuComponents = new ArrayList();

   public String getName() {
      return "GUI";
   }

   public double A() {
      return (double)110.0F;
   }

   private void addDefaultMenuComponent(GuiComponent component) {
      this.h(component, new Object[0]);
      this.defaultMenuComponents.add(component);
   }

   public void rebuildContent() {
      this.removeMarkedChildren();
      ModeSelection searchBarStyle = (ModeSelection)ClientSettings.INSTANCE.searchBarStyle.getValue();
      String query = this.header.getSearchInput().getText();
      if (searchBarStyle.equals(ClientSettings.INSTANCE.integratedSearchBarMode) && !query.isEmpty()) {
         String normalizedQuery = StringUtils.y(query);

         for(Mod mod : Vape.INSTANCE.getModManager().collectMods()) {
            if (!mod.getCategory().equals(Category.NONE)) {
               String normalizedModuleName = StringUtils.y(mod.getName());
               boolean matchesQuery = normalizedModuleName.contains(normalizedQuery);
               if (matchesQuery) {
                  ModuleComponent moduleComponent = new ModuleComponent(this, mod);
                  this.h(moduleComponent, new Object[0]);
                  moduleComponent.buildValueComponents();
               }
            }
         }

      } else {
         this.populateDefaultMenu();
      }
   }

   public void dispatchMouseEvent(GuiMouseEvent event) {
      QuickActionsFrame quickActionsFrame = (QuickActionsFrame)ClientSettings.getFrame(QuickActionsFrame.class);
      int transitionState = quickActionsFrame.Q$src$I$1o5zb27();
      if (transitionState != 3 && transitionState != 4) {
         if (quickActionsFrame.V$src$Z$1xhop3l()) {
            quickActionsFrame.w(3);
            quickActionsFrame.U();
         } else {
            super.dispatchMouseEvent(event);
         }
      }
   }

   public ClientSettingsSearchFrame() {
      super(Category.NONE);
      this.setDisabledOverlayColor(J.r);
      this.K((double)32.0F);
      this.S((double)32.0F);
      this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().M(false);
      this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().M("wrap");
      this.header = new ClientSettingsSearchFrameHeader(this);
      this.Y(this.header);
      this.rebuildContent();
      this.L(false, true);
   }

   public ClientSettingsSearchFrameHeader getHeader() {
      return this.header;
   }

   public void u() {
      try {
         ClientSettingsFrame settingsFrame = (ClientSettingsFrame)ClientSettings.getFrame(ClientSettingsFrame.class);
         ClientSettingsSectionFrame settingsSectionFrame = (ClientSettingsSectionFrame)ClientSettings.getFrame(ClientSettingsSectionFrame.class);
         this.synchronizeWithSettingsFrames(settingsFrame, settingsSectionFrame);
      } catch (Throwable var3) {
      }

   }

   private void synchronizeWithSettingsFrames(ClientSettingsFrame settingsFrame, ClientSettingsSectionFrame settingsSectionFrame) {
      boolean settingsVisible = settingsFrame.V$src$Z$1xhop3l();
      boolean settingsSectionVisible = settingsSectionFrame.V$src$Z$1xhop3l();
      if (!settingsVisible && !settingsSectionVisible) {
         if (!this.V$src$Z$1xhop3l()) {
            this.t(true, false);
         }

      } else {
         this.t(false, false);
         Frame visibleSettingsFrame = (Frame)(settingsVisible ? settingsFrame : settingsSectionFrame);
         this.M(visibleSettingsFrame.G$src$D$1b2f02a(), visibleSettingsFrame.n());
      }
   }

   public void J() {
      QuickActionsFrame quickActionsFrame = (QuickActionsFrame)ClientSettings.getFrame(QuickActionsFrame.class);
      if (!quickActionsFrame.V$src$Z$1xhop3l()) {
         super.J();
      }
   }

   private void populateDefaultMenu() {
      if (this.defaultMenuComponents.isEmpty()) {
         this.addDefaultMenuComponent(new ColorDividerComponent(J.m));
         this.addDefaultMenuComponent(new ModuleCategoryNavigationButtonComponent("Combat", Category.COMBAT.getIconKey()));
         this.addDefaultMenuComponent(new ModuleCategoryNavigationButtonComponent("Render", Category.RENDER.getIconKey()));
         this.addDefaultMenuComponent(new ModuleCategoryNavigationButtonComponent("Utility", Category.UTILITY.getIconKey()));
         this.addDefaultMenuComponent(new ModuleCategoryNavigationButtonComponent("World", Category.WORLD.getIconKey()));
         this.addDefaultMenuComponent(new ModuleCategoryNavigationButtonComponent("Inventory", Category.INVENTORY.getIconKey()));
         this.addDefaultMenuComponent(new ModuleCategoryNavigationButtonComponent("Network", Category.NETWORK.getIconKey()));
         if (Vape.INSTANCE.isFeatureDisabled()) {
            this.addDefaultMenuComponent((new ModuleCategoryNavigationButtonComponent("Other", "other")).Q(1));
         }

         this.addDefaultMenuComponent(new SpacerComponent((double)1.0F, (double)2.0F));
         this.addDefaultMenuComponent(new SimpleTextLabelComponent("  MISC", (double)0.625F));
         this.addDefaultMenuComponent(new SpacerComponent((double)1.0F, (double)2.0F));
         this.addDefaultMenuComponent(new ColorDividerComponent(J.m));
         this.addDefaultMenuComponent((new FrameNavigationButtonComponent("Friends", (String)null, OnlineFriendsFrame.class)).addClickListener(new ClientSettingsSearchFrameClassOpenClickHandler(this, OnlineFriendsFrame.class)));
         this.addDefaultMenuComponent((new ProfilesFrameNavigationButtonComponent()).addClickListener(new ClientSettingsSearchFrameClassOpenClickHandler(this, ProfilesSettingsFrame.class)));
         this.addDefaultMenuComponent((new FrameNavigationButtonComponent("Macros", (String)null, FrameMacros.class)).addClickListener(new ClientSettingsSearchFrameClassOpenClickHandler(this, FrameMacros.class)));
         this.addDefaultMenuComponent(new ColorDividerComponent(J.m));
         this.addDefaultMenuComponent(new ClickGuiQuickActionsComponent());
      } else {
         for(GuiComponent component : this.defaultMenuComponents) {
            this.h(component, new Object[0]);
         }

      }
   }

   public void t(JsonObject frameState) {
      super.t(frameState);
      this.rebuildContent();
      ClientSettings.refreshModuleCategoryHeaders();
   }

   public void v() {
   }

   public void resetSearchAsync() {
      ClientSettings.UI_EXECUTOR.execute(this::resetSearch);
   }

   private void resetSearch() {
      this.header.getSearchInput().setText("");
      this.rebuildContent();
   }

   public void Y() {
   }
}
