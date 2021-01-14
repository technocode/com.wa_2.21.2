package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity;
import java.util.AbstractCollection;

/* renamed from: X.1PU  reason: invalid class name */
public abstract class AnonymousClass1PU extends ActivityC09470d0 {
    public AnonymousClass3IA A00;
    public final C01970Ad A01 = C01970Ad.A00();

    @Override // X.ActivityC09470d0
    public AbstractC11910hD A0T(ViewGroup viewGroup, int i) {
        if (i == 300) {
            return new AnonymousClass3YU(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.merchant_detail_payout_bank_view, viewGroup, false));
        }
        if (i == 301) {
            return new AnonymousClass3YV(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.merchant_detail_card_payout_method_view, viewGroup, false));
        }
        if (i == 303) {
            return new C74823bY(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_expandable_listview, viewGroup, false));
        }
        if (i != 305) {
            return super.A0T(viewGroup, i);
        }
        return new AnonymousClass3YX(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.merchant_warning_info_view, viewGroup, false));
    }

    public final AnonymousClass0MD A0U(CharSequence charSequence, String str, boolean z) {
        int i = 200;
        if (z) {
            i = 201;
        }
        AnonymousClass0MB r3 = new AnonymousClass0MB(this);
        AnonymousClass0MC r2 = r3.A01;
        r2.A0E = charSequence;
        r2.A0J = true;
        r3.A05(((AnonymousClass2C0) this).A01.A06(R.string.cancel), new DialogInterface$OnClickListenerC62762vJ(this, i));
        DialogInterface$OnClickListenerC62772vK r0 = new DialogInterface$OnClickListenerC62772vK(this, i, z);
        r2.A0H = str;
        r2.A06 = r0;
        r2.A02 = new DialogInterface$OnCancelListenerC62782vL(this, i);
        return r3.A00();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC09470d0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity = (BrazilMerchantDetailsListActivity) this;
        C63272w9 r1 = brazilMerchantDetailsListActivity.A05;
        if (r1 != null) {
            C73743Yn r0 = (C73743Yn) C002001d.A0l(brazilMerchantDetailsListActivity, new C73753Yo(r1, brazilMerchantDetailsListActivity)).A00(C73743Yn.class);
            brazilMerchantDetailsListActivity.A02 = r0;
            r0.A00.A03(((AnonymousClass3IA) r0).A06, new AnonymousClass3GO(brazilMerchantDetailsListActivity));
            C73743Yn r02 = brazilMerchantDetailsListActivity.A02;
            this.A00 = r02;
            ((AnonymousClass3IA) r02).A00.A03(((AnonymousClass3IA) r02).A06, new AnonymousClass3F6(this));
            AnonymousClass3IA r03 = this.A00;
            r03.A03.A03(r03.A06, new AnonymousClass3GM(this));
            this.A00.A02(new C63342wG(0));
            ((ActivityC09470d0) this).A01.setLockIconVisibility(false);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        AnonymousClass01X r2;
        String A06;
        if (i == 200) {
            AnonymousClass01X r22 = ((AnonymousClass2C0) this).A01;
            return A0U(r22.A06(R.string.delete_seller_account_dialog_title), r22.A06(R.string.remove), false);
        } else if (i != 201) {
            return super.onCreateDialog(i);
        } else {
            C01970Ad r0 = this.A01;
            r0.A04();
            if (((AbstractCollection) r0.A05.A0S(1)).size() > 0) {
                r2 = ((AnonymousClass2C0) this).A01;
                A06 = r2.A06(R.string.delete_seller_account_dialog_title_with_warning);
            } else {
                r2 = ((AnonymousClass2C0) this).A01;
                A06 = r2.A06(R.string.delete_seller_account_dialog_title);
            }
            return A0U(C002001d.A1J(A06, this, this.A0M), r2.A06(R.string.remove), true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_remove_payment_method, 0, ((AnonymousClass2C0) this).A01.A06(R.string.remove_account));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_remove_payment_method) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A00.A02(new C63342wG(1));
        return true;
    }
}
