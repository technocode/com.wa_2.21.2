package X;

import android.content.Intent;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0AW  reason: invalid class name */
public final class AnonymousClass0AW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public AnonymousClass0AW() {
        this.A00 = 1;
        this.A01 = 0;
        this.A02 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A03 = 0;
    }

    public AnonymousClass0AW(Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            this.A00 = intent.getIntExtra("health", 1);
            this.A01 = intent.getIntExtra("level", -1);
            this.A02 = intent.getIntExtra("plugged", 0);
            this.A03 = intent.getIntExtra("scale", -1);
            return;
        }
        throw new IllegalArgumentException("Intent must be android.intent.action.BATTERY_CHANGED");
    }

    public double A00() {
        int i;
        int i2 = this.A01;
        if (i2 < 0 || (i = this.A03) <= 0) {
            return Double.NaN;
        }
        return (((double) i2) * 100.0d) / ((double) i);
    }

    public boolean A01() {
        int i = this.A02;
        return (i == 0 || i == Integer.MIN_VALUE) ? false : true;
    }

    public boolean A02() {
        double A002 = A00();
        if (A01()) {
            return true;
        }
        if (this.A00 != 1 || this.A01 > 0 || this.A03 > 0 || this.A02 != Integer.MIN_VALUE) {
            return A002 != Double.NaN && A002 > 20.0d;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0AW.class != obj.getClass()) {
            return false;
        }
        AnonymousClass0AW r5 = (AnonymousClass0AW) obj;
        if (this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31) + this.A03;
    }

    public String toString() {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("BatteryState{health=");
        int i = this.A00;
        switch (i) {
            case 1:
                str = "unknown";
                break;
            case 2:
                str = "good";
                break;
            case 3:
                str = "overheat";
                break;
            case 4:
                str = "dead";
                break;
            case 5:
                str = "over_voltage";
                break;
            case 6:
                str = "unspecified_failure";
                break;
            case 7:
                str = "cold";
                break;
            default:
                StringBuilder A0S2 = AnonymousClass008.A0S("other(");
                A0S2.append(i);
                A0S2.append(')');
                str = A0S2.toString();
                break;
        }
        A0S.append(str);
        A0S.append(", level=");
        A0S.append(this.A01);
        A0S.append(", plugged=");
        A0S.append(this.A02);
        A0S.append(", scale=");
        A0S.append(this.A03);
        A0S.append(", percent=");
        A0S.append(A00());
        A0S.append('}');
        return A0S.toString();
    }
}
