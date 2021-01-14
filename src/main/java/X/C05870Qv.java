package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: X.0Qv  reason: invalid class name and case insensitive filesystem */
public class C05870Qv {
    public static C05870Qv[] A0C;
    public static final C05870Qv A0D;
    public static final C05870Qv A0E;
    public static final C05870Qv A0F;
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public C02000Ag[] A07;
    public C02000Ag[] A08;
    public final AbstractC05890Qx A09;
    public final LinkedHashSet A0A;
    public final boolean A0B;

    static {
        AbstractC05890Qx r10 = C05880Qw.A02;
        A0F = new C05870Qv("UNSET", "UNSET", false, 0, 0, r10, new LinkedHashSet(Collections.singletonList(r10)), false, null, null, null, false);
        AbstractC05890Qx r14 = C05880Qw.A01;
        new int[1][0] = 2;
        A0E = new C05870Qv("IN", "91", true, 3, 3, r14, new LinkedHashSet(Collections.singletonList(r14)), true, new int[]{2}, new C02000Ag[]{new C02000Ag("tos_no_wallet", "1", false), new C02000Ag("add_bank", "1", false), new C02000Ag("2fa", "1", false)}, null, true);
        AbstractC05890Qx r19 = C05880Qw.A00;
        int[] iArr = {1, 4, 6};
        C05870Qv r13 = new C05870Qv("BR", "55", true, 1, 1, r19, new LinkedHashSet(Collections.singletonList(r19)), true, new int[]{1, 4, 6}, new C02000Ag[]{new C02000Ag("tos_no_wallet", "1", false), new C02000Ag("add_card", "1", false)}, new C02000Ag[]{new C02000Ag("tos_merchant", "1", false), new C02000Ag("add_business", "1", true)}, false);
        A0D = r13;
        A0C = new C05870Qv[]{A0F, A0E, r13};
    }

    public C05870Qv(String str, String str2, boolean z, int i, int i2, AbstractC05890Qx r6, LinkedHashSet linkedHashSet, boolean z2, int[] iArr, C02000Ag[] r10, C02000Ag[] r11, boolean z3) {
        AnonymousClass00E.A03(str);
        this.A02 = str;
        this.A03 = str2;
        this.A0B = z;
        this.A00 = i;
        this.A01 = i2;
        this.A09 = r6;
        this.A0A = linkedHashSet;
        this.A05 = z2;
        this.A06 = iArr;
        this.A08 = r10;
        this.A07 = r11;
        this.A04 = z3;
    }

    public static C05870Qv A00(String str) {
        if (str != null) {
            C05870Qv[] r4 = A0C;
            for (C05870Qv r1 : r4) {
                if (r1.A02.equalsIgnoreCase(str)) {
                    return r1;
                }
            }
        }
        return A0F;
    }

    public static C05870Qv A01(String str) {
        if (!TextUtils.isEmpty(str)) {
            C05870Qv[] r4 = A0C;
            for (C05870Qv r1 : r4) {
                if (r1.A03.equals(str)) {
                    return r1;
                }
            }
        }
        return A0F;
    }
}
