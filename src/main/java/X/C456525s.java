package X;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* renamed from: X.25s  reason: invalid class name and case insensitive filesystem */
public final class C456525s extends AbstractC30331b9 implements AnonymousClass17Q {
    public Set A00;
    public Semaphore A01 = new Semaphore(0);

    public C456525s(Context context, Set set) {
        super(context);
        this.A00 = set;
    }

    @Override // X.AnonymousClass17Q
    public final void AEO() {
        this.A01.release();
    }
}
