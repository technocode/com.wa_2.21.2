package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.google.android.search.verification.client.R;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2Mo  reason: invalid class name and case insensitive filesystem */
public final class HandlerC48512Mo extends Handler {
    public final Context A00;
    public final /* synthetic */ C48522Mp A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC48512Mo(C48522Mp r2, Context context, Looper looper) {
        super(looper);
        this.A01 = r2;
        if (looper != null) {
            this.A00 = context;
            return;
        }
        throw null;
    }

    public void handleMessage(Message message) {
        Object obj;
        int i;
        C48522Mp r5 = this.A01;
        Bundle data = message.getData();
        AbstractC48582Mw r11 = null;
        if (r5 != null) {
            String string = data.getString("tag_bundle_key");
            if (string != null) {
                ConcurrentHashMap concurrentHashMap = r5.A0j;
                Reference reference = (Reference) concurrentHashMap.get(string);
                if (reference == null || (obj = reference.get()) == null) {
                    Context context = this.A00;
                    if (r5 != null) {
                        Resources resources = context.getResources();
                        boolean z = r5.A0m;
                        int i2 = R.dimen.doodle_shape_picker_grid_size;
                        if (z) {
                            i2 = R.dimen.shape_picker_new_shape_size;
                        }
                        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
                        AbstractC48432Mf r10 = (AbstractC48432Mf) r5.A0k.get(string);
                        ConcurrentHashMap concurrentHashMap2 = r5.A0i;
                        Reference reference2 = (Reference) concurrentHashMap2.get(string);
                        if (reference2 != null) {
                            r11 = (AbstractC48582Mw) reference2.get();
                        }
                        if (r11 == null) {
                            if (r10 != null) {
                                r11 = r10.A3S(context, r5.A0T, true);
                                concurrentHashMap2.put(string, new SoftReference(r11));
                                if (r11 == null) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (r11.A0B()) {
                            if (!(r11 instanceof C60502pa)) {
                                i = 1;
                            } else {
                                i = ((C60502pa) r11).A01;
                            }
                            if (i == 1) {
                                r11.A08(r5.A02);
                            }
                        }
                        if (r11.A0C()) {
                            r11.A06(r5.A00);
                        }
                        if (r11 instanceof C59472nj) {
                            obj = ((C59472nj) r11).A02;
                        } else if (!(r11 instanceof C59462ni)) {
                            obj = null;
                        } else {
                            obj = ((C59462ni) r11).A00;
                        }
                        if (obj == null) {
                            float f = (float) dimensionPixelSize;
                            r11.A0E(new RectF(), 0.0f, 0.0f, f, f);
                            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            r11.A09(new Canvas(createBitmap));
                            obj = new BitmapDrawable(context.getResources(), createBitmap);
                        }
                    } else {
                        throw null;
                    }
                }
                concurrentHashMap.put(string, new SoftReference(obj));
                View view = (View) message.obj;
                if (view != null) {
                    view.setTag(obj);
                    Message obtain = Message.obtain(r5.A06, 0, 0, 0, view);
                    Bundle bundle = new Bundle();
                    bundle.putString("tag_bundle_key", string);
                    obtain.setData(bundle);
                    obtain.sendToTarget();
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }
}
