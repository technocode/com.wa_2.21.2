package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3DU  reason: invalid class name */
public class AnonymousClass3DU implements AbstractC61142sZ {
    public static final void A00(int i, AnonymousClass0M5 r7, AnonymousClass0M5 r8, ArrayList arrayList) {
        int length;
        int i2 = 0;
        if (i == 2) {
            AnonymousClass0M5[] r6 = r8.A03;
            if (r6 != null) {
                int length2 = r6.length;
                while (i2 < length2) {
                    AnonymousClass0M5 r2 = r6[i2];
                    if (r2 != null) {
                        if ("bank".equals(r2.A00)) {
                            C74463ay r0 = new C74463ay();
                            r0.A01(2, r7);
                            r0.A01(2, r2);
                            arrayList.add(r0);
                        } else if ("psp".equals(r2.A00) || "psp-routing".equals(r2.A00)) {
                            AnonymousClass3DY r02 = new AnonymousClass3DY();
                            r02.A01(2, r2);
                            arrayList.add(r02);
                        }
                    }
                    i2++;
                }
            }
        } else if (i == 4) {
            AnonymousClass0M5[] r3 = r8.A03;
            if (r3 != null && (length = r3.length) > 0) {
                while (i2 < length) {
                    AnonymousClass0M5 r1 = r3[i2];
                    if (r1 != null) {
                        C74463ay r03 = new C74463ay();
                        r03.A01(4, r1);
                        arrayList.add(r03);
                    }
                    i2++;
                }
            }
        } else if (i != 5) {
            StringBuilder sb = new StringBuilder("PAY: IndiaProtoParser got action: ");
            sb.append(i);
            sb.append("; nothing to do");
            Log.i(sb.toString());
        } else {
            AnonymousClass3DY r04 = new AnonymousClass3DY();
            r04.A01(5, r8);
            arrayList.add(r04);
        }
    }

    @Override // X.AbstractC61142sZ
    public ArrayList ALu(AnonymousClass0M5 r11) {
        int i;
        AnonymousClass0M5 A0D = r11.A0D("account");
        ArrayList arrayList = new ArrayList();
        if (A0D == null) {
            Log.w("PAY: IndiaProtoParser empty account node");
            return arrayList;
        }
        String A0G = A0D.A0G("action", null);
        if ("upi-batch".equalsIgnoreCase(A0G)) {
            i = 1;
        } else if ("upi-get-banks".equalsIgnoreCase(A0G)) {
            i = 2;
        } else if ("upi-register-vpa".equalsIgnoreCase(A0G)) {
            i = 4;
        } else if ("upi-list-keys".equalsIgnoreCase(A0G)) {
            i = 5;
        } else {
            i = 0;
            if ("upi-check-mpin".equalsIgnoreCase(A0G)) {
                i = 6;
            }
        }
        if (i == 1) {
            AnonymousClass0M5[] r6 = A0D.A03;
            if (r6 != null) {
                for (AnonymousClass0M5 r1 : r6) {
                    if (r1 != null) {
                        String str = r1.A00;
                        int hashCode = str.hashCode();
                        if (hashCode != -384112062) {
                            if (hashCode != 3288564) {
                                if (hashCode == 93503927) {
                                    if (!str.equals("banks")) {
                                    }
                                }
                            } else if (str.equals("keys")) {
                                A00(5, A0D, r1, arrayList);
                            }
                        } else if (!str.equals("psp-config")) {
                        }
                        A00(2, A0D, r1, arrayList);
                    }
                }
            }
        } else if (i == 2) {
            A00(i, A0D, A0D, arrayList);
            AnonymousClass0M5[] r2 = A0D.A03;
            if (r2 != null) {
                for (AnonymousClass0M5 r12 : r2) {
                    if (r12 != null && "psp-config".equals(r12.A00)) {
                        A00(i, A0D, r12, arrayList);
                    }
                }
            }
        } else {
            A00(i, A0D, A0D, arrayList);
        }
        return arrayList;
    }
}
