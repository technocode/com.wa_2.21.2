package X;

import java.util.List;

/* renamed from: X.3XJ  reason: invalid class name */
public class AnonymousClass3XJ implements AnonymousClass3D9 {
    public int A00 = -1;
    public final int A01;
    public final List A02;

    public AnonymousClass3XJ(List list) {
        this.A02 = list;
        this.A01 = list.size();
    }

    @Override // X.AnonymousClass3D9
    public String readLine() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i < this.A01) {
            return ((AnonymousClass3DA) this.A02.get(i)).A00;
        }
        return null;
    }
}
