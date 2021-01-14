package X;

import android.app.Application;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0KP  reason: invalid class name */
public class AnonymousClass0KP {
    public static volatile AnonymousClass0KP A0F;
    public final AnonymousClass04j A00;
    public final AnonymousClass03P A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass03S A03;
    public final AnonymousClass00D A04;
    public final AnonymousClass01X A05;
    public final AnonymousClass0KQ A06;
    public final C02660Cy A07;
    public final C03210Ff A08;
    public final C03260Fm A09;
    public final AnonymousClass03U A0A;
    public final AnonymousClass03A A0B;
    public final AnonymousClass00T A0C;
    public final AnonymousClass0CQ A0D;
    public final AnonymousClass0KR A0E;

    public AnonymousClass0KP(AnonymousClass00G r1, AnonymousClass03A r2, AnonymousClass00T r3, AnonymousClass0CQ r4, C03210Ff r5, AnonymousClass03P r6, AnonymousClass01X r7, C03260Fm r8, AnonymousClass03U r9, AnonymousClass04j r10, C02660Cy r11, AnonymousClass03S r12, AnonymousClass00D r13, AnonymousClass0KQ r14, AnonymousClass0KR r15) {
        this.A02 = r1;
        this.A0B = r2;
        this.A0C = r3;
        this.A0D = r4;
        this.A08 = r5;
        this.A01 = r6;
        this.A05 = r7;
        this.A09 = r8;
        this.A0A = r9;
        this.A00 = r10;
        this.A07 = r11;
        this.A03 = r12;
        this.A04 = r13;
        this.A06 = r14;
        this.A0E = r15;
    }

    public static AnonymousClass0KP A00() {
        if (A0F == null) {
            synchronized (AnonymousClass0KP.class) {
                if (A0F == null) {
                    A0F = new AnonymousClass0KP(AnonymousClass00G.A01, AnonymousClass03A.A00(), C002101e.A00(), AnonymousClass0CQ.A00(), C03210Ff.A00(), AnonymousClass03P.A00(), AnonymousClass01X.A00(), C03260Fm.A00(), AnonymousClass03U.A00(), AnonymousClass04j.A00(), C02660Cy.A00(), AnonymousClass03S.A00(), AnonymousClass00D.A00(), AnonymousClass0KQ.A00(), new AnonymousClass0KR());
                }
            }
        }
        return A0F;
    }

    public C48842Nz A01(String str, String str2, byte[] bArr, String str3, String str4, byte[] bArr2, JSONObject jSONObject, AnonymousClass30Z r19) {
        int simState;
        String str5;
        String str6;
        A04();
        boolean A082 = this.A03.A08();
        AnonymousClass03P r1 = this.A01;
        TelephonyManager A0F2 = r1.A0F();
        if (A0F2 == null) {
            simState = -1;
        } else {
            simState = A0F2.getSimState();
        }
        String valueOf = String.valueOf(simState);
        TelephonyManager A0F3 = r1.A0F();
        String str7 = "";
        if (A0F3 != null) {
            str5 = A0F3.getNetworkOperatorName();
            str7 = A0F3.getSimOperatorName();
        } else {
            str5 = str7;
        }
        Log.i("http/registration/wamsys/checkifexists");
        HashMap hashMap = new HashMap();
        hashMap.put("token", str3.getBytes());
        hashMap.put("mistyped", str4.getBytes());
        if (jSONObject != null) {
            hashMap.put("offline_ab", jSONObject.toString().getBytes());
        }
        JSONObject A002 = r19.A00();
        try {
            A002.put("was_activated_from_stub", this.A02.A00.getSharedPreferences("downloader_stub", 0).getBoolean("activated", false));
        } catch (JSONException unused) {
            Log.e("Failed to add stub activation metric.");
        }
        hashMap.put("client_metrics", A002.toString().getBytes());
        if (A082) {
            str6 = "1";
        } else {
            str6 = "0";
        }
        hashMap.put("read_phone_permission_granted", str6.getBytes());
        hashMap.put("sim_state", valueOf.getBytes());
        hashMap.put("network_operator_name", str5.getBytes());
        hashMap.put("sim_operator_name", str7.getBytes());
        A06(hashMap);
        AnonymousClass0KR r4 = this.A0E;
        List A032 = A03();
        if (r4 != null) {
            return (C48842Nz) AnonymousClass3Ak.A00(new AnonymousClass3W2(r4, str, str2, bArr, bArr2, hashMap, A032));
        }
        throw null;
    }

    public AnonymousClass2O4 A02(String str, String str2, String str3, String str4, AnonymousClass30Z r15) {
        byte[] bArr;
        int i;
        A04();
        byte[] A072 = A07(str, str2);
        Log.i("http/registration/wamsys/resetsecuritycode");
        HashMap hashMap = new HashMap();
        hashMap.put("client_metrics", r15.A00().toString().getBytes());
        A06(hashMap);
        if (str4 != null) {
            bArr = str4.getBytes();
        } else {
            bArr = null;
        }
        if ("wipe".equals(str3)) {
            i = 2;
        } else {
            i = 0;
            if ("email".equals(str3)) {
                i = 1;
            }
        }
        AnonymousClass2O4 r2 = (AnonymousClass2O4) AnonymousClass3Ak.A00(new AnonymousClass3W8(this.A0E, null, i, bArr, str, str2, A072, hashMap, A03()));
        if (r2 != null && r2.A03 == AnonymousClass2O5.YES) {
            A05(r2.A04);
        }
        return r2;
    }

    public final List A03() {
        ArrayList arrayList = new ArrayList();
        AnonymousClass0KQ r2 = this.A06;
        if (r2 != null) {
            try {
                r2.A01();
            } catch (IOException e) {
                Log.e("DomainFrontingManager/get-providers/error getting providers from the file", e);
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(r2.A07);
            arrayList2.addAll(r2.A08);
            arrayList2.addAll(r2.A06);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C49402Qi r3 = (C49402Qi) it.next();
                StringBuilder sb = new StringBuilder();
                sb.append(r3.A02);
                sb.append(" ");
                sb.append(r3.A01);
                sb.append(" ");
                sb.append(r3.A03);
                arrayList.add(sb.toString());
            }
            return arrayList;
        }
        throw null;
    }

    public void A04() {
        this.A0D.A04(this.A02, this.A0B, this.A0C, this.A05, this.A0A, this.A04, this.A08.A8L().A01);
    }

    public final void A05(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.A09.A01(Base64.decode(str, 3));
            } catch (IllegalArgumentException e) {
                Log.e("routing_info_helper/update_routing_info the routing info wasn't saved.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (r2 < 6) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.util.Map r7) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KP.A06(java.util.Map):void");
    }

    public byte[] A07(String str, String str2) {
        Application application = this.A02.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String A1o = C002001d.A1o(sb.toString());
        byte[] A0E2 = C007603r.A0E(application, A1o);
        if (A0E2 != null) {
            return A0E2;
        }
        byte[] A0B2 = C007603r.A0B();
        C007603r.A09(application, A0B2, A1o);
        return A0B2;
    }
}
