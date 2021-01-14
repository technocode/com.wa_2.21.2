package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Lp  reason: invalid class name and case insensitive filesystem */
public class C26611Lp {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int[][] A04;

    public C26611Lp() {
        this.A02 = 0;
        this.A04 = null;
        this.A00 = R.id.emoji_recent_btn;
        this.A01 = R.id.emoji_recent_marker;
        this.A03 = R.string.emoji_recents_title;
    }

    public C26611Lp(int i, AbstractC03980In r3) {
        this.A02 = i;
        EnumC03970Im r32 = (EnumC03970Im) r3;
        this.A04 = r32.emojiData;
        this.A00 = r32.buttonId;
        this.A01 = r32.markerId;
        this.A03 = r32.titleResId;
    }

    public int A00(Context context) {
        if (!(this instanceof C40021sU)) {
            return this.A04.length;
        }
        return ((C40021sU) this).A00.A00();
    }

    public int[] A01(AnonymousClass022 r3, int i) {
        if (this instanceof C40021sU) {
            return (int[]) ((C40021sU) this).A00.A01(i);
        }
        int[] iArr = this.A04[i];
        if (C28051Sr.A21(iArr)) {
            return C26621Lq.A02(r3, iArr);
        }
        return iArr;
    }
}
