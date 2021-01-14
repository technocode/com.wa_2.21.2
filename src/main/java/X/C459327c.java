package X;

import android.os.Bundle;
import android.os.ConditionVariable;

/* renamed from: X.27c  reason: invalid class name and case insensitive filesystem */
public class C459327c implements AbstractC09090cH {
    public final /* synthetic */ ConditionVariable A00;

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
    public final void AFj(int i, Bundle bundle) {
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
    public final void AHl(boolean z) {
    }

    @Override // X.AbstractC09090cH
    public final void AHm(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public final void AHn() {
    }

    @Override // X.AbstractC09090cH
    public final void AJo() {
    }

    @Override // X.AbstractC09090cH
    public final void ALU() {
    }

    public C459327c(ConditionVariable conditionVariable) {
        this.A00 = conditionVariable;
    }

    @Override // X.AbstractC09090cH
    public void ACZ(boolean z) {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("deleteacctconfirm/gdrive-observer/deletion-finished/");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        AnonymousClass008.A1U(A0S, str);
        this.A00.open();
    }
}
