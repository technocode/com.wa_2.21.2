package X;

import java.util.regex.Pattern;

/* renamed from: X.233  reason: invalid class name */
public class AnonymousClass233 implements AbstractC002501i {
    public final Pattern A00 = Pattern.compile("\\(-?а\\)");
    public final Pattern A01 = Pattern.compile("[:\"«»„“”]");
    public final C666335e[] A02 = {new C666335e(Pattern.compile("\\bя\\s+\\S*ла\\b", 2), 1.0d), new C666335e(Pattern.compile("\\bя\\s+\\S*лась\\b", 2), 1.5d), new C666335e(Pattern.compile("\\bя\\s+\\S*л\\b", 2), -1.0d), new C666335e(Pattern.compile("\\bя\\s+\\S*лся\\b", 2), -1.5d)};
    public final /* synthetic */ C002401h A03;

    public AnonymousClass233(C002401h r7) {
        this.A03 = r7;
    }

    @Override // X.AbstractC002501i
    public String A4O(double d, String str) {
        if (d > 8.0d) {
            return this.A00.matcher(str).replaceAll("а");
        }
        return d < -8.0d ? this.A00.matcher(str).replaceAll("") : str;
    }

    @Override // X.AbstractC002501i
    public double A6X(String str) {
        if (this.A01.matcher(str).find()) {
            return 0.0d;
        }
        C666335e[] r4 = this.A02;
        for (C666335e r1 : r4) {
            if (r1.A01.matcher(str).find()) {
                return r1.A00;
            }
        }
        return 0.0d;
    }
}
