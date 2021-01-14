package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: X.0MB  reason: invalid class name */
public class AnonymousClass0MB {
    public final int A00;
    public final AnonymousClass0MC A01;

    public AnonymousClass0MB(Context context) {
        this(context, AnonymousClass0MD.A00(context, 0));
    }

    public AnonymousClass0MB(Context context, int i) {
        this.A01 = new AnonymousClass0MC(new ContextThemeWrapper(context, AnonymousClass0MD.A00(context, i)));
        this.A00 = i;
    }

    public AnonymousClass0MD A00() {
        int i;
        ListAdapter listAdapter;
        AnonymousClass0MC r8 = this.A01;
        Context context = r8.A0O;
        AnonymousClass0MD r6 = new AnonymousClass0MD(context, this.A00);
        C12810j6 r5 = r6.A00;
        View view = r8.A0B;
        if (view != null) {
            r5.A0E = view;
        } else {
            CharSequence charSequence = r8.A0I;
            if (charSequence != null) {
                r5.A0T = charSequence;
                TextView textView = r5.A0N;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = r8.A0A;
            if (drawable != null) {
                r5.A09 = drawable;
                r5.A03 = 0;
                ImageView imageView = r5.A0J;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    r5.A0J.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = r8.A0E;
        if (charSequence2 != null) {
            r5.A0S = charSequence2;
            TextView textView2 = r5.A0M;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = r8.A0H;
        if (charSequence3 != null) {
            r5.A04(-1, charSequence3, r8.A06);
        }
        CharSequence charSequence4 = r8.A0F;
        if (charSequence4 != null) {
            r5.A04(-2, charSequence4, r8.A03);
        }
        CharSequence charSequence5 = r8.A0G;
        if (charSequence5 != null) {
            r5.A04(-3, charSequence5, r8.A04);
        }
        if (!(r8.A0M == null && r8.A0D == null)) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) r8.A0P.inflate(r5.A05, (ViewGroup) null);
            if (r8.A0K) {
                listAdapter = new C12760j0(r8, context, r5.A06, r8.A0M, alertController$RecycleListView);
            } else {
                if (r8.A0L) {
                    i = r5.A07;
                } else {
                    i = r5.A04;
                }
                listAdapter = r8.A0D;
                if (listAdapter == null) {
                    listAdapter = new C12800j4(context, i, r8.A0M);
                }
            }
            r5.A0K = listAdapter;
            r5.A02 = r8.A00;
            if (r8.A05 != null) {
                alertController$RecycleListView.setOnItemClickListener(new C12770j1(r8, r5));
            } else if (r8.A09 != null) {
                alertController$RecycleListView.setOnItemClickListener(new C12780j2(r8, alertController$RecycleListView, r5));
            }
            if (r8.A0L) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (r8.A0K) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            r5.A0L = alertController$RecycleListView;
        }
        View view2 = r8.A0C;
        if (view2 != null) {
            r5.A0F = view2;
            r5.A08 = 0;
        } else {
            int i2 = r8.A01;
            if (i2 != 0) {
                r5.A0F = null;
                r5.A08 = i2;
            }
        }
        r6.setCancelable(r8.A0J);
        if (r8.A0J) {
            r6.setCanceledOnTouchOutside(true);
        }
        r6.setOnCancelListener(r8.A02);
        r6.setOnDismissListener(r8.A07);
        DialogInterface.OnKeyListener onKeyListener = r8.A08;
        if (onKeyListener != null) {
            r6.setOnKeyListener(onKeyListener);
        }
        return r6;
    }

    public void A01(int i) {
        AnonymousClass0MC r1 = this.A01;
        r1.A0E = r1.A0O.getText(i);
    }

    public void A02(int i) {
        AnonymousClass0MC r1 = this.A01;
        r1.A0I = r1.A0O.getText(i);
    }

    public void A03(int i, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass0MC r1 = this.A01;
        r1.A0F = r1.A0O.getText(i);
        r1.A03 = onClickListener;
    }

    public void A04(int i, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass0MC r1 = this.A01;
        r1.A0H = r1.A0O.getText(i);
        r1.A06 = onClickListener;
    }

    public void A05(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass0MC r0 = this.A01;
        r0.A0F = charSequence;
        r0.A03 = onClickListener;
    }

    public void A06(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass0MC r0 = this.A01;
        r0.A0G = charSequence;
        r0.A04 = onClickListener;
    }

    public void A07(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass0MC r0 = this.A01;
        r0.A0H = charSequence;
        r0.A06 = onClickListener;
    }
}
