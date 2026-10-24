package gg.vape.ui.click.frame.impl;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public final class ThemeComponentGroupKey {
   private final @Nullable String h;
   private final String Z;

   public @Nullable String u() {
      return this.h;
   }

   public boolean equals(Object object) {
      if (this == object) {
         return true;
      } else if (object != null && this.getClass() == object.getClass()) {
         ThemeComponentGroupKey he_12 = (ThemeComponentGroupKey)object;
         boolean bl = Objects.equals(this.Z, he_12.Z) && Objects.equals(this.h, he_12.h);
         return bl;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.Z, this.h});
   }

   public String h() {
      return this.Z;
   }

   public ThemeComponentGroupKey(String string, @Nullable String string2) {
      this.Z = string;
      this.h = string2;
   }
}
