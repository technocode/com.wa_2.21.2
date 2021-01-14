package X;

import android.database.ContentObserver;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;

/* renamed from: X.0eH  reason: invalid class name and case insensitive filesystem */
public class C10220eH extends AnonymousClass0JW {
    public C47942Kh A00;
    public C47942Kh A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass01K A04;
    public final AnonymousClass0BV A05;
    public final AnonymousClass02N A06;
    public final C57502kP A07;
    public final AnonymousClass0M3 A08;

    public C10220eH(C57502kP r1, AnonymousClass02N r2, AnonymousClass0M3 r3, AnonymousClass01K r4, AnonymousClass0BV r5) {
        this.A06 = r2;
        this.A08 = r3;
        this.A07 = r1;
        this.A04 = r4;
        this.A05 = r5;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        if (((Number) obj).intValue() >= 0) {
            C57502kP r4 = this.A07;
            C47942Kh r5 = this.A00;
            boolean z = this.A02;
            C47942Kh r3 = this.A01;
            boolean z2 = this.A03;
            MediaViewFragment mediaViewFragment = r4.A07;
            if (mediaViewFragment.A0A() != null && !C002001d.A3D(mediaViewFragment.AMs())) {
                r4.close();
                r4.A0C.put(0, r4.A0G);
                r4.A02 = r5;
                r4.A09 = z;
                r4.A03 = r3;
                r4.A0A = z2;
                r4.A00 = r5.getCount();
                int count = r3.getCount();
                r4.A01 = count;
                StringBuilder A0S = AnonymousClass008.A0S("MediaMessagesNavigator/navigator/set-cursors/ head-count:");
                A0S.append(r4.A00);
                A0S.append(" head-full:");
                A0S.append(z);
                A0S.append(" tail-count:");
                A0S.append(count);
                A0S.append(" tail-full:");
                A0S.append(z2);
                Log.i(A0S.toString());
                ContentObserver contentObserver = r4.A0B;
                r5.registerContentObserver(contentObserver);
                r3.registerContentObserver(contentObserver);
                r4.A07.A17(r4.A00);
            }
        }
    }
}
