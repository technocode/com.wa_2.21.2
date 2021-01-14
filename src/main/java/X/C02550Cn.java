package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0Cn  reason: invalid class name and case insensitive filesystem */
public class C02550Cn {
    public static volatile C02550Cn A04;
    public final AnonymousClass009 A00;
    public final AnonymousClass088 A01;
    public final C000300f A02;
    public final C02510Ch A03;

    public C02550Cn(AnonymousClass009 r1, AnonymousClass088 r2, C000300f r3, C02510Ch r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static float A00(C000300f r4, int i, int i2, long j, int i3) {
        if (i == 0 || i2 == 0) {
            return 3.0f;
        }
        float A06 = (((float) ((r4.A06(AbstractC000400g.A3a) << 10) << 10)) * 8000.0f) / ((float) (((i * i2) * 3) + 96000));
        float max = Math.max(0.0f, A06 - ((float) j)) / A06;
        return (((float) (i3 - 3)) * max * max) + 3.0f;
    }

    public static C02550Cn A01() {
        if (A04 == null) {
            synchronized (C02550Cn.class) {
                if (A04 == null) {
                    A04 = new C02550Cn(AnonymousClass009.A00(), AnonymousClass088.A00(), C000300f.A00(), C02510Ch.A08());
                }
            }
        }
        return A04;
    }

    public static boolean A02(AnonymousClass1XO r3, File file) {
        if (r3 == AnonymousClass1XO.A0N || r3 == AnonymousClass1XO.A04 || r3 == AnonymousClass1XO.A0Q) {
            if (AnonymousClass0JG.A01() == 1) {
                return true;
            }
            return false;
        } else if (r3 == AnonymousClass1XO.A05) {
            return C39371rO.A00(file);
        } else {
            if (r3 == AnonymousClass1XO.A0A || r3 == AnonymousClass1XO.A0P || r3 == AnonymousClass1XO.A0H || r3 == AnonymousClass1XO.A06 || r3 == AnonymousClass1XO.A0I || r3 == AnonymousClass1XO.A0C) {
                return true;
            }
            return false;
        }
    }

    public boolean A03(long j, long j2) {
        int i;
        if (j <= 262144) {
            return false;
        }
        if (j2 == 0) {
            i = 0;
        } else {
            i = (int) ((j * 8) / (j2 * 1000));
        }
        if (i > this.A02.A06(AbstractC000400g.A48)) {
            return true;
        }
        return false;
    }

    public boolean A04(AnonymousClass1XO r4, File file) {
        if (file != null) {
            try {
                if (AnonymousClass1XO.A0N == r4 || AnonymousClass1XO.A04 == r4 || AnonymousClass1XO.A0Q == r4) {
                    if (C02510Ch.A06(this.A00, file, false).A01 != 0) {
                        return true;
                    }
                } else if ((AnonymousClass1XO.A05 == r4 || AnonymousClass1XO.A0D == r4) && C02510Ch.A06(this.A00, file, false).A01 == 2) {
                    return true;
                }
            } catch (IOException e) {
                Log.e("transcodeutils/isEligibleForMp4Check exception", e);
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        if (r0 == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.AnonymousClass0M3 r10) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02550Cn.A05(X.0M3):boolean");
    }
}
