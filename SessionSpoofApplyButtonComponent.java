package gg.vape.ui.click.frame.impl;

import gg.vape.account.MinecraftSessionWrapper;
import gg.vape.ui.click.component.gui.TextButton;
import gg.vape.wrapper.impl.Minecraft;
import java.awt.Color;

class SessionSpoofApplyButtonComponent extends TextButton {
   final SessionSpoofFrame X_;
   private static final String cb = "Logged in (";

   public boolean w$src$Z$e457mb() {
      return SessionSpoofFrame.t(this.X_) == null ? false : super.w$src$Z$e457mb();
   }

   public void u() {
      super.u();
      MinecraftSessionWrapper minecraftSessionWrapper;
      if (SessionSpoofFrame.t(this.X_) == null && (minecraftSessionWrapper = Minecraft.Q$src$Lgg_vape_account_MinecraftSessionWrapper_$1ftnn3u()).isNotNull()) {
         SessionSpoofFrame.i(this.X_).setLabelText("Logged in (" + minecraftSessionWrapper.getUsername() + ")");
      }

   }

   public double A() {
      return (double)140.0F;
   }

   SessionSpoofApplyButtonComponent(SessionSpoofFrame sessionSpoofFrame, String string, double d, Color color, Color color2) {
      super(string, d, color, color2);
      this.X_ = sessionSpoofFrame;
   }

   public double L() {
      return (double)20.0F;
   }
}
