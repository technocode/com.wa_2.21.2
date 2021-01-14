package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import java.util.Calendar;

/* renamed from: X.0cD  reason: invalid class name and case insensitive filesystem */
public class C09050cD {
    public static volatile C09050cD A06;
    public final AnonymousClass0I5 A00;
    public final AnonymousClass01A A01;
    public final C014308b A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass01X A04;
    public final C002401h A05;

    public C09050cD(AnonymousClass00S r1, C002401h r2, AnonymousClass01A r3, C014308b r4, AnonymousClass01X r5, AnonymousClass0I5 r6) {
        this.A03 = r1;
        this.A05 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A00 = r6;
    }

    public static C09050cD A00() {
        if (A06 == null) {
            synchronized (C09050cD.class) {
                if (A06 == null) {
                    A06 = new C09050cD(AnonymousClass00S.A00(), C002401h.A00(), AnonymousClass01A.A00(), C014308b.A00(), AnonymousClass01X.A00(), AnonymousClass0I5.A00());
                }
            }
        }
        return A06;
    }

    public String A01(C007003k r6) {
        String A022 = A02(r6);
        if (A022 != null) {
            return A022;
        }
        AnonymousClass0I5 r1 = this.A00;
        Jid A023 = r6.A02(AnonymousClass02N.class);
        if (A023 != null) {
            long A024 = r1.A02((AnonymousClass02N) A023);
            if (A024 == 0) {
                return "";
            }
            if (A024 == 1) {
                return this.A04.A06(R.string.conversation_contact_online);
            }
            toString();
            return A04(r6, this.A03.A06(A024), true);
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        if ((r7 + 25000) <= android.os.SystemClock.elapsedRealtime()) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02(X.C007003k r12) {
        /*
        // Method dump skipped, instructions count: 249
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09050cD.A02(X.03k):java.lang.String");
    }

    public String A03(C007003k r8) {
        if (A02(r8) != null) {
            return null;
        }
        AnonymousClass0I5 r4 = this.A00;
        Jid A022 = r8.A02(AnonymousClass02N.class);
        if (A022 != null) {
            long A023 = r4.A02((AnonymousClass02N) A022);
            Jid A024 = r8.A02(AnonymousClass02N.class);
            if (A024 == null) {
                throw null;
            } else if (1 != r4.A02((AnonymousClass02N) A024)) {
                return A04(r8, this.A03.A06(A023), false);
            } else {
                return null;
            }
        } else {
            throw null;
        }
    }

    public final String A04(C007003k r9, long j, boolean z) {
        int i;
        int A002 = AnonymousClass0OY.A00(this.A03.A05(), j);
        if (A002 <= 6) {
            if (A002 != 0) {
                if (A002 != 1) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(j);
                    switch (instance.get(7)) {
                        case 1:
                            i = R.string.sunday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_sun_with_placeholder;
                                break;
                            }
                            break;
                        case 2:
                            i = R.string.monday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_mon_with_placeholder;
                                break;
                            }
                            break;
                        case 3:
                            i = R.string.tuesday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_tue_with_placeholder;
                                break;
                            }
                            break;
                        case 4:
                            i = R.string.wednesday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_wed_with_placeholder;
                                break;
                            }
                            break;
                        case 5:
                            i = R.string.thursday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_thu_with_placeholder;
                                break;
                            }
                            break;
                        case 6:
                            i = R.string.friday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_fri_with_placeholder;
                                break;
                            }
                            break;
                        case 7:
                            i = R.string.saturday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_sat_with_placeholder;
                                break;
                            }
                            break;
                        default:
                            i = 0;
                            break;
                    }
                } else {
                    i = R.string.yesterday_at;
                    if (z) {
                        i = R.string.conversation_last_seen_yesterday_with_placeholder;
                    }
                }
            } else {
                i = R.string.today_at;
                if (z) {
                    i = R.string.conversation_last_seen_today_with_placeholder;
                }
            }
            AnonymousClass01X r4 = this.A04;
            String A003 = AnonymousClass0OZ.A00(r4, j);
            if (z) {
                A003 = this.A05.A03((AnonymousClass02N) r9.A02(AnonymousClass02N.class), i, A003);
            }
            return AnonymousClass0OZ.A01(r4, A003, j);
        }
        String A1U = C002001d.A1U(this.A04, A002, j);
        if (!z) {
            return A1U;
        }
        return this.A05.A03((AnonymousClass02N) r9.A02(AnonymousClass02N.class), R.string.conversation_last_seen_with_placeholder, A1U);
    }
}
