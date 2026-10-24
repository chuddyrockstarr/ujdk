package gg.vape.ui.click;

public enum MouseButton {
   LEFT_CLICK,
   RIGHT_CLICK,
   MIDDLE_CLICK,
   UNKNOWN;

   private static final MouseButton[] J;

   public static MouseButton A(int n) {
      for(MouseButton mouseButton : values()) {
         if (mouseButton.ordinal() == n) {
            return mouseButton;
         }
      }

      return UNKNOWN;
   }

   public MouseClickButton G() {
      return this == LEFT_CLICK ? MouseClickButton.LEFT_CLICK : (this == RIGHT_CLICK ? MouseClickButton.RIGHT_CLICK : (this == MIDDLE_CLICK ? MouseClickButton.MIDDLE_CLICK : null));
   }

   // $FF: synthetic method
   private static MouseButton[] $values() {
      return new MouseButton[]{LEFT_CLICK, RIGHT_CLICK, MIDDLE_CLICK, UNKNOWN};
   }

   static {
      String[] var10000 = new String[]{"LEFT_CLICK", "MIDDLE_CLICK", "RIGHT_CLICK", "UNKNOWN"};
      J = new MouseButton[]{LEFT_CLICK, RIGHT_CLICK, MIDDLE_CLICK, UNKNOWN};
   }
}
