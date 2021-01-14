package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2ny  reason: invalid class name and case insensitive filesystem */
public class C59592ny extends C08490bD {
    public Bitmap A00;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public AbstractC48882Od A04;
    public boolean A05;
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();

    public C59592ny(Context context) {
        super(context, null);
        Drawable A032 = C004302a.A03(context, R.drawable.selector_orange_gradient);
        this.A03 = A032;
        A032.setCallback(this);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
            Drawable drawable = this.A03;
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
        }
    }

    @Override // X.C08490bD
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A03;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public AbstractC48882Od getMediaItem() {
        return this.A04;
    }

    public Bitmap getThumbnail() {
        return this.A00;
    }

    public Uri getUri() {
        return this.A04.A4W();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 != 1) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r1 == 3) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r3 == false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r0 != false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r3 != false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r4 == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r1 == 0) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r5.A06 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        r5.A06 = r5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        r15.drawText(X.C002001d.A1W(r5.A07, r1), (r5.A06.getTextSize() / 3.0f) + ((float) r0), ((float) r5.getHeight()) - (r5.A06.getTextSize() / 3.0f), r5.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c1, code lost:
        r10 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c3, code lost:
        if (r10 != null) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c5, code lost:
        r10 = X.C004302a.A03(r5.getContext(), com.google.android.search.verification.client.R.drawable.mark_gif);
        r5.A01 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d3, code lost:
        r10 = r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d5, code lost:
        if (r10 != null) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d7, code lost:
        r10 = X.C004302a.A03(r5.getContext(), com.google.android.search.verification.client.R.drawable.mark_video);
        r5.A05 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e4, code lost:
        if (r10 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e6, code lost:
        r6 = r5.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e8, code lost:
        if (r6 != null) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ea, code lost:
        r6 = X.C004302a.A03(r5.getContext(), com.google.android.search.verification.client.R.drawable.gallery_album_overlay);
        r5.A04 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f7, code lost:
        r6.setBounds(0, r5.getHeight() - (r10.getIntrinsicHeight() << 1), r5.getWidth(), r5.getHeight());
        r5.A04.draw(r15);
        r6 = r10.getIntrinsicHeight() >> 2;
        r10.setBounds(r6, (r5.getHeight() - r10.getIntrinsicHeight()) - r6, r10.getIntrinsicWidth() + r6, r5.getHeight() - r6);
        r10.draw(r15);
        r0 = r10.getIntrinsicWidth() + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0239, code lost:
        r1 = r2.A67();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023f, code lost:
        r4 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r15) {
        /*
        // Method dump skipped, instructions count: 626
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59592ny.onDraw(android.graphics.Canvas):void");
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public void setChecked(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            setSelected(z);
            invalidate();
        }
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A02 = drawable;
        invalidate();
    }

    public void setMediaItem(AbstractC48882Od r3) {
        int i;
        this.A04 = r3;
        if (r3 != null) {
            int A9V = r3.A9V();
            if (A9V == 0) {
                i = R.string.conversations_most_recent_image;
            } else if (A9V == 1) {
                i = R.string.conversations_most_recent_video;
            } else if (A9V == 2) {
                i = R.string.conversations_most_recent_gif;
            } else if (A9V == 3) {
                i = R.string.conversations_most_recent_audio;
            } else if (A9V == 4) {
                i = R.string.conversations_most_recent_document;
            } else {
                return;
            }
            setContentDescription(this.A06.A06(i));
        }
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.A03;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.A03 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
    }

    public void setThumbnail(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.A03 || super.verifyDrawable(drawable);
    }
}
