package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.1jC  reason: invalid class name and case insensitive filesystem */
public final class C34771jC implements AnonymousClass179 {
    public final /* synthetic */ BasePendingResult A00;
    public final /* synthetic */ AnonymousClass17S A01;

    public C34771jC(AnonymousClass17S r1, BasePendingResult basePendingResult) {
        this.A01 = r1;
        this.A00 = basePendingResult;
    }

    @Override // X.AnonymousClass179
    public final void AEP(Status status) {
        this.A01.A00.remove(this.A00);
    }
}
