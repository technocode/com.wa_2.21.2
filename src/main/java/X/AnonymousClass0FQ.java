package X;

import java.util.HashMap;

/* renamed from: X.0FQ  reason: invalid class name */
public class AnonymousClass0FQ extends HashMap<C007303n, AnonymousClass0M3> {
    public final /* synthetic */ AnonymousClass0CH this$0;

    public AnonymousClass0FQ(AnonymousClass0CH r1) {
        this.this$0 = r1;
    }

    /* renamed from: A00 */
    public AnonymousClass0M3 remove(Object obj) {
        AnonymousClass0M3 r1 = (AnonymousClass0M3) super.get(obj);
        if (!(r1 == null || r1.A02 == null)) {
            this.this$0.A05(r1);
        }
        return (AnonymousClass0M3) super.remove(obj);
    }
}
