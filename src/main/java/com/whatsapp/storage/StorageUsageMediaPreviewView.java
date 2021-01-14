package com.whatsapp.storage;

import X.AbstractC53892e0;
import X.AnonymousClass08D;
import X.AnonymousClass2PJ;
import X.AnonymousClass2PM;
import X.AnonymousClass34E;
import X.AnonymousClass34G;
import X.C004302a;
import X.C28051Sr;
import X.C59592ny;
import X.C60512pb;
import X.C72003Rd;
import X.C72013Re;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import java.util.List;

public class StorageUsageMediaPreviewView extends LinearLayout {
    public static final Bitmap A09 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public int A00;
    public String A01;
    public List A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Drawable A06;
    public final AnonymousClass08D A07 = AnonymousClass08D.A00();
    public final AnonymousClass2PM A08;

    public StorageUsageMediaPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(0);
        this.A05 = getResources().getDimensionPixelSize(R.dimen.storage_preview_item_thumb_space);
        this.A03 = getResources().getDimensionPixelSize(R.dimen.storage_preview_item_thumb_size);
        int A002 = C004302a.A00(getContext(), R.color.gallery_cell);
        this.A04 = A002;
        this.A06 = new ColorDrawable(A002);
        this.A08 = new AnonymousClass2PM(this.A07, context.getContentResolver(), new Handler(Looper.getMainLooper()));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A02 != null && this.A01 != null) {
            post(new RunnableEBaseShape13S0100000_I1_8(this, 11));
        }
    }

    public void setPreviewMediaItems(List list, int i, String str) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = str;
        removeAllViews();
        if (list.size() != 0) {
            if (getMeasuredWidth() == 0) {
                addOnLayoutChangeListener(new AnonymousClass34G(this, list, i, str));
            } else {
                setPreviewMediaItemsInternal(list, i, str);
            }
        }
    }

    public final void setPreviewMediaItemsInternal(List list, int i, String str) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C59592ny r3;
        int measuredWidth = getMeasuredWidth();
        int i2 = this.A03;
        int i3 = ((i2 >> 1) + measuredWidth) / i2;
        int measuredWidth2 = getMeasuredWidth();
        int i4 = this.A05;
        int i5 = (measuredWidth2 - ((i3 - 1) * i4)) / i3;
        int min = Math.min(list.size(), i3);
        Context context = getContext();
        if (context != null) {
            Drawable A0N = C28051Sr.A0N(context);
            for (int i6 = 0; i6 < min; i6++) {
                AbstractC53892e0 r4 = (AbstractC53892e0) list.get(i6);
                if (i6 != min - 1 || i <= min) {
                    C60512pb r32 = new C60512pb(getContext());
                    r32.A00 = 3;
                    r32.setFrameDrawable(A0N);
                    addView(r32);
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) r32.getLayoutParams();
                    r3 = r32;
                } else {
                    C59592ny r33 = new C59592ny(getContext());
                    AnonymousClass34E r14 = new AnonymousClass34E(getContext());
                    int i7 = i - min;
                    View view = r14.A00;
                    if (view != null) {
                        r14.removeView(view);
                    }
                    r14.addView(r33, 0);
                    r14.A00 = r33;
                    r14.A01.setText(r14.A02.A0D(R.string.storage_usage_preview_overlay_text, Integer.valueOf(i7)));
                    r14.setFrameDrawable(A0N);
                    addView(r14);
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) r14.getLayoutParams();
                    r3 = r33;
                }
                if (i6 != 0) {
                    marginLayoutParams.leftMargin = i4;
                }
                marginLayoutParams.width = i5;
                marginLayoutParams.height = i5;
                r3.setMediaItem(r4);
                r3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                r3.setSelector(null);
                AnonymousClass2PM r2 = this.A08;
                r2.A01((AnonymousClass2PJ) r3.getTag());
                C72003Rd r1 = new C72003Rd(r4, i5, str);
                r3.setTag(r1);
                r2.A02(r1, new C72013Re(this, r3, r1, r4));
            }
            return;
        }
        throw null;
    }
}
