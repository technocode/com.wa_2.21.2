package X;

import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.09M  reason: invalid class name */
public class AnonymousClass09M {
    public static volatile AnonymousClass09M A0C;
    public int A00 = 0;
    public final SparseIntArray A01 = new SparseIntArray();
    public final AnonymousClass009 A02;
    public final AnonymousClass09J A03;
    public final AnonymousClass09L A04;
    public final AnonymousClass09I A05;
    public final AnonymousClass09P A06;
    public final AnonymousClass09O A07 = new AnonymousClass09N();
    public final Object A08 = new Object();
    public final List A09 = new ArrayList();
    public final Map A0A = new HashMap();
    public final Map A0B = new HashMap();

    public AnonymousClass09M(AnonymousClass009 r4, AnonymousClass09I r5, AnonymousClass09J r6, AnonymousClass09L r7) {
        this.A02 = r4;
        this.A05 = r5;
        this.A03 = r6;
        this.A04 = r7;
        HandlerThread handlerThread = new HandlerThread("XmppMessageRouter", 1);
        handlerThread.start();
        this.A06 = new AnonymousClass09P(this, handlerThread.getLooper());
    }

    public static AnonymousClass09M A00() {
        if (A0C == null) {
            synchronized (AnonymousClass09M.class) {
                if (A0C == null) {
                    A0C = new AnonymousClass09M(AnonymousClass009.A00(), AnonymousClass09I.A01, AnonymousClass09J.A02, AnonymousClass09L.A00());
                }
            }
        }
        return A0C;
    }

    public static void A01(AnonymousClass09M r3, String str, boolean z) {
        AnonymousClass09O r0;
        if (r3 != null) {
            AnonymousClass008.A16("xmppIncomingMessageRouter/iq-delivery-failure; id=", str);
            if (z) {
                AnonymousClass09J r1 = r3.A03;
                AnonymousClass00E.A04(str, "Can't remove message with null id");
                List list = r1.A00;
                synchronized (list) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (str.equals(((AnonymousClass1WH) it.next()).A01)) {
                            it.remove();
                        }
                    }
                }
            }
            synchronized (r3.A08) {
                r0 = (AnonymousClass09O) r3.A0B.remove(str);
                if (r0 == null) {
                    r0 = (AnonymousClass09O) r3.A0A.remove(str);
                }
            }
            if (r0 != null) {
                r0.AEv(str);
            } else {
                AnonymousClass008.A18("xmppIncomingMessageRouter/ignoring failure due to missing callback for iqId:", str);
            }
        } else {
            throw null;
        }
    }

    public void A02(AnonymousClass0C0 r9) {
        int[] A6c = r9.A6c();
        List list = this.A09;
        int size = list.size();
        list.add(r9);
        for (int i : A6c) {
            SparseIntArray sparseIntArray = this.A01;
            if (sparseIntArray.get(i, -1) == -1) {
                sparseIntArray.put(i, size);
            } else {
                throw new IllegalArgumentException(AnonymousClass008.A0F("Already have registered handler for recv message type:", i));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r2 == r4.A07) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A08
            monitor-enter(r3)
            java.util.Map r0 = r4.A0B     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r0.remove(r5)     // Catch:{ all -> 0x0018 }
            X.09O r2 = (X.AnonymousClass09O) r2     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0012
            X.09O r1 = r4.A07     // Catch:{ all -> 0x0018 }
            r0 = 0
            if (r2 != r1) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            X.AnonymousClass00E.A07(r0)     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09M.A03(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r1 == r6.A07) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.lang.String r7, X.AnonymousClass09O r8, long r9, boolean r11) {
        /*
            r6 = this;
            java.lang.Object r3 = r6.A08
            monitor-enter(r3)
            java.util.Map r0 = r6.A0A     // Catch:{ all -> 0x005c }
            boolean r0 = r0.containsKey(r7)     // Catch:{ all -> 0x005c }
            r5 = 1
            r4 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000f
            r2 = 1
        L_0x000f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r1.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "Pending iq-callback for id:"
            r1.append(r0)     // Catch:{ all -> 0x005c }
            r1.append(r7)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005c }
            X.AnonymousClass00E.A0A(r2, r0)     // Catch:{ all -> 0x005c }
            java.util.Map r0 = r6.A0B     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r0.put(r7, r8)     // Catch:{ all -> 0x005c }
            X.09O r1 = (X.AnonymousClass09O) r1     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0032
            X.09O r0 = r6.A07     // Catch:{ all -> 0x005c }
            r2 = 0
            if (r1 != r0) goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r1.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "Pending request for id:"
            r1.append(r0)     // Catch:{ all -> 0x005c }
            r1.append(r7)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005c }
            X.AnonymousClass00E.A0A(r2, r0)     // Catch:{ all -> 0x005c }
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005a
            X.09P r1 = r6.A06     // Catch:{ all -> 0x005c }
            r0 = 4
            if (r11 != 0) goto L_0x0053
            r5 = 0
        L_0x0053:
            android.os.Message r0 = r1.obtainMessage(r0, r5, r4, r7)     // Catch:{ all -> 0x005c }
            r1.sendMessageDelayed(r0, r9)     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r3)     // Catch:{ all -> 0x005c }
            return
        L_0x005c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09M.A04(java.lang.String, X.09O, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r5.A0A.isEmpty() == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(boolean r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.A08
            monitor-enter(r4)
            java.util.Map r0 = r5.A0B     // Catch:{ all -> 0x004b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004b }
            r3 = 0
            if (r0 == 0) goto L_0x0015
            java.util.Map r0 = r5.A0A     // Catch:{ all -> 0x004b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004b }
            r2 = 0
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 1
        L_0x0016:
            if (r6 != 0) goto L_0x003f
            if (r2 != 0) goto L_0x003f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "xmppIncomingMessageRouter/resetIqIdCounter sendingChannelHasPendingXmpp:"
            r1.append(r0)     // Catch:{ all -> 0x004d }
            r1.append(r6)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = " hasPendingIqCallbacks:"
            r1.append(r0)     // Catch:{ all -> 0x004d }
            r1.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004d }
            com.whatsapp.util.Log.d(r0)     // Catch:{ all -> 0x004d }
            r5.A00 = r3     // Catch:{ all -> 0x004d }
            X.09P r1 = r5.A06     // Catch:{ all -> 0x004d }
            r0 = 4
            r1.removeMessages(r0)     // Catch:{ all -> 0x004d }
        L_0x003f:
            monitor-exit(r4)     // Catch:{ all -> 0x004d }
            X.09P r1 = r5.A06
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.sendToTarget()
            return
        L_0x004b:
            r0 = move-exception
            throw r0
        L_0x004d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09M.A05(boolean):void");
    }
}
