package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.2Yc  reason: invalid class name and case insensitive filesystem */
public class C51282Yc extends AnonymousClass0JW {
    public int A00;
    public int A01;
    public final File A02;
    public final String A03;
    public final WeakReference A04;

    public C51282Yc(File file, String str, C47072Gi r5) {
        this.A02 = file;
        this.A03 = str;
        this.A04 = new WeakReference(r5);
        this.A00 = r5.A05.A02().getDimensionPixelSize(R.dimen.file_preview_thumbnail_height);
        this.A01 = r5.A05.A02().getDimensionPixelSize(R.dimen.file_preview_thumbnail_width);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C47072Gi r6 = (C47072Gi) this.A04.get();
        if (r6 != null) {
            int i = this.A00;
            ViewGroup.LayoutParams layoutParams = r6.A02.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = r6.A02.getLayoutParams();
            if (bitmap != null) {
                layoutParams.height = i;
                layoutParams2.height = i;
                r6.A00.setClipChildren(true);
                r6.A02.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                r6.A02.setImageBitmap(bitmap);
                r6.A03.setVisibility(0);
                r6.A01.setVisibility(8);
                r6.A02.setContentDescription(r6.A07.A06(R.string.document_preview));
            } else {
                layoutParams.height = -1;
                layoutParams2.height = -1;
                r6.A00.setClipChildren(false);
                ActivityC004902h A0A = r6.A05.A0A();
                if (A0A != null) {
                    ImageView imageView = r6.A02;
                    AnonymousClass01X r3 = r6.A07;
                    imageView.setImageDrawable(new C06470Tj(r3, C004302a.A03(A0A, R.drawable.unknown_file_preview_background)));
                    r6.A01.setImageDrawable(new C06470Tj(r3, C004302a.A03(A0A, R.drawable.ic_attachment_forward_large)));
                }
                r6.A02.setContentDescription("");
            }
            r6.A02.setLayoutParams(layoutParams);
            r6.A03.setLayoutParams(layoutParams2);
        }
    }
}
