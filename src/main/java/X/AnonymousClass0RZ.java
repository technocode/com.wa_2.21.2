package X;

import java.io.Serializable;

/* renamed from: X.0RZ  reason: invalid class name */
public abstract class AnonymousClass0RZ implements Serializable {
    public AnonymousClass0RZ A00(AnonymousClass0RZ r9, AnonymousClass0RZ r10) {
        boolean z;
        if (this instanceof AnonymousClass0RY) {
            AnonymousClass0RY r4 = (AnonymousClass0RY) this;
            AnonymousClass0RY r92 = (AnonymousClass0RY) r9;
            AnonymousClass0RY r102 = (AnonymousClass0RY) r10;
            if (r102 == null) {
                r102 = new AnonymousClass0RY();
            }
            long j = r4.uptimeMs;
            if (r92 == null) {
                r102.uptimeMs = j;
                r102.realtimeMs = r4.realtimeMs;
                return r102;
            }
            r102.uptimeMs = j - r92.uptimeMs;
            r102.realtimeMs = r4.realtimeMs - r92.realtimeMs;
            return r102;
        } else if (this instanceof C05960Re) {
            C05960Re r42 = (C05960Re) this;
            C05960Re r93 = (C05960Re) r9;
            C05960Re r103 = (C05960Re) r10;
            if (r103 == null) {
                r103 = new C05960Re();
            }
            if (r93 == null) {
                r103.mobileBytesRx = r42.mobileBytesRx;
                r103.mobileBytesTx = r42.mobileBytesTx;
                r103.wifiBytesRx = r42.wifiBytesRx;
                r103.wifiBytesTx = r42.wifiBytesTx;
                return r103;
            }
            r103.mobileBytesTx = r42.mobileBytesTx - r93.mobileBytesTx;
            r103.mobileBytesRx = r42.mobileBytesRx - r93.mobileBytesRx;
            r103.wifiBytesTx = r42.wifiBytesTx - r93.wifiBytesTx;
            r103.wifiBytesRx = r42.wifiBytesRx - r93.wifiBytesRx;
            return r103;
        } else if (!(this instanceof C05940Rc)) {
            C06130Rx r7 = (C06130Rx) this;
            C06130Rx r94 = (C06130Rx) r9;
            C06130Rx r104 = (C06130Rx) r10;
            if (r104 != null) {
                if (r94 == null) {
                    r104.A02(r7);
                } else {
                    int i = r7.mMetricsMap.A00;
                    for (int i2 = 0; i2 < i; i2++) {
                        Class cls = (Class) r7.mMetricsMap.A02[i2 << 1];
                        if (!r7.A04(cls) || !r94.A04(cls)) {
                            z = false;
                        } else {
                            z = true;
                            AnonymousClass0RZ A01 = r104.A01(cls);
                            if (A01 != null) {
                                r7.A01(cls).A00(r94.A01(cls), A01);
                            }
                        }
                        r104.A03(cls, z);
                    }
                }
                return r104;
            }
            throw new IllegalArgumentException("CompositeMetrics doesn't support nullable results");
        } else {
            C05940Rc r43 = (C05940Rc) this;
            C05940Rc r95 = (C05940Rc) r9;
            C05940Rc r105 = (C05940Rc) r10;
            if (r105 == null) {
                r105 = new C05940Rc();
            }
            if (r95 == null) {
                r105.A01(r43);
                return r105;
            }
            r105.systemTimeS = r43.systemTimeS - r95.systemTimeS;
            r105.userTimeS = r43.userTimeS - r95.userTimeS;
            r105.childSystemTimeS = r43.childSystemTimeS - r95.childSystemTimeS;
            r105.childUserTimeS = r43.childUserTimeS - r95.childUserTimeS;
            return r105;
        }
    }
}
