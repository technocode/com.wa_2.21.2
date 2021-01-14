package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;

/* renamed from: X.2OT  reason: invalid class name */
public class AnonymousClass2OT {
    public float A00;
    public int A01 = 4;
    public int A02;
    public Bitmap A03;
    public Bitmap A04;
    public Bitmap A05;
    public Rect A06;
    public View A07;
    public AnonymousClass1DH A08;
    public BottomSheetBehavior A09;
    public DoodleView A0A;
    public C53602dX A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final int A0J;
    public final int A0K;
    public final Activity A0L;
    public final Handler A0M = new Handler(Looper.getMainLooper());
    public final View A0N;
    public final View A0O;
    public final TextView A0P;
    public final CoordinatorLayout A0Q;
    public final RecyclerView A0R;
    public final AnonymousClass08D A0S = AnonymousClass08D.A00();
    public final AnonymousClass0DD A0T = this.A0S.A03();
    public final AnonymousClass00D A0U = AnonymousClass00D.A00();
    public final C59502nm A0V;
    public final GestureDetector$OnDoubleTapListenerC54222eY A0W;
    public final AnonymousClass02H A0X = new AnonymousClass02H(this.A0Y, false);
    public final AnonymousClass00T A0Y = C002101e.A00();
    public final Runnable A0Z;
    public final String A0a;

    public AnonymousClass2OT(Activity activity, View view, Uri uri, GestureDetector$OnDoubleTapListenerC54222eY r7, C59502nm r8, int i) {
        this.A0L = activity;
        this.A0O = view;
        this.A0W = r7;
        this.A02 = i;
        this.A0V = r8;
        this.A0Q = (CoordinatorLayout) view.findViewById(R.id.filter_sheet_container);
        this.A0N = this.A0O.findViewById(R.id.filter_bottom_sheet);
        this.A0R = (RecyclerView) this.A0O.findViewById(R.id.filter_selector);
        this.A07 = this.A0O.findViewById(R.id.media_content);
        this.A0A = (DoodleView) this.A0O.findViewById(R.id.doodle_view);
        this.A0P = (TextView) activity.findViewById(R.id.filter_swipe_text);
        this.A00 = 0.28f;
        StringBuilder sb = new StringBuilder();
        sb.append(uri.toString());
        sb.append("-filter");
        this.A0a = sb.toString();
        this.A0K = activity.getResources().getDimensionPixelSize(R.dimen.filter_thumb_width);
        this.A0J = activity.getResources().getDimensionPixelSize(R.dimen.filter_thumb_height);
        this.A0Z = new RunnableEBaseShape2S0300000_I1(this, activity, view, 27);
    }

    public static void A00(AnonymousClass2OT r7) {
        RecyclerView recyclerView = r7.A0R;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
        View view = r7.A0O;
        int width = view.getWidth();
        int height = view.getHeight();
        int dimensionPixelSize = r7.A0L.getResources().getDimensionPixelSize(R.dimen.filter_selector_height);
        if (width < height) {
            r7.A00 = 0.28f;
        } else {
            r7.A00 = 0.5f;
        }
        Rect rect = r7.A06;
        marginLayoutParams.leftMargin = rect.left;
        marginLayoutParams.rightMargin = rect.right;
        marginLayoutParams.topMargin = rect.top;
        marginLayoutParams.bottomMargin = rect.bottom;
        recyclerView.setLayoutParams(marginLayoutParams);
        recyclerView.A0i = true;
        r7.A09.A0C((height - dimensionPixelSize) - r7.A06.bottom);
        float f = ((float) width) / 2.0f;
        float height2 = ((float) (height - recyclerView.getHeight())) / 2.0f;
        r7.A07.setPivotX(f);
        r7.A07.setPivotY(height2);
        r7.A0A.setPivotX(f);
        r7.A0A.setPivotY(height2);
        if (r7.A09.A0B == 3) {
            float f2 = 1.0f - r7.A00;
            r7.A07.setScaleX(f2);
            r7.A07.setScaleY(f2);
            r7.A0A.setScaleX(f2);
            r7.A0A.setScaleY(f2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (A0A() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            android.view.View r2 = r3.A0N
            if (r2 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r3.A09()
            if (r0 != 0) goto L_0x0012
            boolean r1 = r3.A0A()
            r0 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            r1 = 0
            if (r0 == 0) goto L_0x0023
            r3.A02()
            boolean r0 = r3.A0A()
            if (r0 != 0) goto L_0x0022
            r2.setVisibility(r1)
        L_0x0022:
            return
        L_0x0023:
            r0 = 1
            r3.A0F = r0
            r3.A0D = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2OT.A01():void");
    }

    public void A02() {
        TextView textView = this.A0P;
        if (textView.getVisibility() != 0) {
            AlphaAnimation A022 = AnonymousClass008.A02(0.0f, 1.0f, 300);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(1);
            AnimationSet animationSet = new AnimationSet(false);
            animationSet.addAnimation(A022);
            animationSet.addAnimation(translateAnimation);
            textView.setVisibility(0);
            textView.startAnimation(animationSet);
        }
    }

    public void A03() {
        if (this.A05 != null) {
            AnonymousClass0DD r5 = this.A0T;
            String str = this.A0a;
            Bitmap bitmap = (Bitmap) r5.A02(str);
            this.A04 = bitmap;
            if (bitmap == null) {
                int i = this.A02;
                if (i == 0) {
                    this.A04 = this.A05;
                    r5.A04(str);
                    return;
                }
                Bitmap A012 = FilterUtils.A01(this.A05, i, true, this.A0V);
                this.A04 = A012;
                if (A012 == null) {
                    this.A04 = this.A05;
                    this.A02 = 0;
                    Log.w("FilterUi/updateFilteredMediaBitmap/filter failed");
                    return;
                }
                r5.A05(str, A012);
                return;
            }
            return;
        }
        Log.d("FilterUi/updateFilteredMediaBitmap/mediaBitmap is null");
    }

    public final void A04() {
        C53602dX r5 = this.A0B;
        if (r5 != null) {
            int i = 0;
            while (true) {
                AnonymousClass2OT r2 = r5.A0A;
                if (i < r2.A0R.getChildCount()) {
                    RecyclerView recyclerView = r5.A0A.A0R;
                    View$OnClickListenerC53592dW r0 = (View$OnClickListenerC53592dW) recyclerView.A0E(recyclerView.getChildAt(i));
                    if (r0 != null) {
                        ImageView imageView = r0.A02;
                        imageView.setBackgroundResource(0);
                        imageView.setImageDrawable(null);
                    }
                    i++;
                } else {
                    ((AnonymousClass0JW) new C10550eo(r5.A01)).A00.executeOnExecutor(r2.A0X, new Void[0]);
                    return;
                }
            }
        }
    }

    public final void A05() {
        if (this.A05 != null && !this.A0C) {
            ((AnonymousClass0JW) new C10530em(this)).A00.executeOnExecutor(this.A0X, new Void[0]);
            this.A0C = true;
        }
    }

    public void A06(int i, Runnable runnable, Runnable runnable2) {
        if (this.A05 != null) {
            AnonymousClass0DD r2 = this.A0T;
            String str = this.A0a;
            Bitmap bitmap = (Bitmap) r2.A02(str);
            if (i != this.A02 || i == 0) {
                r2.A04(str);
            }
            if (i != 0) {
                ((AnonymousClass0JW) new C10520el(this, bitmap, i, runnable, runnable2)).A00.executeOnExecutor(this.A0X, new Void[0]);
                return;
            }
            this.A04 = this.A05;
            if (runnable != null) {
                runnable.run();
            }
            this.A02 = 0;
            this.A0W.A02();
            return;
        }
        Log.e("FilterUi/startUpdateFilteredMediaBitmapTask/mediaBitmap is null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (A0A() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(boolean r4) {
        /*
            r3 = this;
            android.view.View r2 = r3.A0N
            if (r2 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r3.A09()
            if (r0 != 0) goto L_0x0012
            boolean r1 = r3.A0A()
            r0 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            if (r0 == 0) goto L_0x001d
            r3.A08(r4)
            r0 = 4
            r2.setVisibility(r0)
            return
        L_0x001d:
            r0 = 0
            r3.A0F = r0
            r0 = 1
            r3.A0D = r0
            r3.A0E = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2OT.A07(boolean):void");
    }

    public void A08(boolean z) {
        TextView textView = this.A0P;
        if (textView.getVisibility() != 4) {
            textView.setVisibility(4);
            if (z) {
                textView.startAnimation(AnonymousClass008.A02(1.0f, 0.0f, 300));
            }
        }
    }

    public boolean A09() {
        BottomSheetBehavior bottomSheetBehavior;
        return this.A0N == null || (bottomSheetBehavior = this.A09) == null || bottomSheetBehavior.A0B == 4;
    }

    public boolean A0A() {
        BottomSheetBehavior bottomSheetBehavior;
        return (this.A0N == null || (bottomSheetBehavior = this.A09) == null || bottomSheetBehavior.A0B != 3) ? false : true;
    }

    public boolean A0B() {
        View view = this.A0N;
        if (view == null || A09() || this.A0I) {
            return false;
        }
        this.A08.A01(view, 1);
        this.A09.A0D(4);
        this.A0I = true;
        return true;
    }
}
