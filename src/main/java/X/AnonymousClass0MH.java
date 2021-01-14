package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0MH  reason: invalid class name */
public class AnonymousClass0MH implements Parcelable {
    public static final String A0O = C05870Qv.A0E.A02;
    public static final int[] A0P = {101, 102, 103, 104};
    public static final int[] A0Q = {11, 12};
    public static final int[] A0R = {401, 402, 403, 404, 410, 411, 413};
    public static final Parcelable.Creator CREATOR = new AnonymousClass2LU();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public C05900Qy A06;
    public AbstractC43791yx A07;
    public AnonymousClass02N A08;
    public UserJid A09;
    public UserJid A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public ArrayList A0J;
    public boolean A0K = true;
    public boolean A0L;
    public boolean A0M;
    public byte[] A0N;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass0MH(int i, long j, String str, int i2) {
        this.A02 = i;
        this.A04 = j;
        this.A0C = str;
        this.A03 = i2;
        this.A00 = 0;
    }

    public AnonymousClass0MH(int i, UserJid userJid, UserJid userJid2, String str, C05900Qy r14, long j, String str2, int i2, long j2, String str3, String str4, String str5, String str6, String str7, int i3, int i4) {
        boolean z = true;
        AnonymousClass00E.A07(i == 0 ? false : z);
        this.A02 = i;
        this.A0A = userJid;
        this.A09 = userJid2;
        this.A0E = str;
        this.A06 = r14;
        this.A04 = j;
        this.A0C = str7;
        this.A03 = i3;
        this.A00 = i4;
        if (!TextUtils.isEmpty(str2)) {
            A0D(str2);
        } else if (!TextUtils.isEmpty(str6) && (i == 10 || i == 20 || i == 40)) {
            A0D(str6);
        }
        A09(i2, j2, str3, str4, str5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r11 != 200) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(int r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 434
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MH.A00(int, java.lang.String):int");
    }

    public static int A01(String str) {
        Number number;
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        HashMap hashMap = AnonymousClass2LX.A00;
        if (!hashMap.containsKey(str) || (number = (Number) hashMap.get(str)) == null) {
            return 1;
        }
        return number.intValue();
    }

    public static AnonymousClass0MH A02(int i, int i2, UserJid userJid, UserJid userJid2, String str, C05900Qy r18, long j, String str2, String str3, int i3, int i4) {
        return new AnonymousClass0MH(i, userJid, userJid2, str, r18, j, null, i2, 0, null, null, null, str2, str3, i3, i4);
    }

    public static AnonymousClass0MH A03(long j) {
        return new AnonymousClass0MH(4, j, C05870Qv.A0F.A02, 1);
    }

    public static String A04(List list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((AnonymousClass2LW) it.next()).A00(false));
        }
        return jSONArray.toString();
    }

    public static ArrayList A05(String str, AbstractC05890Qx r15) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int optInt = jSONObject.optInt("t", 0);
                String optString = jSONObject.optString("st", null);
                String optString2 = jSONObject.optString("cc", null);
                String optString3 = jSONObject.optString("c", null);
                String optString4 = jSONObject.optString("n", null);
                String optString5 = jSONObject.optString("a", null);
                int optInt2 = jSONObject.optInt("sd", 1);
                if (TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString5)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("PAY: PaymentTransaction:Source:fromJsonString could not parse string: ");
                    sb.append(str);
                    Log.w(sb.toString());
                    return null;
                }
                C05900Qy A002 = C05900Qy.A00(optString5, r15.A5z());
                if (A002 == null || !A002.A01()) {
                    Log.w("PAY: PaymentTransaction:Source:fromJsonString could not parse string amount");
                    return null;
                }
                AnonymousClass1VM A012 = AnonymousClass1VM.A01(optInt, optString, C05870Qv.A00(optString2), optString3, optString4);
                if (A012 instanceof C43761yu) {
                    ((C43761yu) A012).A01 = jSONObject.optInt("ci", 0);
                }
                arrayList.add(new AnonymousClass2LW(A012, A002, optInt2));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PAY: PaymentTransaction:Source:fromJsonString parsed ");
            sb2.append(arrayList.size());
            sb2.append(" sources");
            Log.d(sb2.toString());
            return arrayList;
        } catch (JSONException e) {
            Log.w("PAY: PaymentTransaction:Source:fromJsonString threw json exception in response: ", e);
            return null;
        }
    }

    public static boolean A06(AnonymousClass0MH r4) {
        C05900Qy r0;
        BigDecimal bigDecimal;
        if (r4 == null) {
            return true;
        }
        int i = r4.A02;
        if (i == 1000) {
            return false;
        }
        if (i == 4 || (r0 = r4.A06) == null || ((bigDecimal = r0.A00) != null && bigDecimal.intValue() == 0)) {
            return true;
        }
        return false;
    }

    public static boolean A07(String str) {
        return !TextUtils.isEmpty(str) && !"UNSET".equals(str);
    }

    public synchronized AbstractC05890Qx A08() {
        return AnonymousClass1VK.A01(this.A0E);
    }

    public synchronized void A09(int i, long j, String str, String str2, String str3) {
        this.A01 = i;
        if (j >= 0) {
            this.A05 = j;
            this.A0K = true;
            this.A0D = str;
            this.A0F = str2;
            this.A0B = str3;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: PaymentTransaction update called with invalid timestamp: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public synchronized void A0A(AbstractC43791yx r3, int i) {
        if (i > 0) {
            AbstractC43791yx r1 = this.A07;
            if (r1 == null) {
                this.A07 = r3;
                r1 = r3;
            }
            if (!(r1 instanceof AnonymousClass3Y3)) {
                ((AnonymousClass3XM) r1).A00 = i;
            }
        }
    }

    public synchronized void A0B(AbstractC43791yx r4, long j) {
        if (j > 0) {
            AbstractC43791yx r1 = this.A07;
            if (r1 == null) {
                this.A07 = r4;
                r1 = r4;
            }
            if (!(r1 instanceof AnonymousClass3Y3)) {
                ((AnonymousClass3XM) r1).A04 = j;
            } else {
                ((AnonymousClass3Y3) r1).A00 = j;
            }
        }
    }

    public synchronized void A0C(AnonymousClass0MH r10) {
        if (!TextUtils.isEmpty(r10.A0G)) {
            A0D(r10.A0G);
        }
        this.A04 = r10.A04;
        this.A0A = r10.A0A;
        this.A09 = r10.A09;
        this.A06 = r10.A06;
        this.A0E = r10.A0E;
        this.A02 = r10.A02;
        this.A0C = r10.A0C;
        this.A03 = r10.A03;
        this.A0N = r10.A0N;
        this.A0H = r10.A0H;
        this.A0M = r10.A0M;
        this.A08 = r10.A08;
        this.A0I = r10.A0I;
        this.A07 = r10.A07;
        A09(this.A01, this.A05, this.A0D, this.A0F, this.A0B);
    }

    public synchronized void A0D(String str) {
        AnonymousClass00E.A03(str);
        this.A0G = str;
        this.A0K = true;
    }

    public synchronized void A0E(ArrayList arrayList) {
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                this.A0J = arrayList;
            }
        }
    }

    public synchronized void A0F(boolean z) {
        this.A0K = z;
    }

    public synchronized boolean A0G() {
        int i = this.A02;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return true;
                }
                if (i == 10 || i == 20) {
                    for (int i2 : A0Q) {
                        if (i2 == this.A01) {
                            return false;
                        }
                    }
                    return true;
                } else if (i != 100) {
                    if (i != 200) {
                        return false;
                    }
                }
            }
            for (int i3 : A0P) {
                if (i3 == this.A01) {
                    return false;
                }
            }
            return true;
        }
        for (int i4 : A0R) {
            if (i4 == this.A01) {
                return false;
            }
        }
        return true;
    }

    public synchronized boolean A0H() {
        return this.A0K;
    }

    public synchronized boolean A0I() {
        int i;
        return this.A02 == 10 && ((i = this.A01) == 12 || i == 19);
    }

    public synchronized boolean A0J() {
        int i;
        return A0K() && ((i = this.A01) == 12 || i == 19);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r2 == 30) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0K() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r2 = r3.A02     // Catch:{ all -> 0x0017 }
            r0 = 20
            if (r2 == r0) goto L_0x0014
            r0 = 40
            if (r2 == r0) goto L_0x0014
            r0 = 10
            if (r2 == r0) goto L_0x0014
            r1 = 30
            r0 = 0
            if (r2 != r1) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            monitor-exit(r3)
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MH.A0K():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r3.A02 == 30) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0L() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r1 = r3.A01     // Catch:{ all -> 0x0015 }
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 == r0) goto L_0x0012
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x0012
            int r2 = r3.A02     // Catch:{ all -> 0x0015 }
            r1 = 30
            r0 = 0
            if (r2 != r1) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            monitor-exit(r3)
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MH.A0L():boolean");
    }

    public synchronized boolean A0M() {
        boolean z;
        String str = this.A0C;
        int i = this.A03;
        int A012 = A01(str);
        z = false;
        if (A012 >= i) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r1 != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0N() {
        /*
            r3 = this;
            monitor-enter(r3)
            X.0Qy r0 = r3.A06     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003f
            X.1yx r1 = r3.A07     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x003f
            boolean r0 = r1 instanceof X.AnonymousClass3XM     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x000f
            r1 = 0
            goto L_0x003c
        L_0x000f:
            X.3XM r1 = (X.AnonymousClass3XM) r1     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r1.A0B     // Catch:{ all -> 0x0042 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = r1.A09     // Catch:{ all -> 0x0042 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0039
            java.lang.String r1 = r1.A0E     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "FULL"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x003b
            boolean r0 = r3.A0G()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r3.A0B     // Catch:{ all -> 0x0042 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003b
        L_0x0039:
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            r0 = 0
            if (r1 == 0) goto L_0x0040
        L_0x003f:
            r0 = 1
        L_0x0040:
            monitor-exit(r3)
            return r0
        L_0x0042:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MH.A0N():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        if (r3 != 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        if (r9 <= r3) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0O(int r6, long r7, int r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            X.1yx r0 = r5.A07     // Catch:{ all -> 0x002d }
            r4 = 0
            if (r0 == 0) goto L_0x0010
            int r3 = r0.A03()     // Catch:{ all -> 0x002d }
        L_0x000a:
            int r1 = r5.A02     // Catch:{ all -> 0x002d }
            r0 = 5
            if (r1 != r0) goto L_0x0014
            goto L_0x0012
        L_0x0010:
            r3 = 0
            goto L_0x000a
        L_0x0012:
            if (r1 != r6) goto L_0x002a
        L_0x0014:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x001a
            if (r1 != r6) goto L_0x002a
        L_0x001a:
            long r1 = r5.A05     // Catch:{ all -> 0x002d }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002a
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002b
            if (r9 != 0) goto L_0x0028
            if (r3 == 0) goto L_0x002a
        L_0x0028:
            if (r9 <= r3) goto L_0x002b
        L_0x002a:
            r4 = 1
        L_0x002b:
            monitor-exit(r5)
            return r4
        L_0x002d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MH.A0O(int, long, int):boolean");
    }

    public synchronized boolean A0P(AnonymousClass0MH r5) {
        int i;
        AbstractC43791yx r0 = r5.A07;
        if (r0 != null) {
            i = r0.A03();
        } else {
            i = 0;
        }
        return A0O(r5.A02, r5.A05, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1.equals(r2.A09) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0Q(X.AbstractC007503q r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.whatsapp.jid.UserJid r1 = r3.A08()     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0018
            com.whatsapp.jid.UserJid r0 = r2.A0A     // Catch:{ all -> 0x001b }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0018
            com.whatsapp.jid.UserJid r0 = r2.A09     // Catch:{ all -> 0x001b }
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x001b }
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            monitor-exit(r2)
            return r0
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MH.A0Q(X.03q):boolean");
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("id: ");
        sb.append(this.A0G);
        sb.append(" key_remote_id: ");
        sb.append(this.A08);
        sb.append(" key_from_me: ");
        sb.append(this.A0M);
        sb.append(" key_id: ");
        sb.append(this.A0H);
        sb.append(" status: ");
        sb.append(this.A01);
        sb.append(" type: ");
        sb.append(this.A02);
        sb.append(" updateTs: ");
        sb.append(this.A05);
        sb.append(" initTs: ");
        sb.append(this.A04);
        sb.append(" error_code: ");
        sb.append(this.A0F);
        sb.append(" sender: ");
        sb.append(this.A0A);
        sb.append(" receiver: ");
        sb.append(this.A09);
        sb.append(" credential_id: ");
        sb.append(this.A0D);
        sb.append(" methods: ");
        sb.append(this.A0J);
        sb.append(" reqMsgKeyId: ");
        sb.append(this.A0I);
        sb.append(" metadata: ");
        sb.append(this.A07);
        sb.append(" country: ");
        sb.append(this.A0C);
        sb.append(" version: ");
        sb.append(this.A03);
        return sb.toString();
    }

    public synchronized void writeToParcel(Parcel parcel, int i) {
        int i2;
        String str;
        int i3;
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A05);
        parcel.writeString(this.A0E);
        C05900Qy r0 = this.A06;
        if (r0 != null) {
            i2 = r0.A00.scale();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        C05900Qy r02 = this.A06;
        String str2 = null;
        if (r02 != null) {
            str = r02.A00.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeString(this.A0G);
        UserJid userJid = this.A0A;
        parcel.writeString(userJid == null ? null : userJid.getRawString());
        UserJid userJid2 = this.A09;
        if (userJid2 != null) {
            str2 = userJid2.getRawString();
        }
        parcel.writeString(str2);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0B);
        parcel.writeList(this.A0J);
        parcel.writeString(AnonymousClass1VY.A0D(this.A08));
        int i4 = 0;
        if (this.A0M) {
            i4 = 1;
        }
        parcel.writeInt(i4);
        parcel.writeLong(this.A04);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A03);
        byte[] bArr = this.A0N;
        if (bArr != null) {
            i3 = bArr.length;
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeByteArray(this.A0N);
        parcel.writeParcelable(this.A07, 0);
    }
}
