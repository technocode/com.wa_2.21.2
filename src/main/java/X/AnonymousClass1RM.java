package X;

import android.graphics.Bitmap;
import android.os.Process;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.1RM  reason: invalid class name */
public class AnonymousClass1RM extends Thread {
    public final /* synthetic */ AnonymousClass1RO A00;

    public AnonymousClass1RM(AnonymousClass1RO r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass1RL r4;
        Process.setThreadPriority(10);
        do {
            try {
                AnonymousClass1RO r5 = this.A00;
                Stack stack = r5.A09;
                synchronized (stack) {
                    if (stack.size() == 0) {
                        stack.wait();
                    }
                }
                if (stack.size() != 0) {
                    Object obj = r5.A05;
                    synchronized (obj) {
                        r4 = stack.size() != 0 ? (AnonymousClass1RL) stack.pop() : null;
                    }
                    if (r4 != null) {
                        ConcurrentMap concurrentMap = r4.A05;
                        if (concurrentMap.size() != 0) {
                            String str = r4.A03;
                            String A01 = C007603r.A01(str);
                            if (A01 != null) {
                                AnonymousClass1RK r2 = r5.A03;
                                Bitmap A002 = r2.A00(A01, r4.A01, r4.A00);
                                if (A002 == null) {
                                    synchronized (obj) {
                                        for (AnonymousClass1RQ r1 : concurrentMap.values()) {
                                            if (r1.A4C()) {
                                                if (r1.getId().equals(str)) {
                                                    concurrentMap.remove(r1);
                                                }
                                                r5.A02.A02.post(new RunnableEBaseShape2S0300000_I1(null, Collections.singletonList(r1), r5, 16));
                                            }
                                        }
                                        if (!r4.A06.get() && concurrentMap.size() != 0) {
                                            Stack stack2 = r5.A0A;
                                            stack2.remove(r4);
                                            stack2.push(r4);
                                            r4.A02 = new C50002Ta((byte) 1);
                                            synchronized (stack2) {
                                                stack2.notify();
                                            }
                                        }
                                    }
                                } else {
                                    AnonymousClass08V r12 = r2.A02;
                                    synchronized (r12) {
                                        r12.A07(str, A002);
                                        r12.A01();
                                        r12.A00();
                                    }
                                    synchronized (obj) {
                                        r5.A08.remove(str);
                                        if (concurrentMap.size() != 0) {
                                            ArrayList arrayList = new ArrayList(concurrentMap.values());
                                            concurrentMap.clear();
                                            RunnableEBaseShape2S0300000_I1 runnableEBaseShape2S0300000_I1 = new RunnableEBaseShape2S0300000_I1(A002, arrayList, r5, 16);
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("bitmaploader/load-success from disk ");
                                            sb.append(r4.A04);
                                            Log.d(sb.toString());
                                            r5.A02.A02.post(runnableEBaseShape2S0300000_I1);
                                        }
                                    }
                                }
                            } else {
                                throw null;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        } while (!Thread.interrupted());
    }
}
