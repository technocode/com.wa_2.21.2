package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.1Zq  reason: invalid class name */
public class AnonymousClass1Zq implements AbstractC13270jv, DialogInterface.OnClickListener {
    public ListAdapter A00;
    public AnonymousClass0MD A01;
    public CharSequence A02;
    public final /* synthetic */ AppCompatSpinner A03;

    @Override // X.AbstractC13270jv
    public Drawable A4r() {
        return null;
    }

    @Override // X.AbstractC13270jv
    public int A6i() {
        return 0;
    }

    @Override // X.AbstractC13270jv
    public int A9f() {
        return 0;
    }

    public AnonymousClass1Zq(AppCompatSpinner appCompatSpinner) {
        this.A03 = appCompatSpinner;
    }

    @Override // X.AbstractC13270jv
    public CharSequence A6h() {
        return this.A02;
    }

    @Override // X.AbstractC13270jv
    public boolean ABa() {
        AnonymousClass0MD r0 = this.A01;
        if (r0 != null) {
            return r0.isShowing();
        }
        return false;
    }

    @Override // X.AbstractC13270jv
    public void ANt(ListAdapter listAdapter) {
        this.A00 = listAdapter;
    }

    @Override // X.AbstractC13270jv
    public void ANx(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // X.AbstractC13270jv
    public void AOI(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // X.AbstractC13270jv
    public void AOJ(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // X.AbstractC13270jv
    public void AOu(CharSequence charSequence) {
        this.A02 = charSequence;
    }

    @Override // X.AbstractC13270jv
    public void API(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // X.AbstractC13270jv
    public void APg(int i, int i2) {
        if (this.A00 != null) {
            AppCompatSpinner appCompatSpinner = this.A03;
            AnonymousClass0MB r3 = new AnonymousClass0MB(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.A02;
            if (charSequence != null) {
                r3.A01.A0I = charSequence;
            }
            ListAdapter listAdapter = this.A00;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            AnonymousClass0MC r1 = r3.A01;
            r1.A0D = listAdapter;
            r1.A05 = this;
            r1.A00 = selectedItemPosition;
            r1.A0L = true;
            AnonymousClass0MD A002 = r3.A00();
            this.A01 = A002;
            ListView listView = A002.A00.A0L;
            if (Build.VERSION.SDK_INT >= 17) {
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
            }
            this.A01.show();
        }
    }

    @Override // X.AbstractC13270jv
    public void dismiss() {
        AnonymousClass0MD r0 = this.A01;
        if (r0 != null) {
            r0.dismiss();
            this.A01 = null;
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        AppCompatSpinner appCompatSpinner = this.A03;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i, this.A00.getItemId(i));
        }
        AnonymousClass0MD r0 = this.A01;
        if (r0 != null) {
            r0.dismiss();
            this.A01 = null;
        }
    }
}
