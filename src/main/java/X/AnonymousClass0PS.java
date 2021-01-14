package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0PS  reason: invalid class name */
public class AnonymousClass0PS {
    public List A00;

    public AnonymousClass0PS(AnonymousClass0PR... r5) {
        int length = r5.length;
        this.A00 = new ArrayList(length);
        for (AnonymousClass0PR r1 : r5) {
            if (r1 != null) {
                this.A00.add(r1);
            }
        }
    }

    public boolean A00() {
        for (AnonymousClass0PR r0 : this.A00) {
            if (!r0.isValid()) {
                return false;
            }
        }
        return true;
    }
}
