package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;

/* renamed from: X.26w  reason: invalid class name and case insensitive filesystem */
public class DialogC458926w extends AnonymousClass0ME {
    public AnonymousClass1DH A00;
    public BottomSheetBehavior A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DialogC458926w(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r3 = 1
            if (r6 != 0) goto L_0x0017
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r0 = 2130968661(0x7f040055, float:1.7545982E38)
            boolean r0 = r1.resolveAttribute(r0, r2, r3)
            if (r0 == 0) goto L_0x002d
            int r6 = r2.resourceId
        L_0x0017:
            r4.<init>(r5, r6)
            r4.A02 = r3
            r4.A03 = r3
            X.1mm r0 = new X.1mm
            r0.<init>(r4)
            r4.A00 = r0
            X.01p r0 = r4.A00()
            r0.A0H(r3)
            return
        L_0x002d:
            r6 = 2131952228(0x7f130264, float:1.9540893E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC458926w.<init>(android.content.Context, int):void");
    }

    public final View A02(int i, View view, ViewGroup.LayoutParams layoutParams) {
        View inflate = View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.design_bottom_sheet);
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(viewGroup2);
        this.A01 = A002;
        A002.A0E = this.A00;
        A002.A0J = this.A02;
        if (layoutParams == null) {
            viewGroup2.addView(view);
        } else {
            viewGroup2.addView(view, layoutParams);
        }
        viewGroup.findViewById(R.id.touch_outside).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 2));
        AnonymousClass0Q7.A0d(viewGroup2, new C36721ml(this));
        viewGroup2.setOnTouchListener(new AnonymousClass1DJ());
        return inflate;
    }

    @Override // X.AnonymousClass0ME
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            }
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0B == 5) {
            bottomSheetBehavior.A0D(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.A02 != z) {
            this.A02 = z;
            BottomSheetBehavior bottomSheetBehavior = this.A01;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0J = z;
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.A02) {
            this.A02 = true;
        }
        this.A03 = z;
        this.A04 = true;
    }

    @Override // android.app.Dialog, X.AnonymousClass0ME
    public void setContentView(int i) {
        A00().A0C(A02(i, null, null));
    }

    @Override // android.app.Dialog, X.AnonymousClass0ME
    public void setContentView(View view) {
        A00().A0C(A02(0, view, null));
    }

    @Override // X.AnonymousClass0ME
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A00().A0C(A02(0, view, layoutParams));
    }
}
