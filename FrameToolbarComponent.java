package gg.vape.ui.click.frame;

import gg.vape.ui.click.component.FlowLayoutComponent;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.component.IconButtonComponent;
import gg.vape.ui.click.component.PanelComponent;
import gg.vape.ui.click.component.SimpleTextLabelComponent;
import gg.vape.ui.click.component.SpacerComponent;
import gg.vape.ui.click.component.SquareIconButtonComponent;
import gg.vape.ui.click.component.layout.PaddedComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrameToolbarComponent extends FrameHeaderComponent {
   private static String legacyState;
   private final PanelComponent contentPanel;
   private final SimpleTextLabelComponent titleLabel;
   private boolean defaultCloseActionVisible = false;
   private final String defaultIconResource;
   private boolean showingBackNavigation = false;
   private float defaultIconScale = 1.0F;
   private final SquareIconButtonComponent closeButton = new SquareIconButtonComponent("newclose", (double)1.5F);
   private final PaddedComponent paddedContent;
   private final FlowLayoutComponent actionsLayout;
   private final List<FrameToolbarEntry> entries = new ArrayList();
   private final IconButtonComponent navigationButton;
   private final String defaultTitle;
   private final FlowLayoutComponent closeActionLayout;

   public void addEntry(FrameToolbarEntry entry) {
      this.entries.add(entry);
      Collections.reverse(this.entries);
      FrameToolbarEntry[] reversedEntries = new FrameToolbarEntry[this.entries.size()];
      reversedEntries = (FrameToolbarEntry[])this.entries.toArray(reversedEntries);
      Collections.reverse(this.entries);
      this.setEntries(reversedEntries);
   }

   public void setEntries(FrameToolbarEntry... entries) {
      this.actionsLayout.t$src$V$zbu1jn();

      for(FrameToolbarEntry entry : entries) {
         this.actionsLayout.h(entry.getLayout(), new Object[0]);
      }

      this.actionsLayout.h(this.closeActionLayout, new Object[0]);
   }

   public boolean D(int n, int n2) {
      return !this.showingBackNavigation || !this.navigationButton.getBounds().J((double)n, (double)n2) && !this.actionsLayout.getBounds().J((double)n, (double)n2) ? this.getBounds().J((double)n, (double)n2) : false;
   }

   public FlowLayoutComponent getCloseActionLayout() {
      return this.closeActionLayout;
   }

   public static String getLegacyState() {
      return legacyState;
   }

   public void showSettingsNavigation(boolean hideAllActions) {
      this.showBackNavigation(this.getDefaultTitle() + " settings", hideAllActions);
   }

   public IconButtonComponent getNavigationButton() {
      return this.navigationButton;
   }

   public boolean isShowingBackNavigation() {
      return this.showingBackNavigation;
   }

   public void setDefaultCloseActionVisible(boolean defaultCloseActionVisible) {
      this.defaultCloseActionVisible = defaultCloseActionVisible;
      this.getCloseActionLayout().setVisible(true);
   }

   public FrameToolbarComponent(Frame frame, String defaultIconResource, String defaultTitle) {
      super(frame);
      this.defaultIconResource = defaultIconResource;
      this.defaultTitle = defaultTitle;
      this.contentPanel = new PanelComponent(this.x() - (double)8.0F, this.C() - (double)8.0F);
      this.paddedContent = new PaddedComponent((double)4.0F, (double)4.0F, this.contentPanel);
      FlowLayoutComponent titleLayout = new FlowLayoutComponent((double)90.0F);
      this.navigationButton = new IconButtonComponent(defaultIconResource);
      titleLayout.h(this.navigationButton, new Object[0]);
      this.titleLabel = new SimpleTextLabelComponent(defaultTitle, 0.9, J.A);
      this.titleLabel.setOffsetX(0.0F);
      this.titleLabel.setOffsetY(1.0F);
      titleLayout.h(new SpacerComponent((double)1.0F, (double)1.0F), new Object[0]);
      titleLayout.h(this.titleLabel, new Object[0]);
      this.actionsLayout = new FlowLayoutComponent((double)60.0F);
      this.contentPanel.h(titleLayout, new Object[0]);
      this.contentPanel.h(this.actionsLayout, new Object[]{"alignright"});
      this.closeActionLayout = new FlowLayoutComponent((double)10.0F);
      this.closeActionLayout.addChildren(new GuiComponent[]{new SpacerComponent((double)10.0F, (double)2.0F), this.closeButton});
      this.closeActionLayout.setVisible(false);
      this.addChildren(new GuiComponent[]{this.paddedContent});
      this.navigationButton.setOverrideColor(J.f);
      titleLayout.setShowDisabledOverlay(false);
      this.actionsLayout.setShowDisabledOverlay(false);
      this.contentPanel.setShowDisabledOverlay(false);
      this.paddedContent.setShowDisabledOverlay(false);
      this.closeButton.setImageDivisor((double)3.5F);
      this.closeButton.setIconScale(1.2);
      this.setEntries();
   }

   public void addAction(GuiComponent component) {
      this.addEntry(new FrameToolbarEntry(component));
   }

   public void setDefaultIconScale(float defaultIconScale) {
      this.defaultIconScale = defaultIconScale;
      if (!this.showingBackNavigation) {
         this.navigationButton.setIconScale((double)defaultIconScale);
      }

   }

   public void showBackNavigation(String title, boolean hideAllActions) {
      this.navigationButton.setIconResource("moduleback");
      this.navigationButton.setIconScale((double)0.85F);
      this.titleLabel.setText(title);
      if (hideAllActions) {
         this.closeActionLayout.setVisible(true);
      }

      for(FrameToolbarEntry entry : this.entries) {
         if (entry.isHiddenInBackMode() || hideAllActions) {
            entry.getLayout().setVisible(false);
         }
      }

      this.showingBackNavigation = true;
   }

   public void updateLayout() {
      this.paddedContent.H(true);
      this.paddedContent.K(this.G$src$D$1b2f02a());
      this.paddedContent.S(this.n());
   }

   public static void setLegacyState(String state) {
      legacyState = state;
   }

   public String getDefaultTitle() {
      return this.defaultTitle;
   }

   public void setToolbarWidth(double width) {
      this.o(width);
      this.setExplicitWidth(width);
      this.contentPanel.setExplicitWidth(width - (double)8.0F);
   }

   public void restoreDefaultNavigation() {
      this.navigationButton.setIconResource(this.defaultIconResource);
      this.navigationButton.setIconScale((double)this.defaultIconScale);
      this.titleLabel.setText(this.defaultTitle);
      this.closeActionLayout.setVisible(this.defaultCloseActionVisible);

      for(FrameToolbarEntry entry : this.entries) {
         entry.getLayout().setVisible(true);
      }

      this.showingBackNavigation = false;
   }

   public SquareIconButtonComponent getCloseButton() {
      return this.closeButton;
   }

   static {
      setLegacyState("Mcksjb");
   }
}
