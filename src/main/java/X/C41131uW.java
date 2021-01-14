package X;

import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.account.delete.DeleteAccountFeedback;

/* renamed from: X.1uW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41131uW implements AbstractC13370k8 {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ DeleteAccountFeedback A01;

    public /* synthetic */ C41131uW(DeleteAccountFeedback deleteAccountFeedback, TextView textView) {
        this.A01 = deleteAccountFeedback;
        this.A00 = textView;
    }

    @Override // X.AbstractC13370k8
    public final boolean onMenuItemClick(MenuItem menuItem) {
        DeleteAccountFeedback deleteAccountFeedback = this.A01;
        TextView textView = this.A00;
        deleteAccountFeedback.A01 = menuItem.getItemId();
        textView.setText(menuItem.getTitle());
        EditText editText = deleteAccountFeedback.A03;
        AnonymousClass01X r3 = ((AnonymousClass2C0) deleteAccountFeedback).A01;
        int i = deleteAccountFeedback.A01;
        int i2 = R.string.delete_account_additional_comments_hint;
        if (i == 2) {
            i2 = R.string.delete_account_additional_comments_temporarily;
        }
        editText.setHint(r3.A06(i2));
        return false;
    }
}
