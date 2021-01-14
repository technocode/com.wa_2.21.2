package X;

import android.content.Context;

/* renamed from: X.277  reason: invalid class name */
public class AnonymousClass277 extends C30521bU {
    public int A00 = 0;

    public AnonymousClass277(Context context) {
        super(context);
    }

    public void A04(String str) {
        if (str == null) {
            this.A00 = 0;
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 100571) {
            if (hashCode == 109757538 && str.equals("start")) {
                this.A00 = -1;
            }
        } else if (str.equals("end")) {
            this.A00 = 1;
        }
    }
}
