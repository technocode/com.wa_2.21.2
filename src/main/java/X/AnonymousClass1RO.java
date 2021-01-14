package X;

import android.graphics.Bitmap;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.1RO  reason: invalid class name */
public abstract class AnonymousClass1RO {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass1RK A03;
    public final AnonymousClass1RP A04;
    public final Object A05 = new Object();
    public final List A06;
    public final List A07;
    public final Map A08 = new HashMap();
    public final Stack A09 = new Stack();
    public final Stack A0A = new Stack();

    public AnonymousClass1RO(AnonymousClass02M r5, File file, AnonymousClass1RP r7, long j) {
        this.A02 = r5;
        this.A03 = new AnonymousClass1RK(file, j);
        this.A04 = r7;
        this.A06 = new ArrayList(4);
        this.A07 = new ArrayList(4);
        int i = 0;
        do {
            this.A07.add(new AnonymousClass1RN(this));
            this.A06.add(new AnonymousClass1RM(this));
            i++;
        } while (i < 4);
    }

    public void A00(AnonymousClass1RQ r6, boolean z) {
        AnonymousClass1RP r2 = this.A04;
        r2.AHB(r6);
        AnonymousClass1RK r0 = this.A03;
        Bitmap bitmap = (Bitmap) r0.A02.A03(r6.getId());
        if (bitmap != null) {
            if (bitmap != AnonymousClass1RK.A05) {
                r2.AHE(r6, bitmap, true);
                return;
            } else if (!z) {
                r2.AH5(r6);
                return;
            }
        }
        r2.ACx(r6);
        AnonymousClass00E.A01();
        synchronized (this.A05) {
            Map map = this.A08;
            AnonymousClass1RL r22 = (AnonymousClass1RL) map.get(r6.getId());
            if (r22 == null) {
                r22 = new AnonymousClass1RL(r6);
                map.put(r22.A03, r22);
            } else {
                r22.A05.put(r6, r6);
            }
            Stack stack = this.A09;
            stack.remove(r22);
            this.A0A.remove(r22);
            stack.push(r22);
            synchronized (stack) {
                stack.notify();
            }
        }
        if (!this.A00) {
            for (Thread thread : this.A06) {
                if (thread.getState() == Thread.State.NEW) {
                    thread.start();
                }
            }
            this.A00 = true;
        }
        if (!this.A01) {
            for (Thread thread2 : this.A07) {
                if (thread2.getState() == Thread.State.NEW) {
                    thread2.start();
                }
            }
            this.A01 = true;
        }
    }

    public void A01(boolean z) {
        for (Thread thread : this.A07) {
            thread.interrupt();
        }
        for (Thread thread2 : this.A06) {
            thread2.interrupt();
        }
        AnonymousClass1RK r0 = this.A03;
        if (r0 != null) {
            r0.A03(z);
        }
        this.A01 = false;
        this.A00 = false;
    }
}
