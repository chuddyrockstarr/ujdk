package gg.vape.ui.click.frame.impl;

import gg.vape.ui.click.component.TextInputComponentBase;

class SessionSpoofUsernameInputComponent extends TextInputComponentBase {
   final SessionSpoofFrame rf;

   public double C() {
      return (double)20.0F;
   }

   SessionSpoofUsernameInputComponent(SessionSpoofFrame sessionSpoofFrame, String string) {
      super(string);
      this.rf = sessionSpoofFrame;
   }

   public void submit() {
      SessionSpoofFrame.W(this.rf);
      this.setText("");
   }

   public double x() {
      return (double)150.0F;
   }
}
