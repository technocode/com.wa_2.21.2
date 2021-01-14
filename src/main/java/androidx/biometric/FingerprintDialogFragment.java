package androidx.biometric;

import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.C004302a;
import X.DialogInterface$OnClickListenerC13720ki;
import X.DialogInterface$OnClickListenerC13730kj;
import X.HandlerC13740kk;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;

public class FingerprintDialogFragment extends DialogFragment {
    public int A00;
    public int A01;
    public int A02;
    public Context A03;
    public DialogInterface.OnClickListener A04;
    public Bundle A05;
    public ImageView A06;
    public TextView A07;
    public HandlerC13740kk A08 = new HandlerC13740kk(this);
    public boolean A09 = true;
    public final DialogInterface.OnClickListener A0A = new DialogInterface$OnClickListenerC13720ki(this);

    @Override // X.AnonymousClass037
    public void A0d() {
        this.A0U = true;
        this.A08.removeCallbacksAndMessages(null);
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        this.A01 = 0;
        A0z(1);
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        Context A002 = A00();
        this.A03 = A002;
        if (Build.VERSION.SDK_INT >= 26) {
            this.A00 = A0x(16844099);
        } else {
            this.A00 = C004302a.A00(A002, R.color.biometric_error_color);
        }
        this.A02 = A0x(16842808);
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0j(Bundle bundle) {
        super.A0j(bundle);
        bundle.putBundle("SavedBundle", this.A05);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        CharSequence charSequence;
        if (bundle != null && this.A05 == null) {
            this.A05 = bundle.getBundle("SavedBundle");
        }
        AnonymousClass0MB r5 = new AnonymousClass0MB(A00());
        CharSequence charSequence2 = this.A05.getCharSequence("title");
        AnonymousClass0MC r4 = r5.A01;
        r4.A0I = charSequence2;
        View inflate = LayoutInflater.from(r4.A0O).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        CharSequence charSequence3 = this.A05.getCharSequence("subtitle");
        if (TextUtils.isEmpty(charSequence3)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence3);
        }
        CharSequence charSequence4 = this.A05.getCharSequence("description");
        if (TextUtils.isEmpty(charSequence4)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(charSequence4);
        }
        this.A06 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.A07 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (this.A05.getBoolean("allow_device_credential")) {
            charSequence = A0F(R.string.confirm_device_credential_password);
        } else {
            charSequence = this.A05.getCharSequence("negative_text");
        }
        r5.A05(charSequence, new DialogInterface$OnClickListenerC13730kj(this));
        r4.A0C = inflate;
        r4.A01 = 0;
        AnonymousClass0MD A002 = r5.A00();
        A002.setCanceledOnTouchOutside(false);
        return A002;
    }

    public final int A0x(int i) {
        TypedValue typedValue = new TypedValue();
        this.A03.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = A0A().obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public void A0y() {
        if (this.A0H == null) {
            Log.e("FingerprintDialogFrag", "Failed to dismiss fingerprint dialog fragment. Fragment manager was null.");
        } else {
            A0r();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r6 != 2) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0z(int r6) {
        /*
            r5 = this;
            android.widget.ImageView r0 = r5.A06
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x003a
            int r0 = r5.A01
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 != 0) goto L_0x0040
            if (r6 != r2) goto L_0x0059
            r1 = 2131231286(0x7f080236, float:1.8078649E38)
        L_0x0017:
            android.content.Context r0 = r5.A03
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            if (r1 == 0) goto L_0x0059
            boolean r0 = r1 instanceof android.graphics.drawable.AnimatedVectorDrawable
            if (r0 == 0) goto L_0x0026
            r4 = r1
            android.graphics.drawable.AnimatedVectorDrawable r4 = (android.graphics.drawable.AnimatedVectorDrawable) r4
        L_0x0026:
            android.widget.ImageView r0 = r5.A06
            r0.setImageDrawable(r1)
            if (r4 == 0) goto L_0x0038
            int r0 = r5.A01
            if (r0 == 0) goto L_0x0038
            if (r0 != r2) goto L_0x003b
            if (r6 != r3) goto L_0x0038
        L_0x0035:
            r4.start()
        L_0x0038:
            r5.A01 = r6
        L_0x003a:
            return
        L_0x003b:
            if (r0 != r3) goto L_0x0038
            if (r6 != r2) goto L_0x0038
            goto L_0x0035
        L_0x0040:
            if (r0 != r2) goto L_0x004e
            r1 = 2131231286(0x7f080236, float:1.8078649E38)
            if (r6 == r3) goto L_0x0017
        L_0x0047:
            r0 = 3
            if (r6 != r0) goto L_0x0059
            r1 = 2131231285(0x7f080235, float:1.8078647E38)
            goto L_0x0017
        L_0x004e:
            if (r0 != r3) goto L_0x0056
            if (r6 != r2) goto L_0x0059
            r1 = 2131231285(0x7f080235, float:1.8078647E38)
            goto L_0x0017
        L_0x0056:
            if (r0 != r2) goto L_0x0059
            goto L_0x0047
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.FingerprintDialogFragment.A0z(int):void");
    }
}
