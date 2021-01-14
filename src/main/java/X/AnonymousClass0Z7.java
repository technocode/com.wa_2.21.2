package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.0Z7  reason: invalid class name */
public class AnonymousClass0Z7 {
    public static volatile AnonymousClass0Z7 A0C;
    public final AnonymousClass01I A00;
    public final C000300f A01;
    public final AnonymousClass01A A02;
    public final C014308b A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass01X A05;
    public final AnonymousClass01T A06;
    public final AnonymousClass01P A07;
    public final C015808q A08;
    public final C02130At A09;
    public final C002401h A0A;
    public final AnonymousClass0ZQ A0B;

    public AnonymousClass0Z7(AnonymousClass01I r1, AnonymousClass00G r2, C002401h r3, C000300f r4, AnonymousClass01A r5, C014308b r6, AnonymousClass01X r7, C015808q r8, AnonymousClass01P r9, C02130At r10, AnonymousClass01T r11, AnonymousClass0ZQ r12) {
        this.A00 = r1;
        this.A04 = r2;
        this.A0A = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = r7;
        this.A08 = r8;
        this.A07 = r9;
        this.A09 = r10;
        this.A06 = r11;
        this.A0B = r12;
    }

    public static AnonymousClass0Z7 A00() {
        if (A0C == null) {
            synchronized (AnonymousClass0Z7.class) {
                if (A0C == null) {
                    AnonymousClass01I A002 = AnonymousClass01I.A00();
                    AnonymousClass00G r5 = AnonymousClass00G.A01;
                    C002401h A003 = C002401h.A00();
                    C000300f A004 = C000300f.A00();
                    AnonymousClass01A A005 = AnonymousClass01A.A00();
                    C014308b A006 = C014308b.A00();
                    AnonymousClass01X A007 = AnonymousClass01X.A00();
                    C015808q A008 = C015808q.A00();
                    AnonymousClass01P A009 = AnonymousClass01P.A00();
                    C02130At A0010 = C02130At.A00();
                    AnonymousClass01T A0011 = AnonymousClass01T.A00();
                    if (AnonymousClass0ZQ.A05 == null) {
                        synchronized (AnonymousClass0ZQ.class) {
                            if (AnonymousClass0ZQ.A05 == null) {
                                AnonymousClass0ZQ.A05 = new AnonymousClass0ZQ(AnonymousClass01I.A00(), C002401h.A00(), AnonymousClass01A.A00(), C014308b.A00(), AnonymousClass01X.A00());
                            }
                        }
                    }
                    A0C = new AnonymousClass0Z7(A002, r5, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, AnonymousClass0ZQ.A05);
                }
            }
        }
        return A0C;
    }

    public final String A01(C007003k r3) {
        String A082 = this.A03.A08(r3, false);
        if (A082 == null) {
            return null;
        }
        return this.A05.A0E(A082);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r11 == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02(X.AnonymousClass02N r10, boolean r11, int r12) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z7.A02(X.02N, boolean, int):java.lang.String");
    }

    public final String A03(C007303n r6, int i, int i2) {
        if (r6.A02) {
            return this.A0A.A03(null, i, new Object[0]);
        }
        AnonymousClass02N r3 = r6.A00;
        if (r3 == null) {
            return "";
        }
        String A012 = A01(this.A02.A0A(r3));
        return this.A0A.A03(r3, i2, A012);
    }

    public final String A04(C05390Oi r9, int i, int i2) {
        List list = ((C05400Oj) r9).A01;
        if (list.size() == 1 && this.A00.A09((Jid) list.get(0))) {
            return this.A05.A06(i);
        }
        AnonymousClass01X r5 = this.A05;
        long size = (long) list.size();
        return String.format(r5.A0I(), r5.A08(i2, size), r5.A0E(this.A03.A0C(list)));
    }

    public final String A05(C05390Oi r6, String str, int i, int i2, int i3) {
        if (AnonymousClass1VY.A0T(r6.A0n.A00)) {
            return this.A0A.A03(r6.A07(), i, str);
        } else if (this.A00.A09(r6.A07())) {
            return this.A05.A06(i2);
        } else {
            return this.A0A.A03(r6.A07(), i3, str);
        }
    }

    public final String A06(C05390Oi r8, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        List list = ((C05400Oj) r8).A01;
        if (AnonymousClass1VY.A0T(r8.A0n.A00)) {
            AnonymousClass01X r5 = this.A05;
            long size = (long) list.size();
            return String.format(r5.A0I(), r5.A08(i6, size), r5.A0E(this.A03.A0C(list)));
        }
        AnonymousClass01I r2 = this.A00;
        if (r2.A09(r8.A07())) {
            AnonymousClass01X r3 = this.A05;
            return String.format(r3.A0I(), r3.A06(i), r3.A0E(this.A03.A0C(list)));
        } else if (str == null) {
            if (list.size() == 1 && r2.A09((Jid) list.get(0))) {
                return this.A05.A06(i2);
            }
            AnonymousClass01X r32 = this.A05;
            return String.format(r32.A0I(), r32.A06(i3), r32.A0E(this.A03.A0C(list)));
        } else if (list.size() != 1 || !r2.A09((Jid) list.get(0))) {
            return this.A0A.A03(r8.A07(), i5, str, this.A05.A0E(this.A03.A0C(list)));
        } else {
            return this.A0A.A03(r8.A07(), i4, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0a0e, code lost:
        if (X.C003701u.A03(r1).equals(X.C003701u.A03(r5)) == false) goto L_0x0a10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0a12, code lost:
        if (r0 != false) goto L_0x0a14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0ae1, code lost:
        if (r1 == false) goto L_0x0ae3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0b00, code lost:
        if (r1 == false) goto L_0x0b02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0d57, code lost:
        if (r5.lastIndexOf("\"") > r5.indexOf("\"")) goto L_0x0d59;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x05cb  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x067b  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0699  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0718  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x07a5  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x07b7  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x07c9  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x07d3  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x07df  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x080d  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x083b  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0869  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0897  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x089e  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x090b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0915  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0927  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0939  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x094b  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0955  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0998  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x09d2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0b52  */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0b8d  */
    /* JADX WARNING: Removed duplicated region for block: B:520:0x0bb4  */
    /* JADX WARNING: Removed duplicated region for block: B:522:0x0bbf  */
    /* JADX WARNING: Removed duplicated region for block: B:524:0x0bca  */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0be1  */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x0bfd  */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x0c14  */
    /* JADX WARNING: Removed duplicated region for block: B:540:0x0c6c  */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x0c73  */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0cbe  */
    /* JADX WARNING: Removed duplicated region for block: B:556:0x0cdb  */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x0ce9  */
    /* JADX WARNING: Removed duplicated region for block: B:564:0x0d11  */
    /* JADX WARNING: Removed duplicated region for block: B:566:0x0d1f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A07(X.C05390Oi r26, boolean r27) {
        /*
        // Method dump skipped, instructions count: 4014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Z7.A07(X.0Oi, boolean):java.lang.String");
    }

    public final String A08(C12130hb r10, C007003k r11, String str, boolean z) {
        UserJid userJid = r10.A00;
        UserJid userJid2 = r10.A01;
        if (userJid2 != null) {
            userJid2.getRawString();
        }
        if (z) {
            if (!r11.A07()) {
                return this.A05.A0D(R.string.group_participant_changed_number_known_name, str);
            } else if (userJid != null) {
                String A022 = C12420i4.A02(userJid);
                AnonymousClass01X r3 = this.A05;
                Object[] objArr = new Object[2];
                objArr[0] = str.replace(' ', (char) 160);
                if (A022 != null) {
                    objArr[1] = r3.A0F(A022.replace(' ', (char) 160));
                    return r3.A0D(R.string.group_participant_changed_number_unknown_name, objArr);
                }
                throw null;
            } else {
                throw null;
            }
        } else if (userJid2 != null) {
            boolean equals = userJid2.equals(r10.A0n.A00);
            int i = R.string.chat_changed_number_new;
            if (equals) {
                i = R.string.chat_changed_number_old;
            }
            if (r11.A07()) {
                return this.A05.A0D(i, str.replace(' ', (char) 160));
            }
            return this.A05.A0D(i, str);
        } else {
            throw null;
        }
    }

    public final String A09(boolean z, int i) {
        if (i <= 0) {
            C002401h r2 = this.A0A;
            int i2 = R.string.ephemeral_setting_disabled;
            if (z) {
                i2 = R.string.ephemeral_setting_disabled_tap_to_change;
            }
            return r2.A03(null, i2, new Object[0]);
        }
        int i3 = R.plurals.ephemeral_setting_enabled_in_seconds;
        if (z) {
            i3 = R.plurals.ephemeral_setting_enabled_in_seconds_tap_to_change;
        }
        if (i > 86400) {
            i /= 86400;
            i3 = R.plurals.ephemeral_setting_enabled_in_days;
            if (z) {
                i3 = R.plurals.ephemeral_setting_enabled_in_days_tap_to_change;
            }
        } else if (i >= 3600) {
            i /= 3600;
            i3 = R.plurals.ephemeral_setting_enabled_in_hours;
            if (z) {
                i3 = R.plurals.ephemeral_setting_enabled_in_hours_tap_to_change;
            }
        } else if (i >= 60) {
            i /= 60;
            i3 = R.plurals.ephemeral_setting_enabled_in_minutes;
            if (z) {
                i3 = R.plurals.ephemeral_setting_enabled_in_minutes_tap_to_change;
            }
        }
        return this.A0A.A02(null, i3, i, Integer.valueOf(i));
    }
}
