package X;

import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;

/* renamed from: X.0Rb  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC05930Rb {
    public boolean A00(AnonymousClass0RZ r12) {
        boolean z;
        boolean z2;
        if (this instanceof C05920Ra) {
            AnonymousClass0RY r122 = (AnonymousClass0RY) r12;
            C001801b.A1P(r122);
            r122.realtimeMs = SystemClock.elapsedRealtime();
            r122.uptimeMs = SystemClock.uptimeMillis();
            return true;
        } else if (this instanceof C05970Rf) {
            C05970Rf r4 = (C05970Rf) this;
            C05960Re r123 = (C05960Re) r12;
            synchronized (r4) {
                if (r4.A00) {
                    AbstractC05990Rh r6 = r4.A01;
                    long[] jArr = r4.A02;
                    if (r6.A01(jArr)) {
                        long[] jArr2 = r4.A03;
                        int i = 0;
                        while (true) {
                            int length = jArr.length;
                            if (i >= length) {
                                System.arraycopy(jArr, 0, jArr2, 0, length);
                                z = true;
                                break;
                            } else if (jArr[i] < jArr2[i]) {
                                StringBuilder A0S = AnonymousClass008.A0S("Network Bytes decreased from ");
                                A0S.append(Arrays.toString(jArr2));
                                A0S.append(" to ");
                                A0S.append(Arrays.toString(jArr));
                                Log.e("NetworkMetricsCollector", A0S.toString(), null);
                                z = false;
                                break;
                            } else {
                                i++;
                            }
                        }
                        r4.A00 = z;
                        if (!z) {
                            return false;
                        }
                        boolean A00 = r6.A00();
                        r123.mobileBytesTx = 0;
                        r123.mobileBytesRx = 0;
                        r123.wifiBytesTx = 0;
                        r123.wifiBytesRx = 0;
                        C05970Rf.A00(r123, jArr, 0);
                        if (A00) {
                            C05970Rf.A00(r123, jArr, 4);
                        }
                        return true;
                    }
                }
                return false;
            }
        } else if (!(this instanceof C05950Rd)) {
            C06120Rv r7 = (C06120Rv) this;
            C06130Rx r124 = (C06130Rx) r12;
            C001801b.A1P(r124);
            AnonymousClass05W r62 = r124.mMetricsMap;
            int i2 = r62.A00;
            boolean z3 = false;
            for (int i3 = 0; i3 < i2; i3++) {
                Class cls = (Class) r62.A02[i3 << 1];
                AbstractC05930Rb r1 = (AbstractC05930Rb) r7.A00.get(cls);
                if (r1 != null) {
                    z2 = r1.A00(r124.A01(cls));
                } else {
                    z2 = false;
                }
                r124.A03(cls, z2);
                z3 |= z2;
            }
            return z3;
        } else {
            C05950Rd r2 = (C05950Rd) this;
            C05940Rc r125 = (C05940Rc) r12;
            C001801b.A1P(r125);
            try {
                ThreadLocal threadLocal = r2.A01;
                C06010Rj r3 = (C06010Rj) threadLocal.get();
                if (r3 == null) {
                    r3 = new C06010Rj("/proc/self/stat");
                    threadLocal.set(r3);
                }
                r3.A02();
                if (!r3.A05) {
                    return false;
                }
                int i4 = 0;
                do {
                    r3.A05(' ');
                    i4++;
                } while (i4 < 13);
                r125.userTimeS = C05950Rd.A00(r3);
                r125.systemTimeS = C05950Rd.A00(r3);
                r125.childUserTimeS = C05950Rd.A00(r3);
                r125.childSystemTimeS = C05950Rd.A00(r3);
                ThreadLocal threadLocal2 = r2.A00;
                if (threadLocal2.get() == null) {
                    threadLocal2.set(new C05940Rc());
                }
                C05940Rc r5 = (C05940Rc) threadLocal2.get();
                if (Double.compare(r125.userTimeS, r5.userTimeS) < 0 || Double.compare(r125.systemTimeS, r5.systemTimeS) < 0 || Double.compare(r125.childUserTimeS, r5.childUserTimeS) < 0 || Double.compare(r125.childSystemTimeS, r5.childSystemTimeS) < 0) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("Cpu Time Decreased from ");
                    A0S2.append(r5.toString());
                    A0S2.append(" to ");
                    A0S2.append(r125.toString());
                    Log.e("CpuMetricsCollector", A0S2.toString(), null);
                    return false;
                }
                r5.A01(r125);
                return true;
            } catch (C19700vS e) {
                Log.e("CpuMetricsCollector", "Unable to parse CPU time field", e);
                return false;
            }
        }
    }
}
