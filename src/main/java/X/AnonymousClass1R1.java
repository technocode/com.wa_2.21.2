package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* renamed from: X.1R1  reason: invalid class name */
public class AnonymousClass1R1 {
    public static final Set A00 = new HashSet();

    public static Object A00(AbstractC03860Ib r1, AbstractC27641Qv r2, String str) {
        return A01(r1, r2, str, 14);
    }

    public static Object A01(AbstractC03860Ib r7, AbstractC27641Qv r8, String str, int i) {
        AnonymousClass0FA r3 = new AnonymousClass0FA(new Random(), i, 2147483647L);
        try {
            Thread currentThread = Thread.currentThread();
            Set set = A00;
            synchronized (set) {
                set.add(currentThread);
            }
            set.size();
            int i2 = 0;
            while (true) {
                if (r7 != null && !r7.A00()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-retry-task/condition-failed/");
                    sb.append(r7);
                    Log.i(sb.toString());
                    break;
                }
                try {
                    Object A002 = r8.A00();
                    if (A002 != null) {
                        if (r3.A00() > 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("gdrive-retry-task/execute/attempt-");
                            sb2.append(r3.A00());
                            sb2.append("/success: ");
                            sb2.append(str);
                            Log.i(sb2.toString());
                        }
                        A03(currentThread);
                        return A002;
                    }
                } catch (C41541vE e) {
                    i2++;
                    Log.e("gdrive-retry-task/execute", e);
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("gdrive-retry-task/execute/attempt-");
                sb3.append(r3.A00());
                sb3.append("/failed: ");
                sb3.append(str);
                Log.i(sb3.toString());
                Long A01 = r3.A01();
                if (A01 != null) {
                    try {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("gdrive/gdrive-retry-task backoff for ");
                        sb4.append(A01);
                        sb4.append(" milliseconds");
                        Log.i(sb4.toString());
                        Thread.sleep(A01.longValue());
                    } catch (InterruptedException e2) {
                        Log.i("gdrive-retry-task/interrupted", e2);
                    }
                } else if (i2 > 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Google Drive failures/total attempts: ");
                    sb5.append(i2);
                    sb5.append("/");
                    sb5.append(r3.A00());
                    throw new C41551vF(sb5.toString());
                }
            }
            A03(currentThread);
            return null;
        } catch (Throwable th) {
            A03(Thread.currentThread());
            throw th;
        }
    }

    public static void A02() {
        Set<Thread> set = A00;
        synchronized (set) {
            for (Thread thread : set) {
                thread.interrupt();
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("gdrive-retry-task/interrupt-active-tasks/size/");
        A0S.append(set.size());
        Log.i(A0S.toString());
    }

    public static void A03(Thread thread) {
        Set set = A00;
        synchronized (set) {
            set.remove(thread);
        }
        set.size();
    }
}
