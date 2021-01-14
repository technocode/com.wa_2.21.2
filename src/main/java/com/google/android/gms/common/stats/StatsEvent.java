package com.google.android.gms.common.stats;

import X.AnonymousClass008;
import X.AnonymousClass066;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

public abstract class StatsEvent extends AnonymousClass066 implements ReflectedParcelable {
    public String toString() {
        String join;
        WakeLockEvent wakeLockEvent = (WakeLockEvent) this;
        long j = wakeLockEvent.A07;
        int i = wakeLockEvent.A00;
        String str = wakeLockEvent.A09;
        int i2 = wakeLockEvent.A04;
        List list = wakeLockEvent.A0E;
        String str2 = "";
        if (list == null) {
            join = str2;
        } else {
            join = TextUtils.join(",", list);
        }
        int i3 = wakeLockEvent.A01;
        String str3 = wakeLockEvent.A0A;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = wakeLockEvent.A0D;
        if (str4 == null) {
            str4 = str2;
        }
        float f = wakeLockEvent.A03;
        String str5 = wakeLockEvent.A0B;
        if (str5 != null) {
            str2 = str5;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str4.length() + str3.length() + AnonymousClass008.A00(join, AnonymousClass008.A00(str, 45)));
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i3);
        AnonymousClass008.A1Y(sb, "\t", str3, "\t", str4);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str2);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder(AnonymousClass008.A00(obj, 53));
        sb2.append(j);
        sb2.append("\t");
        sb2.append(i);
        sb2.append("\t");
        sb2.append(-1L);
        sb2.append(obj);
        return sb2.toString();
    }
}
