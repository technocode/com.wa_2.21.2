package X;

/* renamed from: X.0Rx  reason: invalid class name and case insensitive filesystem */
public class C06130Rx extends AnonymousClass0RZ {
    public final AnonymousClass05W mMetricsMap = new AnonymousClass05W();
    public final AnonymousClass05W mMetricsValid = new AnonymousClass05W();

    public AnonymousClass0RZ A01(Class cls) {
        return (AnonymousClass0RZ) cls.cast(this.mMetricsMap.getOrDefault(cls, null));
    }

    public void A02(C06130Rx r9) {
        int i = this.mMetricsMap.A00;
        for (int i2 = 0; i2 < i; i2++) {
            Class cls = (Class) this.mMetricsMap.A02[i2 << 1];
            AnonymousClass0RZ A01 = r9.A01(cls);
            if (A01 != null) {
                AnonymousClass0RZ A012 = A01(cls);
                if (A012 instanceof AnonymousClass0RY) {
                    AnonymousClass0RY r5 = (AnonymousClass0RY) A012;
                    AnonymousClass0RY r7 = (AnonymousClass0RY) A01;
                    r5.uptimeMs = r7.uptimeMs;
                    r5.realtimeMs = r7.realtimeMs;
                } else if (A012 instanceof C05960Re) {
                    C05960Re r52 = (C05960Re) A012;
                    C05960Re r72 = (C05960Re) A01;
                    r52.mobileBytesRx = r72.mobileBytesRx;
                    r52.mobileBytesTx = r72.mobileBytesTx;
                    r52.wifiBytesRx = r72.wifiBytesRx;
                    r52.wifiBytesTx = r72.wifiBytesTx;
                } else if (!(A012 instanceof C05940Rc)) {
                    ((C06130Rx) A012).A02((C06130Rx) A01);
                } else {
                    ((C05940Rc) A012).A01((C05940Rc) A01);
                }
                A03(cls, r9.A04(cls));
            } else {
                A03(cls, false);
            }
        }
    }

    public void A03(Class cls, boolean z) {
        this.mMetricsValid.put(cls, z ? Boolean.TRUE : Boolean.FALSE);
    }

    public boolean A04(Class cls) {
        Boolean bool = (Boolean) this.mMetricsValid.getOrDefault(cls, null);
        return bool != null && bool.booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C06130Rx.class != obj.getClass()) {
            return false;
        }
        C06130Rx r5 = (C06130Rx) obj;
        if (!C001801b.A1n(this.mMetricsValid, r5.mMetricsValid) || !C001801b.A1n(this.mMetricsMap, r5.mMetricsMap)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.mMetricsValid.hashCode() + (this.mMetricsMap.hashCode() * 31);
    }

    public String toString() {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("Composite Metrics{\n");
        int i = this.mMetricsMap.A00;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 << 1;
            A0S.append(this.mMetricsMap.A02[i3 + 1]);
            if (A04((Class) this.mMetricsMap.A02[i3])) {
                str = " [valid]";
            } else {
                str = " [invalid]";
            }
            A0S.append(str);
            A0S.append('\n');
        }
        A0S.append("}");
        return A0S.toString();
    }
}
