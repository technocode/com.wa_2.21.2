package X;

/* renamed from: X.0U6  reason: invalid class name */
public class AnonymousClass0U6 implements AnonymousClass0U5 {
    public static final AnonymousClass0U6 A01 = new AnonymousClass0U6();
    public final boolean A00 = true;

    @Override // X.AnonymousClass0U5
    public int A2d(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + i;
        boolean z = false;
        while (i < i3) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i));
            if (directionality == 0) {
                if (!this.A00) {
                    return 1;
                }
                z = true;
            } else if (directionality == 1 || directionality == 2) {
                if (this.A00) {
                    return 0;
                }
                z = true;
            }
            i++;
        }
        if (z) {
            return this.A00 ? 1 : 0;
        }
        return 2;
    }
}
