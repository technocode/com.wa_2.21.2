package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: X.0bD  reason: invalid class name and case insensitive filesystem */
public class C08490bD extends ImageView implements AbstractC05570Pf, AnonymousClass0W8 {
    public final AnonymousClass0ZW A00;
    public final C08080aR A01;

    public C08490bD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C08490bD(Context context, AttributeSet attributeSet, int i) {
        super(AnonymousClass0ZT.A00(context), attributeSet, i);
        AnonymousClass0ZW r0 = new AnonymousClass0ZW(this);
        this.A00 = r0;
        r0.A08(attributeSet, i);
        C08080aR r02 = new C08080aR(this);
        this.A01 = r02;
        r02.A02(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
        C08080aR r02 = this.A01;
        if (r02 != null) {
            r02.A00();
        }
    }

    @Override // X.AbstractC05570Pf
    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            return r0.A00();
        }
        return null;
    }

    @Override // X.AbstractC05570Pf
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            return r0.A01();
        }
        return null;
    }

    @Override // X.AnonymousClass0W8
    public ColorStateList getSupportImageTintList() {
        C07660Za r0;
        C08080aR r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    @Override // X.AnonymousClass0W8
    public PorterDuff.Mode getSupportImageTintMode() {
        C07660Za r0;
        C08080aR r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public boolean hasOverlappingRendering() {
        return this.A01.A03() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C08080aR r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C08080aR r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void setImageResource(int i) {
        C08080aR r0 = this.A01;
        if (r0 != null) {
            r0.A01(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C08080aR r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    @Override // X.AbstractC05570Pf
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            r0.A06(colorStateList);
        }
    }

    @Override // X.AbstractC05570Pf
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass0ZW r0 = this.A00;
        if (r0 != null) {
            r0.A07(mode);
        }
    }

    @Override // X.AnonymousClass0W8
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C08080aR r2 = this.A01;
        if (r2 != null) {
            C07660Za r1 = r2.A00;
            if (r1 == null) {
                r1 = new C07660Za();
                r2.A00 = r1;
            }
            r1.A00 = colorStateList;
            r1.A02 = true;
            r2.A00();
        }
    }

    @Override // X.AnonymousClass0W8
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C08080aR r2 = this.A01;
        if (r2 != null) {
            C07660Za r1 = r2.A00;
            if (r1 == null) {
                r1 = new C07660Za();
                r2.A00 = r1;
            }
            r1.A01 = mode;
            r1.A03 = true;
            r2.A00();
        }
    }
}
