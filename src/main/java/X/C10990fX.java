package X;

import com.whatsapp.bloks.BloksCameraOverlay;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.0fX  reason: invalid class name and case insensitive filesystem */
public class C10990fX extends AnonymousClass0JW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final File A03;
    public final String A04;
    public final WeakReference A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final boolean A08;
    public final byte[] A09;
    public final /* synthetic */ C43081xl A0A;

    public C10990fX(C43081xl r2, AnonymousClass05q r3, byte[] bArr, boolean z, File file, String str, int i, int i2, BloksCameraOverlay bloksCameraOverlay, int i3, C46472Ap r12) {
        this.A0A = r2;
        this.A06 = new WeakReference(r3);
        this.A09 = bArr;
        this.A08 = z;
        this.A03 = file;
        this.A04 = str;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = new WeakReference(bloksCameraOverlay);
        this.A00 = i3;
        this.A07 = new WeakReference(r12);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C43081xl r2 = this.A0A;
        r2.A0D = true;
        r2.A02((AnonymousClass05q) this.A06.get(), (C46472Ap) this.A07.get());
    }
}
