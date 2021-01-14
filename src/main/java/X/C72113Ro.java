package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3Ro  reason: invalid class name and case insensitive filesystem */
public class C72113Ro implements AnonymousClass1RP {
    public final Drawable A00;
    public final Drawable A01;

    public C72113Ro(Drawable drawable, Drawable drawable2) {
        this.A00 = drawable2;
        this.A01 = drawable;
    }

    public static final boolean A00(ImageView imageView, String str) {
        return (imageView == null || imageView.getTag() == null || !imageView.getTag().equals(str)) ? false : true;
    }

    @Override // X.AnonymousClass1RP
    public void ACx(AnonymousClass1RQ r3) {
        ImageView imageView;
        C72123Rp r32 = (C72123Rp) r3;
        WeakReference weakReference = r32.A07;
        if (weakReference != null) {
            imageView = (ImageView) weakReference.get();
        } else {
            imageView = null;
        }
        if (A00(imageView, r32.A06)) {
            Drawable drawable = r32.A03;
            if (drawable == null) {
                drawable = this.A01;
            }
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // X.AnonymousClass1RP
    public void AH5(AnonymousClass1RQ r3) {
        ImageView imageView;
        C72123Rp r32 = (C72123Rp) r3;
        WeakReference weakReference = r32.A07;
        if (weakReference != null) {
            imageView = (ImageView) weakReference.get();
        } else {
            imageView = null;
        }
        if (A00(imageView, r32.A06)) {
            Drawable drawable = r32.A02;
            if (drawable == null) {
                drawable = this.A00;
            }
            imageView.setImageDrawable(drawable);
        }
        AnonymousClass34f r0 = r32.A04;
        if (r0 != null) {
            r0.AH4();
        }
    }

    @Override // X.AnonymousClass1RP
    public void AHB(AnonymousClass1RQ r3) {
        View view;
        C72123Rp r32 = (C72123Rp) r3;
        WeakReference weakReference = r32.A07;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setTag(r32.A06);
        }
    }

    @Override // X.AnonymousClass1RP
    public void AHE(AnonymousClass1RQ r6, Bitmap bitmap, boolean z) {
        ImageView imageView;
        Drawable drawable;
        C72123Rp r62 = (C72123Rp) r6;
        WeakReference weakReference = r62.A07;
        if (weakReference != null) {
            imageView = (ImageView) weakReference.get();
        } else {
            imageView = null;
        }
        String str = r62.A06;
        if (A00(imageView, str)) {
            StringBuilder A0S = AnonymousClass008.A0S("simplethumbloader/display ");
            A0S.append(str);
            Log.d(A0S.toString());
            if ((imageView.getDrawable() == null || (imageView.getDrawable() instanceof ColorDrawable)) && !z) {
                Drawable[] drawableArr = new Drawable[2];
                if (imageView.getDrawable() == null) {
                    drawable = new ColorDrawable(0);
                } else {
                    drawable = imageView.getDrawable();
                }
                drawableArr[0] = drawable;
                drawableArr[1] = new BitmapDrawable(imageView.getResources(), bitmap);
                TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(200);
                imageView.setImageDrawable(transitionDrawable);
            } else {
                imageView.setImageBitmap(bitmap);
            }
            AnonymousClass34f r0 = r62.A04;
            if (r0 != null) {
                r0.AKx();
            }
        }
    }
}
