package X;

import android.view.animation.Animation;
import android.widget.AbsListView;
import com.whatsapp.emoji.EmojiPopupFooter;

/* renamed from: X.2NY  reason: invalid class name */
public class AnonymousClass2NY implements AbsListView.OnScrollListener {
    public final /* synthetic */ C53392d8 A00;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public AnonymousClass2NY(C53392d8 r1) {
        this.A00 = r1;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C53392d8 r3 = this.A00;
        int height = r3.A07.getHeight();
        int i4 = r3.A01;
        if (i4 >= i) {
            height = -1;
            if (i4 > i) {
                height = 0;
            }
        }
        r3.A01 = i;
        if (height >= 0) {
            EmojiPopupFooter emojiPopupFooter = r3.A07;
            if (height != emojiPopupFooter.A00) {
                Animation animation = emojiPopupFooter.getAnimation();
                if (!(animation instanceof AnonymousClass2NZ) || ((AnonymousClass2NZ) animation).A00 != height) {
                    if (animation != null) {
                        animation.cancel();
                    }
                    r3.A07.startAnimation(new AnonymousClass2NZ(r3, height));
                }
            }
        }
    }
}
