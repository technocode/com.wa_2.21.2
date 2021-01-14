package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/* renamed from: X.3IE  reason: invalid class name */
public class AnonymousClass3IE extends AnonymousClass0SD implements AbstractC61092sU {
    public AbstractC005102k A00;
    public C02270Bi A01 = new C02270Bi(new ArrayList());
    public AbstractC29091Wz A02;
    public C09990dr A03;
    public C63392wL A04;
    public C007303n A05;
    public C08580bN A06 = new C08580bN();
    public Boolean A07;
    public String A08;
    public String A09;
    public boolean A0A = false;
    public final AnonymousClass0GG A0B;
    public final AnonymousClass02M A0C;
    public final AnonymousClass01I A0D;
    public final AnonymousClass01A A0E;
    public final AnonymousClass03P A0F;
    public final AnonymousClass00S A0G;
    public final AnonymousClass00G A0H;
    public final AnonymousClass01X A0I;
    public final AnonymousClass01K A0J;
    public final C018609s A0K;
    public final C018709t A0L;
    public final AnonymousClass0BA A0M;
    public final C01980Ae A0N;
    public final C02040Ak A0O;
    public final C01970Ad A0P;
    public final C61592tQ A0Q;
    public final C018809u A0R = C018809u.A00("PaymentTransactionDetailsViewModel", "payment-settings", "COMMON");
    public final C63212w2 A0S;
    public final C02150Av A0T;
    public final AnonymousClass00T A0U;

    public AnonymousClass3IE(AbstractC005102k r4, AnonymousClass00S r5, AnonymousClass02M r6, AnonymousClass01I r7, AnonymousClass00G r8, AnonymousClass00T r9, C018709t r10, C02150Av r11, AnonymousClass01A r12, AnonymousClass03P r13, AnonymousClass01X r14, C01970Ad r15, AnonymousClass0GG r16, AnonymousClass01K r17, C63212w2 r18, C01980Ae r19, C02040Ak r20, C018609s r21, C61592tQ r22, AnonymousClass0AD r23, AnonymousClass0BA r24, Bundle bundle) {
        AbstractC29091Wz r0;
        this.A00 = r4;
        this.A0G = r5;
        this.A0C = r6;
        this.A0D = r7;
        this.A0H = r8;
        this.A0U = r9;
        this.A0L = r10;
        this.A0T = r11;
        this.A0E = r12;
        this.A0F = r13;
        this.A0I = r14;
        this.A0P = r15;
        this.A0B = r16;
        this.A0J = r17;
        this.A0S = r18;
        this.A0N = r19;
        this.A0O = r20;
        this.A0K = r21;
        this.A0Q = r22;
        this.A0M = r24;
        this.A05 = C006803i.A09(bundle, "");
        this.A08 = bundle.getString("extra_transaction_id");
        this.A09 = bundle.getString("extra_transaction_ref");
        this.A07 = Boolean.valueOf(bundle.getBoolean("extra_is_pending_request_saved_instance", false));
        if (!(this instanceof C73773Yq)) {
            r0 = new AnonymousClass3IC(this);
        } else {
            r0 = new AnonymousClass3I8((C73773Yq) this);
        }
        this.A02 = r0;
        r23.A01(r0);
    }

    public String A02(AnonymousClass0MH r2) {
        return (r2.A0K() || AnonymousClass0MH.A07(r2.A0B)) ? r2.A0B : r2.A0G;
    }

    public void A03() {
        AbstractC007503q r1;
        UserJid userJid;
        C63392wL r0 = this.A04;
        if (r0 != null) {
            r1 = r0.A02;
        } else {
            r1 = null;
        }
        if (r1 != null) {
            AnonymousClass0MH r2 = r1.A0F;
            if (r2 == null || (userJid = r2.A09) == null) {
                C63372wJ r22 = new C63372wJ(8);
                r22.A07 = this.A0I.A06(R.string.payments_generic_error);
                this.A06.A07(r22);
            } else if (!this.A0B.A0H(userJid)) {
                this.A06.A07(new C63372wJ(12));
            } else {
                C63372wJ r12 = new C63372wJ(13);
                r12.A05 = r2.A09;
                this.A06.A07(r12);
            }
        } else {
            C63372wJ r23 = new C63372wJ(8);
            r23.A07 = this.A0I.A06(R.string.payments_generic_error);
            this.A06.A07(r23);
        }
    }

    public void A04() {
        AnonymousClass0MH r5;
        C63392wL r1 = this.A04;
        if (r1 != null && !this.A0A && (r5 = r1.A01) != null) {
            this.A0A = true;
            if (this.A0N.A09() && !TextUtils.isEmpty(r5.A0G) && !r5.A0K()) {
                C018809u r2 = this.A0R;
                StringBuilder A0S2 = AnonymousClass008.A0S("syncing pending transaction: ");
                A0S2.append(r5.A0G);
                A0S2.append(" status: ");
                AnonymousClass008.A1N(A0S2, r5.A01, r2);
                AbstractC61782tj A6O = this.A0P.A03().A6O();
                if (A6O != null) {
                    A6O.AQ7();
                }
                this.A0Q.A02(r5.A0G, r5.A0N(), new AnonymousClass3ID(this, A6O));
            }
        }
    }

    public void A05() {
        C09990dr r0 = this.A03;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C09990dr r2 = new C09990dr(this, this.A05, this.A08);
        this.A03 = r2;
        this.A0U.ANC(r2, new Void[0]);
    }

    public void A06(List list) {
        C60882s9 r1;
        SpannableStringBuilder spannableStringBuilder;
        String A0D2;
        String A062;
        if (!(this instanceof C73773Yq)) {
            A09(list);
            A0A(list);
            A08(list);
            return;
        }
        C73773Yq r6 = (C73773Yq) this;
        C63392wL r0 = ((AnonymousClass3IE) r6).A04;
        AnonymousClass0MH r5 = r0.A01;
        AbstractC43791yx r4 = r5.A07;
        if (r4 != null) {
            AnonymousClass3XM r42 = (AnonymousClass3XM) r4;
            if (r0 != null) {
                AnonymousClass1VM r14 = r0.A00;
                int i = 0;
                if (r5.A02 != 40 || (r1 = r42.A06) == null || !r1.A09) {
                    r6.A09(list);
                    r6.A0A(list);
                    r6.A08(list);
                    if (r5.A0K()) {
                        synchronized (r5) {
                            if (r5.A0K() && r5.A01 == 17) {
                                i = 1;
                            }
                        }
                        if (i == 0) {
                            return;
                        }
                    }
                    list.add(new C69493Hg(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                    return;
                }
                C60892sA r2 = r1.A02;
                if (r2 != null) {
                    String str = r2.A04;
                    int hashCode = str.hashCode();
                    if (hashCode != 433141802) {
                        if (hashCode == 1924835592 && str.equals("ACCEPT")) {
                            String str2 = r2.A06;
                            if (str2.equals("PENDING")) {
                                String A063 = r6.A0I.A06(R.string.upi_mandate_transaction_detail_processing_update_header);
                                C73703Yj r22 = new C73703Yj();
                                r22.A01 = A063;
                                r22.A00 = new ViewOnClickEBaseShape2S0200000_I1_1(r6, r5, 18);
                                list.add(r22);
                            } else if (str2.equals("FAILURE") && !TextUtils.isEmpty(r2.A01)) {
                                C73703Yj r23 = new C73703Yj();
                                r23.A01 = r6.A0I.A06(R.string.upi_mandate_transaction_detail_processing_update_failed_bottom_sheet_header);
                                r23.A00 = new ViewOnClickEBaseShape1S0300000_I1(r6, r42, r5, 15);
                                list.add(r23);
                            }
                        }
                    } else if (str.equals("UNKNOWN") && r2.A06.equals("INIT")) {
                        String A0D3 = r6.A0I.A0D(R.string.upi_mandate_transaction_detail_pending_update_header, r42.A09);
                        C73703Yj r24 = new C73703Yj();
                        r24.A01 = A0D3;
                        r24.A00 = new ViewOnClickEBaseShape2S0200000_I1_1(r6, r5, 18);
                        list.add(r24);
                    }
                }
                C05900Qy r25 = r5.A06;
                if (r25 != null) {
                    spannableStringBuilder = C02150Av.A01(r6.A0I, r25, r5.A08());
                } else {
                    spannableStringBuilder = new SpannableStringBuilder();
                }
                C73693Yi r26 = new C73693Yi(spannableStringBuilder);
                if ("MAX".equals(r42.A06.A04)) {
                    r26.A00 = r6.A0I.A06(R.string.upi_mandate_payment_transaction_detail_amount_max);
                }
                list.add(r26);
                C69593Hq r12 = new C69593Hq();
                AnonymousClass1X6 r27 = r6.A08;
                String str3 = r42.A09;
                C60882s9 r02 = r42.A06;
                long j = r02.A01;
                long j2 = r02.A00;
                if (AnonymousClass1X6.A01(j).equals(AnonymousClass1X6.A01(j2))) {
                    AnonymousClass01X r9 = r27.A01;
                    A0D2 = r9.A0D(R.string.upi_mandate_payment_transaction_detail_payee_payment_note, str3, AnonymousClass008.A0A(j2, r27.A00, r9));
                } else {
                    AnonymousClass01X r15 = r27.A01;
                    AnonymousClass00S r13 = r27.A00;
                    A0D2 = r15.A0D(R.string.upi_mandate_payment_transaction_detail_payee_payment_note_date_range, str3, AnonymousClass008.A0A(j, r13, r15), AnonymousClass008.A0A(j2, r13, r15));
                }
                r12.A04 = A0D2;
                r12.A00 = 0;
                r12.A03 = ((AnonymousClass3IE) r6).A04;
                r12.A02 = r6;
                C01970Ad r03 = r6.A0P;
                r12.A01 = r03.A03().A5s();
                list.add(r12);
                C69623Ht r92 = new C69623Ht();
                r92.A00 = C02150Av.A00(r5);
                r92.A01 = r5.A08().A5g(r6.A0H.A00, 1);
                AnonymousClass01X r8 = r6.A0I;
                boolean A0K2 = r5.A0K();
                int i2 = R.string.payment;
                if (A0K2) {
                    i2 = R.string.payment_request;
                }
                r92.A02 = r8.A06(i2);
                C02150Av r132 = r6.A0T;
                r92.A03 = r132.A0A(r5);
                int i3 = r5.A01;
                if (i3 != 20) {
                    if (!(i3 == 401 || i3 == 415)) {
                        if (i3 == 417) {
                            A062 = r8.A0D(R.string.upi_mandate_payment_request_status_schedule_payment_sent_time, C001801b.A0c(r8, r6.A0G.A06(r42.A06.A00 - ((long) TimeZone.getTimeZone("Asia/Kolkata").getRawOffset()))));
                        } else if (i3 != 418) {
                            A062 = "";
                        }
                    }
                    A062 = r6.A0S.A01(r5, r03.A03().A5Y());
                } else {
                    Pair A042 = r132.A04(r42.A04 - r132.A03.A05());
                    if (A042 != null) {
                        A062 = r8.A0A(R.plurals.upi_mandate_payment_request_status_time_remaining_to_approve, (long) ((Number) A042.first).intValue(), A042.second);
                    } else {
                        A062 = r8.A06(R.string.payments_request_status_request_expired);
                    }
                }
                r92.A07 = A062;
                list.add(r92);
                r6.A07(list);
                list.add(new C69653Hw());
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                if (r5.A01 == 417) {
                    z = true;
                    if (r14 != null) {
                        C69633Hu r16 = new C69633Hu();
                        r16.A04 = r8.A06(R.string.transaction_sender_payment_method_label);
                        r16.A03 = C28051Sr.A0y(r03, r8, r14);
                        arrayList.add(r16);
                    }
                }
                C69633Hu r133 = new C69633Hu();
                r133.A04 = r8.A06(R.string.upi_mandate_payment_transaction_detail_date_row_title);
                C60882s9 r04 = r42.A06;
                r133.A03 = r27.A02(r04.A01, r04.A00);
                arrayList.add(r133);
                if (z) {
                    C69633Hu r17 = new C69633Hu();
                    r17.A04 = r8.A06(R.string.upi_mandate_bottom_row_item_frequency);
                    r17.A03 = r8.A06(R.string.upi_mandate_bottom_row_item_frequency_once);
                    arrayList.add(r17);
                }
                r6.A0E(arrayList, r42);
                r6.A0D(arrayList);
                while (i < arrayList.size()) {
                    list.add(arrayList.get(i));
                    if (i != arrayList.size() - 1) {
                        list.add(new C69513Hi());
                    }
                    i++;
                }
                r6.A08(list);
                list.add(new C69653Hw());
                if (!TextUtils.isEmpty(r42.A06.A05) && r5.A01 == 417) {
                    AnonymousClass3I9 r18 = new AnonymousClass3I9(8);
                    r18.A07 = r8.A06(R.string.upi_mandate_processing_cancel_failed);
                    ((AnonymousClass3IE) r6).A06.A07(r18);
                    r6.A0U.ANF(new RunnableEBaseShape2S0300000_I1(r6, r42, r5, 35));
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(java.util.List r15) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3IE.A07(java.util.List):void");
    }

    public void A08(List list) {
        C63392wL r0 = this.A04;
        AnonymousClass0MH r4 = r0.A01;
        AnonymousClass1VM r3 = r0.A00;
        C69643Hv r2 = new C69643Hv();
        r2.A00 = new ViewOnClickEBaseShape1S0300000_I1(this, r3, r4, 17);
        list.add(new C69653Hw());
        list.add(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r3 == 106) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        if (r9 == 17) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(java.util.List r15) {
        /*
        // Method dump skipped, instructions count: 588
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3IE.A09(java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(java.util.List r11) {
        /*
        // Method dump skipped, instructions count: 394
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3IE.A0A(java.util.List):void");
    }

    public void A0B(boolean z) {
        C63372wJ r1 = new C63372wJ(1);
        r1.A0D = z;
        this.A06.A07(r1);
    }

    @Override // X.AbstractC61092sU
    public void AIO() {
        A05();
    }
}
