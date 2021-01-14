package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Mm  reason: invalid class name and case insensitive filesystem */
public class C70813Mm implements AnonymousClass09O {
    public final /* synthetic */ AnonymousClass0I3 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ byte[] A02;

    public C70813Mm(AnonymousClass0I3 r1, byte[] bArr, String str) {
        this.A00 = r1;
        this.A02 = bArr;
        this.A01 = str;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/delivery-failure");
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r3) {
        Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/error");
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r7) {
        Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest/success");
        this.A00.A04.ANF(new RunnableEBaseShape1S1200000_I1(this, this.A02, this.A01, 27));
    }
}
