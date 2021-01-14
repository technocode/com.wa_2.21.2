package X;

import android.content.Intent;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity;
import com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3Gm  reason: invalid class name and case insensitive filesystem */
public class C69293Gm implements AbstractC29081Wy {
    public static volatile C69293Gm A02;
    public final C60922sD A00;
    public final C68393Da A01;

    @Override // X.AbstractC29081Wy
    public int A6G(int i) {
        return 0;
    }

    @Override // X.AbstractC29081Wy
    public boolean AAy(int i) {
        return i == 11510;
    }

    @Override // X.AbstractC29081Wy
    public boolean AB9(int i) {
        return i == 11482;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABA(int i) {
        return i == 11459;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABB(int i) {
        return i == 11504;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABC(int i) {
        return false;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABD(int i) {
        return false;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABE(int i) {
        return false;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABF(int i) {
        return i == 11503;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABG(int i) {
        return false;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABJ(int i) {
        return i == 11468;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABR(int i) {
        return false;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABe(int i) {
        return i == 11455 || i == 11502;
    }

    @Override // X.AbstractC29081Wy
    public int ABz() {
        return 100000;
    }

    @Override // X.AbstractC29081Wy
    public int AC0() {
        return 10;
    }

    public C69293Gm(C60922sD r1, C68393Da r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x001d, code lost:
        if (r3 != 443) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(int r3, X.C61082sT r4) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69293Gm.A00(int, X.2sT):int");
    }

    public static C69293Gm A01() {
        if (A02 == null) {
            synchronized (C69293Gm.class) {
                if (A02 == null) {
                    A02 = new C69293Gm(C60922sD.A00(), C68393Da.A00());
                }
            }
        }
        return A02;
    }

    public static boolean A02(AnonymousClass1PY r6, String str, int i, boolean z) {
        if (z && i == 404) {
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: ");
            sb.append(r6);
            sb.append(" op: ");
            sb.append(str);
            sb.append(" payment account error: ");
            sb.append(i);
            sb.append("; restartPaymentsAccountSetupAndFinish");
            Log.e(sb.toString());
            r6.A0Z();
            Intent intent = new Intent(r6, IndiaUpiPaymentsAccountSetupActivity.class);
            r6.A0c(intent);
            r6.A0I(intent, false);
            r6.finish();
            return true;
        } else if (i == 440) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PAY: ");
            sb2.append(r6);
            sb2.append(" op: ");
            sb2.append(str);
            sb2.append(" tos not accepted; showTosAndFinish");
            Log.e(sb2.toString());
            Intent intent2 = new Intent(r6, IndiaUpiPaymentsTosActivity.class);
            intent2.putExtra("extra_show_updated_tos", false);
            r6.A0c(intent2);
            r6.A0Z();
            r6.A0I(intent2, false);
            r6.finish();
            return true;
        } else if (i == 442) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("PAY: ");
            sb3.append(r6);
            sb3.append(" op: ");
            sb3.append(str);
            sb3.append(" tos v2 not accepted; showTosAndFinish");
            Log.e(sb3.toString());
            Intent intent3 = new Intent(r6, IndiaUpiPaymentsTosActivity.class);
            intent3.putExtra("extra_show_updated_tos", true);
            r6.A0c(intent3);
            r6.startActivityForResult(intent3, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            return true;
        } else if (i != 443) {
            return false;
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("PAY: ");
            sb4.append(r6);
            sb4.append(" op: ");
            sb4.append(str);
            sb4.append(" payment unsupported for client version");
            Log.e(sb4.toString());
            r6.A0Z();
            Intent intent4 = new Intent(r6, PaymentsUpdateRequiredActivity.class);
            intent4.addFlags(335544320);
            r6.A0c(intent4);
            r6.A0I(intent4, false);
            r6.finish();
            return true;
        }
    }

    @Override // X.AbstractC29081Wy
    public int A6F(int i, C61082sT r3) {
        return A00(i, null);
    }

    @Override // X.AbstractC29081Wy
    public void AA8(String str) {
        if (str.equals("11456") || str.equals("11471")) {
            AnonymousClass008.A18("PAY: IndiaUpiErrorHelper/handlePaymentTransactionError handle:", str);
            this.A01.A0B();
            C60922sD r2 = this.A00;
            r2.A04.A06.add("done");
            r2.A08();
        }
    }
}
