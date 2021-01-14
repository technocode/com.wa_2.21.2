package X;

import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;

/* renamed from: X.0eG  reason: invalid class name and case insensitive filesystem */
public class C10210eG extends AnonymousClass0JW {
    public final int A00;
    public final long A01;
    public final AnonymousClass01K A02;
    public final AnonymousClass0BV A03;
    public final AnonymousClass02N A04;
    public final C57502kP A05;
    public final boolean A06;

    public C10210eG(C57502kP r1, AnonymousClass01K r2, AnonymousClass0BV r3, AnonymousClass02N r4, long j, boolean z, int i) {
        this.A05 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = j;
        this.A06 = z;
        this.A00 = i;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C47942Kh r5 = (C47942Kh) obj;
        if (r5 != null) {
            StringBuilder A0S = AnonymousClass008.A0S("MediaMessagesNavigator/navigator/cursor-upgraded is-head:");
            boolean z = this.A06;
            A0S.append(z);
            A0S.append(" count:");
            A0S.append(r5.getCount());
            A0S.append(" pos:");
            A0S.append(r5.getPosition());
            Log.d(A0S.toString());
            C57502kP r3 = this.A05;
            MediaViewFragment mediaViewFragment = r3.A07;
            if (mediaViewFragment.A0A() != null && !C002001d.A3D(mediaViewFragment.AMs())) {
                if (z) {
                    C47942Kh r2 = r3.A02;
                    r3.A09 = true;
                    r3.A02 = r5;
                    int count = r5.getCount();
                    r3.A00 = count;
                    AnonymousClass008.A1L(AnonymousClass008.A0S("MediaMessagesNavigator/navigator/upgrade-head-cursor/ count:"), count);
                    r3.A02.registerContentObserver(r3.A0B);
                    Runnable runnable = r3.A08;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (r2 != null) {
                        r2.close();
                        return;
                    }
                    return;
                }
                C47942Kh r22 = r3.A03;
                r3.A0A = true;
                r3.A03 = r5;
                int count2 = r5.getCount();
                r3.A01 = count2;
                AnonymousClass008.A1L(AnonymousClass008.A0S("MediaMessagesNavigator/navigator/upgrade-tail-cursor/ count:"), count2);
                r3.A03.registerContentObserver(r3.A0B);
                Runnable runnable2 = r3.A08;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (r22 != null) {
                    r22.close();
                }
            }
        }
    }
}
