package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;

/* renamed from: X.1lM  reason: invalid class name and case insensitive filesystem */
public final class C35961lM extends AnonymousClass1AY implements IUiSettingsDelegate {
    public C35961lM(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void AO4(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        A02(2, A00);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void AOb(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        A02(3, A00);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void APR(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        A02(1, A00);
    }
}
