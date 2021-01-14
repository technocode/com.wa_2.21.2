package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3bq  reason: invalid class name and case insensitive filesystem */
public class C74953bq extends AnonymousClass3ZW {
    public AnonymousClass3ZU A00;
    public final AnonymousClass0HJ A01;
    public final AnonymousClass0YX A02;
    public final AnonymousClass0AQ A03;
    public final AnonymousClass01S A04;
    public final C02770Dj A05;

    public C74953bq(Context context, AnonymousClass00S r16, AnonymousClass01I r17, C02590Cr r18, C09610dF r19, C02770Dj r20, AnonymousClass0HJ r21, AnonymousClass01A r22, AnonymousClass03P r23, C014308b r24, AnonymousClass01X r25, AnonymousClass31y r26, AnonymousClass0YX r27, AnonymousClass01S r28, AnonymousClass022 r29, AnonymousClass0AQ r30, C09030cB r31) {
        super(context, r16, r17, r18, r19, r22, r23, r24, r25, r26, r31, r29);
        this.A05 = r20;
        this.A01 = r21;
        this.A02 = r27;
        this.A04 = r28;
        this.A03 = r30;
        A00();
    }

    @Override // X.AnonymousClass3OP, X.AnonymousClass3ZW
    public CharSequence A01(AbstractC007503q r9, C007003k r10) {
        String str;
        AbstractC02860Dt r92 = (AbstractC02860Dt) r9;
        if (!(r92 instanceof C02850Ds) || (str = ((C02850Ds) r92).A03) == null) {
            str = "";
        }
        int i = R.drawable.ic_inline_live_location;
        if (r92 instanceof C05470Or) {
            i = R.drawable.msg_status_location;
        }
        Drawable A0b = C002001d.A0b(getContext(), i, R.color.msgStatusTint);
        TextPaint paint = ((AnonymousClass3OP) this).A01.getPaint();
        if (!TextUtils.isEmpty(str)) {
            return C28051Sr.A0j(C05270Nw.A01("", A0b, paint), r10, r92.A0n.A02, this.A08, this.A0A, this.A0F);
        }
        return super.A01(r92, r10);
    }

    /* renamed from: A07 */
    public void A04(AbstractC02860Dt r10, List list) {
        String A06;
        long A052;
        String A10;
        super.A04(r10, list);
        AnonymousClass3ZU r7 = this.A00;
        if (r7 != null) {
            String str = "";
            if (r10 instanceof C05470Or) {
                C05470Or r0 = (C05470Or) r10;
                A06 = r0.A01;
                if (A06 == null) {
                    A06 = str;
                }
                A10 = r0.A00;
                String A0w = r0.A0w();
                if (A0w != null) {
                    Uri parse = Uri.parse(A0w);
                    if (parse.getHost() != null) {
                        str = parse.getHost();
                    }
                }
                if (TextUtils.isEmpty(A06) && TextUtils.isEmpty(A10)) {
                    A06 = r7.A06.A06(R.string.pinned_location);
                }
            } else {
                C02850Ds r4 = (C02850Ds) r10;
                A06 = r7.A06.A06(R.string.live_location);
                AnonymousClass01S r3 = r7.A08;
                if (r4.A0n.A02) {
                    A052 = r3.A06(r4);
                } else {
                    A052 = r3.A05(r4);
                }
                AnonymousClass00S r2 = r7.A05;
                A10 = C28051Sr.A10(r4, C28051Sr.A1w(r4, A052, r2), r2, r7.A06, r3);
            }
            r7.A00.setTitleAndDescription(A06, A10, list);
            if (str != null) {
                r7.A00.setSubText(str, null);
            }
            r7.A01.setMessage(r10);
            return;
        }
        throw null;
    }
}
