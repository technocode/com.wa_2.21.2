package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Yq  reason: invalid class name and case insensitive filesystem */
public class C73773Yq extends AnonymousClass3IE {
    public boolean A00;
    public final C000300f A01;
    public final C449222e A02;
    public final C60922sD A03;
    public final AnonymousClass0AD A04;
    public final AnonymousClass3EF A05;
    public final C68783En A06;
    public final C69293Gm A07;
    public final AnonymousClass1X6 A08;

    public C73773Yq(AbstractC005102k r29, AnonymousClass00S r30, AnonymousClass02M r31, AnonymousClass01I r32, AnonymousClass00G r33, AnonymousClass00T r34, C000300f r35, C018709t r36, C02150Av r37, AnonymousClass01A r38, AnonymousClass03P r39, AnonymousClass01X r40, C63842x6 r41, C01970Ad r42, AnonymousClass0GG r43, AnonymousClass01K r44, AnonymousClass1X6 r45, C63212w2 r46, C69293Gm r47, AnonymousClass04j r48, C01980Ae r49, C60922sD r50, C03340Fu r51, C02040Ak r52, C018609s r53, C449222e r54, AnonymousClass0GP r55, C61592tQ r56, AnonymousClass0AD r57, AnonymousClass0BA r58, C68783En r59, Bundle bundle) {
        super(r29, r30, r31, r32, r33, r34, r36, r37, r38, r39, r40, r42, r43, r44, r46, r49, r52, r53, r56, r57, r58, bundle);
        this.A01 = r35;
        this.A08 = r45;
        this.A07 = r47;
        this.A03 = r50;
        this.A02 = r54;
        this.A04 = r57;
        this.A06 = r59;
        this.A05 = new AnonymousClass3EF(r33.A00, r31, r41, r48, r50, r51, r54, r55);
        this.A00 = bundle.getBoolean("extra_return_after_completion");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r0 == false) goto L_0x0013;
     */
    @Override // X.AnonymousClass3IE
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02(X.AnonymousClass0MH r3) {
        /*
            r2 = this;
            X.1yx r1 = r3.A07
            X.3XM r1 = (X.AnonymousClass3XM) r1
            com.whatsapp.jid.UserJid r0 = r3.A0A
            if (r0 != 0) goto L_0x0013
            if (r1 == 0) goto L_0x0013
            java.lang.String r0 = r1.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            boolean r0 = r3.A0K()
            if (r0 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r3.A0B
            boolean r0 = X.AnonymousClass0MH.A07(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r3.A0B
            return r0
        L_0x0027:
            java.lang.String r0 = r3.A0G
            return r0
        L_0x002a:
            java.lang.String r0 = super.A02(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73773Yq.A02(X.0MH):java.lang.String");
    }

    @Override // X.AnonymousClass3IE
    public void A03() {
        AnonymousClass0MH r1;
        String str;
        C63392wL r0 = super.A04;
        if (r0 == null || (r1 = r0.A01) == null || !r1.A0L) {
            super.A03();
            return;
        }
        AbstractC43791yx r12 = r1.A07;
        if (r12 instanceof AnonymousClass3XM) {
            str = ((AnonymousClass3XM) r12).A09;
        } else {
            str = "";
        }
        if (!C63832x5.A00(str)) {
            C63372wJ r2 = new C63372wJ(8);
            r2.A07 = this.A0I.A06(R.string.payment_invalid_vpa_error_text);
            super.A06.A07(r2);
        } else if (!this.A02.A03(str)) {
            A0B(true);
            this.A05.A00(str, null, new AnonymousClass3I2(this, str));
        } else {
            C63372wJ r13 = new C63372wJ(13);
            r13.A0A = str;
            super.A06.A07(r13);
        }
    }

    public final void A0C() {
        A0B(true);
        C68783En r3 = this.A06;
        String str = super.A04.A01.A0G;
        AnonymousClass3I1 r1 = new AnonymousClass3I1(this);
        if (r3 == null) {
            throw null;
        } else if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            r3.A05(arrayList, r1);
        }
    }

    public final void A0D(List list) {
        AnonymousClass3XM r3 = (AnonymousClass3XM) super.A04.A01.A07;
        if (this.A01.A0D(AbstractC000400g.A22) && !TextUtils.isEmpty(r3.A0H)) {
            C69633Hu r2 = new C69633Hu();
            AnonymousClass01X r1 = this.A0I;
            r2.A04 = r1.A06(R.string.upi_url_reference_section_title);
            r2.A03 = r1.A06(R.string.upi_url_reference_section_description);
            r2.A01 = new ViewOnClickEBaseShape2S0200000_I1_1(this, r3, 19);
            list.add(r2);
        }
    }

    public final void A0E(List list, AnonymousClass3XM r5) {
        C60882s9 r0 = r5.A06;
        if (r0 != null && !TextUtils.isEmpty(r0.A07)) {
            C69633Hu r2 = new C69633Hu();
            r2.A04 = this.A0I.A06(R.string.upi_mandate_payment_transaction_detail_umn_row_title);
            r2.A03 = r5.A06.A07;
            r2.A02 = new View$OnLongClickListenerC63242w6(this, r5);
            list.add(r2);
        }
    }
}
