package com.google.firebase.iid;

import X.AnonymousClass1Em;
import X.AnonymousClass1Ep;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;

public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public static int A00 = 1;
    public static AnonymousClass1Ep A01;
    public static AnonymousClass1Ep A02;
    public static final SparseArray A03 = new SparseArray();

    public FirebaseInstanceIdReceiver() {
    }

    public FirebaseInstanceIdReceiver(int i) {
    }

    public static void A00(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        AnonymousClass1Ep r4;
        String str2;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Binding to service: ".concat(valueOf);
            } else {
                str2 = new String("Binding to service: ");
            }
            Log.d("FirebaseInstanceId", str2);
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                r4 = A02;
                if (r4 == null) {
                    r4 = new AnonymousClass1Ep(context, str);
                    A02 = r4;
                }
            } else {
                r4 = A01;
                if (r4 == null) {
                    r4 = new AnonymousClass1Ep(context, str);
                    A01 = r4;
                }
            }
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        synchronized (r4) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
            }
            r4.A04.add(new AnonymousClass1Em(intent, goAsync, r4.A05));
            r4.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0201, code lost:
        if (r1 == null) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x023e, code lost:
        if (r4.equals(r5) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r13.getApplicationInfo().targetSdkVersion < 26) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c0, code lost:
        if (r4.equals("com.google.firebase.MESSAGING_EVENT") == false) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0108 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a9 A[Catch:{ SecurityException -> 0x022f, IllegalStateException -> 0x020c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r13, android.content.Intent r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 601
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.A01(android.content.Context, android.content.Intent, java.lang.String):void");
    }

    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (!(parcelableExtra instanceof Intent) || (intent2 = (Intent) parcelableExtra) == null) {
                A01(context, intent, intent.getAction());
            } else {
                A01(context, intent2, intent.getAction());
            }
        }
    }
}
