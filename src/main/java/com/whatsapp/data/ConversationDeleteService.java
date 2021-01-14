package com.whatsapp.data;

import X.AbstractIntentServiceC29181Xk;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass01K;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass02Y;
import X.AnonymousClass03E;
import X.AnonymousClass0A8;
import X.AnonymousClass0BS;
import X.AnonymousClass2L6;
import X.C000300f;
import X.C002101e;
import X.C003701u;
import X.C004302a;
import X.C006903j;
import X.C014408c;
import X.C02100Aq;
import X.C28551Ut;
import X.C47882Kb;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class ConversationDeleteService extends AbstractIntentServiceC29181Xk {
    public long A00;
    public final Handler A01;
    public final C014408c A02 = C014408c.A00();
    public final C006903j A03 = C006903j.A00();
    public final AnonymousClass0A8 A04;
    public final AnonymousClass01K A05;
    public final C02100Aq A06;
    public final AnonymousClass01T A07;
    public final AnonymousClass2L6 A08;
    public final AnonymousClass00T A09 = C002101e.A00();
    public final ConcurrentHashMap A0A;
    public final AtomicInteger A0B;
    public final AtomicInteger A0C;
    public final AtomicInteger A0D;

    public ConversationDeleteService() {
        super(ConversationDeleteService.class.getCanonicalName());
        C000300f.A00();
        this.A05 = AnonymousClass01K.A00();
        this.A06 = C02100Aq.A00();
        this.A08 = AnonymousClass2L6.A00();
        this.A04 = AnonymousClass0A8.A00;
        this.A07 = AnonymousClass01T.A00();
        this.A01 = new Handler(Looper.myLooper());
        this.A0B = new AtomicInteger(0);
        this.A0D = new AtomicInteger(0);
        this.A0A = new ConcurrentHashMap();
        this.A0C = new AtomicInteger(3);
    }

    public static void A00(Context context, String str, C28551Ut r6) {
        Log.i("conversation-delete-service/start-service");
        Intent intent = new Intent(context, ConversationDeleteService.class);
        intent.setAction(str);
        intent.putExtra("job_id", r6.A06);
        intent.putExtra("jid_to_delete", r6.A07.getRawString());
        C004302a.A06(context, intent);
    }

    public void A01(AnonymousClass02N r13, int i) {
        int max;
        this.A0C.set(2);
        C47882Kb r2 = (C47882Kb) this.A0A.get(r13);
        synchronized (r2) {
            int i2 = r2.A00;
            max = Math.max(0, i - i2);
            r2.A00 = i2 + max;
            r2.A01 -= max;
        }
        AtomicInteger atomicInteger = this.A0B;
        atomicInteger.addAndGet(max);
        AtomicInteger atomicInteger2 = this.A0D;
        if (atomicInteger2.get() == 0 || atomicInteger.get() > atomicInteger2.get()) {
            Log.w("conversation-delete-service/delete-progress/totalMessagesAllJids not updated.");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.A00 >= 250) {
            this.A00 = uptimeMillis;
            int i3 = (atomicInteger.get() * 100) / atomicInteger2.get();
            AnonymousClass01X r10 = super.A01;
            A02(r10.A06(R.string.delete_wait_progress), r10.A0D(R.string.delete_wait_progress_text_with_percentage, Integer.valueOf(atomicInteger.get()), Integer.valueOf(atomicInteger2.get()), r10.A0H().format(((double) i3) / 100.0d)), 3, i3);
        }
    }

    public final void A02(String str, String str2, int i, int i2) {
        AnonymousClass03E A002 = AnonymousClass0BS.A00(this);
        A002.A0J = "other_notifications@1";
        A002.A03 = -1;
        A002.A07.icon = R.drawable.notifybar;
        if (Build.VERSION.SDK_INT >= 21) {
            A002.A0I = "progress";
            A002.A06 = -1;
        }
        if (i == 2) {
            A002.A05 = 100;
            A002.A04 = i2;
            A002.A0T = true;
        } else if (i == 3) {
            A002.A05 = 100;
            A002.A04 = i2;
            A002.A0T = false;
        } else {
            throw new IllegalStateException(AnonymousClass008.A0F("unexpected value for progress bar style ", i));
        }
        A002.A06(16, false);
        A002.A06(2, true);
        A002.A0A(str);
        A002.A09(str2);
        if (C003701u.A0D()) {
            startForeground(13, A002.A01());
        } else {
            this.A01.post(new RunnableEBaseShape7S0200000_I1_2(this, A002, 39));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0298, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x029c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02e0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02e7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02ee, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x013b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x013c, code lost:
        if (r3 != null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0141, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0144, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0148, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cc, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C28551Ut r36) {
        /*
        // Method dump skipped, instructions count: 760
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.ConversationDeleteService.A03(X.1Ut):boolean");
    }

    public void onCreate() {
        Log.i("conversation-delete-service/onCreate");
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("conversation-delete-service/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x018c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0190, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0197, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x019b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0162, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0166, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0171, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r16) {
        /*
        // Method dump skipped, instructions count: 413
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.ConversationDeleteService.onHandleIntent(android.content.Intent):void");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        StringBuilder sb = new StringBuilder("conversation-delete-service/startcommand intent=");
        sb.append(intent);
        Log.i(sb.toString());
        if (intent == null || (action = intent.getAction()) == null) {
            Log.e("conversation-delete-service/start-command invalid action is null");
            return super.onStartCommand(intent, i, i2);
        }
        int hashCode = action.hashCode();
        if (hashCode == 1096596436 ? !action.equals("action_delete") : hashCode != 1835767556 || !action.equals("action_clear")) {
            AnonymousClass008.A17("conversation-delete-service/start-command invalid action=", action);
        } else {
            try {
                AnonymousClass02N A002 = AnonymousClass02N.A00(intent.getStringExtra("jid_to_delete"));
                this.A0A.putIfAbsent(A002, new C47882Kb());
                this.A09.ANF(new RunnableEBaseShape7S0200000_I1_2(this, A002, 38));
                if (this.A0C.compareAndSet(3, 1) || Build.VERSION.SDK_INT >= 26) {
                    A02(super.A01.A06(R.string.delete_wait_progress), "", 2, 0);
                }
            } catch (AnonymousClass02Y e) {
                StringBuilder sb2 = new StringBuilder("conversation-delete-service/start-command invalid jid, action=");
                sb2.append(action);
                Log.e(sb2.toString(), e);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
