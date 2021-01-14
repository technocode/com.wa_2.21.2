package com.whatsapp.push;

import X.AnonymousClass009;
import X.AnonymousClass00D;
import X.AnonymousClass013;
import X.AnonymousClass03P;
import X.AnonymousClass0AR;
import X.AnonymousClass0BB;
import X.AnonymousClass0IZ;
import X.AnonymousClass0PE;
import X.AnonymousClass0PF;
import X.C000300f;
import X.C002701k;
import X.C64662yY;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

public class RegistrationIntentService extends AnonymousClass0PE {
    public C002701k A00 = C002701k.A00();
    public C64662yY A01 = new C64662yY();
    public final AnonymousClass009 A02 = AnonymousClass009.A00();
    public final AnonymousClass013 A03 = AnonymousClass013.A01;
    public final C000300f A04 = C000300f.A00();
    public final AnonymousClass03P A05 = AnonymousClass03P.A00();
    public final AnonymousClass00D A06 = AnonymousClass00D.A00();
    public final AnonymousClass0AR A07 = AnonymousClass0AR.A00();
    public final AnonymousClass0BB A08 = AnonymousClass0BB.A00();
    public final AnonymousClass0IZ A09 = AnonymousClass0IZ.A01();

    public static void A00(Context context) {
        Log.i("GCM: refreshing gcm token");
        AnonymousClass0PF.A01(context, RegistrationIntentService.class, 4, new Intent("com.whatsapp.action.REFRESH", null, context, RegistrationIntentService.class));
    }

    public static void A02(Context context, String str) {
        StringBuilder sb = new StringBuilder("GCM: verifying registration; serverRegistrationId=");
        sb.append(str);
        Log.i(sb.toString());
        Intent intent = new Intent("com.whatsapp.action.VERIFY", null, context, RegistrationIntentService.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("registrationId", str);
        }
        if (!TextUtils.isEmpty(null)) {
            intent.putExtra("mutedChatsHash", (String) null);
        }
        AnonymousClass0PF.A01(context, RegistrationIntentService.class, 4, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0239, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x023f, code lost:
        if ((!r5.equalsIgnoreCase(r9)) != false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0241, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config with new muted chats");
        r31.A07.A0Q(r1, "gcm", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024f, code lost:
        r12.edit().putString("c2dm_reg_id", r1).putInt("c2dm_app_vers", 210204500).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x025e, code lost:
        if (r23 != false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0264, code lost:
        if (android.text.TextUtils.equals(r1, r10) != false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0266, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config with new token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0275, code lost:
        if (r31.A00.A0E(283) == false) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0277, code lost:
        r31.A07.A0Q(r1, "gcm", r31.A08.A0D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0283, code lost:
        r31.A07.A0Q(r1, "gcm", null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0289, code lost:
        if (r20 == false) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x028b, code lost:
        if (r22 == false) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x028d, code lost:
        if (r11 != false) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0294, code lost:
        if (r12.getBoolean("saved_gcm_token_server_unreg", false) != false) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0296, code lost:
        com.whatsapp.util.Log.i("GCM: verifying tokenUnregisteredOnServer fetched saved token");
        r31.A02.A04("gcm-retrieved-saved-token", null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r12.edit().putBoolean("saved_gcm_token_server_unreg", true).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02b1, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02ba, code lost:
        throw new java.lang.AssertionError("GCM: empty token returned but no exception thrown");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bc, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02bd, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02c2, code lost:
        if (r2.getMessage() == null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02dc, code lost:
        com.whatsapp.util.Log.e("GCM: security exception caught; switching to long-connect", r2);
        r0.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e6, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02e7, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0306, code lost:
        if (r1.equals("SERVICE_NOT_AVAILABLE") != false) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x030f, code lost:
        if (r1.equals("QUOTA_EXCEEDED") != false) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0318, code lost:
        if (r1.equals("PHONE_REGISTRATION_ERROR") != false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0322, code lost:
        if (r1.equals("AUTHENTICATION_FAILED") != false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x032b, code lost:
        if (r1.equals("INVALID_PARAMETERS") != false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0334, code lost:
        if (r1.equals("INTERNAL_SERVER_ERROR") != false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x033d, code lost:
        if (r1.equals("TIMEOUT") != false) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0346, code lost:
        if (r1.equals("BACKOFF") != false) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0348, code lost:
        r5 = java.lang.Math.min(r32.getLongExtra("delay_ms", 15000), 86400000L);
        r32.putExtra("delay_ms", 2 * r5);
        r3 = r31.A05.A02();
        r2 = android.app.PendingIntent.getService(r31, 0, r32, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0366, code lost:
        if (r3 == null) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0368, code lost:
        r3.cancel(r2);
        r3.set(3, android.os.SystemClock.elapsedRealtime() + r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x037a, code lost:
        if (r1.equals("TOO_MANY_REGISTRATIONS") != false) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x037c, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("GCM: attempted to register for GCM but registration count was exceeded already; exceptionMessage=");
        r1.append(r5.getMessage());
        com.whatsapp.util.Log.e(r1.toString());
        r0.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x039e, code lost:
        if (r1.equals("ACCOUNT_MISSING") != false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03a0, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("GCM: attempted to register for GCM but received undocumented error; exceptionMessage=");
        r1.append(r5.getMessage());
        r1.append("; playServicesAvailable=");
        r1.append(X.AnonymousClass0IZ.A00(r31));
        com.whatsapp.util.Log.e(r1.toString());
        r0.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03d9, code lost:
        com.whatsapp.util.Log.w("RegistrationIntentService/onHandleWork AlarmManager is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007e, code lost:
        if (r24 != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0085, code lost:
        if (android.text.TextUtils.equals(r10, r7) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r21 = android.text.TextUtils.isEmpty(r7);
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (210204500 == r5) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        if (r22 != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        if (r21 != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        if (r1 != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        if (r0 == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        if (r20 == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a1, code lost:
        if (r22 == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a3, code lost:
        if (r21 != false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        if (r12.getBoolean("saved_gcm_token_server_unreg", false) == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (r31.A04.A0D(X.AbstractC000400g.A0k) == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("GCM: verifying tokenUnregisteredOnServer deleting savedToken:");
        r1.append(r7);
        com.whatsapp.util.Log.i(r1.toString());
        r0 = r31.A03.A00;
        r15 = com.google.firebase.iid.FirebaseInstanceId.getInstance(X.AnonymousClass05T.A00());
        r19 = "FCM";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d9, code lost:
        if (r15 == null) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e3, code lost:
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e9, code lost:
        if (r19.isEmpty() != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r19.equalsIgnoreCase("fcm") != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r19.equalsIgnoreCase("gcm") == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r19 = "*";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ff, code lost:
        r18 = com.google.firebase.iid.FirebaseInstanceId.A01();
        com.google.firebase.iid.FirebaseInstanceId.A00(r0, r19);
        r14 = r15.A00;
        r13 = new android.os.Bundle();
        r13.putString("delete", "1");
        r15.A04(X.C012407e.A00(r14.A01(r14.A02(r18, r0, r19, r13))));
        r13 = com.google.firebase.iid.FirebaseInstanceId.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0131, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r1 = X.C012207c.A01(r0, r19);
        r0 = r13.A01.edit();
        r0.remove(r1);
        r0.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0146, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0152, code lost:
        throw new java.io.IOException("MAIN_THREAD");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0155, code lost:
        r12.edit().putBoolean("saved_gcm_token_server_unreg", false).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0160, code lost:
        r1 = r31.A01;
        r11 = r31.A03.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0166, code lost:
        if (r1 == null) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0168, code lost:
        r1 = com.google.firebase.iid.FirebaseInstanceId.getInstance(X.AnonymousClass05T.A00()).A05(r11, "FCM");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017a, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017c, code lost:
        r11 = new java.lang.StringBuilder();
        r11.append("GCM: token retrieved successfully; token=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0186, code lost:
        if (r1 == null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0189, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018b, code lost:
        r0 = r1.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018f, code lost:
        r11.append(r0);
        r11.append(" bytes; applicationVersion=");
        r11.append(210204500);
        com.whatsapp.util.Log.i(r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a1, code lost:
        if (r21 == false) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a3, code lost:
        com.whatsapp.util.Log.i("GCM: no previously saved token");
        r0.A0R(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ae, code lost:
        r11 = !android.text.TextUtils.equals(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b4, code lost:
        if (r20 != false) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b6, code lost:
        if (r11 != false) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c0, code lost:
        if (r31.A00.A0E(283) == false) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c2, code lost:
        if (r24 == false) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c4, code lost:
        r9 = r32.getStringExtra("mutedChatsHash");
        r11 = r31.A08;
        r8 = r11.A0D();
        r6 = !android.text.TextUtils.isEmpty(r9);
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01db, code lost:
        if (r8.size() <= 0) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01dd, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01de, code lost:
        if (r6 != false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e0, code lost:
        if (r0 == false) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e3, code lost:
        if (r0 == false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e5, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e6, code lost:
        if (r11 == null) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r6 = java.security.MessageDigest.getInstance("SHA-256");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ee, code lost:
        r5 = java.nio.charset.Charset.forName("UTF-8");
        r12 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01fc, code lost:
        if (r12.hasNext() == false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01fe, code lost:
        r11 = (X.C29201Xm) r12.next();
        r6.update(r11.A00.getRawString().getBytes(r5));
        r6.update(r11.A01.toString().getBytes(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021f, code lost:
        r5 = new byte[6];
        java.lang.System.arraycopy(r6.digest(), 0, r5, 0, 6);
        r5 = android.util.Base64.encodeToString(r5, 2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02bd A[ExcHandler: SecurityException (r2v2 'e' java.lang.SecurityException A[CUSTOM_DECLARE]), Splitter:B:34:0x00a5] */
    @Override // X.AnonymousClass0PF
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.content.Intent r32) {
        /*
        // Method dump skipped, instructions count: 1052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.push.RegistrationIntentService.A05(android.content.Intent):void");
    }
}
