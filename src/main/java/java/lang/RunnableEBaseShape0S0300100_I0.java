package java.lang;

import X.AnonymousClass05T;
import X.C012807i;
import android.content.Context;
import android.os.PowerManager;
import com.google.firebase.iid.FirebaseInstanceId;

public class RunnableEBaseShape0S0300100_I0 extends RunnableEmptyBase implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public RunnableEBaseShape0S0300100_I0(FirebaseInstanceId firebaseInstanceId, C012807i r6, long j) {
        this.A04 = 0;
        this.A03 = firebaseInstanceId;
        this.A01 = r6;
        this.A00 = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) A00().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.A02 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public RunnableEBaseShape0S0300100_I0(Object obj, Object obj2, Object obj3, long j, int i) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = j;
    }

    public final Context A00() {
        AnonymousClass05T r0 = ((FirebaseInstanceId) this.A03).A02;
        r0.A03();
        return r0.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x023f, code lost:
        if (r1.length() == 0) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0241, code lost:
        r0 = "/topics/".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0245, code lost:
        r4.A04(X.C012407e.A00(r12.A01(r12.A02(r13, r11, r0, r7))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0258, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.A03() == false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x025a, code lost:
        android.util.Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0261, code lost:
        r0 = new java.lang.String("/topics/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0267, code lost:
        r1 = new java.lang.String("/topics/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x026d, code lost:
        r1 = com.google.firebase.iid.FirebaseInstanceId.A00(X.C012007a.A00(r4.A02), "*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x027b, code lost:
        if (r4.A0B(r1) != false) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x027d, code lost:
        r13 = com.google.firebase.iid.FirebaseInstanceId.A01();
        r12 = r1.A01;
        r11 = r4.A00;
        r7 = new android.os.Bundle();
        r1 = java.lang.String.valueOf(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0294, code lost:
        if (r1.length() == 0) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0296, code lost:
        r1 = "/topics/".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x029a, code lost:
        r7.putString("gcm.topic", r1);
        r1 = java.lang.String.valueOf(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02a7, code lost:
        if (r1.length() == 0) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02a9, code lost:
        r0 = "/topics/".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ad, code lost:
        r4.A04(X.C012407e.A00(r11.A01(r11.A02(r13, r12, r0, r7))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02c0, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.A03() == false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02c2, code lost:
        android.util.Log.d("FirebaseInstanceId", "subscribe operation succeeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c9, code lost:
        r0 = new java.lang.String("/topics/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02cf, code lost:
        r1 = new java.lang.String("/topics/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02d5, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r7 = (X.C24611Bq) r2.A02.remove(java.lang.Integer.valueOf(r2.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r6 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02e6, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r12 = r6.A01;
        r1 = r12.getString("topic_operaion_queue", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r15 = r14.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02f8, code lost:
        if (r15 == 0) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02fa, code lost:
        r0 = ",".concat(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0302, code lost:
        if (r1.startsWith(r0) == false) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0305, code lost:
        r0 = new java.lang.String(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x030b, code lost:
        if (r15 == 0) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x030e, code lost:
        r0 = new java.lang.String(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0314, code lost:
        r0 = ",".concat(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r12.edit().putString("topic_operaion_queue", r1.substring(r0.length())).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x032b, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x032d, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x032e, code lost:
        r2.A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0333, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0334, code lost:
        if (r7 == null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0336, code lost:
        r7.A00.A08(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x033e, code lost:
        r4.A0A(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0347, code lost:
        throw new java.io.IOException("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x034d, code lost:
        throw new java.io.IOException("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x034e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x034f, code lost:
        r1 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x035d, code lost:
        if (r1.length() != 0) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x035f, code lost:
        r0 = "Topic sync failed: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0363, code lost:
        android.util.Log.e("FirebaseInstanceId", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0367, code lost:
        r0 = new java.lang.String("Topic sync failed: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ef, code lost:
        if (r1 == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c9, code lost:
        r6 = r14.split("!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d1, code lost:
        if (r6.length != 2) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d3, code lost:
        r7 = r6[0];
        r15 = r6[1];
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r6 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01de, code lost:
        if (r6 == 83) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e2, code lost:
        if (r6 != 85) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ea, code lost:
        if (r7.equals("U") == false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ec, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f4, code lost:
        if (r7.equals("S") == false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f6, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01fa, code lost:
        if (r1 == 0) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01fc, code lost:
        if (r1 != 1) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01fe, code lost:
        r1 = com.google.firebase.iid.FirebaseInstanceId.A00(X.C012007a.A00(r4.A02), "*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x020c, code lost:
        if (r4.A0B(r1) != false) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x020e, code lost:
        r13 = com.google.firebase.iid.FirebaseInstanceId.A01();
        r12 = r4.A00;
        r11 = r1.A01;
        r7 = new android.os.Bundle();
        r1 = java.lang.String.valueOf(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0225, code lost:
        if (r1.length() == 0) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0227, code lost:
        r1 = "/topics/".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x022b, code lost:
        r7.putString("gcm.topic", r1);
        r7.putString("delete", "1");
        r1 = java.lang.String.valueOf(r15);
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 1346
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape0S0300100_I0.run():void");
    }
}
