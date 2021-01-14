package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.math.BigDecimal;
import java.util.Calendar;

/* renamed from: X.0Av  reason: invalid class name and case insensitive filesystem */
public class C02150Av {
    public static volatile C02150Av A07;
    public final AnonymousClass01I A00;
    public final AnonymousClass01A A01;
    public final C014308b A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass01X A04;
    public final C01970Ad A05;
    public final C018809u A06 = C018809u.A00("PaymentsUtils", "infra", "COMMON");

    public C02150Av(AnonymousClass00S r4, AnonymousClass01I r5, AnonymousClass01A r6, C014308b r7, AnonymousClass01X r8, C01970Ad r9) {
        this.A03 = r4;
        this.A00 = r5;
        this.A01 = r6;
        this.A02 = r7;
        this.A04 = r8;
        this.A05 = r9;
    }

    public static int A00(AnonymousClass0MH r0) {
        int i = r0.A01;
        switch (i) {
            case 11:
            case 12:
            case 15:
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
            case 18:
            case 19:
            case AnonymousClass0PW.A01 /*{ENCODED_INT: 20}*/:
                return R.color.payments_status_gray;
            case 13:
            case 14:
                return R.color.payments_status_red;
            case 17:
                return R.color.payments_status_green;
            default:
                switch (i) {
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 109:
                        return R.color.payments_status_gray;
                    case 105:
                    case 107:
                    case AnonymousClass0PW.A03 /*{ENCODED_INT: 108}*/:
                    case 110:
                    case 111:
                        return R.color.payments_status_red;
                    case 106:
                        return R.color.payments_status_green;
                    default:
                        switch (i) {
                            case 401:
                            case 402:
                            case 403:
                            case 410:
                            case 417:
                            case 418:
                                return R.color.payments_status_gray;
                            case 404:
                            case 406:
                            case 407:
                            case 408:
                            case 409:
                            case 411:
                            case 412:
                            case 413:
                            case 414:
                            case 415:
                            case 416:
                                return R.color.payments_status_red;
                            case 405:
                                return R.color.payments_status_green;
                            default:
                                return R.color.payments_status_gray;
                        }
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        if (r3.stripTrailingZeros().scale() <= 0) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannableStringBuilder A01(X.AnonymousClass01X r9, X.C05900Qy r10, X.AbstractC05890Qx r11) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02150Av.A01(X.01X, X.0Qy, X.0Qx):android.text.SpannableStringBuilder");
    }

    public static C02150Av A02() {
        if (A07 == null) {
            synchronized (C02150Av.class) {
                if (A07 == null) {
                    A07 = new C02150Av(AnonymousClass00S.A00(), AnonymousClass01I.A00(), AnonymousClass01A.A00(), C014308b.A00(), AnonymousClass01X.A00(), C01970Ad.A00());
                }
            }
        }
        return A07;
    }

    public static CharSequence A03(Context context, AnonymousClass0MH r3) {
        AbstractC05890Qx A08 = r3.A08();
        return A08 != C05880Qw.A02 ? A08.A5g(context, r3.A0K() ? 1 : 0) : "";
    }

    public Pair A04(long j) {
        if (j <= 0) {
            return null;
        }
        int i = (int) (j / 86400000);
        if (i > 0) {
            return new Pair(Integer.valueOf(i), C002001d.A1S(this.A04, i, 3));
        }
        int i2 = (int) (j / 3600000);
        if (i2 > 0) {
            return new Pair(Integer.valueOf(i2), C002001d.A1S(this.A04, i2, 2));
        }
        int i3 = (int) (j / 60000);
        if (i3 > 0) {
            return new Pair(Integer.valueOf(i3), C002001d.A1S(this.A04, i3, 1));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        if (r6 != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A05(X.AnonymousClass0MH r10) {
        /*
            r9 = this;
            java.lang.String r8 = r9.A0F(r10)
            java.lang.String r7 = r9.A0G(r10)
            X.01X r5 = r9.A04
            java.lang.String r1 = r5.A04()
            java.lang.String r0 = "en"
            boolean r6 = r0.equals(r1)
            X.01I r1 = r9.A00
            com.whatsapp.jid.UserJid r0 = r10.A09
            boolean r0 = r1.A09(r0)
            r4 = 0
            r3 = 1
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0035
            if (r6 != 0) goto L_0x0035
            r1 = 2131888564(0x7f1209b4, float:1.9411767E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r8
            java.lang.String r1 = r5.A0D(r1, r0)
        L_0x002f:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L_0x0035:
            com.whatsapp.jid.UserJid r0 = r10.A0A
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x004b
            if (r6 != 0) goto L_0x004d
            r1 = 2131888563(0x7f1209b3, float:1.9411765E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r7
            java.lang.String r1 = r5.A0D(r1, r0)
            goto L_0x002f
        L_0x004b:
            if (r6 == 0) goto L_0x004e
        L_0x004d:
            r2 = r7
        L_0x004e:
            r1 = 2131888562(0x7f1209b2, float:1.9411763E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r7
            r0[r3] = r8
            java.lang.String r1 = r5.A0D(r1, r0)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02150Av.A05(X.0MH):android.util.Pair");
    }

    public Long A06(AnonymousClass0MH r5) {
        AbstractC43791yx r0 = r5.A07;
        if (r0 == null) {
            return null;
        }
        return Long.valueOf(r0.A04() - this.A03.A05());
    }

    public final String A07(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str, long j) {
        int i12 = i9;
        if (j <= 0) {
            AnonymousClass01X r0 = this.A04;
            return String.format(r0.A0I(), r0.A06(i), str);
        }
        int A002 = AnonymousClass0OY.A00(this.A03.A05(), j);
        if (A002 == 0) {
            AnonymousClass01X r02 = this.A04;
            return String.format(r02.A0I(), r02.A06(i2), str);
        } else if (A002 == 1) {
            AnonymousClass01X r03 = this.A04;
            return String.format(r03.A0I(), r03.A06(i3), str);
        } else if (A002 < 7) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            switch (instance.get(7)) {
                case 1:
                    i12 = i10;
                    break;
                case 2:
                    i12 = i4;
                    break;
                case 3:
                    i12 = i5;
                    break;
                case 4:
                    i12 = i6;
                    break;
                case 5:
                    i12 = i7;
                    break;
                case 6:
                    i12 = i8;
                    break;
                case 7:
                    break;
                default:
                    i12 = 0;
                    break;
            }
            return this.A04.A0D(i12, str);
        } else {
            AnonymousClass01X r3 = this.A04;
            return String.format(r3.A0I(), r3.A06(i11), str, C001801b.A0a(r3, j));
        }
    }

    public String A08(AnonymousClass0MH r3) {
        if (r3.A0K()) {
            if (this.A00.A09(r3.A0A)) {
                return this.A04.A06(R.string.payments_request_short_status_from_you);
            }
            return this.A04.A06(R.string.payment_row_request_short_status);
        } else if (this.A00.A09(r3.A09)) {
            return this.A04.A06(R.string.payments_transaction_short_status_to_you);
        } else {
            return this.A04.A06(R.string.payment_row_transaction_short_status);
        }
    }

    public String A09(AnonymousClass0MH r4) {
        return (AnonymousClass0MH.A06(r4) || TextUtils.isEmpty(r4.A0E) || r4.A06 == null) ? "" : r4.A08().A4R(this.A04, r4.A06);
    }

    public String A0A(AnonymousClass0MH r5) {
        int i = r5.A01;
        if (i == 0) {
            return "";
        }
        switch (i) {
            case 11:
                return this.A04.A06(R.string.payments_transaction_status_processing);
            case 12:
            case AnonymousClass0PW.A01 /*{ENCODED_INT: 20}*/:
                return this.A04.A06(R.string.payments_transaction_status_pending);
            case 13:
            case 14:
                return this.A04.A06(R.string.payments_transaction_status_failed);
            case 15:
                return this.A04.A06(R.string.payments_request_status_rejected);
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                return this.A04.A06(R.string.payments_transaction_status_expired);
            case 17:
                return this.A04.A06(R.string.payments_transaction_status_complete);
            case 18:
                return this.A04.A06(R.string.payments_request_status_canceled);
            case 19:
                AnonymousClass01X r3 = this.A04;
                int i2 = r5.A02;
                int i3 = R.string.payments_request_status_request_wait;
                if (i2 == 10) {
                    i3 = R.string.payments_request_status_requester_wait;
                }
                return r3.A06(i3);
            default:
                switch (i) {
                    case 101:
                    case 103:
                    case 104:
                    case 109:
                        return this.A04.A06(R.string.payments_transaction_status_processing);
                    case 102:
                    case 110:
                        return this.A04.A06(R.string.payments_transaction_status_pending);
                    case 105:
                    case AnonymousClass0PW.A03 /*{ENCODED_INT: 108}*/:
                    case 111:
                        return this.A04.A06(R.string.payments_transaction_status_failed);
                    case 106:
                        return this.A04.A06(R.string.payments_transaction_status_complete);
                    case 107:
                        return this.A04.A06(R.string.payments_transaction_status_expired);
                    default:
                        switch (i) {
                            case 401:
                            case 403:
                            case 410:
                                return this.A04.A06(R.string.payments_transaction_status_processing);
                            case 402:
                                return this.A04.A06(R.string.payments_transaction_status_pending);
                            case 404:
                            case 406:
                            case 407:
                            case 408:
                            case 409:
                            case 411:
                            case 412:
                            case 413:
                            case 414:
                            case 415:
                                return this.A04.A06(R.string.payments_transaction_status_failed);
                            case 405:
                                return this.A04.A06(R.string.payments_transaction_status_complete);
                            case 416:
                                return this.A04.A06(R.string.payments_transaction_status_expired);
                            case 417:
                                return this.A04.A06(R.string.payments_request_status_scheduled);
                            case 418:
                                return this.A04.A06(R.string.payments_transaction_status_canceling);
                            case 419:
                                return this.A04.A06(R.string.payments_transaction_status_pending);
                            default:
                                return this.A04.A06(R.string.payments_transaction_status_unknown);
                        }
                }
        }
    }

    public final String A0B(AnonymousClass0MH r9) {
        Long A062 = A06(r9);
        if (A062 == null) {
            return "";
        }
        long longValue = A062.longValue();
        Pair A042 = A04(longValue);
        if (A042 != null) {
            return this.A04.A0A(R.plurals.payments_message_bubble_status_label_desc_expiration, (long) ((Number) A042.first).intValue(), A042.second);
        } else if (longValue > 0) {
            return this.A04.A06(R.string.payments_message_bubble_status_label_desc_expiration_sub_minute);
        } else {
            return this.A04.A06(R.string.payments_message_bubble_status_label_desc_expiring);
        }
    }

    public final String A0C(AnonymousClass0MH r6) {
        if (this.A00.A09(r6.A09)) {
            return this.A04.A06(R.string.payment_data_localized_preview_to_me);
        }
        return this.A04.A0D(R.string.payment_data_localized_preview_to_other, A0E(r6));
    }

    public synchronized String A0D(AnonymousClass0MH r2) {
        return A0I(r2, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004d, code lost:
        if (r1 != 1000) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0E(X.AnonymousClass0MH r6) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02150Av.A0E(X.0MH):java.lang.String");
    }

    public synchronized String A0F(AnonymousClass0MH r4) {
        AnonymousClass00E.A07(r4.A0K());
        UserJid userJid = r4.A0A;
        C007003k A0A = userJid != null ? this.A01.A0A(userJid) : null;
        if (A0A == null) {
            AbstractC43791yx r0 = r4.A07;
            if (r0 == null || TextUtils.isEmpty(r0.A07())) {
                return this.A04.A06(R.string.unknown);
            }
            return r4.A07.A07();
        } else if (this.A00.A09(A0A.A09)) {
            return this.A04.A06(R.string.you);
        } else {
            return this.A02.A06(A0A);
        }
    }

    public synchronized String A0G(AnonymousClass0MH r4) {
        AnonymousClass00E.A07(r4.A0K());
        UserJid userJid = r4.A09;
        C007003k A0A = userJid != null ? this.A01.A0A(userJid) : null;
        if (A0A == null) {
            AbstractC43791yx r0 = r4.A07;
            if (r0 == null || TextUtils.isEmpty(r0.A06())) {
                return this.A04.A06(R.string.unknown);
            }
            return r4.A07.A06();
        } else if (this.A00.A09(A0A.A09)) {
            return this.A04.A06(R.string.you);
        } else {
            return this.A02.A06(A0A);
        }
    }

    public synchronized String A0H(AnonymousClass0MH r3) {
        UserJid userJid = r3.A0A;
        C007003k A0A = userJid != null ? this.A01.A0A(userJid) : null;
        if (A0A != null) {
            return this.A02.A06(A0A);
        }
        AbstractC43791yx r0 = r3.A07;
        if (r0 != null) {
            String A072 = r0.A07();
            if (!TextUtils.isEmpty(A072)) {
                return A072;
            }
        }
        return this.A04.A06(R.string.unknown);
    }

    public synchronized String A0I(AnonymousClass0MH r4, boolean z) {
        String str;
        String str2;
        String str3;
        UserJid userJid;
        int i = r4.A02;
        if (i != 10) {
            if (i != 20) {
                if (i != 30) {
                    if (!(i == 40 || i == 100)) {
                        if (i != 200) {
                            if (i != 1000) {
                                switch (i) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        break;
                                    case 6:
                                    case 7:
                                    case 8:
                                        return this.A04.A06(this.A05.A03().A86());
                                    default:
                                        return this.A04.A06(R.string.unknown);
                                }
                            }
                        }
                    }
                }
                UserJid userJid2 = r4.A09;
                if (userJid2 == null || r4.A0A == null) {
                    str3 = this.A04.A06(R.string.unknown);
                } else {
                    if (this.A00.A09(userJid2)) {
                        userJid = r4.A0A;
                    } else {
                        userJid = r4.A09;
                    }
                    C007003k A0A = this.A01.A0A(userJid);
                    if (z) {
                        str3 = this.A02.A06(A0A);
                    } else {
                        str3 = this.A02.A08(A0A, false);
                    }
                }
                return str3;
            }
            UserJid userJid3 = r4.A09;
            if (userJid3 != null) {
                C007003k A0A2 = this.A01.A0A(userJid3);
                if (z) {
                    str2 = this.A02.A06(A0A2);
                } else {
                    str2 = this.A02.A08(A0A2, false);
                }
                return str2;
            }
            AbstractC43791yx r0 = r4.A07;
            if (r0 != null && !TextUtils.isEmpty(r0.A06())) {
                return r4.A07.A06();
            }
            return this.A04.A06(R.string.unknown);
        }
        UserJid userJid4 = r4.A0A;
        if (userJid4 != null) {
            C007003k A0A3 = this.A01.A0A(userJid4);
            if (z) {
                str = this.A02.A06(A0A3);
            } else {
                str = this.A02.A08(A0A3, false);
            }
            return str;
        }
        AbstractC43791yx r02 = r4.A07;
        if (r02 != null && !TextUtils.isEmpty(r02.A07())) {
            return r4.A07.A07();
        }
        return this.A04.A06(R.string.unknown);
    }

    public String A0J(AbstractC007503q r5) {
        AnonymousClass0MH r3 = r5.A0F;
        String str = "";
        if (r3 == null) {
            return str;
        }
        if (r3.A02 == 1000) {
            return A0C(r3);
        }
        if (!TextUtils.isEmpty(r3.A0E)) {
            AnonymousClass0MH r1 = r5.A0F;
            if (r1.A06 != null) {
                str = r1.A08().A4P(this.A04, r5.A0F.A06);
            }
        }
        if (r5.A0m != 0 || TextUtils.isEmpty(r5.A0D())) {
            return str;
        }
        StringBuilder A0Y = AnonymousClass008.A0Y(str, " • ");
        A0Y.append(r5.A0D());
        return A0Y.toString();
    }

    public synchronized String A0K(AbstractC007503q r8, AnonymousClass0MH r9) {
        AnonymousClass01A r1 = this.A01;
        UserJid A08 = r8.A08();
        if (A08 != null) {
            C007003k A0A = r1.A0A(A08);
            if (r8 instanceof AnonymousClass0ZK) {
                if (r9.A06 != null) {
                    AnonymousClass01X r3 = this.A04;
                    boolean z = r8.A0n.A02;
                    int i = R.string.payment_system_event_my_request_declined;
                    if (z) {
                        i = R.string.payment_system_event_request_declined;
                    }
                    return r3.A0D(i, this.A02.A08(A0A, false), A09(r9));
                }
                AnonymousClass01X r32 = this.A04;
                boolean z2 = r8.A0n.A02;
                int i2 = R.string.payment_system_event_my_request_declined_no_amount;
                if (z2) {
                    i2 = R.string.payment_system_event_request_declined_no_amount;
                }
                return r32.A0D(i2, this.A02.A08(A0A, false), A09(r9));
            } else if (!(r8 instanceof AnonymousClass0ZM)) {
                throw new IllegalStateException(C018809u.A01("PaymentsUtils", "Request message is not cancelled or rejected"));
            } else if (r9.A06 != null) {
                AnonymousClass01X r33 = this.A04;
                boolean z3 = r8.A0n.A02;
                int i3 = R.string.payment_system_event_request_canceled;
                if (z3) {
                    i3 = R.string.payment_system_event_request_canceled_by_me;
                }
                return r33.A0D(i3, this.A02.A08(A0A, false), A09(r9));
            } else {
                AnonymousClass01X r34 = this.A04;
                boolean z4 = r8.A0n.A02;
                int i4 = R.string.payment_system_event_request_canceled_no_amount;
                if (z4) {
                    i4 = R.string.payment_system_event_request_canceled_by_me_no_amount;
                }
                return r34.A0D(i4, this.A02.A08(A0A, false), A09(r9));
            }
        } else {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0138, code lost:
        if (r19 == false) goto L_0x013a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0L(X.AbstractC007503q r18, boolean r19) {
        /*
        // Method dump skipped, instructions count: 511
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02150Av.A0L(X.03q, boolean):java.lang.String");
    }

    public String A0M(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split(";");
        if (split.length != 2) {
            return "";
        }
        AbstractC05890Qx A012 = AnonymousClass1VK.A01(split[0]);
        try {
            return A012.A4R(this.A04, new C05900Qy(new BigDecimal(split[1]).movePointLeft(3), A012.A5z()));
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public String A0N(boolean z, String str, String str2, int i, int i2, long j, long j2, String str3, int i3) {
        if (z) {
            if (i == 406 || i == 407 || i == 412) {
                return A07(R.string.payments_transaction_system_message_from_me_failed_no_timestamp, R.string.payments_transaction_system_message_from_me_failed_today, R.string.payments_transaction_system_message_from_me_failed_yesterday, R.string.payments_transaction_system_message_from_me_failed_on_monday, R.string.payments_transaction_system_message_from_me_failed_on_tuesday, R.string.payments_transaction_system_message_from_me_failed_on_wednesday, R.string.payments_transaction_system_message_from_me_failed_on_thursday, R.string.payments_transaction_system_message_from_me_failed_on_friday, R.string.payments_transaction_system_message_from_me_failed_on_saturday, R.string.payments_transaction_system_message_from_me_failed_on_sunday, R.string.payments_transaction_system_message_from_me_failed_day_and_month, str, j);
            }
            if (i == 408 || i == 404 || i == 411) {
                return A07(R.string.payments_transaction_system_message_from_me_refunded_no_timestamp, R.string.payments_transaction_system_message_from_me_refunded_today, R.string.payments_transaction_system_message_from_me_refunded_yesterday, R.string.payments_transaction_system_message_from_me_refunded_on_monday, R.string.payments_transaction_system_message_from_me_refunded_on_tuesday, R.string.payments_transaction_system_message_from_me_refunded_on_wednesday, R.string.payments_transaction_system_message_from_me_refunded_on_thursday, R.string.payments_transaction_system_message_from_me_refunded_on_friday, R.string.payments_transaction_system_message_from_me_refunded_on_saturday, R.string.payments_transaction_system_message_from_me_refunded_on_sunday, R.string.payments_transaction_system_message_from_me_refunded_day_and_month, str, j2);
            }
            if (i != 409) {
                return "";
            }
            int i4 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            AnonymousClass01X r7 = this.A04;
            if (i4 > 0) {
                return r7.A0D(R.string.payments_transaction_system_message_from_me_refunded_failure, str, r7.A0D(R.string.transaction_timestamp_format, C001801b.A0c(r7, j)));
            }
            return r7.A0D(R.string.payments_transaction_system_message_from_me_refunded_failure_no_timestamp, str);
        } else if (i == 102) {
            return this.A04.A0A(R.plurals.payments_transaction_system_message_to_me_pending_setup, (long) i3, str2, str3);
        } else if (i == 106 && (i2 == 104 || i2 == 103 || i2 == 102)) {
            return A07(R.string.payments_transaction_system_message_to_me_success_with_hiccup_no_timestamp, R.string.payments_transaction_system_message_to_me_success_with_hiccup_today, R.string.payments_transaction_system_message_to_me_success_with_hiccup_yesterday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_monday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_tuesday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_wednesday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_thursday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_friday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_saturday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_sunday, R.string.payments_transaction_system_message_to_me_success_with_hiccup_day_and_month, str2, j);
        } else {
            return "";
        }
    }

    public boolean A0O(AnonymousClass0MH r5, AbstractC29081Wy r6) {
        int i;
        int A022 = C006803i.A02(r5.A0F, -1);
        int i2 = r5.A02;
        if ((i2 != 1 && i2 != 100) || !this.A00.A09(r5.A0A) || !r5.A0G() || (i = r5.A01) == 419 || i == 409 || i == 405 || i == 407 || i == 0 || A022 == 441 || A022 == 410 || A022 == 11455 || A022 == 2826008) {
            return false;
        }
        if (r6 == null || (!r6.ABe(A022) && !r6.ABF(A022) && !r6.ABB(A022) && !r6.AB9(A022) && !r6.ABJ(A022))) {
            return true;
        }
        return false;
    }
}
