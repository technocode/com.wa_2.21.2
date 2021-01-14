package com.whatsapp.cron;

import X.AbstractC02140Au;
import X.AnonymousClass00J;
import X.AnonymousClass00K;
import X.AnonymousClass01I;
import X.AnonymousClass03P;
import X.AnonymousClass0AV;
import X.AnonymousClass0HN;
import X.AnonymousClass0HO;
import X.AnonymousClass0JL;
import X.AnonymousClass0KZ;
import X.AnonymousClass2K4;
import X.C002101e;
import X.C014708f;
import X.C02130At;
import X.C03270Fn;
import X.C39321rJ;
import X.C43411yK;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class HourlyCronWorker extends Worker {
    public HourlyCronWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: finally extract failed */
    public static void A00() {
        if (AnonymousClass00K.A02 == null) {
            synchronized (AnonymousClass00K.class) {
                if (AnonymousClass00K.A02 == null) {
                    AnonymousClass00J r1 = AnonymousClass00K.A01;
                    if (r1 != null) {
                        AnonymousClass00K.A02 = new AnonymousClass00K(r1);
                    } else {
                        throw new IllegalStateException("Not initialized.");
                    }
                }
            }
        }
        AnonymousClass00K r12 = AnonymousClass00K.A02;
        AnonymousClass2K4 A00 = AnonymousClass2K4.A00();
        A00.A01("/cron/hourly/started");
        AnonymousClass00J r13 = r12.A00;
        ConcurrentMap concurrentMap = r13.A01;
        Set<AbstractC02140Au> set = (Set) concurrentMap.get(AbstractC02140Au.class);
        if (set == null) {
            synchronized (AbstractC02140Au.class) {
                set = (Set) concurrentMap.get(AbstractC02140Au.class);
                if (set == null) {
                    ThreadLocal threadLocal = r13.A00;
                    Set set2 = (Set) threadLocal.get();
                    if (set2 == null) {
                        set2 = new HashSet();
                        threadLocal.set(set2);
                    }
                    if (!set2.contains(AbstractC02140Au.class)) {
                        set2.add(AbstractC02140Au.class);
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            AbstractC02140Au[] r11 = new AbstractC02140Au[6];
                            r11[0] = new C39321rJ(C002101e.A00(), AnonymousClass03P.A00(), C03270Fn.A00(), AnonymousClass0AV.A00());
                            r11[1] = AnonymousClass0KZ.A00();
                            r11[2] = AnonymousClass0JL.A00();
                            r11[3] = C02130At.A00();
                            r11[4] = AnonymousClass0HO.A00();
                            if (C43411yK.A04 == null) {
                                synchronized (C43411yK.class) {
                                    if (C43411yK.A04 == null) {
                                        C43411yK.A04 = new C43411yK(AnonymousClass01I.A00(), C002101e.A00(), AnonymousClass0HN.A00(), C014708f.A00());
                                    }
                                }
                            }
                            r11[5] = C43411yK.A04;
                            linkedHashSet.addAll(Arrays.asList(r11));
                            set = Collections.unmodifiableSet(linkedHashSet);
                            set2.remove(AbstractC02140Au.class);
                            concurrentMap.put(AbstractC02140Au.class, set);
                        } catch (Throwable th) {
                            set2.remove(AbstractC02140Au.class);
                            throw th;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Recursive attempt to create ");
                        sb.append(AbstractC02140Au.class);
                        sb.append(" multibinding.");
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
        }
        for (AbstractC02140Au r0 : set) {
            r0.AGf();
        }
        A00.A01("/cron/hourly/completed");
    }
}
