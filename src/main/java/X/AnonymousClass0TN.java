package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0TN  reason: invalid class name */
public class AnonymousClass0TN implements AnonymousClass0TO, AdapterView.OnItemClickListener {
    public int A00 = R.layout.abc_list_menu_item_layout;
    public Context A01;
    public LayoutInflater A02;
    public ExpandedMenuView A03;
    public AnonymousClass0TP A04;
    public AnonymousClass0T8 A05;
    public AnonymousClass0TR A06;

    @Override // X.AnonymousClass0TO
    public boolean A2q(AnonymousClass0T8 r2, AnonymousClass1ZT r3) {
        return false;
    }

    @Override // X.AnonymousClass0TO
    public boolean A4B(AnonymousClass0T8 r2, AnonymousClass1ZT r3) {
        return false;
    }

    @Override // X.AnonymousClass0TO
    public boolean A4H() {
        return false;
    }

    public AnonymousClass0TN(Context context) {
        this.A01 = context;
        this.A02 = LayoutInflater.from(context);
    }

    @Override // X.AnonymousClass0TO
    public void AAh(Context context, AnonymousClass0T8 r3) {
        if (this.A01 != null) {
            this.A01 = context;
            if (this.A02 == null) {
                this.A02 = LayoutInflater.from(context);
            }
        }
        this.A05 = r3;
        AnonymousClass0TP r0 = this.A04;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    @Override // X.AnonymousClass0TO
    public void AEI(AnonymousClass0T8 r2, boolean z) {
        AnonymousClass0TR r0 = this.A06;
        if (r0 != null) {
            r0.AEI(r2, z);
        }
    }

    @Override // X.AnonymousClass0TO
    public boolean AKe(AnonymousClass0TY r8) {
        if (!r8.hasVisibleItems()) {
            return false;
        }
        AnonymousClass1ZR r3 = new AnonymousClass1ZR(r8);
        AnonymousClass0T8 r6 = r3.A02;
        AnonymousClass0MB r5 = new AnonymousClass0MB(r6.A0M);
        AnonymousClass0MC r4 = r5.A01;
        AnonymousClass0TN r2 = new AnonymousClass0TN(r4.A0O);
        r3.A01 = r2;
        r2.A06 = r3;
        AnonymousClass0T8 r1 = r3.A02;
        r1.A0C(r2, r1.A0M);
        AnonymousClass0TN r12 = r3.A01;
        AnonymousClass0TP r0 = r12.A04;
        if (r0 == null) {
            r0 = new AnonymousClass0TP(r12);
            r12.A04 = r0;
        }
        r4.A0D = r0;
        r4.A05 = r3;
        View view = r6.A02;
        if (view != null) {
            r4.A0B = view;
        } else {
            r4.A0A = r6.A01;
            r4.A0I = r6.A05;
        }
        r4.A08 = r3;
        AnonymousClass0MD A002 = r5.A00();
        r3.A00 = A002;
        A002.setOnDismissListener(r3);
        WindowManager.LayoutParams attributes = r3.A00.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        r3.A00.show();
        AnonymousClass0TR r02 = this.A06;
        if (r02 == null) {
            return true;
        }
        r02.AI7(r8);
        return true;
    }

    @Override // X.AnonymousClass0TO
    public void AO1(AnonymousClass0TR r1) {
        this.A06 = r1;
    }

    @Override // X.AnonymousClass0TO
    public void AQr(boolean z) {
        AnonymousClass0TP r0 = this.A04;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A05.A0J(this.A04.getItem(i), this, 0);
    }
}
