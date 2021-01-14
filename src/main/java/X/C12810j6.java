package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;

/* renamed from: X.0j6  reason: invalid class name and case insensitive filesystem */
public class C12810j6 {
    public int A00;
    public int A01;
    public int A02 = -1;
    public int A03 = 0;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Drawable A09;
    public Handler A0A;
    public Message A0B;
    public Message A0C;
    public Message A0D;
    public View A0E;
    public View A0F;
    public Button A0G;
    public Button A0H;
    public Button A0I;
    public ImageView A0J;
    public ListAdapter A0K;
    public ListView A0L;
    public TextView A0M;
    public TextView A0N;
    public NestedScrollView A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public CharSequence A0R;
    public CharSequence A0S;
    public CharSequence A0T;
    public boolean A0U;
    public final int A0V;
    public final Context A0W;
    public final View.OnClickListener A0X = new ViewOnClickEBaseShape2S0100000_I1_0(this, 0);
    public final Window A0Y;
    public final AnonymousClass0ME A0Z;

    public C12810j6(Context context, AnonymousClass0ME r6, Window window) {
        this.A0W = context;
        this.A0Z = r6;
        this.A0Y = window;
        this.A0A = new HandlerC12790j3(r6);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AnonymousClass0T3.A06, R.attr.alertDialogStyle, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, 0);
        this.A01 = obtainStyledAttributes.getResourceId(2, 0);
        this.A05 = obtainStyledAttributes.getResourceId(4, 0);
        this.A06 = obtainStyledAttributes.getResourceId(5, 0);
        this.A07 = obtainStyledAttributes.getResourceId(7, 0);
        this.A04 = obtainStyledAttributes.getResourceId(3, 0);
        this.A0U = obtainStyledAttributes.getBoolean(6, true);
        this.A0V = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        r6.A00().A0H(1);
    }

    public static final ViewGroup A00(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public static void A01(View view, View view2, View view3) {
        int i = 4;
        if (view2 != null) {
            int i2 = 4;
            if (view.canScrollVertically(-1)) {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    public static final void A02(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static boolean A03(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (A03(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public void A04(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message = null;
        if (onClickListener != null) {
            message = this.A0A.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.A0Q = charSequence;
            this.A0C = message;
        } else if (i == -2) {
            this.A0P = charSequence;
            this.A0B = message;
        } else if (i == -1) {
            this.A0R = charSequence;
            this.A0D = message;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
