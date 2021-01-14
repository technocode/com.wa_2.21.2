package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3bj  reason: invalid class name and case insensitive filesystem */
public class C74883bj extends AnonymousClass3ZW {
    public AnonymousClass3ZS A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass0HJ A02;
    public final AnonymousClass0YX A03;
    public final AnonymousClass3SQ A04;

    public C74883bj(Context context, AnonymousClass00S r16, AnonymousClass02M r17, AnonymousClass01I r18, C02590Cr r19, C09610dF r20, AnonymousClass0HJ r21, AnonymousClass01A r22, AnonymousClass03P r23, C014308b r24, AnonymousClass01X r25, AnonymousClass31y r26, AnonymousClass3SQ r27, AnonymousClass0YX r28, C09030cB r29, AnonymousClass022 r30) {
        super(context, r16, r18, r19, r20, r22, r23, r24, r25, r26, r29, r30);
        this.A01 = r17;
        this.A02 = r21;
        this.A03 = r28;
        this.A04 = r27;
        A00();
    }

    public void A07(C04830Lz r11, List list) {
        super.A04(r11, list);
        AnonymousClass3ZS r3 = this.A00;
        AnonymousClass01X r4 = r3.A0D;
        FrameLayout frameLayout = r3.A04;
        int i = r3.A01;
        AnonymousClass0SE.A07(r4, frameLayout, i, i, i, i);
        r3.A0B.A05(r3.A06, R.drawable.avatar_contact);
        r3.A05.setVisibility(8);
        String A1f = C002001d.A1f(r3.A0D, r11);
        if (A1f == null) {
            A1f = "";
        }
        r3.A07.setTitleAndDescription(C003701u.A07(A1f, 128), null, list);
        r3.A02(r11, list);
    }

    public void A08(AnonymousClass0M1 r11, List list) {
        super.A04(r11, list);
        AnonymousClass3ZS r3 = this.A00;
        int i = r3.A01;
        int i2 = ((i << 1) - r3.A03) >> 1;
        AnonymousClass0SE.A07(r3.A0D, r3.A04, i2, i, i2, i);
        AnonymousClass0HJ r2 = r3.A0B;
        r2.A05(r3.A06, R.drawable.avatar_contact);
        r2.A05(r3.A05, R.drawable.avatar_contact);
        r3.A05.setVisibility(0);
        r3.A06.setVisibility(0);
        r3.A02(r11, list);
    }
}
