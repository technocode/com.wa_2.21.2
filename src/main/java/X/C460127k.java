package X;

import android.os.Bundle;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* renamed from: X.27k  reason: invalid class name and case insensitive filesystem */
public class C460127k implements AbstractC09090cH {
    public int A00 = -1;
    public final /* synthetic */ RestoreFromBackupActivity A01;

    @Override // X.AbstractC09090cH
    public final void ACZ(boolean z) {
    }

    @Override // X.AbstractC09090cH
    public final void ADJ() {
    }

    @Override // X.AbstractC09090cH
    public final void ADK(boolean z) {
    }

    @Override // X.AbstractC09090cH
    public final void ADL(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void ADM(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void ADN(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void ADO(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void ADP(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void ADQ(int i) {
    }

    @Override // X.AbstractC09090cH
    public final void ADR() {
    }

    @Override // X.AbstractC09090cH
    public final void ADS(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void ADT() {
    }

    @Override // X.AbstractC09090cH
    public final void AFh(int i, Bundle bundle) {
    }

    @Override // X.AbstractC09090cH
    public final void AFi(int i, Bundle bundle) {
    }

    @Override // X.AbstractC09090cH
    public final void AHY() {
    }

    @Override // X.AbstractC09090cH
    public final void AHZ(boolean z, long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void AHa(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void AHb(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void AHc(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void AHd(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void AHe(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void AHf(int i) {
    }

    @Override // X.AbstractC09090cH
    public final void AHg() {
    }

    @Override // X.AbstractC09090cH
    public final void AHh(long j, long j2, long j3) {
    }

    @Override // X.AbstractC09090cH
    public final void AJo() {
    }

    @Override // X.AbstractC09090cH
    public final void ALU() {
    }

    public C460127k(RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A01 = restoreFromBackupActivity;
    }

    @Override // X.AbstractC09090cH
    public void AFj(int i, Bundle bundle) {
        StringBuilder A0S = AnonymousClass008.A0S("gdrive-activity-observer/msgstore-download-error/");
        A0S.append(AnonymousClass0JJ.A05(i));
        Log.i(A0S.toString());
        AnonymousClass02M r2 = ((ActivityC004702f) this.A01).A0F;
        r2.A02.post(new RunnableEBaseShape1S0201000_I1(bundle, i, this, 7));
    }

    @Override // X.AbstractC09090cH
    public void AHl(boolean z) {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("gdrive-activity-observer/msgstore-download-finished/");
        if (z) {
            str = "successful";
        } else {
            str = "failed";
        }
        AnonymousClass008.A1U(A0S, str);
        RestoreFromBackupActivity restoreFromBackupActivity = this.A01;
        int A05 = ((ActivityC004702f) restoreFromBackupActivity).A0J.A05();
        if (A05 == 10) {
            AnonymousClass02M r2 = ((ActivityC004702f) restoreFromBackupActivity).A0F;
            r2.A02.post(new RunnableEBaseShape1S0110000_I1(this, z, 4));
            return;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-activity-observer/msgstore-download-finished/get-error/");
        A0S2.append(AnonymousClass0JJ.A05(A05));
        Log.i(A0S2.toString());
    }

    @Override // X.AbstractC09090cH
    public void AHm(long j, long j2) {
        int i = (int) ((100 * j) / j2);
        if (i - this.A00 > 0) {
            this.A00 = i;
            if (i % 10 == 0) {
                StringBuilder A0V = AnonymousClass008.A0V("gdrive-activity-observer/msgstore-download-progress:", j, "/");
                A0V.append(j2);
                A0V.append(" ");
                A0V.append(i);
                AnonymousClass008.A1U(A0V, "%");
            }
            AnonymousClass02M r0 = ((ActivityC004702f) this.A01).A0F;
            r0.A02.post(new RunnableEBaseShape0S0101200_I1(this, i, j, j2, 1));
        }
    }

    @Override // X.AbstractC09090cH
    public void AHn() {
        AnonymousClass02M r2 = ((ActivityC004702f) this.A01).A0F;
        r2.A02.post(new RunnableEBaseShape7S0100000_I1_2(this, 12));
    }
}
