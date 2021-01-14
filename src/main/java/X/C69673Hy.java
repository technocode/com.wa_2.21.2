package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.3Hy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69673Hy {
    public final /* synthetic */ AnonymousClass3I5 A00;

    public /* synthetic */ C69673Hy(AnonymousClass3I5 r1) {
        this.A00 = r1;
    }

    public final void A00(C05900Qy r11, C05900Qy r12, C61072sS r13) {
        AnonymousClass3I5 r6 = this.A00;
        C02270Bi r1 = r6.A01;
        C63402wM r0 = new C63402wM();
        r0.A01 = true;
        r1.A07(r0);
        if (r13 != null || r11 == null || r12 == null) {
            C018809u r2 = r6.A07;
            StringBuilder A0S = AnonymousClass008.A0S("error: ");
            A0S.append(r13.text);
            r2.A03(A0S.toString());
            C63292wB r22 = new C63292wB(3);
            r22.A03 = r6.A03.A06(R.string.upi_check_balance_error_message);
            r6.A02.A07(r22);
            return;
        }
        C63292wB r5 = new C63292wB(2);
        AnonymousClass01X r8 = r6.A03;
        r5.A02 = r8.A0D(R.string.upi_check_balance_dialog_text, r8.A0D(R.string.upi_check_balance_dialog_total_balance, C05880Qw.A01.A4P(r8, r11)), r8.A0D(R.string.upi_check_balance_dialog_usable_balance, C05880Qw.A01.A4P(r8, r12)));
        r6.A02.A07(r5);
    }
}
