package X;

import com.whatsapp.util.Log;

/* renamed from: X.38g  reason: invalid class name and case insensitive filesystem */
public class C673638g {
    public double A00 = Double.NaN;
    public double A01 = Double.NaN;
    public long A02 = 0;
    public final AnonymousClass0AV A03;

    public C673638g(AnonymousClass0AV r3) {
        this.A03 = r3;
    }

    public double A00() {
        AnonymousClass0AW r0 = this.A03.A00;
        double A002 = r0.A00();
        String bool = Boolean.toString(r0.A01());
        StringBuilder sb = new StringBuilder("voip/call/battery_monitor percent = ");
        sb.append(A002);
        sb.append(", charging = ");
        sb.append(bool);
        Log.i(sb.toString());
        return A002;
    }
}
