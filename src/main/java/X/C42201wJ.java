package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.1wJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42201wJ implements AbstractC27871Rx {
    public final /* synthetic */ C42291wT A00;

    public /* synthetic */ C42201wJ(C42291wT r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC27871Rx
    public final void AHF(C42301wU r5, Bitmap bitmap, boolean z) {
        C42291wT r1 = this.A00;
        ImageView imageView = r1.A01;
        imageView.setImageBitmap(bitmap);
        if (r1.A00) {
            r1.A00 = false;
            Context A0O = C002001d.A0O(imageView.getContext());
            if (A0O instanceof ActivityC004802g) {
                imageView.post(new RunnableEBaseShape7S0100000_I1_2(A0O, 39));
            }
        }
    }
}
