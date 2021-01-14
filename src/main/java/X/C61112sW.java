package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0500000_I1;
import com.facebook.redex.ViewOnClickEBaseShape1S0400000_I1;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2sW  reason: invalid class name and case insensitive filesystem */
public class C61112sW {
    public static volatile C61112sW A0E;
    public final AnonymousClass02M A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass01X A02;
    public final AnonymousClass0AQ A03;
    public final AnonymousClass01K A04;
    public final AnonymousClass01T A05;
    public final AnonymousClass0AB A06;
    public final C01980Ae A07;
    public final C68453Dg A08;
    public final C61122sX A09;
    public final C03340Fu A0A;
    public final C01970Ad A0B;
    public final AnonymousClass0AL A0C;
    public final AnonymousClass00T A0D;

    public C61112sW(AnonymousClass00S r1, AnonymousClass02M r2, AnonymousClass00T r3, AnonymousClass0AB r4, AnonymousClass01X r5, AnonymousClass0AL r6, C01970Ad r7, AnonymousClass01K r8, C01980Ae r9, C61122sX r10, C03340Fu r11, C68453Dg r12, AnonymousClass01T r13, AnonymousClass0AQ r14) {
        this.A01 = r1;
        this.A00 = r2;
        this.A0D = r3;
        this.A06 = r4;
        this.A02 = r5;
        this.A0C = r6;
        this.A0B = r7;
        this.A04 = r8;
        this.A07 = r9;
        this.A09 = r10;
        this.A0A = r11;
        this.A08 = r12;
        this.A05 = r13;
        this.A03 = r14;
    }

    public static C61112sW A00() {
        if (A0E == null) {
            synchronized (C61112sW.class) {
                if (A0E == null) {
                    A0E = new C61112sW(AnonymousClass00S.A00(), AnonymousClass02M.A00(), C002101e.A00(), AnonymousClass0AB.A00(), AnonymousClass01X.A00(), AnonymousClass0AL.A01(), C01970Ad.A00(), AnonymousClass01K.A00(), C01980Ae.A00(), C61122sX.A00(), C03340Fu.A00(), C68453Dg.A00(), AnonymousClass01T.A00(), AnonymousClass0AQ.A00());
                }
            }
        }
        return A0E;
    }

    public void A01(Context context, AnonymousClass0MH r7) {
        AbstractC07650Yy r0;
        int A8B;
        AnonymousClass1X1 A022 = this.A0B.A02(r7.A0C);
        if (A022 != null) {
            r0 = A022.A8I(r7.A0E);
        } else {
            r0 = null;
        }
        if (r0 == null || (A8B = r0.A8B()) == 0) {
            ((AbstractC004502c) context).APq(0, R.string.payment_unblock_error, new Object[0]);
        } else {
            ((AbstractC004502c) context).APq(0, R.string.unblock_payment_id_error_default, this.A02.A06(A8B));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r1.A03().A5X().A03(r3) == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r4.A00.A0H(com.whatsapp.jid.UserJid.of(r0)) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.content.Context r12, X.AnonymousClass0MH r13, boolean r14, X.AbstractC61102sV r15) {
        /*
            r11 = this;
            X.2sX r4 = r11.A09
            r3 = 0
            if (r4 == 0) goto L_0x0060
            com.whatsapp.jid.UserJid r0 = r13.A09
            if (r0 == 0) goto L_0x0016
            X.0GG r1 = r4.A00
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            boolean r0 = r1.A0H(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            X.1yx r0 = r13.A07
            if (r0 == 0) goto L_0x001f
            java.lang.String r3 = r0.A06()
        L_0x001f:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0040
            X.0Ad r1 = r4.A05
            X.0Yy r0 = r1.A03()
            X.22e r0 = r0.A5X()
            if (r0 == 0) goto L_0x0040
            X.0Yy r0 = r1.A03()
            X.22e r0 = r0.A5X()
            boolean r1 = r0.A03(r3)
            r0 = 1
            if (r1 != 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r2 != 0) goto L_0x0049
            if (r0 != 0) goto L_0x0049
            r15.AKf()
            return
        L_0x0049:
            android.app.Activity r5 = X.C02780Dk.A00(r12)
            com.whatsapp.jid.UserJid r6 = r13.A09
            X.1yx r0 = r13.A07
            java.lang.String r7 = r0.A06()
            r8 = 0
            X.3DE r10 = new X.3DE
            r10.<init>(r15)
            r9 = r14
            r4.A01(r5, r6, r7, r8, r9, r10)
            return
        L_0x0060:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61112sW.A02(android.content.Context, X.0MH, boolean, X.2sV):void");
    }

    public void A03(View view, AbstractC61092sU r25, AnonymousClass0MH r26, AbstractC007503q r27, boolean z, AbstractC29051Wv r29, Button button) {
        AnonymousClass0MH A0K;
        int i;
        C60882s9 r0;
        int i2;
        View findViewById = view.findViewById(R.id.request_decline_button);
        if (findViewById != null) {
            View findViewById2 = view.findViewById(R.id.request_pay_button);
            if (findViewById2 != null) {
                Context context = view.getContext();
                if (r27 == null) {
                    A0K = null;
                } else {
                    C01970Ad r02 = this.A0B;
                    r02.A04();
                    A0K = r02.A05.A0K(r27.A0n.A01);
                }
                if (!A06(r26) && (A0K == null || A0K.A0G())) {
                    int i3 = r26.A02;
                    if (i3 == 20 && r26.A01 == 12) {
                        findViewById2.setEnabled(true);
                        findViewById2.setOnClickListener(new ViewOnClickEBaseShape0S0500000_I1(this, context, r26, r27, r25, 3));
                        findViewById.setEnabled(true);
                        findViewById.setOnClickListener(new ViewOnClickEBaseShape0S0500000_I1(this, context, r26, r27, r25, 2));
                        view.setVisibility(0);
                    } else if (r29 != null && i3 == 40 && ((i = r26.A01) == 20 || i == 417 || i == 418)) {
                        AnonymousClass3XM r5 = (AnonymousClass3XM) r26.A07;
                        if (r5.A06 == null) {
                            return;
                        }
                        if (i != 20) {
                            if (i == 417 || i == 418) {
                                findViewById2.setVisibility(8);
                                findViewById.setVisibility(8);
                                if (button == null || (r0 = r5.A06) == null || !r0.A0A) {
                                    view.setVisibility(8);
                                    return;
                                }
                                if (r26.A01 == 418) {
                                    i2 = 0;
                                    button.setEnabled(false);
                                    button.setText(R.string.payments_request_canceling);
                                } else {
                                    i2 = 0;
                                    button.setEnabled(true);
                                    button.setText(R.string.cancel);
                                    button.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(context, r26, 3));
                                }
                                button.setVisibility(i2);
                                view.setVisibility(i2);
                                return;
                            }
                            view.setVisibility(8);
                        } else if (r5.A04 - r29.A00.A03.A05() > 0) {
                            TextView textView = (TextView) findViewById2;
                            textView.setEnabled(true);
                            textView.setOnClickListener(new ViewOnClickEBaseShape1S0400000_I1(r29, context, r26, r25, 5));
                            textView.setText(R.string.upi_mandate_payment_bottom_sheet_approve_payment_cta);
                            findViewById.setEnabled(true);
                            findViewById.setOnClickListener(new ViewOnClickEBaseShape1S0400000_I1(r29, context, r26, r25, 4));
                            view.setVisibility(0);
                            if (button != null) {
                                button.setVisibility(8);
                            }
                        }
                    } else {
                        view.setVisibility(8);
                    }
                } else if (z) {
                    view.setVisibility(8);
                } else {
                    findViewById2.setEnabled(false);
                    findViewById.setEnabled(false);
                    view.setVisibility(0);
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    public final void A04(View view, AbstractC61092sU r12, AnonymousClass0MH r13, boolean z, Button button) {
        UserJid userJid = r13.A0A;
        View findViewById = view.findViewById(R.id.request_decline_button);
        if (findViewById != null) {
            View findViewById2 = view.findViewById(R.id.request_pay_button);
            if (findViewById2 == null) {
                throw null;
            } else if (userJid == null || A06(r13)) {
                view.setVisibility(8);
            } else {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(8);
                view.setVisibility(8);
                if (z && button != null) {
                    boolean z2 = false;
                    view.setVisibility(0);
                    button.setVisibility(0);
                    if (r13.A01 == 19) {
                        z2 = true;
                    }
                    A05(button, z2, r13, true);
                    if (r13.A01 != 19) {
                        button.setOnClickListener(new ViewOnClickEBaseShape0S0500000_I1(this, button, r12, r13, userJid, 1));
                    }
                }
            }
        } else {
            throw null;
        }
    }

    public final void A05(TextView textView, boolean z, AnonymousClass0MH r13, boolean z2) {
        if (z) {
            textView.setText(this.A02.A06(R.string.payments_request_canceling));
            textView.setEnabled(false);
            int i = r13.A01;
            if (i != 19) {
                r13.A01 = 19;
                C01970Ad r0 = this.A0B;
                r0.A04();
                r0.A05.A0d(new C007303n(r13.A08, r13.A0M, r13.A0H), r13, i, -1, 0);
                return;
            }
            return;
        }
        textView.setEnabled(true);
        AnonymousClass01X r1 = this.A02;
        int i2 = R.string.cancel;
        if (z2) {
            i2 = R.string.payments_cancel_request;
        }
        textView.setText(r1.A06(i2));
        int i3 = r13.A01;
        if (i3 != 12) {
            r13.A01 = 12;
            C01970Ad r02 = this.A0B;
            r02.A04();
            r02.A05.A0d(new C007303n(r13.A08, r13.A0M, r13.A0H), r13, i3, -1, 0);
        }
    }

    public final synchronized boolean A06(AnonymousClass0MH r7) {
        AnonymousClass02N r1 = r7.A08;
        boolean z = false;
        if (r1 == null) {
            return false;
        }
        C007003k A022 = this.A03.A02(r1);
        if (A022.A09()) {
            AnonymousClass01T r3 = this.A05;
            Jid A023 = A022.A02(AnonymousClass02U.class);
            if (A023 == null) {
                throw null;
            } else if (r3.A01((GroupJid) A023).A0A(r3.A01) && A022.A0Q) {
                Jid A024 = A022.A02(AnonymousClass02U.class);
                if (A024 == null) {
                    throw null;
                } else if (!r3.A05((GroupJid) A024)) {
                    z = true;
                }
            }
        }
        return z;
    }
}
