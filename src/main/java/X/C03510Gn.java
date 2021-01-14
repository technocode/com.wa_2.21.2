package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.Random;

/* renamed from: X.0Gn  reason: invalid class name and case insensitive filesystem */
public class C03510Gn {
    public static volatile C03510Gn A0C;
    public SharedPreferences A00;
    public final AbstractC03530Gp A01;
    public final AnonymousClass01A A02;
    public final AnonymousClass00S A03;
    public final C006903j A04;
    public final AnonymousClass01K A05;
    public final AnonymousClass0CG A06;
    public final AnonymousClass01P A07;
    public final AnonymousClass00Y A08;
    public final AnonymousClass022 A09;
    public final AnonymousClass0BB A0A;
    public final AnonymousClass00T A0B;

    public C03510Gn(AnonymousClass00S r2, AnonymousClass00T r3, C006903j r4, AnonymousClass00Y r5, AnonymousClass01A r6, AnonymousClass01K r7, AnonymousClass0BB r8, AnonymousClass0CG r9, AnonymousClass01P r10, C03320Fs r11, AnonymousClass022 r12) {
        C03520Go r0 = new C03520Go(this);
        this.A01 = r0;
        this.A03 = r2;
        this.A0B = r3;
        this.A04 = r4;
        this.A08 = r5;
        this.A02 = r6;
        this.A05 = r7;
        this.A0A = r8;
        this.A06 = r9;
        this.A07 = r10;
        this.A09 = r12;
        r11.A00(r0);
    }

    public static C03510Gn A00() {
        if (A0C == null) {
            synchronized (C03510Gn.class) {
                if (A0C == null) {
                    A0C = new C03510Gn(AnonymousClass00S.A00(), C002101e.A00(), C006903j.A00(), AnonymousClass00Y.A00(), AnonymousClass01A.A00(), AnonymousClass01K.A00(), AnonymousClass0BB.A00(), AnonymousClass0CG.A00(), AnonymousClass01P.A00(), C03320Fs.A00, AnonymousClass022.A00());
                }
            }
        }
        return A0C;
    }

    public static void A01(C03510Gn r12, AnonymousClass02N r13, boolean z, boolean z2) {
        long j;
        long j2;
        long j3;
        long j4;
        synchronized (r12) {
            SharedPreferences sharedPreferences = r12.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r12.A09.A01("chatCounts");
                r12.A00 = sharedPreferences;
            }
            String rawString = r13.getRawString();
            long j5 = 0;
            if (sharedPreferences.contains(rawString)) {
                String[] split = sharedPreferences.getString(rawString, "0,0,0,0").split(",");
                int length = split.length;
                if (length >= 2) {
                    j3 = C006803i.A04(split[0], 0);
                    j4 = C006803i.A04(split[1], 0);
                } else {
                    j3 = 0;
                    j4 = 0;
                }
                if (length == 4) {
                    j = C006803i.A04(split[2], 0);
                    j2 = C006803i.A04(split[3], 0);
                    j5 = j4;
                } else {
                    j2 = 0;
                    j5 = j4;
                    j = 0;
                }
            } else {
                j2 = 0;
                j3 = 0;
                j = 0;
            }
            if (z) {
                j3++;
                if (z2) {
                    j++;
                }
            } else {
                j5++;
                if (z2) {
                    j2++;
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            StringBuilder sb = new StringBuilder();
            sb.append(j3);
            sb.append(",");
            sb.append(j5);
            sb.append(",");
            sb.append(j);
            sb.append(",");
            sb.append(j2);
            edit.putString(rawString, sb.toString()).apply();
        }
    }

    public synchronized void A02() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A09.A01("chatCounts");
            this.A00 = sharedPreferences;
        }
        long j5 = 0;
        long j6 = sharedPreferences.getLong("start_time_ms", 0);
        long A052 = this.A03.A05();
        if (j6 == 0) {
            sharedPreferences.edit().putLong("start_time_ms", A052 - ((long) new Random().nextInt(86400000))).apply();
            return;
        }
        long j7 = A052 - j6;
        if (j7 >= 86400000) {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                String key = entry.getKey();
                if (!"start_time_ms".equals(key) && (entry.getValue() instanceof String)) {
                    String[] split = ((String) entry.getValue()).split(",");
                    boolean z = false;
                    if (split.length >= 2) {
                        j = C006803i.A04(split[0], j5);
                        j2 = C006803i.A04(split[1], j5);
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    if (split.length == 4) {
                        j4 = C006803i.A04(split[2], j5);
                        j3 = C006803i.A04(split[3], j5);
                    } else {
                        j3 = 0;
                        j4 = 0;
                    }
                    C44191ze r2 = new C44191ze();
                    r2.A0D = Long.valueOf(j6 / 1000);
                    r2.A0A = Long.valueOf(j);
                    r2.A09 = Long.valueOf(j2);
                    r2.A08 = Long.valueOf(j4);
                    r2.A07 = Long.valueOf(j3);
                    AnonymousClass02N A012 = AnonymousClass02N.A01(key);
                    if (A012 != null) {
                        C007003k A092 = this.A02.A09(A012);
                        if (A092 == null || !A092.A09()) {
                            r2.A01 = Boolean.FALSE;
                        } else {
                            r2.A01 = Boolean.TRUE;
                            UserJid A0D = this.A02.A0D((GroupJid) A092.A02(GroupJid.class));
                            if (A0D != null) {
                                A092 = this.A02.A09(A0D);
                            } else {
                                A092 = null;
                            }
                        }
                        boolean A093 = this.A0A.A08(A012).A09();
                        boolean z2 = this.A0A.A08(A012).A0F;
                        if (!(A092 == null || A092.A08 == null)) {
                            z = true;
                        }
                        r2.A00 = Boolean.valueOf(z);
                        if (!A093) {
                            i = 1;
                        } else {
                            i = 2;
                            if (z2) {
                                i = 3;
                            }
                        }
                        r2.A04 = Integer.valueOf(i);
                        if (A092 == null || !A092.A08()) {
                            r2.A05 = 1;
                        } else {
                            r2.A05 = 2;
                            UserJid userJid = (UserJid) A092.A02(UserJid.class);
                            if (A092.A06() && userJid != null && this.A07.A02(userJid)) {
                                r2.A05 = 3;
                            }
                        }
                        r2.A03 = Boolean.valueOf(this.A0A.A08(A012).A0E);
                        r2.A02 = Boolean.valueOf(this.A04.A0E(A012));
                        r2.A0C = Long.valueOf((long) this.A04.A01(A012));
                        r2.A0B = Long.valueOf(this.A06.A01(A012));
                        r2.A06 = Long.valueOf((long) C006803i.A01(this.A04, this.A02, A012));
                        this.A08.A09(r2, 1);
                        AnonymousClass00Y.A01(r2, "");
                    }
                }
                j5 = 0;
            }
            long j8 = j6 + 86400000;
            if (A052 > j8 + 86400000) {
                long j9 = j7 / 86400000;
                Long.signum(j9);
                j8 = (j9 * 86400000) + j6;
            }
            sharedPreferences.edit().clear().putLong("start_time_ms", j8).apply();
        }
    }
}
