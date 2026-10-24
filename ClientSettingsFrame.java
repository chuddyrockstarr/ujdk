package gg.vape.ui.click.frame.impl;

import gg.vape.Vape;
import gg.vape.config.ClientSettings;
import gg.vape.config.PublicProfileSettings;
import gg.vape.ui.click.component.ColorDividerComponent;
import gg.vape.ui.click.component.GuiComponent;
import gg.vape.ui.click.component.SpacerComponent;
import gg.vape.ui.click.component.value.ClientSettingsColorValueEditorComponent;
import gg.vape.ui.click.frame.Frame;
import gg.vape.ui.click.frame.PopupFrame;
import gg.vape.ui.click.frame.impl.hud.HudModuleConfigFrameBase;
import gg.vape.ui.font.SmoothFontRenderer;
import gg.vape.utils.render.GuiRenderPrimitives;
import gg.vape.wrapper.impl.Minecraft;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClientSettingsFrame extends Frame {
   private ClientSettings r1;
   private ClientSettingsColorValueEditorComponent rV;
   private HashMap<String, GuiComponent[]> r2;
   private gg.vape.module.none.ClientSettings rX;
   private PublicProfileSettings rh;

   public void u() {
      ClientSettingsSearchFrame clientSettingsSearchFrame = (ClientSettingsSearchFrame)gg.vape.module.none.ClientSettings.getFrame(ClientSettingsSearchFrame.class);
      ClientSettingsSectionFrame clientSettingsSectionFrame = (ClientSettingsSectionFrame)gg.vape.module.none.ClientSettings.getFrame(ClientSettingsSectionFrame.class);
      if (!clientSettingsSectionFrame.V$src$Z$1xhop3l() && !clientSettingsSearchFrame.V$src$Z$1xhop3l()) {
         if (!this.V$src$Z$1xhop3l()) {
            this.t(true, false);
         }
      } else {
         if (this.V$src$Z$1xhop3l() && clientSettingsSectionFrame.V$src$Z$1xhop3l()) {
            this.t(false, false);
         }

         if (clientSettingsSectionFrame.V$src$Z$1xhop3l()) {
            this.M(clientSettingsSectionFrame.G$src$D$1b2f02a(), clientSettingsSectionFrame.n());
         } else if (clientSettingsSearchFrame.V$src$Z$1xhop3l() && this.G$src$D$1b2f02a() != clientSettingsSearchFrame.G$src$D$1b2f02a() && this.n() != clientSettingsSearchFrame.n()) {
            this.M(clientSettingsSearchFrame.G$src$D$1b2f02a(), clientSettingsSearchFrame.n());
         }
      }

   }

   private void v(Frame frame) {
      if (frame != null) {
         frame.t(!frame.V$src$Z$1xhop3l(), false);
         if (frame.V$src$Z$1xhop3l()) {
            frame.U();
         }

         frame.K(this.G$src$D$1b2f02a());
         frame.S(this.n());
         frame.l$src$V$1mibm4x();
      }
   }

   private void z(String string, GuiComponent... guiComponentArray) {
      this.r2.put(string, guiComponentArray);
      this.h((new ClientSettingsFrameSectionLabelComponent(string)).addClickListener(new ClientSettingsFrameSectionOpenClickHandler(this, string)), new Object[0]);
   }

   private static int lambda$sortGui$1(Frame frame, Frame frame2) {
      return frame.L() == frame2.L() ? 0 : Double.compare(frame2.L(), frame.L());
   }

   public static HashMap t(ClientSettingsFrame clientSettingsFrame) {
      return clientSettingsFrame.r2;
   }

   public void z(boolean bl) {
      super.z(bl);
      this.Y((double)238.0F);
      GuiRenderPrimitives.C(this.G$src$D$1b2f02a(), this.n() + this.j$src$Lgg_vape_ui_click_frame_FrameHeaderComponent_$175vsfc().L() + (double)2.0F, this.A(), this.L() - (this.j$src$Lgg_vape_ui_click_frame_FrameHeaderComponent_$175vsfc().L() + (double)8.0F), J.i);
      SmoothFontRenderer smoothFontRenderer = Vape.INSTANCE.getFontManager().E(0.7, false);
      String string = "Vape " + Vape.VERSION;
      double d = smoothFontRenderer.N(string);
      smoothFontRenderer.d(string, this.G$src$D$1b2f02a() + this.A() - d - (double)4.0F, this.n() + this.L() - (double)4.5F, J.h);
   }

   private void Q$src$V$16a7t4t() {
      Map<ThemeComponentGroupKey, GuiComponent[]> map = ClientSettingsComponentFactory.d(J, this.r1, this.rX, false);
      ThemeComponentGroupKey themeComponentGroupKey;
      if (map.containsKey(themeComponentGroupKey = new ThemeComponentGroupKey("GUI", "newgui"))) {
         GuiComponent[] guiComponentArray = (GuiComponent[])map.get(themeComponentGroupKey);
         GuiComponent[] object = new GuiComponent[guiComponentArray.length + 2];
         System.arraycopy(guiComponentArray, 0, object, 0, guiComponentArray.length);
         object[guiComponentArray.length] = (new ClientSettingsActionButtonRowComponent("Reset GUI positions", new ClientSettingsFrameResetGuiLayoutClickHandler(this))).w("This will reset your GUI back to the default");
         object[guiComponentArray.length + 1] = (new ClientSettingsActionButtonRowComponent("Sort GUI", new ClientSettingsFrameSortGuiClickHandler(this))).w("Sorts GUI by size");
         map.put(themeComponentGroupKey, object);
      }

      for(Map.Entry entry : map.entrySet()) {
         String string = ((ThemeComponentGroupKey)entry.getKey()).h();
         GuiComponent[] guiComponentArray = (GuiComponent[])entry.getValue();
         this.r2.put(string, guiComponentArray);
         this.h((new ClientSettingsFrameSectionLabelComponent(string)).addClickListener(new ClientSettingsFrameActionClickHandler(this, string)), new Object[0]);
      }

   }

   public void d$src$V$16knweo() {
      this.rV.resetPaletteSlider();
   }

   public void onDisable() {
      super.onDisable();
   }

   public static ClientSettingsSectionFrame m(ClientSettingsFrame clientSettingsFrame, String string) {
      return clientSettingsFrame.A(string);
   }

   public static void a(ClientSettingsFrame clientSettingsFrame) {
      clientSettingsFrame.Z$src$V$16f5yh2();
   }

   public void Y() {
   }

   private static boolean lambda$sortGui$0(Frame frame) {
      return !frame.V$src$Z$1xhop3l() || frame.n$src$Z$1fa61uz() || !frame.J$src$Z$1eqdghz() || frame instanceof HudModuleConfigFrameBase || frame instanceof PopupFrame;
   }

   public static void n(ClientSettingsFrame clientSettingsFrame) {
      clientSettingsFrame.k$src$V$16oigk7();
   }

   public void v() {
   }

   private static Exception a(Exception exception) {
      return exception;
   }

   private void k$src$V$16oigk7() {
      int n = 10;

      for(Frame frame : gg.vape.module.none.ClientSettings.getAllFrames()) {
         if (frame instanceof ClientSettingsSearchFrame) {
            frame.M((double)10.0F, (double)20.0F);
         } else if (frame.J$src$Z$1eqdghz() && !frame.n$src$Z$1fa61uz()) {
            double var10001 = ((ClientSettingsSearchFrame)gg.vape.module.none.ClientSettings.getFrame(ClientSettingsSearchFrame.class)).A() + (double)10.0F;
            n += 22;
            frame.M(var10001, (double)n);
         }
      }

      for(Frame frame : gg.vape.module.none.ClientSettings.getAllFrames()) {
         if (!frame.n$src$Z$1fa61uz() && frame.J$src$Z$1eqdghz()) {
            frame.setVisible(frame instanceof ClientSettingsSearchFrame);
         }
      }

      gg.vape.module.none.ClientSettings.clearPositionedFrames();
   }

   private ClientSettingsSectionFrame A(String string) {
      ClientSettingsSectionFrame clientSettingsSectionFrame = ((ClientSettingsSectionFrame)gg.vape.module.none.ClientSettings.getFrame(ClientSettingsSectionFrame.class)).z(string);
      clientSettingsSectionFrame.s$src$V$yca8r0();
      this.v(clientSettingsSectionFrame);
      clientSettingsSectionFrame.removeMarkedChildren();
      return clientSettingsSectionFrame;
   }

   private void Z$src$V$16f5yh2() {
      ArrayList<Frame> arrayList = new ArrayList(gg.vape.module.none.ClientSettings.INSTANCE.getActiveStack().Y());
      arrayList.removeIf(ClientSettingsFrame::lambda$sortGui$0);

      try {
         arrayList.sort(ClientSettingsFrame::lambda$sortGui$1);
         Frame frame = null;

         for(Frame frame2 : arrayList) {
            if (frame2 instanceof ClientSettingsSectionFrame) {
               frame = frame2;
               break;
            }
         }

         if (frame != null) {
            arrayList.remove(frame);
            arrayList.add(0, frame);
         }
      } catch (Exception exception) {
         Vape.logThrowable(exception);
      }

      double d = (double)32.0F;
      double d2 = (double)32.0F;
      double d3 = (double)0.0F;

      for(Frame frame : arrayList) {
         if (d + frame.A() > (double)Minecraft.G().getScaledWidth()) {
            d = (double)30.0F;
            d2 += d3 + (double)4.0F;
            d3 = (double)0.0F;
         }

         double d4 = frame.L() > frame.d$src$D$ibccpu() ? frame.d$src$D$ibccpu() : frame.L();
         if (d4 > d3) {
            d3 = d4;
         }

         frame.M(d, d2);
         d += frame.A() + (double)2.0F;
      }

   }

   public String getName() {
      return "Settings";
   }

   public ClientSettingsFrame() {
      this.rX = gg.vape.module.none.ClientSettings.INSTANCE;
      this.r1 = Vape.INSTANCE.getClientSettings();
      this.rh = Vape.INSTANCE.getPublicProfileSettings();
      this.r2 = new HashMap();
      this.setDisabledOverlayColor(J.r);
      this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().M(false);
      this.l$src$Lgg_vape_ui_click_layout_ComponentLayout_$di1tij().M("wrap");
      ClientSettingsSearchFrame clientSettingsSearchFrame = (ClientSettingsSearchFrame)gg.vape.module.none.ClientSettings.getFrame(ClientSettingsSearchFrame.class);
      this.Y(clientSettingsSearchFrame.L());
      this.o(clientSettingsSearchFrame.A());
      SettingsFrameHeaderComponent settingsFrameHeaderComponent = new SettingsFrameHeaderComponent(this, "Settings");
      settingsFrameHeaderComponent.n(new ClientSettingsFrameOpenSearchAndCloseSettingsClickHandler(this));
      settingsFrameHeaderComponent.f(new ClientSettingsFrameOpenSearchClickHandler(this));
      this.Y(settingsFrameHeaderComponent);
      this.h(new SpacerComponent((double)1.0F, (double)2.0F), new Object[0]);
      this.h(new ColorDividerComponent(J.l), new Object[0]);
      this.Q$src$V$16a7t4t();

      for(GuiComponent guiComponent : ClientSettingsComponentFactory.M(J, this.r1, this.rX, false)) {
         if (guiComponent instanceof ClientSettingsColorValueEditorComponent) {
            this.rV = (ClientSettingsColorValueEditorComponent)guiComponent;
         }

         this.h(guiComponent, new Object[0]);
      }

      this.setVisible(false);
      this.L(false, false);
      this.setVisible(false);
      this.L(false, false);
   }
}
