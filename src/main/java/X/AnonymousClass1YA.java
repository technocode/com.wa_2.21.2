package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import java.util.Arrays;

/* renamed from: X.1YA  reason: invalid class name */
public class AnonymousClass1YA {
    public static final int[] A00 = {1, 2, 3};

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        if (r3 == 2) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r4 != 1) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        if (r4 == 0) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(int r3, int r4) {
        /*
            r2 = 1
            if (r3 != r2) goto L_0x000b
            if (r4 == r2) goto L_0x000f
        L_0x0005:
            r0 = 2
            if (r3 != r2) goto L_0x0010
            if (r4 != r0) goto L_0x001c
            return r0
        L_0x000b:
            if (r3 != 0) goto L_0x0005
            if (r4 != 0) goto L_0x001c
        L_0x000f:
            return r2
        L_0x0010:
            if (r3 != r0) goto L_0x0016
            if (r4 != r2) goto L_0x0018
            r0 = 3
            return r0
        L_0x0016:
            if (r3 != r0) goto L_0x001c
        L_0x0018:
            if (r4 != r0) goto L_0x001c
            r0 = 4
            return r0
        L_0x001c:
            java.lang.String r0 = "getProviderCategory unexpected arguments hostStorage: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ". actualActors:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YA.A00(int, int):int");
    }

    public static int A01(int i, Jid jid) {
        if (i == 1) {
            return R.string.encryption_description;
        }
        if (i == 2) {
            return R.string.contact_info_security_modal_bsp;
        }
        if (i == 3 || i == 4) {
            if (AnonymousClass1VY.A0W(jid)) {
                return R.string.contact_info_security_modal_company_number;
            }
            return R.string.contact_info_security_modal_fb_and_bsp;
        } else if (i == 5) {
            return R.string.contact_info_security_modal_in_app_support;
        } else {
            AnonymousClass008.A0u("providerCategoryToModal unexpected argument value for providerCategory: ", i);
            return R.string.encryption_description;
        }
    }

    public static boolean A02(AnonymousClass0OB r4, AnonymousClass0OB r5, C000300f r6) {
        int A002;
        if (!r6.A0D(AbstractC000400g.A0Z) || r5 == null) {
            return false;
        }
        if (r4 == null) {
            A002 = 1;
        } else {
            A002 = A00(r4.A01, r4.A00);
        }
        if (A002 == A00(r5.A01, r5.A00)) {
            return false;
        }
        Arrays.toString(Thread.currentThread().getStackTrace());
        return true;
    }
}
