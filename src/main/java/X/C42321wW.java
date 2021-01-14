package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.1wW  reason: invalid class name and case insensitive filesystem */
public final class C42321wW implements AnonymousClass1RP {
    public C55132g3 A00;
    public final int A01;

    public C42321wW(int i) {
        this.A01 = i;
    }

    @Override // X.AnonymousClass1RP
    public void ACx(AnonymousClass1RQ r2) {
        AnonymousClass1Rv r0;
        C42301wU r22 = (C42301wU) r2;
        if (r22.A00() && (r0 = r22.A05) != null) {
            r0.ACy(r22);
        }
    }

    @Override // X.AnonymousClass1RP
    public void AH5(AnonymousClass1RQ r20) {
        AbstractC27861Rw r0;
        C42301wU r4 = (C42301wU) r20;
        if (r4.A04 == 1) {
            ArrayList arrayList = new ArrayList(2);
            C42311wV r8 = new C42311wV(r4);
            C48072Ku r6 = r4.A08;
            int i = this.A01;
            WeakReference weakReference = r4.A09;
            C42301wU r5 = new C42301wU(r6, 2, r8, null, null, i, i, (ImageView) weakReference.get());
            C42301wU r10 = new C42301wU(r6, 3, r8, null, null, Integer.MAX_VALUE, Integer.MAX_VALUE, (ImageView) weakReference.get());
            arrayList.add(r5);
            arrayList.add(r10);
            r4.A02 = arrayList;
            C55132g3 r02 = this.A00;
            if (r02 != null) {
                r02.A00(r5, true);
                this.A00.A00(r10, true);
            }
        } else if (r4.A00() && (r0 = r4.A06) != null) {
            r0.AH7(r4);
        }
    }

    @Override // X.AnonymousClass1RP
    public void AHB(AnonymousClass1RQ r1) {
    }

    @Override // X.AnonymousClass1RP
    public void AHE(AnonymousClass1RQ r4, Bitmap bitmap, boolean z) {
        C42301wU r42 = (C42301wU) r4;
        if (r42.A00()) {
            WeakReference weakReference = r42.A09;
            if (weakReference.get() != null) {
                ((View) weakReference.get()).setTag(R.id.loaded_image_url, r42.A9c());
            }
            r42.A07.AHF(r42, bitmap, z);
        }
    }
}
