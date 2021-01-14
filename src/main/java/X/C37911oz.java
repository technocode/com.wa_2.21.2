package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.Camera;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.1oz  reason: invalid class name and case insensitive filesystem */
public class C37911oz implements AnonymousClass11B {
    public final AnonymousClass05q A00;
    public final AbstractC25311Gi A01;

    public C37911oz(AbstractC25311Gi r1, AnonymousClass05q r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        this.A01.A00(obj, this.A00, ((AnonymousClass278) obj2).A00, obj3);
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC25311Gi r0 = this.A01;
        AnonymousClass29W r2 = ((AnonymousClass278) obj).A00;
        AnonymousClass29W r1 = ((AnonymousClass278) obj2).A00;
        if (r0 != null) {
            return (obj3 == obj4 && r2 == r1) ? false : true;
        }
        throw null;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        AbstractC25311Gi r1 = this.A01;
        AnonymousClass29W r2 = ((AnonymousClass278) obj2).A00;
        if (r1 instanceof C43171xu) {
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) AnonymousClass0Q7.A0D((View) obj, R.id.video_view);
            videoSurfaceView.A00();
            videoSurfaceView.A03(false);
        } else if (r1 instanceof C43141xr) {
            ImageView imageView = (ImageView) obj;
            imageView.setImageBitmap(null);
            imageView.setImageDrawable(null);
            imageView.setColorFilter((ColorFilter) null);
        } else if (r1 instanceof C43131xq) {
            ImageView imageView2 = (ImageView) obj;
            imageView2.setImageDrawable(null);
            imageView2.setTag(null);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView2.setColorFilter((ColorFilter) null);
            imageView2.setScaleX(1.0f);
        } else if (r1 instanceof C43101xn) {
        } else {
            if (r1 instanceof C43081xl) {
                C43081xl r12 = (C43081xl) r1;
                r12.A01();
                Camera camera = r12.A04;
                if (camera != null) {
                    camera.release();
                    r12.A04 = null;
                }
            } else if (!(r1 instanceof C43071xk) && !(r1 instanceof C43061xj) && !(r1 instanceof C43051xi)) {
                if (r1 instanceof C43041xh) {
                    ((RecyclerView) ((View) obj).findViewById(R.id.recycler_view)).setAdapter(null);
                } else if (!(r1 instanceof C43031xg) && !(r1 instanceof C43021xf)) {
                    if (r1 instanceof C43011xe) {
                        C43011xe.A00((View) obj, (C46502As) r2);
                    } else if (r1 instanceof C37851ot) {
                        AnonymousClass1GT r6 = (AnonymousClass1GT) obj;
                        C46422Aa r22 = (C46422Aa) r2;
                        r22.A00.A0C = r6.getText().toString();
                        r22.A00.A08 = r6.onSaveInstanceState();
                        r6.removeTextChangedListener(r22.A00.A0A);
                        TextWatcher textWatcher = r22.A00.A09;
                        if (textWatcher != null) {
                            r6.removeTextChangedListener(textWatcher);
                        }
                        r6.A00 = null;
                        r6.setFilters(C37851ot.A01);
                        r6.setOnFocusChangeListener(null);
                        r6.setOnEditorActionListener(null);
                        r6.setText("");
                        r6.setGravity(8388659);
                        r6.setTypeface(Typeface.DEFAULT);
                        r6.setHint("");
                        r6.setMaxLines(Integer.MAX_VALUE);
                        r6.setImeOptions(r22.A00.A00);
                        r6.setTextColor(r22.A00.A06);
                        r6.setHintTextColor(r22.A00.A05);
                        r6.setInputType(r22.A00.A01);
                        Rect rect = r22.A00.A07;
                        r6.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                    } else if (!(r1 instanceof C37791on) && (r1 instanceof C31641dZ)) {
                        ((CompoundButton) obj).setOnCheckedChangeListener(null);
                    }
                }
            }
        }
    }
}
