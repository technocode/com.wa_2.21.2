package X;

import android.content.Context;
import android.widget.BaseAdapter;

/* renamed from: X.1Lj  reason: invalid class name and case insensitive filesystem */
public class C26551Lj extends BaseAdapter {
    public final int A00;
    public final Context A01;
    public final AnonymousClass01X A02;
    public final /* synthetic */ C26621Lq A03;

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public C26551Lj(C26621Lq r1, Context context, AnonymousClass01X r3, int i) {
        this.A03 = r1;
        this.A01 = context;
        this.A02 = r3;
        this.A00 = i;
    }

    public int getCount() {
        C26621Lq r7 = this.A03;
        int i = 0;
        if (r7.A03 == 0) {
            return 0;
        }
        C26611Lp[] r5 = r7.A0R;
        int i2 = this.A00;
        C26611Lp r0 = r5[i2];
        Context context = this.A01;
        int A002 = r0.A00(context);
        int i3 = r7.A03;
        int i4 = ((A002 + i3) - 1) / i3;
        if (r7.A0Q && r5[i2].A00(context) > 0) {
            i = 1;
        }
        return i4 + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 != r4.A03) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26551Lj.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
