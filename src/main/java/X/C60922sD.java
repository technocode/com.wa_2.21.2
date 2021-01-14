package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2sD  reason: invalid class name and case insensitive filesystem */
public class C60922sD {
    public static final ArrayList A0C = new ArrayList(Arrays.asList("+919223274424", "+919870804455", "+919818277355"));
    public static final ArrayList A0D = new ArrayList(Arrays.asList("+919870804455", "+919223274424", "+919818277355"));
    public static volatile C60922sD A0E;
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass3DY A03;
    public C61082sT A04;
    public Boolean A05;
    public ArrayList A06;
    public ArrayList A07;
    public HashMap A08;
    public final AnonymousClass01I A09;
    public final C68393Da A0A;
    public final C68683Ed A0B;

    public C60922sD(AnonymousClass01I r1, C68683Ed r2, C68393Da r3) {
        this.A09 = r1;
        this.A0B = r2;
        this.A0A = r3;
        A08();
    }

    public static C60922sD A00() {
        if (A0E == null) {
            synchronized (C60922sD.class) {
                if (A0E == null) {
                    A0E = new C60922sD(AnonymousClass01I.A00(), C68683Ed.A00(), C68393Da.A00());
                }
            }
        }
        return A0E;
    }

    public static String A01(HashMap hashMap, String str) {
        if (hashMap.get(str) == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject((String) hashMap.get(str)).getJSONObject("data");
            StringBuilder sb = new StringBuilder();
            sb.append(jSONObject.getString("code"));
            sb.append(",");
            sb.append(jSONObject.getString("ki"));
            sb.append(",");
            sb.append(jSONObject.getString("encryptedBase64String"));
            return sb.toString();
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder("PAY: IndiaUPIPaymentBankSetup getEncryptedBlob read: ");
            sb2.append(str);
            sb2.append("  blob threw: ");
            Log.i(sb2.toString(), e);
            return null;
        }
    }

    public final AnonymousClass3DY A02(C74463ay r6) {
        ArrayList A062 = A06(r6);
        if (A062 != null && !A062.isEmpty()) {
            String str = (String) A062.get(this.A01 % A062.size());
            ArrayList arrayList = this.A07;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass3DY r1 = (AnonymousClass3DY) it.next();
                    if (str.equals(r1.A03())) {
                        return r1;
                    }
                }
            }
        }
        return null;
    }

    public String A03(C74463ay r5) {
        ArrayList<String> arrayList;
        Bundle bundle;
        AnonymousClass01I r0 = this.A09;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid != null) {
            String str = userJid.user;
            AnonymousClass3DY A022 = A02(r5);
            if (A022 == null || (bundle = A022.A00) == null || (arrayList = bundle.getStringArrayList("smsGateways")) == null || arrayList.size() <= 0) {
                arrayList = (str.endsWith("0") || str.endsWith("2") || str.endsWith("4") || str.endsWith("6") || str.endsWith("8")) ? A0C : A0D;
            }
            AnonymousClass00E.A05(arrayList);
            int size = arrayList.size();
            this.A00 = size;
            return arrayList.get(this.A02 % size);
        }
        throw null;
    }

    public String A04(C74463ay r3) {
        String A042 = this.A0A.A04();
        if (!TextUtils.isEmpty(A042)) {
            return A042;
        }
        AnonymousClass3DY A022 = A02(r3);
        return (A022 == null || TextUtils.isEmpty(A022.A03())) ? "ICICI" : A022.A03();
    }

    public String A05(C74463ay r5) {
        String str;
        AnonymousClass3DY A022 = A02(r5);
        if (A022 != null) {
            Bundle bundle = A022.A00;
            if (bundle != null) {
                str = bundle.getString("transactionPrefix");
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle2 = A022.A00;
                if (bundle2 != null) {
                    return bundle2.getString("transactionPrefix");
                }
                return null;
            }
        }
        return this.A0A.A03();
    }

    public ArrayList A06(C74463ay r4) {
        Bundle bundle;
        ArrayList arrayList;
        if (r4 != null && (arrayList = r4.A0F) != null && !arrayList.isEmpty()) {
            return arrayList;
        }
        AnonymousClass3DY r1 = this.A03;
        if (r1 == null || (bundle = r1.A00) == null) {
            return null;
        }
        return bundle.getStringArrayList("pspRouting");
    }

    public void A07() {
        int i = this.A02 + 1;
        if (i != this.A00 || this.A07.size() <= 1) {
            this.A02 = i;
            return;
        }
        this.A02 = 0;
        this.A01++;
    }

    public void A08() {
        this.A04 = new C61082sT();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A06 = null;
        this.A07 = null;
        this.A03 = null;
        this.A08 = null;
        this.A0B.reset();
    }

    public void A09(ArrayList arrayList, ArrayList arrayList2, AnonymousClass3DY r5) {
        this.A06 = arrayList;
        this.A07 = arrayList2;
        this.A03 = r5;
        StringBuilder A0S = AnonymousClass008.A0S("PAY: IndiaUpiPaymentSetup setPspAndBanksList got banks: ");
        A0S.append(arrayList);
        Log.i(A0S.toString());
        StringBuilder sb = new StringBuilder("PAY: IndiaUpiPaymentSetup setPspAndBanksList pspConfig: ");
        sb.append(this.A07);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder("PAY: IndiaUpiPaymentSetup setPspAndBanksList pspRouting: ");
        sb2.append(r5);
        Log.i(sb2.toString());
    }
}
