package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.emoji.EmojiPopupFooter;

/* renamed from: X.2NZ  reason: invalid class name */
public final class AnonymousClass2NZ extends Animation {
    public final int A00;
    public final int A01;
    public final /* synthetic */ C53392d8 A02;

    public AnonymousClass2NZ(C53392d8 r4, int i) {
        this.A02 = r4;
        this.A00 = i;
        EmojiPopupFooter emojiPopupFooter = r4.A07;
        int i2 = emojiPopupFooter.A00;
        this.A01 = i2;
        setDuration((long) ((Math.abs(i2 - i) * 300) / emojiPopupFooter.getHeight()));
    }

    public void applyTransformation(float f, Transformation transformation) {
        EmojiPopupFooter emojiPopupFooter = this.A02.A07;
        int i = this.A01;
        emojiPopupFooter.setTopOffset((int) ((((float) (this.A00 - i)) * f) + ((float) i)));
    }
}
